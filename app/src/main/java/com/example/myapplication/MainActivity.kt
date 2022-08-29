package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        button.setOnClickListener {
            textView.text =(Integer.parseInt(textView.text.toString())+ 3).toString()
        }
        button2.setOnClickListener {
            textView.text =(Integer.parseInt(textView.text.toString())+ 2).toString()
        }
        button3.setOnClickListener {
            textView.text =(Integer.parseInt(textView.text.toString())+ 1).toString()
        }


        button4.setOnClickListener {
            textView2.text =(Integer.parseInt(textView2.text.toString())+ 3).toString()
        }
        button5.setOnClickListener {
            textView2.text =(Integer.parseInt(textView2.text.toString())+ 2).toString()
        }
        button6.setOnClickListener {
            textView2.text =(Integer.parseInt(textView2.text.toString())+ 1).toString()
        }

        button7.setOnClickListener {
            textView.text = "0"
            textView2.text = "0"
        }

    }
}