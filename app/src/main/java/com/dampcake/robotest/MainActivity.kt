package com.dampcake.robotest

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView : TextView = findViewById<TextView>(R.id.textView)
        val button : Button = findViewById(R.id.button)
        button.setOnClickListener {
            textView.text = "Tapped!"
        }
    }
}