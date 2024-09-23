package com.example.secondmobilelab

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logButton = findViewById<Button>(R.id.button_log)
        val inputText = findViewById<EditText>(R.id.edit_text)

        logButton.setOnClickListener {
            val message = inputText.text.toString()
            Log.v(TAG, "From EditText: $message")
        }

        Timber.plant(Timber.DebugTree())
        val anotherLog = findViewById<Button>(R.id.button_timber)
        anotherLog.setOnClickListener {
            val message = inputText.text.toString()
            Timber.v(message)
        }
    }
}