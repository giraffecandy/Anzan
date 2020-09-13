package app.babachan.anzan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_right_answer.*

class RightAnswer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_answer)

        val number = intent.getStringExtra("NUMBER")
        val number1 = intent.getStringExtra("NUMBER1")
        val operator = intent.getStringExtra("OPERATOR")
        val enterAnswer = intent.getStringExtra("ENTER")

        rightTextView.text = number
        righttextView1.text = number1
        rightOperator.text = operator
        answerText.text = enterAnswer

    }
}