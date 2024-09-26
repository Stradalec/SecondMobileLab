package com.example.secondmobilelab

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val Text:EditText = findViewById(R.id.edit_text)
        val BlackTextButton: Button = findViewById(R.id.button_blackText)
        val RedTextButton: Button = findViewById(R.id.button_redText)
        val SmallSizeButton: Button = findViewById(R.id.button_sizeFirst)
        val BigSizeButton: Button = findViewById(R.id.button_sizeSecond)
        val WhiteButton: Button = findViewById(R.id.button_white)
        val YellowButton: Button = findViewById(R.id.button_yellow)
        BlackTextButton.setOnClickListener()
        {
            Text.setTextColor(Color.BLACK);
        }

        RedTextButton.setOnClickListener()
        {
            Text.setTextColor(Color.RED);
        }

        SmallSizeButton.setOnClickListener()
        {
            Text.setTextSize(8F);
        }

        BigSizeButton.setOnClickListener()
        {
            Text.setTextSize(24F);
        }

        WhiteButton.setOnClickListener()
        {
            Text.setBackgroundColor(Color.WHITE);
        }

        YellowButton.setOnClickListener()
        {
            Text.setBackgroundColor(Color.YELLOW);
        }

    }
}