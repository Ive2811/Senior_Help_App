package com.example.proyectois

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectois.databinding.ActivityMisLogrosBinding
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size


private lateinit var binding: ActivityMisLogrosBinding

class MisLogros : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMisLogrosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgbtnMlAtras.setOnClickListener {
            startActivity(Intent(this, CapacitacionActivity::class.java))
        }

        binding.imgbtnMlLogro1.setOnClickListener {
            binding.viewKonfetti.build()
                .addColors(Color.RED, Color.GREEN, Color.MAGENTA, Color.BLUE)
                .setDirection(0.0, 359.0)
                .setSpeed(1f, 3f)
                .setFadeOutEnabled(true)
                .setTimeToLive(2000L)
                .addShapes(Shape.Square, Shape.Circle)
                .addSizes(Size(6))
                .setPosition(-50f,binding.viewKonfetti.width +50f, -50f, -50f)
                .streamFor(300, 5000L)
        }

        binding.imgbtnMlLogro2.setOnClickListener {

            binding.viewKonfetti.build()
                .addColors(Color.RED, Color.GREEN, Color.MAGENTA, Color.BLUE)
                .setDirection(0.0, 359.0)
                .setSpeed(1f, 3f)
                .setFadeOutEnabled(true)
                .setTimeToLive(2000L)
                .addShapes(Shape.Square, Shape.Circle)
                .addSizes(Size(6))
                .setPosition(-50f,binding.viewKonfetti.width +50f, -50f, -50f)
                .streamFor(300, 5000L)
        }
    }
}

