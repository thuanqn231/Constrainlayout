package com.example.constrainlayout

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rcvTop = findViewById<RecyclerView>(R.id.rcvTop)
        rcvTop.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)

        val imgList = ArrayList<Image>()

        imgList.add(Image("image17"))
        imgList.add(Image("image17"))
        imgList.add(Image("image17"))
        imgList.add(Image("image17"))
        imgList.add(Image("image17"))
        imgList.add(Image("image17"))
        imgList.add(Image("image17"))

        var adapter = CustomAdapter(this,imgList)

        rcvTop.adapter = adapter

    }


}
