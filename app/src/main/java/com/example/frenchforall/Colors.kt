package com.example.frenchforall

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Colors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors)

        var colors= mutableListOf<FrenchNum>()
        colors.add(FrenchNum("Rouge","Red",R.drawable.color_red))
        colors.add(FrenchNum("Jaune","Yellow",R.drawable.color_mustard_yellow))
        colors.add(FrenchNum("Blanc/Blanche","White",R.drawable.color_white))
        colors.add(FrenchNum("Orange","Orange",R.drawable.color_dusty_yellow))
        colors.add(FrenchNum("Vert/Verte","Green",R.drawable.color_green))
        colors.add(FrenchNum("Gris/Grise","Gray",R.drawable.color_gray))
        colors.add(FrenchNum("Marron","Brown",R.drawable.color_brown))
        colors.add(FrenchNum("Noir","Black",R.drawable.color_black))


        var colorlist=findViewById<ListView>(R.id.color_list)
        var colorAdapter=FrenchAdapter2(this,R.layout.activity_french_adapter2,colors)
        colorlist.adapter=colorAdapter
    }
}