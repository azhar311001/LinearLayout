package com.ap.linearlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.linearlayout.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cvKerucut = findViewById<CardView>(R.id.cv_kerucut)
        val cvLimas = findViewById<CardView>(R.id.cv_limas)
        val cvBola = findViewById<CardView>(R.id.cv_bola)

        cvKerucut.setOnClickListener {
            val i = Intent(this, KerucutActivity::class.java)
            startActivity(i)
        }
        cvLimas.setOnClickListener {
            val i = Intent(this, LimasActivity::class.java)
            startActivity(i)
        }
        cvBola.setOnClickListener {
            val i = Intent(this, BolaActivity::class.java)
            startActivity(i)
        }
    }
}