package com.bogo.customlistveiw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    lateinit var itemname:TextView
    lateinit var itemdtl:TextView
    lateinit var itemimg:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        itemname=findViewById(R.id.rose)
        itemdtl=findViewById(R.id.rosedtls)
        itemimg=findViewById(R.id.imageView)
        var name=intent.getStringExtra("name")
        var dtl=intent.getStringExtra("details")
        var img=intent.getIntExtra("image",R.drawable.rose)
        itemname.text=name
        itemdtl.text=dtl
        itemimg.setImageResource(img)
    }
}