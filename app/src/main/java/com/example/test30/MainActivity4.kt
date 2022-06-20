package com.example.test30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import android.widget.Toast
import com.example.test30.databinding.ActivityMain4Binding
import com.example.test30.databinding.ActivityMainBinding

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etEmail.imeOptions = EditorInfo.IME_ACTION_NEXT//이메일칸에 입력하고 다음으로 넘어가게버튼
        binding.etPwd.imeOptions = EditorInfo.IME_ACTION_NEXT
        binding.etName.imeOptions = EditorInfo.IME_ACTION_NEXT

        //나이 입력하고 완료버튼 누르면 로그인 버튼눌리게
        //이 함수를 쓰는 방법은 구글링을 통해 알자
        //구글검색 [안드로이드 스튜디오 edittext 완료버튼]
        binding.etAge.setOnEditorActionListener { v, action, event ->
            var handled = false
            if (action == EditorInfo.IME_ACTION_DONE) {
                Login(v)
                handled = true
            }
            handled
        }
    }

    fun Login(v : View){
        Toast.makeText(this,"로그인 버튼 눌림", Toast.LENGTH_SHORT).show()
    }
}