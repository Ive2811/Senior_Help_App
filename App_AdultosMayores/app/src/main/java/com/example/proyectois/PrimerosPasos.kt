package com.example.proyectois

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import android.media.MediaPlayer
import android.net.Uri


class PrimerosPasos : AppCompatActivity() {

    protected lateinit var inicio: VideoView
    protected lateinit var mMediaplayer: MediaPlayer
    protected var mCurrentVideoPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeros_pasos)


        inicio = findViewById(R.id.inicio)
        val uri= Uri.parse("android.resource://"
                                        + packageName
                                        + "/"
                                        + R.raw.primerospasos)

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
    }

    override fun onPause() {
        super.onPause()
        mCurrentVideoPosition = mMediaplayer.currentPosition
        inicio.pause()

    }

    override fun onResume() {
        super.onResume()

        inicio.start()
    }

    override fun onDestroy() {
        super.onDestroy()

        mMediaplayer.release()
    }
}