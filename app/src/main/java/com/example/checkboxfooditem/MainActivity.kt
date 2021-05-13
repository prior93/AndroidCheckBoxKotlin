package com.example.checkboxfooditem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pizza = findViewById<CheckBox>(R.id.checkBoxPizza)
        val hotDog = findViewById<CheckBox>(R.id.checkBoxHotdog)
        val burger = findViewById<CheckBox>(R.id.checkBoxBurger)
        val sprite = findViewById<CheckBox>(R.id.checkBoxSprite)
        val pepsi = findViewById<CheckBox>(R.id.checkBoxPepsi)
        val cola = findViewById<CheckBox>(R.id.checkBoxCola)
        val buttonTapped = findViewById<Button>(R.id.button)
        val bill = findViewById<TextView>(R.id.textView)

        var totalBill = 0
        pizza.setOnClickListener(View.OnClickListener {

            if (pizza.isChecked)
                totalBill += 5
            else
                totalBill -= 5
            bill.setText("Total Bill Amount is ${totalBill.toString()} $")
        })
        burger.setOnClickListener(View.OnClickListener {
            if (burger.isChecked)
                totalBill += 3
            else
                totalBill -= 3
            bill.setText("Total Bill Amount is ${totalBill.toString()} $")
        })

        hotDog.setOnClickListener(View.OnClickListener {
            if (hotDog.isChecked)
                totalBill += 2
                else
                    totalBill -= 2
            bill.setText("Total Bill Amount is ${totalBill.toString()} $")

        })

        pepsi.setOnClickListener(View.OnClickListener {
            if (pepsi.isChecked)
                totalBill += 1
                else
                    totalBill -= 1
            bill.setText("Total Bill Amount is ${totalBill.toString()} $")
        })

sprite.setOnClickListener(View.OnClickListener {
            if (sprite.isChecked)
                totalBill += 1
                else
                    totalBill -= 1
            bill.setText("Total Bill Amount is ${totalBill.toString()} $")
        })
cola.setOnClickListener(View.OnClickListener {
            if (cola.isChecked)
                totalBill += 1
                else
                    totalBill -= 1
            bill.setText("Total Bill Amount is ${totalBill.toString()} $")
        })

    }
}