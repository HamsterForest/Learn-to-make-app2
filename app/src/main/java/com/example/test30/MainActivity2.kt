package com.example.test30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.test30.databinding.ActivityMain2Binding
import com.example.test30.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn2.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }
    fun DDuck(v: View){
        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tv.text="뚝"
    }
    fun ZZIck(v: View){
        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tv2.text="찍찍찍"
    }
}