package com.example.frenchforall

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class FrenchAdapter2(var mcontext:Context,var res:Int,var num:List<FrenchNum>) : ArrayAdapter<FrenchNum>(mcontext,res,num)
{
        override fun getView(position: Int, view: View?, parent: ViewGroup): View {
            var inflater=LayoutInflater.from(mcontext)
            val rowView = inflater.inflate(res, null)

            var FrenchText = rowView.findViewById(R.id.frenchword) as TextView
            var EnglishText = rowView.findViewById(R.id.englishword) as TextView
            var image=rowView.findViewById<ImageView>(R.id.image)

            var mNum:FrenchNum=num[position]
            FrenchText.text =mNum.frenchword
            EnglishText.text=mNum.englishword
            image.setImageResource(mNum.imageid)

            return rowView
        }

    }