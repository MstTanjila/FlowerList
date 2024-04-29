package com.bogo.customlistveiw

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (
    private val context: Activity,
    private val titileTxt: Array<String>,
    private val descttxt: Array<String>,
    private val imageId: Array<Int>

):ArrayAdapter<String>(context,R.layout.listitem,titileTxt) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.listitem, parent, false)
        val title = rowView.findViewById<TextView>(R.id.flower)
        val desc = rowView.findViewById<TextView>(R.id.flowerdtl)
        val image = rowView.findViewById<ImageView>(R.id.image1)
        title.text = titileTxt[position]
        desc.text = descttxt[position]
        image.setImageResource(imageId[position])
        return rowView
    }
}