package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyectois.databinding.ActivityResetPasswordBinding
import com.google.firebase.auth.FirebaseAuth

class ActivityResetPassword : AppCompatActivity() {

    /**
     * Declaramos las variables a utilizar.
     */
    private lateinit var binding: ActivityResetPasswordBinding

    /**
     * Función principal.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * Al dar click, mostramos la Pantalla principal.
         */
        binding.btnRpBack.setOnClickListener{
            startActivity(Intent(this,Inicio_Sesion::class.java))
            finish()
        }
        /**
         * Al dar click, llamamos a la función para enviar correo para recuperación de contraseña.
         */
        binding.btnRpSend.setOnClickListener{
            sendEmail()
            }
        }

    /**
     * Función para enviar correo para recuperación de contraseña.
     */
    fun sendEmail() {
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
                            Toast.LENGTH_LONG).show()
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