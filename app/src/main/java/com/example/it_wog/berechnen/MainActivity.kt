package com.example.it_wog.berechnen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var zahl1 = 0
    var zahl2 = 0
    var ergebnis = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
           // zahl1 = Integer.parseInt(editZahl1.text.toString())
           // zahl2 = Integer.parseInt(editZahl2.text.toString())
            var out = berechnen(Integer.parseInt(editZahl1.text.toString()), Integer.parseInt(editZahl2.text.toString()))
            textfeld.text = out
        }
    }

    fun berechnen (zahl1: Int, zahl2: Int) :String {
        var ergebnis = 0
        ergebnis = zahl1 + zahl2
        return ergebnis.toString()
    }
}
