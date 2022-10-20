package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyectois.databinding.ActivityResetPasswordBinding
import com.google.firebase.auth.FirebaseAuth

private lateinit var binding: ActivityResetPasswordBinding

class ActivityResetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRpBack.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
        binding.btnRpSend.setOnClickListener{
            val email: String = binding.edtSiCorreo1.text.toString().trim { it <= ' '}
            if (email.isEmpty()){
               Toast.makeText(this@ActivityResetPassword,
               "Por favor, ingrese su correo electrónico.",
               Toast.LENGTH_SHORT
               ).show()
            }else{
                FirebaseAuth.getInstance().sendPasswordResetEmail(email)
                    .addOnCompleteListener{task ->
                        if(task.isSuccessful){
                            Toast.makeText(this@ActivityResetPassword,
                                "¡Se ha enviado el correo electrónico con éxito!",
                                Toast.LENGTH_LONG
                            ).show()

                            finish()

                        }else{
                            Toast.makeText(this@ActivityResetPassword,
                                task.exception!!.message.toString(),
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    }
            }
        }
    }
}