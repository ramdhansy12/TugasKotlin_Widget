package com.example.tugaskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugaskotlin.databinding.ActivityMainBinding
import com.example.tugaskotlin.databinding.ActivityWidgetBinding

private lateinit var binding : ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Insialisasi Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
//        Memanggil layout binding menggunakan binding.root
        setContentView(binding.root)
//        Explicit intnent memanggil activity di projecet yang sama
        binding.btnwidget.setOnClickListener {
            val intent = Intent(this, Widget::class.java)
            startActivity(intent)
        }

        binding.btnintent.setOnClickListener {
            val intent = Intent (this, ImplicitIntentActivity::class.java)
            startActivity(intent)
        }
    }
}