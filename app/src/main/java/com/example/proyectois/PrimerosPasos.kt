package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import android.media.MediaPlayer
import android.net.Uri
import com.example.proyectois.databinding.ActivityPrimerosPasosBinding

private lateinit var binding: ActivityPrimerosPasosBinding

class PrimerosPasos : AppCompatActivity() {

    protected lateinit var inicio: VideoView
    protected lateinit var mMediaplayer: MediaPlayer
    protected var mCurrentVideoPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrimerosPasosBinding.inflate(layoutInflater)
        setContentView(binding.root)



        inicio = findViewById(R.id.video_prp_inicio)
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
        binding.imgbtnPrpHome.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
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