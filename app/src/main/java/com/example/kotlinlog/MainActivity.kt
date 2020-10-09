package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("佐藤", 30, "野球") //名前を佐藤、年齢30歳、趣味野球でHumanのインスタンスを作る
        human1.say()
        human1.think()

        val human2 = Human("鈴木", 25,"将棋") //名前を鈴木、年齢25歳で、趣味将棋でHumanのインスタンスを作る
        human2.say()
        human2.think()
    }
}
