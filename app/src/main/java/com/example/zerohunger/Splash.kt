package com.example.zerohunger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import java.util.*
import kotlin.concurrent.schedule

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        anime()
        FirstSR()
    }
    private fun anime(){
        val wave: ImageView = findViewById(R.id.waveshine)
        wave.animate().apply {
            duration = 10000
            alpha(1.0f)
        }
    }
    private fun FirstSR(){
        Timer("Setting",false).schedule(10000){
            val nest = Intent(this@Splash,MainActivity2::class.java)
            startActivity(nest)
            finish()
        }

    }
}