package com.example.calculata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

enum class MathOperation {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION,
    NONE
}

class MainActivity : AppCompatActivity() {
    var equationText = ""

    //var operations = arrayOf(Operation(0, MathOperation.NONE)) //  258/NONE, 58/ADDITION, 65/ADDITION, 6
    var pointer = 0
    var symbols:String = ""
    var symbols2: MathOperation = MathOperation.NONE
    var x:Double = 0.0
    var y:Double = 0.0
    //input number
    //input symbol
    //input another number
    //get result or add more symbol
    //clear or add more number repeat
    fun addition (): Double {
        return x + y
    }

    fun minus():Double {
        return x - y
    }

    fun multiply(): Double {
        return x * y
    }

    fun divide(): Double {
        return x / y
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button0.setOnClickListener{
            if (pointer >= 1) {
            equationText += "0"
                if(symbols == ""){
                    x = equationText.toDouble()
                }else{
                    y = equationText.toDouble()
                }
            equation.text = equationText
            println(equationText)

            } else {
                pointer=0
            }
            pointer ++
        }
        button1.setOnClickListener{
            if(equationText == "0"||(symbols!=""&&pointer==0)){
                equationText="1"
            }else {equationText += "1"}
            pointer++

            if(symbols == ""){
            x = equationText.toDouble()
            }else{
                y = equationText.toDouble()
            }
            equation.text = equationText
                    println(equationText)
        }
        button2.setOnClickListener{
            if(equationText=="0" ||(symbols!=""&&pointer==0)){
                equationText="2"
            }else {equationText += "2"}
            pointer++

            if(symbols == ""){
                x = equationText.toDouble()
            }else{
                y = equationText.toDouble()
            }
            equation.text = equationText
        }
        button3.setOnClickListener{
            if(equationText=="0" || (symbols!=""&&pointer==0)){
                equationText="3"
            }else {equationText += "3"}
            pointer++

            if(symbols == ""){
                x = equationText.toDouble()
            }else{
                y = equationText.toDouble()
            }
            equation.text = equationText
        }
        button4.setOnClickListener{
            if(equationText=="0" || (symbols!=""&&pointer==0)){
                equationText="4"
            }else {equationText += "4"}
            pointer++

            if(symbols == ""){
                x = equationText.toDouble()
            }else{
                y = equationText.toDouble()
            }
            equation.text = equationText
        }
        button5.setOnClickListener {
            if(equationText=="0" || (symbols!=""&&pointer==0)){
                equationText="5"
            }else {equationText += "5"}
            pointer++

            if(symbols == ""){
                x = equationText.toDouble()
            }else{
                y = equationText.toDouble()
            }
            equation.text = equationText
        }
        button6.setOnClickListener{
            if(equationText=="0" || (symbols!=""&&pointer==0)){
                equationText="6"
            }else {equationText += "6"}
            pointer++

            if(symbols == ""){
                x = equationText.toDouble()
            }else{
                y = equationText.toDouble()
            }
            equation.text = equationText
        }
        button7.setOnClickListener{
            if(equationText=="0" || (symbols!=""&&pointer==0)){
                equationText="7"
            }else {equationText += "7"}
            pointer++

            if(symbols == ""){
                x = equationText.toDouble()
            }else{
                y = equationText.toDouble()
            }
            equation.text = equationText
        }
        button8.setOnClickListener{
            if(equationText=="0" || (symbols!=""&&pointer==0)){
                equationText="8"
            }else {equationText += "8"}
            pointer++

            if(symbols == ""){
                x = equationText.toDouble()
            }else{
                y = equationText.toDouble()
            }
            equation.text = equationText
        }
        button9.setOnClickListener{
            if(equationText=="0" || (symbols!=""&&pointer==0)){
                equationText="9"
            }else {equationText += "9"}
            pointer++

            if(symbols == ""){
                x = equationText.toDouble()
            }else{
                y = equationText.toDouble()
            }
            equation.text = equationText
        }
        buttonPlus.setOnClickListener {
            pointer=0
            if(symbols == "plus"){
                addition()
                println(addition())
                equationText = addition().toString()
            }else if(symbols == "minus"){
                minus()
                equationText = minus().toString()
                symbols = "plus"
            }else if(symbols=="multiply"){
                multiply()
                equationText = multiply().toString()
                symbols = "plus"
            }else if(symbols =="divide"){
                divide()
                equationText = divide().toString()
                symbols = "plus"
            }else if (symbols==""){
                symbols="plus"
            }
            equation.text = equationText
            x = equationText.toDouble()
        }

        buttonMinus.setOnClickListener{
            pointer=0
            if(symbols == "plus"){
                addition()
                println(addition())
                equationText = addition().toString()
                symbols = "minus"
            }else if(symbols == "minus"){
                minus()
                equationText = minus().toString()
            }else if(symbols=="multiply"){
                multiply()
                equationText = multiply().toString()
                symbols = "minus"
            }else if(symbols =="divide"){
                divide()
                equationText = divide().toString()
                symbols = "minus"
            }else if (symbols==""){
                symbols="minus"
            }
            equation.text = equationText
            x = equationText.toDouble()
        }
        buttonMultiply.setOnClickListener{
            pointer=0
            if(symbols == "plus"){
                addition()
                println(addition())
                equationText = addition().toString()
                symbols = "multiply"
            }else if(symbols == "minus"){
                minus()
                equationText = minus().toString()
                symbols = "multiply"
            }else if(symbols=="multiply"){
                multiply()
                equationText = multiply().toString()
            }else if(symbols =="divide"){
                divide()
                equationText = divide().toString()
                symbols = "multiply"
            }else if (symbols==""){
                symbols="multiply"
            }
            equation.text = equationText
            x = equationText.toDouble()
        }
        buttonDivide.setOnClickListener{
            pointer=0
            if(symbols == "plus"){
                addition()
                println(addition())
                equationText = addition().toString()
                symbols = "divide"
            }else if(symbols == "minus"){
                minus()
                equationText = minus().toString()
                symbols = "divide"
            }else if(symbols=="multiply"){
                multiply()
                equationText = multiply().toString()
                symbols = "divide"
            }else if(symbols =="divide"){
                divide()
                equationText = divide().toString()
            }else if (symbols==""){
                symbols="divide"
            }
            equation.text = equationText
            x = equationText.toDouble()
        }
        buttonEqual.setOnClickListener{
            when(symbols2) {
                MathOperation.ADDITION -> {
                    addition()
                    println(addition())
                }
                MathOperation.SUBTRACTION -> {
                    addition()
                    println(addition())
                }
                MathOperation.MULTIPLICATION -> {
                    addition()
                    println(addition())
                }
                MathOperation.DIVISION -> {
                    addition()
                    println(addition())
                }
                MathOperation.NONE -> println("None")
            }

        if(symbols == "plus"){
            addition()
            println(addition())
        equationText = addition().toString()
        }else if(symbols == "minus"){
            minus()
            equationText = minus().toString()
        }else if(symbols=="multiply"){
            multiply()
            equationText = multiply().toString()
        }else if(symbols =="divide"){
            divide()
            equationText = divide().toString()
        }
            equation.text = equationText
            x = equationText.toDouble()
            symbols = ""
        }
        buttonErase.setOnClickListener{
            equationText = "0"
            symbols = ""
            x=0.0
            y=0.0
            pointer = 0
            equation.text = equationText
        }

    }
}