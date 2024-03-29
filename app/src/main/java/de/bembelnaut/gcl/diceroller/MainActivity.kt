package de.bembelnaut.gcl.diceroller

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val dice = Dice(6)

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button)?.setOnClickListener {
            Toast.makeText(this, getString(R.string.dice_rolled), Toast.LENGTH_SHORT).show()

            val imageResource = when(dice.roll()) {
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.dice_1
            }

            findViewById<ImageView>(R.id.imageView)?.setImageResource(imageResource)
        }
    }
}