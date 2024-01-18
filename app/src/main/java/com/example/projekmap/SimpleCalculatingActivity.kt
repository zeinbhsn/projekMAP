package com.example.projekmap

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SimpleCalculatingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bayar)

        val calculateButton = findViewById<Button>(R.id.calculateButton)
        calculateButton.setOnClickListener { calculate() }
    }

    private fun calculate() {
        val input = findViewById<EditText>(R.id.inputEditText)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        val inputText = input.text.toString()
        if (inputText.isEmpty()) {
            resultTextView.text = "Masukan Jumlah Tiket."
            return
        }

        val inputNumber = inputText.toInt()
        val result = inputNumber * 35000
        resultTextView.text = "TOTAL: Rp. $result"
    }
}