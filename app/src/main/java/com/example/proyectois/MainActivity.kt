package com.example.proyectois

import android.app.Dialog
import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.proyectois.databinding.ActivityMain2Binding
import com.example.proyectois.databinding.ActivityMainBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    /**
     * Declaramos las variables a utilizar.
     */
    private lateinit var googleSingnInClient: GoogleSignInClient
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMainBinding
    private lateinit var dialog: Dialog
    private lateinit var dialog1: Dialog

    /**
     * Función principal.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken("558434712800-e008t60j5klvm9clebv920grifes60tp.apps.googleusercontent.com")
            .requestEmail()
            .build()

        googleSingnInClient = GoogleSignIn.getClient(this, gso)

        /**
         * Al dar click, llamamos a la función de iniciar sesión con Google.
         */
        binding.btnInGoogle.setOnClickListener {
            signInGoogle()
        }

        /**
         * Al dar click, validamos el correo y contraseña ingresado.
         */
        binding.btnInLogin.setOnClickListener {

            val Email = binding.edtInCorreo1.text.toString()
            val Password = binding.edtInContra.text.toString()


            /**
             * Si los campos de correo y contraseña están vacíos, se muestra un mensaje.
             */
            when {
                Email.isEmpty() || Password.isEmpty() -> {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(
                        baseContext, "Autenticación fallida.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                /**
                 * Si no, llamamos a la función de iniciar sesión.
                 */
                else -> {
                    SignIn(Email, Password)

                }
            }
        }
        /**
         * Al dar click, mostramos la pantalla de Registrarse.
         */
        binding.txtInRegistro.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }

        /**
         * Al dar click, mostramos la pantalla principal.
         */
        binding.btnInNocreden.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }

        /**
         * Al dar click, mostramos la pantalla de Recuperar contraseña.
         */
        binding.txtInOlvid.setOnClickListener {
            startActivity(Intent(this, ActivityResetPassword::class.java))
        }
    }

    /**
     * Función para iniciar sesión con Google.
     */
    fun signInGoogle() {
        val signInIntent = googleSingnInClient.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {

            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java)!!
                Log.d(ContentValues.TAG, "firebaseAuthWithGoogle:" + account.id)
                firebaseAuthWithGoogle(account.idToken!!)
            }catch (e: ApiException) {
                Log.w(ContentValues.TAG, "El inicio de sesión con Google ha fallado.", e)
            }
        }
    }

    /**
     * Función para realizar la autenticación con Google.
     */
     fun firebaseAuthWithGoogle(idToken: String){
        val credential = GoogleAuthProvider.getCredential(idToken, null)
        auth.signInWithCredential(credential)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful){
                    Log.d(ContentValues.TAG, "signInWithCredential:success")
                    val user = auth.currentUser
                    updateUI(user)
                }else{
                    Log.w(ContentValues.TAG, "signInWithCredential:failture", task.exception)
                    updateUI(null)
                }
            }
       }

    /**
     * Función para mostrar el nombre de las cuentas existentes.
     */
    fun updateUI(user: FirebaseUser?) {
        if (user != null) {
            val intent = Intent(applicationContext, MainActivity3::class.java)
            intent.putExtra(
                EXTRA_NAME, user.displayName)
            startActivity(intent)
        }
    }
    companion object {
        const val RC_SIGN_IN = 1001
        const val EXTRA_NAME = "EXTRA NAME"
    }

    /**
     * Función para iniciar sesión con correo y contraseña.
     */
     fun SignIn (email: String, password : String){
        auth.signInWithEmailAndPassword(email, password)
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
        val intent = Intent( this, MainActivity3::class.java)
        this.startActivity(intent)
        finish()
    }

    /**
     * Función para mostrar una alerta de éxito al iniciar sesión.
     */
     fun success(){
        dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_view)
        dialog.window!!.setBackgroundDrawable(getDrawable(R.drawable.background_alert))
        dialog.window!!.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        dialog.setCancelable(false)
        dialog.window!!.attributes.windowAnimations = R.style.DialogAnimation

        val okay = dialog.findViewById<Button>(R.id.btn_ok1)

        okay.setOnClickListener {
            reaload()
            dialog.dismiss()
        }
        binding.btnInLogin.setOnClickListener {
            dialog.show()
        }
    }

    /**
     * Función para mostrar una alerta de error al iniciar sesión.
     */

     fun error(){
        dialog1 = Dialog(this)
        dialog1.setContentView(R.layout.dialog_view_error)
        dialog1.window!!.setBackgroundDrawable(getDrawable(R.drawable.background_alert_error))
        dialog1.window!!.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog1.setCancelable(false)
        dialog1.window!!.attributes.windowAnimations = R.style.DialogAnimation

        val okay1 = dialog1.findViewById<Button>(R.id.btn_ok)

        okay1.setOnClickListener {
            dialog1.dismiss()
        }
        binding.btnInLogin.setOnClickListener {
            dialog1.show()
        }
    }
}

