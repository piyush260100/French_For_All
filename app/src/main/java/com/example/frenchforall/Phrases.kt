package com.example.frenchforall

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import org.w3c.dom.Comment

class Phrases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phrases)

        var phrases= mutableListOf<frenchPhrase>()
        phrases.add(frenchPhrase("Je suis désolé(e)","I’m sorry"))
        phrases.add(frenchPhrase("Comment vous appelez-vous?"," What is your name?"))
        phrases.add(frenchPhrase("Parlez-vous anglais?","Do you speak English?"))
        phrases.add(frenchPhrase("Je m’appelle","My name is"))
        phrases.add(frenchPhrase("Quelle heure est-il?","What time is it?"))
        phrases.add(frenchPhrase("Pouvez-vous m’aider?","Can you help me?"))
        phrases.add(frenchPhrase("Combien ça coûte?","How much is this?"))
        phrases.add(frenchPhrase("Je t’aime","I love you"))
        phrases.add(frenchPhrase("Je m’appelle","My name is"))

        var phraselist=findViewById<ListView>(R.id.phrase_list)
        var phraseAdapter=PhraseAdapter2(this,R.layout.activity_phrase_adapter,phrases)

        phraselist.adapter=phraseAdapter

    }
}