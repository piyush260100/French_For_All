package com.example.frenchforall

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ListView
import java.util.ArrayList

class Numbers : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)


        var num= mutableListOf<FrenchNum>()
        num.add(FrenchNum("Un","One",R.drawable.number_one))
        num.add(FrenchNum("Deux","Two",R.drawable.number_two))
        num.add(FrenchNum("Trois","Three",R.drawable.number_three))
        num.add(FrenchNum("Quatre","Four",R.drawable.number_four))
        num.add(FrenchNum("Five","Five",R.drawable.number_five))
        num.add(FrenchNum("Six","Six",R.drawable.number_six))
        num.add(FrenchNum("Sept","Seven",R.drawable.number_seven))
        num.add(FrenchNum("Huit","Eight",R.drawable.number_eight))
        num.add(FrenchNum("Neuf","Nine",R.drawable.number_nine))
        num.add(FrenchNum("Dix","Ten",R.drawable.number_ten))

      /*  var FrenchNumber=Array<String>(10){""}
        FrenchNumber[0]="Un"
        FrenchNumber[1]="Deux"
        FrenchNumber[2]="Trois"
        FrenchNumber[3]="Quatre"
        FrenchNumber[4]="Five"
        FrenchNumber[5]="Six"
        FrenchNumber[6]="Sept"
        FrenchNumber[7]="Huit"
        FrenchNumber[8]="Neuf"
        FrenchNumber[9]="Dix"
    */

       /* var EnglishNumber=Array<String>(10){""}
        EnglishNumber[0]="One"
        EnglishNumber[1]="Two"
        EnglishNumber[2]="Three"
        EnglishNumber[3]="Four"
        EnglishNumber[4]="Five"
        EnglishNumber[5]="Six"
        EnglishNumber[6]="Seven"
        EnglishNumber[7]="Eight"
        EnglishNumber[8]="Nine"
        EnglishNumber[9]="Ten"
    */

        val listview=findViewById<ListView>(R.id.numberlist2)

        val itemsAdapter = FrenchAdapter2(this,R.layout.activity_french_adapter2,num)

        listview.adapter=itemsAdapter

    }
}