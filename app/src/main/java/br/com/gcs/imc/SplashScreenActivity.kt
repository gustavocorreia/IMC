package br.com.gcs.imc

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        load()
    }

    private  fun load() {
        Handler(Looper.getMainLooper()).postDelayed({
            showMain()
        }, 3500L)
    }

    private  fun showMain() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}