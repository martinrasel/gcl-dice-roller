package de.bembelnaut.glc.diceroller

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val dice = Dice(6)

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.textView)?.text = ""

        findViewById<Button>(R.id.button)?.setOnClickListener {
            Toast.makeText(this, getString(R.string.dice_rolled), Toast.LENGTH_SHORT).show()

            val textView = findViewById<TextView>(R.id.textView)
            textView?.setText(dice.roll().toString()) ?: ""
        }
    }
}