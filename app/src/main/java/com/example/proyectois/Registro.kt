package com.example.proyectois

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.util.PatternsCompat
import com.example.proyectois.databinding.ActivityRegistroBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import java.util.regex.Pattern

class Registro : AppCompatActivity() {

    /**
     * Declaramos las variables a utilizar.
     */
    val RC_SIGN_IN = 123
    lateinit var mGoogleSignInClient: GoogleSignInClient
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityRegistroBinding
    private lateinit var dialog2: Dialog
    private lateinit var dialog3: Dialog

    /**
     * Función principal.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth= Firebase.auth


        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        binding.btnSiGoogle.setOnClickListener{
            val signInIntent = mGoogleSignInClient.signInIntent
            startActivityForResult(signInIntent, RC_SIGN_IN)
        }

        /**
         * Al dar click, mostramos la pantalla de Iniciar sesión.
         */
        binding.txtSiRegistro.setOnClickListener {
            startActivity(Intent(this,Inicio_Sesion::class.java))
            finish()
        }

        /**
         * Al dar click, llamamos a la función para validar los campos y se llama a la función para crear la cuenta.
         */
        binding.btnSiSignin.setOnClickListener{
            validate()

            val Email = binding.edtSiCorreo1.text.toString()
            val Password = binding.edtSiContra1.text.toString()
            createAccount(Email, Password)
        }
    }

    /**
     * Función para crear una cuenta.
     */
     fun createAccount(email : String, password : String){
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    success()

                } else {
                    error()
                }
            }
         }

    /**
     * Función para recargar la pantalla.
     */
    fun reaload() {
        val intent = Intent( this, Inicio_Sesion::class.java)
        this.startActivity(intent)
    }

    /**
     * Función para validar la contraseña.
     */
    fun validatePassword() : Boolean{
        val password = binding.edtSiContra.editText?.text.toString()
        val confirmpassword = binding.edtSiRepeat.editText?.text.toString()
        val passwordRegex = Pattern.compile(
            "^" +
                    "(?=.*[0-9])" +
                    "(?=.*[a-z])" +
                    "(?=\\S+$)" +
                    ".{6,}" +
                    "$")
        return if (password.isEmpty()){
            binding.edtSiContra.error = "El campo no puede quedar vacío."
            false
        }else if (!passwordRegex.matcher(password).matches()) {
            binding.edtSiContra.error = "La contraseña debe contener al menos 6 caracteres."
            false
        }else if (password != confirmpassword) {
            binding.edtSiContra.error = "Las contraseñas deben coincidir."
            false
        }else{
            binding.edtSiContra.error=null
            true
        }
    }

    /**
     * Función para confirmar la contraseña.
     */
    fun confirmPassword() : Boolean{
        val password = binding.edtSiContra.editText?.text.toString()
        val confirmpassword = binding.edtSiRepeat.editText?.text.toString()

        return if (confirmpassword.isEmpty()){
            binding.edtSiRepeat.error = "El campo no puede quedar vacío."
            false
        }else if (password != confirmpassword) {
            binding.edtSiRepeat.error = "Las contraseñas deben coincidir."
            false
        }else{
            binding.edtSiRepeat.error=null
            true
        }
    }

    /**
     * Función para validar el correo electrónico.
     */
    fun validateEmail() : Boolean {
        val email = binding.edtSiCorreo.editText?.text.toString()
        return if (email.isEmpty()){
            binding.edtSiCorreo.error = "El campo no puede quedar vacío."
            false
        }else if (!PatternsCompat.EMAIL_ADDRESS.matcher(email).matches()){
            binding.edtSiCorreo.error = "Ingrese un correo electrónico válido."
            false
        }else{
            binding.edtSiCorreo.error = null
            true
        }
    }

    /**
     * Función para validar el nombre.
     */
    fun validateName() : Boolean {
        val name = binding.edtSiNombre.editText?.text.toString()
        return if (name.isEmpty()){
            binding.edtSiNombre.error = "El campo no puede quedar vacío."
            false
        }else{
            binding.edtSiNombre.error = null
            true
        }
    }

    /**
     * Función para validar todos los campos.
     */
     fun validate(){
        val result = arrayOf(validateEmail(), validatePassword(), validateName(), confirmPassword())
        if (false in result){
            return
        }
        Toast.makeText(this,"¡Campos validados correctamente!", Toast.LENGTH_SHORT).show()
    }


    /**
     * Función para mostrar una alerta de éxito al registrarse.
     */
    fun success(){
        dialog2 = Dialog(this)
        dialog2.setContentView(R.layout.dialog_view_register)
        dialog2.window!!.setBackgroundDrawable(getDrawable(R.drawable.background_alert))
        dialog2.window!!.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        dialog2.setCancelable(false)
        dialog2.window!!.attributes.windowAnimations = R.style.DialogAnimation

        val okay2 = dialog2.findViewById<Button>(R.id.btn_ok2)

        okay2.setOnClickListener {
            reaload()
            dialog2.dismiss()
        }
        binding.btnSiSignin.setOnClickListener {
            dialog2.show()
        }
    }

    /**
     * Función para mostrar una alerta de error al registrarse.
     */
    fun error(){
        dialog3 = Dialog(this)
        dialog3.setContentView(com.example.proyectois.R.layout.dialog_view_error_register)
        dialog3.window!!.setBackgroundDrawable(getDrawable(R.drawable.background_alert_error))
        dialog3.window!!.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog3.setCancelable(false)
        dialog3.window!!.attributes.windowAnimations = R.style.DialogAnimation

        val okay3 = dialog3.findViewById<Button>(R.id.btn_ok3)

        okay3.setOnClickListener {
            dialog3.dismiss()
        }
        binding.btnSiSignin.setOnClickListener {
            dialog3.show()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            val task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        }
    }

    /**
     * Función para manejo de errores.
     */
     fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account: GoogleSignInAccount = completedTask.getResult(ApiException::class.java)

            // Signed in successfully, show authenticated UI.
            updateUI(account)
        } catch (e: ApiException) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            //Log.w(TAG, "signInResult:failed code=" + e.statusCode)
            updateUI( null)
        }
    }

    /**
     * Función para mostrar el nombre y correo de las cuentas existentes.
     */
    fun updateUI(account: GoogleSignInAccount?) {
        if(account!= null){
            val intent = Intent(this, Pagina_principal::class.java)
            intent.putExtra("name", account.displayName )
            intent.putExtra("email", account.email)
            startActivity(intent)
        }
    }
}