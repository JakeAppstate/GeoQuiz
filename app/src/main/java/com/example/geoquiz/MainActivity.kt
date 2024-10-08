package com.example.geoquiz

import android.os.Bundle
import android.widget.Button
//import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener {
//            Toast.makeText(
//                this,
//                R.string.correct_toast,
//                Toast.LENGTH_SHORT
//            ).show()
            Snackbar.make(
                findViewById(R.id.main),
                R.string.correct_toast,
                Snackbar.LENGTH_SHORT
            ).show()
        }

        falseButton.setOnClickListener {
//            Toast.makeText(
//                this,
//                R.string.incorrect_toast,
//                Toast.LENGTH_SHORT
//            ).show()
            Snackbar.make(
                findViewById(R.id.main),
                R.string.incorrect_toast,
                Snackbar.LENGTH_SHORT
            ).show()
        }
    }
}