package app.babachan.anzan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_right_answer.*
import kotlinx.android.synthetic.main.activity_wrong_answer.*

class WrongAnswer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrong_answer)

        val number = intent.getStringExtra("NUMBER")
        val number1 = intent.getStringExtra("NUMBER1")
        val operator = intent.getStringExtra("OPERATOR")
        val enterAnswer = intent.getStringExtra("ENTER")

        wrongtextView.text = number
        wrongTextView1.text = number1
        right.text = operator
        wrongAnswer.text = enterAnswer

    }
}