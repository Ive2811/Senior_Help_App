package com.example.proyectois

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.proyectois.databinding.ActivityAyudaBinding

class Ayuda : AppCompatActivity() {

    /**
     * Declaramos las variables a utilizar.
     */
    private lateinit var binding: ActivityAyudaBinding

    /**
     * Función principal.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAyudaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * Al dar click, mostramos la pantalla principal.
         */
        binding.imgbtnAyuHome.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }

        /**
         * Declaramos los botones.
         */
        val btn1 = findViewById<ImageButton>(R.id.imgbtn_ayu_consejo1)
        val btn2 = findViewById<ImageButton>(R.id.imgbtn_ayu_consejo2)
        val btn3 = findViewById<ImageButton>(R.id.imgbtn_ayu_consejo3)


        /**
         * Al dar click, reproducimos el audio referente al apartado de ayuda.
         */
        btn1.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.consejo1)
            mp.start()
        }
        btn2.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.consejo2)
            mp.start()
        }
        btn3.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.consejo3)
            mp.start()
        }

        /**
         * Al dar click, mostramos la pantalla principal.
         */
        binding.imgbtnAyuHome.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }
}