package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi

class Activity2 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val animalName = intent.getParcelableExtra<Animal>("animal")
        val animalInfo = intent.getParcelableExtra<Animal>("animal")
        val animalAge = intent.getParcelableExtra<Animal>("animal")

        val textViewName = findViewById<TextView>(R.id.textView9)
        val textViewInfo = findViewById<TextView>(R.id.textView12)
        val textViewAge = findViewById<TextView>(R.id.tvAge)

        textViewName.text = animalName?.name
        textViewInfo.text = animalInfo?.info
        textViewAge.text = animalAge?.age
    }
}