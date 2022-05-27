package com.example.proyectois

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectois.databinding.ActivityMain2Binding
import com.example.proyectois.databinding.ActivityMainBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity() {

    private lateinit var googleSignInClient: GoogleSignInClient
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMainBinding
    private lateinit var dialog: Dialog
    private lateinit var dialog1: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        googleSignInClient = GoogleSignIn.getClient(this, gso)

        val button = findViewById<ImageButton>(R.id.btn_in_google)

        button.setOnClickListener{
            signIn()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        if (requestCode == 9901) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {

                val account = task.getResult(ApiException::class.java)!!
                Log.d("Success" , "name:" + account.displayName)
            } catch (e: ApiException) {
                Log.w("Error" , "Google sign in failed", e)
            }
        }
    }
    private fun signIn() {
        val signInIntent = googleSignInClient.signInIntent
        startActivityForResult(signInIntent, 9901)



        val sp= getSharedPreferences("my_prefs", MODE_PRIVATE)
        //checkLogin(sp)

        binding.btnInLogin.setOnClickListener{
            //rememberUser(sp)

            val Email = binding.edtInCorreo1.text.toString()
            val Password = binding.edtInContra.text.toString()

            when {
                Email.isEmpty() || Password.isEmpty() -> {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                } else -> {
                SignIn(Email,Password)

            }
            }
        }
        binding.txtInRegistro.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
    /*private fun rememberUser(sp: SharedPreferences) {
        val email = binding.edtInCorreo.editText?.text.toString()
        val password = binding.edtInContrasena.editText?.text.toString()

        if (email.isNotEmpty() && password.isNotEmpty()){
            val checkBox = binding.chkInRecord

            if (checkBox.isChecked){
               with(sp.edit()) {
                   putString("email", email)
                   putString("password", password)
                   putString("active", "true")
                   putString("remember", "true")

                   apply()
               }
               }else{
                with(sp.edit()) {
                    putString("active", "true")
                    putString("remember", "false")

                    apply()
                }
            }
            reaload()

        }else{
            Toast.makeText(this, "Ha ocurrido un error.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun checkLogin(sp : SharedPreferences){
        if (sp.getString("active", "") == "true"){
            reaload()
        }else{
            if (sp.getString("remember", "") == "true"){
                binding.edtInCorreo.editText?.setText(sp.getString("email", ""))
                binding.edtInContrasena.editText?.setText(sp.getString("password", ""))
            }

        }
    }*/

    private fun SignIn (email: String, password : String){
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->

                if (task.isSuccessful) {
                    success()

                } else {
                    error()
                }
            }
    }
    private fun reaload() {
        val intent = Intent( this, MainActivity3::class.java)
        this.startActivity(intent)
        finish()
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

        binding.btnInLogin.setOnClickListener {
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

        binding.btnInLogin.setOnClickListener {
            dialog1.show()
        }
    }

}

