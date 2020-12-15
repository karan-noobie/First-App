package com.example.firstapp

//import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_2.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

        val var1 = btnRoll.setOnClickListener {
            Toast.makeText(this, "You clicked this button", Toast.LENGTH_SHORT).show()
            rollDice()
        }

//        btnAdd.setOnClickListener() {
//
//            val var1: Int
//            val var2: Int
//
//            try {
//                var1 = etVar1.text.toString().toInt()
//                var2 = etVar2.text.toString().toInt()
//            } catch (e: NumberFormatException) {
//                AlertDialog.Builder(this).setTitle("Invalid Operation")
//                    .setMessage("Please add both numbers to add them")
//                    .setPositiveButton("OK") {dialog, _ -> dialog.dismiss() }
//                    .setCancelable(false)
//                    .show()
//
//                return@setOnClickListener
//            }
//
//            val result = (var1 + var2).toString()
//            tvResult.text = result
        //Toast.makeText(this, "ADD Button was clicked", Toast.LENGTH_SHORT).show()
//        }
    }

    private fun rollDice() {

        val resource = when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        ivDice.setImageResource(resource)
    }
}