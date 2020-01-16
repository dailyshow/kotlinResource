package com.cis.kotlinresource

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val str2 = resources.getString(R.string.str2)

            tv.text = str2

            tv.setText(str2)
        }

        btn2.setOnClickListener {
            tv.text = ""
            val strArray = resources.getStringArray(R.array.data_array)
            for (str1: String in strArray) {
                tv.append("${str1}\n")
            }
        }

        btn3.setOnClickListener {
            tv.setTextColor(Color.RED)

//            val color = Color.argb(50,126, 106, 129)
            val color = ContextCompat.getColor(this, R.color.color2)
            tv.setTextColor(color)
        }

        btn4.setOnClickListener {
            val px = resources.getDimension(R.dimen.px)
            val dp = resources.getDimension(R.dimen.dp)
            val sp = resources.getDimension(R.dimen.sp)
            val inch = resources.getDimension(R.dimen.inch)
            val mm = resources.getDimension(R.dimen.mm)
            val pt = resources.getDimension(R.dimen.pt)

            tv.text = "px : ${px}\n"
            tv.append("dp : ${dp}\n")
            tv.append("sp : ${sp}\n")
            tv.append("inch : ${inch}\n")
            tv.append("mm : ${mm}\n")
            tv.append("pt : ${pt}\n")
        }
    }
}
