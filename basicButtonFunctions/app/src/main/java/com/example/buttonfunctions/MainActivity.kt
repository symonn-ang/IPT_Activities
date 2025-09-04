package com.example.buttonfunctions

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.graphics.Color
import androidx.constraintlayout.widget.ConstraintLayout
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var mainLayout: ConstraintLayout
    private lateinit var superButtton1: Button
    private lateinit var superButtton2: Button
    private lateinit var superButtton3: Button
    private lateinit var textView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        // Find views
        mainLayout = findViewById(R.id.main)
        superButtton1 = findViewById(R.id.superButtton1)
        superButtton2 = findViewById(R.id.superButtton2)
        superButtton3 = findViewById(R.id.superButtton3)
        textView2 = findViewById(R.id.textView2)

        // Button 1 - Change background color to black
        superButtton1.setOnClickListener {
            mainLayout.setBackgroundColor(Color.BLACK)
        }

        // Button 2 - Change text of textView2
        superButtton2.setOnClickListener {
            textView2.text = "here's the magic!"
        }

        // Button 3 - Navigate to SecondActivity
        superButtton3.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}