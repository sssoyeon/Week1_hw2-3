package com.soyeon.week1_hw2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class Main2Activity : AppCompatActivity() {
    var setTextNum : String ?= null
    var img : ImageView ?= null
    var preButton : Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        img = findViewById(R.id.main2_img1) as ImageView
        preButton = findViewById(R.id.main2_btn1) as Button

        setTextNum = getIntent().getStringExtra("textNum")

        if(setTextNum ==  "1")
           img!!.setImageResource(R.drawable.p1)
        else if(setTextNum == "2")
            img!!.setImageResource(R.drawable.p2)
        else if(setTextNum == "3")
            img!!.setImageResource(R.drawable.p3)
        else
            img!!.setImageResource(R.drawable.flower)

        preButton!!.setOnClickListener{
           finish()
        }
    }
}
