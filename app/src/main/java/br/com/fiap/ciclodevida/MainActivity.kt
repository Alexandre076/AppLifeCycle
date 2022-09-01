package br.com.fiap.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("lifecycle-fiap", "onCreate")

    }


    override fun onResume() {
        super.onResume()
        Log.i("lifecycle-fiap", "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i("lifecycle-fiap", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("lifecycle-fiap", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("lifecycle-fiap", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lifecycle-fiap", "onDestroy")
    }
}