package com.ap.linearlayout

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.linearlayout.R

class BolaActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etJari: EditText
    private lateinit var btnHitung: Button
    private lateinit var btnReset: Button
    private lateinit var tvHasil: TextView
    var phi = 3.14

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bola)

        etJari = findViewById(R.id.et_jari)
        btnHitung = findViewById(R.id.btn_hitung)
        btnReset = findViewById(R.id.btn_reset)
        tvHasil = findViewById(R.id.tv_hasil)

        btnHitung.setOnClickListener(this)
        btnReset.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val inpJari = etJari.text.toString().trim()

        if(v.id == R.id.btn_hitung) {
            var kosong = false
            if(inpJari.isEmpty()) {
                kosong = true
                etJari.error = "Harap Isi Jari-Jari"
            }
            if(!kosong) {
                val volume = phi * ( inpJari.toDouble() * inpJari.toDouble()
                        * inpJari.toDouble() ) * 4 / 3
                tvHasil.text = volume.toString() + " cm3"
            }
        }
        if(v.id == R.id.btn_reset) {
            etJari.run { setText("") }
            tvHasil.text = ""
        }
    }
}