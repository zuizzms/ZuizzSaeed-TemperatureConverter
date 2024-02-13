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

        val celsiusSeekBar = findViewById<SeekBar>(R.id.celsius_seekBar)
        val fahrenheitSeekBar = findViewById<SeekBar>(R.id.fahrenheit_seekBar)
        val celsiusTextView = findViewById<TextView>(R.id.celsius_textview)
        val fahrenheitTextView = findViewById<TextView>(R.id.fahrenheit_textview)
        val interestingMessageTextView = findViewById<TextView>(R.id.interesting_message)

        celsiusSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val celsiusValue = progress
                val fahrenheitValue = celsiusToFahrenheit(celsiusValue)
                celsiusTextView.text = "$celsiusValue°C"
                fahrenheitTextView.text = "$fahrenheitValue°F"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        fahrenheitSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val fahrenheitValue = progress
                val celsiusValue = fahrenheitToCelsius(fahrenheitValue)
                celsiusTextView.text = "$celsiusValue°C"
                fahrenheitTextView.text = "$fahrenheitValue°F"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }

    private fun celsiusToFahrenheit(celsius: Int): Int {
        return (celsius * 9 / 5) + 32
    }

    private fun fahrenheitToCelsius(fahrenheit: Int): Int {
        return ((fahrenheit - 32) * 5) / 9
    }
}