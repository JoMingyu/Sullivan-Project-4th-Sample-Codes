package io.sullivanproject.practice02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mom_radioButton.setOnClickListener {
            imageView.setImageResource(R.drawable.mom_image)
            textView2.setText("엄마 사랑해요")
        }
        dad_radioButton.setOnClickListener {
            imageView.setImageResource(R.drawable.dad_image)
            textView2.setText("아빠 사랑해요")
        }
    }
}
