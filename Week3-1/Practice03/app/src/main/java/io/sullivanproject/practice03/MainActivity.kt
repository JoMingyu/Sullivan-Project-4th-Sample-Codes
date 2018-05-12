package io.sullivanproject.practice03

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var id = "Mingyu"
        var password = "1234"

        button.setOnClickListener {
            var inputId = editText.text.toString()
            var inputPassword = editText2.text.toString()

            if(id == inputId) {
                if(password == inputPassword) {
                    startActivity(Intent(this, SecondActivity::class.java))
                } else {
                    Toast.makeText(this, "틀렸엉", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "틀렸엉", Toast.LENGTH_LONG).show()
            }
        }
    }
}
