package com.example.proyectois

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.util.PatternsCompat
import com.example.proyectois.databinding.ActivityMain2Binding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import java.util.regex.Pattern

class MainActivity2 : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMain2Binding
    private lateinit var dialog: Dialog
    private lateinit var dialog1: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        auth= Firebase.auth

        binding.txtSiRegistro.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

        binding.btnSiSignin.setOnClickListener{

            validate()

            val Email = binding.edtSiCorreo1.text.toString()
            val Password = binding.edtSiContra1.text.toString()
            createAccount(Email, Password)
        }
    }
    private fun createAccount(email : String, password : String){
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                  success()
                    reaload()
                } else {
                   error()
                }
            }
         }
    private fun reaload() {
        val intent = Intent( this, MainActivity::class.java)
        this.startActivity(intent)
    }

    private fun validatePassword() : Boolean{
        val password = binding.edtSiContra.editText?.text.toString()
        val confirmpassword = binding.edtSiRepeat.editText?.text.toString()
        val passwordRegex = Pattern.compile(
            "^" +
                    "(?=.*[0-9])" +
                    "(?=.*[a-z])" +
                    "(?=.*[@#$%^&+=])" +
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

    private fun confirmPassword() : Boolean{
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

    private fun validateEmail() : Boolean {
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
    private fun validateName() : Boolean {
        val name = binding.edtSiNombre.editText?.text.toString()
        return if (name.isEmpty()){
            binding.edtSiNombre.error = "El campo no puede quedar vacío."
            false
        }else{
            binding.edtSiNombre.error = null
            true
        }
    }

    private fun validate(){

        val result = arrayOf(validateEmail(), validatePassword(), validateName(), confirmPassword())
        if (false in result){
            return
        }
        Toast.makeText(this,"Éxito", Toast.LENGTH_SHORT).show()
    }

    private fun success(){
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

        binding.btnSiSignin.setOnClickListener {
            dialog.show()
        }
    }

    private fun error(){
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

        binding.btnSiSignin.setOnClickListener {
            dialog1.show()
        }
    }
}