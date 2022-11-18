package com.example.proyectois

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.proyectois.databinding.ActivityMain3Binding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity3 : AppCompatActivity() {

    /**
     * Declaramos las variables a utilizar.
     */
    private lateinit var binding: ActivityMain3Binding

    /**
     * Función principal.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * Al dar click, llamamos a la función de cerrar sesión.
         */
        binding.btnPpLogout.setOnClickListener {
            logOut()
        }

        /**
         * Al dar click, mostramos la pantalla de Capacitación.
         */
        binding.imgbtnPpCap.setOnClickListener {
            startActivity(Intent(this, CapacitacionActivity::class.java))
        }
    }

    /**
     * Función para cerrar sesión.
     */
     fun logOut() {
        Firebase.auth.signOut()

        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}