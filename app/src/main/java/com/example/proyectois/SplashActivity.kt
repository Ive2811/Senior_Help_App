package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         * Al cargar, mostramos la pantalla de Iniciar sesión.
         */
        startActivity(Intent(this,Inicio_Sesion::class.java))
    }
}