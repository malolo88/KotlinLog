package com.example.kotlinlog

import android.util.Log

class Human: Animal, Thinkable {

    val hobby: String

    //superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int, hobby: String):super(name,age){
        this.hobby = hobby
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say(){
        Log.d("kotlintest","私の名前は"+this.name+"です。年は"+this.age+"歳です。")
    }

    //Thinkableインターフェースのメソッドをオーバーライド
    override fun think(){
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }


}