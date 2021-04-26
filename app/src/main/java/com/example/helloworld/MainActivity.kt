package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var incrementNumber = 0

        var minus = findViewById<Button>(R.id.DecrementButton)
        var dispaly = findViewById<TextView>(R.id.texView)
        var plus = findViewById<Button>(R.id.IncrementButton)


        minus.setOnClickListener{
                incrementNumber-1
                dispaly.text = incrementNumber.toString()

        }
        plus.setOnClickListener{
            incrementNumber++
            dispaly.text = incrementNumber.toString()
        }
    }
}