package com.example.kodama.kotlinexercises

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //テキストを定義
        this.textView = findViewById(R.id.sample_text)

        //ボタンを定義
        val sampleButton:Button = findViewById(R.id.sample_button)

        //ボタンのクリックリスナーをセット
        sampleButton.setOnClickListener(listener)

    }

    private val listener = object : View.OnClickListener{
        @Override
        override fun onClick(v : View?){
            textView!!.text = "sample button clicked"
        }
    }


}
