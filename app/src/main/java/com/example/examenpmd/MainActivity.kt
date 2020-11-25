package com.example.examenpmd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b0 = findViewById<TextView>(R.id.b0)
        val editTextNumero = findViewById<EditText>(R.id.etNumero)

        editTextNumero.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                s?.let {

                    var lista=listOf(editTextNumero.getText())

                    if (lista.size>=4)
                        //b0.setEnabled(true)
                        b0.isEnabled = true

                }
            }
        })

        b0.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)

            val lista=mutableListOf("Hola", "que", "tal")
            val contenidoTV=3

            /*intent.putExtra(SecondActivity.LISTA,lista)
            intent.putExtra(SecondActivity.NUMERO,contenidoTV)*/


            startActivity(intent)

        }


    }





}