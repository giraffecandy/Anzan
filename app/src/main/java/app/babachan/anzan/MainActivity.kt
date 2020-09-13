package app.babachan.anzan

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val number = (0..999).random()
        val number1 = (0..99).random()

        val operatorList = listOf<String>("+", "-")
        val index = (0..1).random()
        val operator = operatorList[index]

        operatorTextView.text = operator

        textView.text = number.toString()
        textView2.text = number1.toString()


//        val enterAnswer = answerTextView.editableText.toString()
//        val answer = findViewById(R.id.answerTextView) as EditText
//        val intEnterAnswer = enterAnswer.toIntOrNull()
//        val answer = findViewById<EditText>(R.id.answerTextView)
//
        var correctAnswer = 0
val inputText = findViewById(R.id.answerTextView) as EditText
        if (index == 0) {
            correctAnswer = number + number1
        } else {
            correctAnswer = number - number1
        }


        button.setOnClickListener {

            val enterAnswer = inputText.text.toString()
            if (enterAnswer.isNotEmpty()) {
                val questionText = number.toString() + operator + number1.toString() + "="
                val intent = Intent(this, RightAnswer::class.java)

                intent.putExtra("question", questionText)
                intent.putExtra("answer",enterAnswer)
                intent.putExtra("correct", correctAnswer.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}