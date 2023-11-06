package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cat = Animal("Dog", "Info", "2")
        val dog = Animal("Cat", "Info", "4")
        val bird = Animal("Mouse", "Info", "1")

        val buttonCat = findViewById<Button>(R.id.button)
        buttonCat.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("animal", cat)
            startActivity(intent)
        }

        val buttonDog = findViewById<Button>(R.id.button2)
        buttonDog.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("animal", dog)
            startActivity(intent)
        }

        val buttonBird = findViewById<Button>(R.id.button3)
        buttonBird.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("animal", bird)
            startActivity(intent)
        }
    }
}