package com.example.frenchforall

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlin.Number

class MainActivity : AppCompatActivity() {

    lateinit var Numbers:Button
    lateinit var FamilyMembers:Button
    lateinit var Colors:Button
    lateinit var Phrases:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Numbers=findViewById(R.id.numbers)
        FamilyMembers=findViewById(R.id.familymembers)
        Colors=findViewById(R.id.colors)
        Phrases=findViewById(R.id.phrases)
    }

    fun openNumbers(androidView:View)
    {
        val intent1=Intent(this,com.example.frenchforall.Numbers::class.java)
        startActivity(intent1)
        Log.i("Activity","Numbers")
        Toast.makeText(this,"Show list of Numbers",Toast.LENGTH_SHORT).show()
    }

    fun openFamilyMembers(androidView:View)
    {
        val intent2=Intent(this,com.example.frenchforall.Family_Members::class.java)
        startActivity(intent2)
        Log.i("Activity","Family Members")
        Toast.makeText(this,"Show list of Family Members",Toast.LENGTH_SHORT).show()
    }

    fun openColors(androidView:View)
    {
        val intent3=Intent(this,com.example.frenchforall.Colors::class.java)
        startActivity(intent3)
        Log.i("Activity","Colors")
        Toast.makeText(this,"Show list of Colors",Toast.LENGTH_SHORT).show()
    }

    fun openPhrases(androidView:View)
    {
        val intent4=Intent(this,com.example.frenchforall.Phrases::class.java)
        startActivity(intent4)
        Log.i("Activity","Phrases")
        Toast.makeText(this,"Show list of Phrases",Toast.LENGTH_SHORT).show()
    }

}