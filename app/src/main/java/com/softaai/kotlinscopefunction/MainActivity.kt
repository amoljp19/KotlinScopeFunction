package com.softaai.kotlinscopefunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hello_World_text_view.setText("${performLetOperation()}")
        //performLetOperation()
    }

    private fun performLetOperation() : Unit {
        val person = Person().let {
            it.name = "NewName"
        }
        print(person)
        return person
    }
}
