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
        var n = 1
        button.setOnClickListener {
            if (n==1) {
                textView.text = "Tapped 1 time"
            } else if (n>1) {
                textView.text = "tapped more than one time"
            }
            n++
        }
    }
}