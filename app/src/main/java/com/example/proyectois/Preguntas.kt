package com.example.proyectois

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.proyectois.databinding.ActivityPreguntasBinding


class Preguntas : AppCompatActivity() {

    /**
     * Declaramos las variables a utilizar.
     */
    private lateinit var binding: ActivityPreguntasBinding

    /**
     * Función principal.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreguntasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * Declaramos los botones.
         */
        val btn1 = findViewById<Button>(R.id.btn_respuesta1)
        val btn2 = findViewById<Button>(R.id.btn_respuesta2)
        val btn3 = findViewById<Button>(R.id.btn_respuesta3)

        /**
         * Al dar click, reproducimos el audio referente al apartado de cada pregunta.
         */
        btn1.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.respuesta1)
            mp.start()
        }
        btn2.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.respuesta2)
            mp.start()
        }
        btn3.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.respuesta3)
            mp.start()
        }

        /**
         * Al dar click, mostramos la pantalla principal.
         */
        binding.imgbtnPreHome.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }
}