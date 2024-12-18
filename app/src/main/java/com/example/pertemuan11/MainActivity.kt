package com.example.pertemuan11

import android.R.id.button1
import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)

        button1.setOnClickListener{
            btnClick(it)
        }

        button2.setOnClickListener{
            btn2Click(it)
        }

        button3.setOnClickListener() {
            btn3click(it)
        }

        button4.setOnClickListener {
            btn4click(it)
        }

    }

    fun btnClick(view : View) {
        val tlp = Intent(Intent.ACTION_DIAL, Uri.parse("tel:08123456789"))
        startActivity(tlp)
    }

    fun btn2Click(view : View) {
        val setting = Intent(android.provider.Settings.ACTION_SETTINGS)
        startActivity(setting)
        Toast.makeText(this, "you have Pressed : "+findViewById<Button>(R.id.button2).getText(), Toast.LENGTH_LONG).show()
    }

    fun btn3click(view : View) {
        val search = Intent(Intent.ACTION_WEB_SEARCH)
        search.putExtra(SearchManager.QUERY,"intent android")
        startActivity(search)
    }

    fun btn4click(view : View) {
        val myIntent = Intent();
        myIntent.setType("audio/mp3")
        myIntent.setAction(Intent.ACTION_GET_CONTENT)
        startActivity(myIntent)
    }



}