package com.ap.linearlayout

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.trimmedLength
import com.example.linearlayout.R

class LimasActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etSisi: EditText
    private lateinit var etTinggi: EditText
    private lateinit var btnHitung: Button
    private lateinit var btnReset: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_limas)

        etSisi = findViewById(R.id.et_sisi)
        etTinggi = findViewById(R.id.et_tinggi)
        btnHitung = findViewById(R.id.btn_hitung)
        btnReset = findViewById(R.id.btn_reset)
        tvHasil = findViewById(R.id.tv_hasil)

        btnHitung.setOnClickListener(this)
        btnReset.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        val inpSisi = etSisi.text.toString().trim()
        val inpTinggi = etTinggi.text.toString().trim()

        if(v.id == R.id.btn_hitung) {
            var kosong = false
            if(inpSisi.isEmpty()) {
                kosong = true
                etSisi.error = "Harap Isi Sisi Alas"
            }
            if(inpTinggi.isEmpty()) {
                kosong = true
                etTinggi.error = "Harap Isi Tinggi"
            }
            if(!kosong) {
                val volume = (inpSisi.toDouble() * inpSisi.toDouble()) *
                        inpTinggi.toDouble() / 3
                tvHasil.text = volume.toString() + " cm3"
            }
        }
        if(v.id == R.id.btn_reset) {
            etSisi.run { setText("") }
            etTinggi.setText("")
            tvHasil.text = ""
        }
    }
}