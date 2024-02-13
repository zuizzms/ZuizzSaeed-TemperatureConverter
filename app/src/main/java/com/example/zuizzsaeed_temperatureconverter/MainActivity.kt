package com.example.zuizzsaeed_temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val celsiusSeekBar: SeekBar = findViewById(R.id.celsius_seekBar)
        val fahrenheitSeekBar: SeekBar = findViewById(R.id.fahrenheit_seekBar)
        val celsiusTV: TextView = findViewById(R.id.celsius_textview)
        val fahrenheitTV: TextView = findViewById(R.id.fahrenheit_textview)
        val interestingMessage: TextView = findViewById(R.id.interesting_message)


    }
}