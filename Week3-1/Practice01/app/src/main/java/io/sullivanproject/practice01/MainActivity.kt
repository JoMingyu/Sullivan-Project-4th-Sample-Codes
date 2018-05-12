package io.sullivanproject.practice01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var a = editText.text.toString().toInt()
            var b = editText2.text.toString().toInt()

            var sum = a + b

            Toast.makeText(this, "${sum}", Toast.LENGTH_SHORT).show()
        }
    }
}
