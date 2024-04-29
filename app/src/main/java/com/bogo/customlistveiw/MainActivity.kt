package com.bogo.customlistveiw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val users = arrayOf(
        "Rose",
        "Marigold",
        "China rose",
        "Tube rose",
        "Orchid",
        "Tulipe"
    )
    val imagedtls = arrayOf<String>(
        "Queen of flower",
        "Winter flower",
        "Nice flower",
        "beautiful",
        "wow",
        "Lovely flower"
    )
    val images= arrayOf<Int>(
        R.drawable.rose,
        R.drawable.marigold,
        R.drawable.chainarose,
        R.drawable.tuberose,
        R.drawable.orchid,
        R.drawable.tulipe




    )
    val longDesc = arrayOf(
        "The rose is a type of flowering shrub. Its name comes from the Latin word Rosa.[1]There are over three hundred species and tens of thousands of cultivars. The flowers of the rose grow in many different colors, from the well-known red rose or yellow rose and sometimes white or purple rose. Rose thorns are actually prickles – outgrowths of the epidermisRoses belong to the family of plants called Rosaceae. All roses were originally wild: they grew in North America, Europe, northwest Africa and many parts of Asia and Oceania. There are over 150 different species of roses. The wild rose species can be grown in gardens, but most garden roses are cultivars, which have been selected by people.[2]Over hundreds of years they have been specially bred to produce a wide variety of growing habits and a broad range of colours from dark red to white including as well yellow and a bluish/lilac colour. Many roses have a strong, pleasant scent.Most roses have spines (incorrectly called prickles) on their stems. This is a common defense system in plants.Rose bushes are able to live in a wide variety of conditions. The fruit of the rose is called a hip or a haw or a hep. Some roses have decorative hips.",
        "The rose is a type of flowering shrub. Its name comes from the Latin word Rosa.[1]There are over three hundred species and tens of thousands of cultivars. The flowers of the rose grow in many different colors, from the well-known red rose or yellow rose and sometimes white or purple rose. Rose thorns are actually prickles – outgrowths of the epidermisRoses belong to the family of plants called Rosaceae. All roses were originally wild: they grew in North America, Europe, northwest Africa and many parts of Asia and Oceania. There are over 150 different species of roses. The wild rose species can be grown in gardens, but most garden roses are cultivars, which have been selected by people.[2]Over hundreds of years they have been specially bred to produce a wide variety of growing habits and a broad range of colours from dark red to white including as well yellow and a bluish/lilac colour. Many roses have a strong, pleasant scent.Most roses have spines (incorrectly called prickles) on their stems. This is a common defense system in plants.Rose bushes are able to live in a wide variety of conditions. The fruit of the rose is called a hip or a haw or a hep. Some roses have decorative hips.",
        "The rose is a type of flowering shrub. Its name comes from the Latin word Rosa.[1]There are over three hundred species and tens of thousands of cultivars. The flowers of the rose grow in many different colors, from the well-known red rose or yellow rose and sometimes white or purple rose. Rose thorns are actually prickles – outgrowths of the epidermisRoses belong to the family of plants called Rosaceae. All roses were originally wild: they grew in North America, Europe, northwest Africa and many parts of Asia and Oceania. There are over 150 different species of roses. The wild rose species can be grown in gardens, but most garden roses are cultivars, which have been selected by people.[2]Over hundreds of years they have been specially bred to produce a wide variety of growing habits and a broad range of colours from dark red to white including as well yellow and a bluish/lilac colour. Many roses have a strong, pleasant scent.Most roses have spines (incorrectly called prickles) on their stems. This is a common defense system in plants.Rose bushes are able to live in a wide variety of conditions. The fruit of the rose is called a hip or a haw or a hep. Some roses have decorative hips.",
        "The rose is a type of flowering shrub. Its name comes from the Latin word Rosa.[1]There are over three hundred species and tens of thousands of cultivars. The flowers of the rose grow in many different colors, from the well-known red rose or yellow rose and sometimes white or purple rose. Rose thorns are actually prickles – outgrowths of the epidermisRoses belong to the family of plants called Rosaceae. All roses were originally wild: they grew in North America, Europe, northwest Africa and many parts of Asia and Oceania. There are over 150 different species of roses. The wild rose species can be grown in gardens, but most garden roses are cultivars, which have been selected by people.[2]Over hundreds of years they have been specially bred to produce a wide variety of growing habits and a broad range of colours from dark red to white including as well yellow and a bluish/lilac colour. Many roses have a strong, pleasant scent.Most roses have spines (incorrectly called prickles) on their stems. This is a common defense system in plants.Rose bushes are able to live in a wide variety of conditions. The fruit of the rose is called a hip or a haw or a hep. Some roses have decorative hips.",
        "The rose is a type of flowering shrub. Its name comes from the Latin word Rosa.[1]There are over three hundred species and tens of thousands of cultivars. The flowers of the rose grow in many different colors, from the well-known red rose or yellow rose and sometimes white or purple rose. Rose thorns are actually prickles – outgrowths of the epidermisRoses belong to the family of plants called Rosaceae. All roses were originally wild: they grew in North America, Europe, northwest Africa and many parts of Asia and Oceania. There are over 150 different species of roses. The wild rose species can be grown in gardens, but most garden roses are cultivars, which have been selected by people.[2]Over hundreds of years they have been specially bred to produce a wide variety of growing habits and a broad range of colours from dark red to white including as well yellow and a bluish/lilac colour. Many roses have a strong, pleasant scent.Most roses have spines (incorrectly called prickles) on their stems. This is a common defense system in plants.Rose bushes are able to live in a wide variety of conditions. The fruit of the rose is called a hip or a haw or a hep. Some roses have decorative hips.",
        "The rose is a type of flowering shrub. Its name comes from the Latin word Rosa.[1]There are over three hundred species and tens of thousands of cultivars. The flowers of the rose grow in many different colors, from the well-known red rose or yellow rose and sometimes white or purple rose. Rose thorns are actually prickles – outgrowths of the epidermisRoses belong to the family of plants called Rosaceae. All roses were originally wild: they grew in North America, Europe, northwest Africa and many parts of Asia and Oceania. There are over 150 different species of roses. The wild rose species can be grown in gardens, but most garden roses are cultivars, which have been selected by people.[2]Over hundreds of years they have been specially bred to produce a wide variety of growing habits and a broad range of colours from dark red to white including as well yellow and a bluish/lilac colour. Many roses have a strong, pleasant scent.Most roses have spines (incorrectly called prickles) on their stems. This is a common defense system in plants.Rose bushes are able to live in a wide variety of conditions. The fruit of the rose is called a hip or a haw or a hep. Some roses have decorative hips.")
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView =findViewById(R.id.listView)
        val MyAdapter = MyAdapter(this,users, imagedtls,images)
        listView.adapter=MyAdapter
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"Clicked item"+parent.getItemAtPosition(position),Toast.LENGTH_SHORT).show()
            var intent = Intent(this,DetailsActivity::class.java)
            intent.putExtra("name",users[position])
            intent.putExtra("details",longDesc[position])
            intent.putExtra("image",images[position])
            startActivity(intent)
        }

        }


    }
