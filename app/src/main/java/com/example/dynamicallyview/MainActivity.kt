package com.example.dynamicallyview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_layout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  addButton.setOnClickListener{
            addView()
      //  }
    }

    fun addView() {
        val infalater = LayoutInflater.from(this).inflate(R.layout.item_layout, null)
        linearlayout.addView(infalater, linearlayout.childCount)
       val numText:EditText=infalater.findViewById(R.id.etText)

        numText.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                if (p0 != null) {
                    if (p0.length == 1) {
                        addView()
                    }
                }
            }

        })
    }
}