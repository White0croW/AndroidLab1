package com.example.androidlab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickCustomButton(view: View) {
        val inputText = findViewById<TextView>(R.id.inputText)
        val outputText = findViewById<TextView>(R.id.outputText)
        if (inputText.text.toString() == "") {
            Toast.makeText(this@MainActivity, "Текст не введен!", Toast.LENGTH_SHORT).show()
        } else {
            outputText.text = inputText.text.toString()
            outputText.visibility = VISIBLE
        }
    }
}