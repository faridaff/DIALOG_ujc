package com.example.dialog_ujc

import android.annotation.SuppressLint
import android.app.ProgressDialog.show
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombol = findViewById<Button>(R.id.tombolDialog)

        tombol.setOnClickListener {
            AlertDialog.Builder( this)
                .setTitle("MY PROFIL")
                .setMessage("AHMAD YUNUS FURQON")
                .setMessage("XI PPLG 2")
                .setMessage("2233276")
                .setPositiveButton( "Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Tombol YES Ditekan", Toast.LENGTH_LONG).show()
                })
                .setNegativeButton( "No",DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Tombol NO Ditekan",Toast.LENGTH_LONG).show()
                })
                .show()
            }

        }
}