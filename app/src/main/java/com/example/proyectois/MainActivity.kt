package com.example.proyectois

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectois.databinding.ActivityMainBinding
import com.example.proyectois.databinding.ActivityResetPasswordBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMainBinding
    private lateinit var dialog: Dialog
    private lateinit var dialog1: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth


            binding.btnInLogin.setOnClickListener{

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
        binding.txtInOlvid.setOnClickListener {
            startActivity(Intent(this,ActivityResetPassword::class.java))
        }
    }

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

