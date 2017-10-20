package com.soyeon.week1_hw2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var editText : EditText?= null
    var nextButton : Button?=null
    var text : String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextButton = findViewById(R.id.main1_btn1) as Button
        editText = findViewById(R.id.etText1) as EditText

//        nextButton!!.setOnClickListener{
//            text = editText!!.text.toString();
//            var Intent = Intent(applicationContext, Main2Activity::class.java)
//            Intent.putExtra("textNum", text)
//            startActivity(Intent)
//        }

        //*****************심화과제*******************
        // builde.gralde파일에서 extension 추가하면 findViewById하지 않고 바로 Id로 접근 가능
        main1_btn1!!.setOnClickListener{
            text = editText!!.text.toString();
            var Intent = Intent(applicationContext, Main2Activity::class.java)
            Intent.putExtra("textNum", text)
            startActivity(Intent)
        }
    }
}
