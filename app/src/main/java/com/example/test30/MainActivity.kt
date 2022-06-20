package com.example.test30

import android.content.Intent
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
            Toast.makeText(this,"activity main 2로 갑니다",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,MainActivity2::class.java))
        }

        binding.logbtn.setOnClickListener {
            Toast.makeText(this,"activity main 4로 갑니다",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,MainActivity4::class.java))
        }
    }
}