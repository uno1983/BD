package com.example.bd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addName.setOnClickListener{
            val db = DBHelper(this, null)
            val name = enterName.text.toString()
            val age = enterAge.text.toString()

            db.addName(name, age)
            Toast.makeText(this,name+ "addet to database", Toast.LENGTH_LONG).show()
            enterName.text.clear()
            enterAge.text.clear()

        }
        printName.setOnClickListener{
            val db = DBHelper(this,null)
            val cursor = db.get.Name ()
            cursor!!.moveToFirst()
            Name.append(cursor.getString)
        }
    }
}