package com.example.test30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.test30.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)//인스턴스 만들기
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)//xml레이아웃 띄우고

        binding.btn.setOnClickListener {
            Toast.makeText(this,"토스트",Toast.LENGTH_SHORT).show()
        }
    }
}