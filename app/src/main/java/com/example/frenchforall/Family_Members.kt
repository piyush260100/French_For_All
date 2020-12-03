package com.example.frenchforall

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Family_Members : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family__members)

        var family= mutableListOf<FrenchNum>()
        family.add(FrenchNum("Grand-père","Grandfather",R.drawable.family_grandfather))
        family.add(FrenchNum("Grand-mère","Grandmother",R.drawable.family_grandmother))
        family.add(FrenchNum("Père","Father",R.drawable.family_father))
        family.add(FrenchNum("Mere","Mother",R.drawable.family_mother))
        family.add(FrenchNum("Oncle","Uncle",R.drawable.family_older_brother))
        family.add(FrenchNum("tante","Aunt",R.drawable.family_older_sister))
        family.add(FrenchNum("Frere","Brother",R.drawable.family_younger_brother))
        family.add(FrenchNum("Sœur","Sister",R.drawable.family_younger_sister))
        family.add(FrenchNum("Fils","Son",R.drawable.family_son))
        family.add(FrenchNum("Fille","Daughter",R.drawable.family_daughter))

        var familyList=findViewById<ListView>(R.id.family_member_list)
        var familyAdapter=FrenchAdapter2(this,R.layout.activity_french_adapter2,family)
        familyList.adapter=familyAdapter
    }
}