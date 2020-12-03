package com.example.frenchforall

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class PhraseAdapter2(var mcontext:Context,var res:Int,var phrase:List<frenchPhrase>) :ArrayAdapter<frenchPhrase>(mcontext,res,phrase){
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        var inflater= LayoutInflater.from(mcontext)
        val rowView = inflater.inflate(res, null)

        var FrenchPhrase = rowView.findViewById(R.id.frenchphrase) as TextView
        var EnglishMeaning = rowView.findViewById(R.id.meaning) as TextView

        var mPhrase=phrase[position]
        FrenchPhrase.text =mPhrase.frenchphrase
        EnglishMeaning.text=mPhrase.englishmeaning

        return rowView
    }
}