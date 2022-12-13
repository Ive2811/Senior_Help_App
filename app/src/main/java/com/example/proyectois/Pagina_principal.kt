package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectois.databinding.ActivityPaginaPrincipalBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Pagina_principal : AppCompatActivity() {

    /**
     * Declaramos las variables a utilizar.
     */
    private lateinit var binding: ActivityPaginaPrincipalBinding

    /**
     * Función principal.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaginaPrincipalBinding.inflate(layoutInflater)
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

        /**
         * Al dar click, mostramos la pantalla de Preguntas frecuentes.
         */
        binding.imgbtnPpPreguntas.setOnClickListener {
            startActivity(Intent(this, Preguntas::class.java))
        }
    }

    /**
     * Función para cerrar sesión.
     */
     fun logOut() {
        Firebase.auth.signOut()

        val intent = Intent(applicationContext, Inicio_Sesion::class.java)
        startActivity(intent)
        finish()
    }
}