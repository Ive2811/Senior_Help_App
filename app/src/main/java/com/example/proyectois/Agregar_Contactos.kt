package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import android.media.MediaPlayer
import android.net.Uri
import com.example.proyectois.databinding.ActivityAgregarContactosBinding



class Agregar_Contactos : AppCompatActivity() {

    /**
     * Declaramos las variables a utilizar.
     */
    private lateinit var binding: ActivityAgregarContactosBinding
    protected lateinit var inicio: VideoView
    protected lateinit var mMediaplayer: MediaPlayer
    protected var mCurrentVideoPosition: Int = 0

    /**
     * Función principal.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgregarContactosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * Definimos la ruta de ubicación de los vídeos.
         */
        inicio = findViewById(R.id.video1_prp_inicio)
        val uri= Uri.parse("android.resource://"
                + packageName
                + "/"
                + R.raw.video1)
        inicio.setVideoURI(uri)
        inicio.start()
        inicio.setOnPreparedListener{ np ->
            mMediaplayer = np
            mMediaplayer.isLooping = true

            if(mCurrentVideoPosition != 0){
                mMediaplayer.seekTo(mCurrentVideoPosition)
                mMediaplayer.start()
            }
        }

        /**
         * Al dar click, mostramos la Pantalla principal.
         */
        binding.imgbtnPrpHome.setOnClickListener {
            startActivity(Intent(this, Pagina_principal::class.java))
        }
    }

    /**
     * Función para pausar el video.
     */
    override fun onPause() {
        super.onPause()
        mCurrentVideoPosition = mMediaplayer.currentPosition
        inicio.pause()

    }

    /**
     * Función para iniciar el video.
     */
    override fun onResume() {
        super.onResume()
        inicio.start()
    }

    /**
     * Función para finalizar el video.
     */
    override fun onDestroy() {
        super.onDestroy()
        mMediaplayer.release()
    }


}