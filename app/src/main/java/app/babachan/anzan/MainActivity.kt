package app.babachan.anzan

import android.content.Intent
import android.os.Bundle
import android.text.Editable
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


       val enterAnswer = answerTextView.editableText.toString()
        val answer = findViewById(R.id.answerTextView) as EditText
        val intEnterAnswer = enterAnswer.toIntOrNull()
//        val answer = findViewById<EditText>(R.id.answerTextView)


        var cpuAnswer = number + number1
        val cpu = cpuAnswer.toString()

        button.setOnClickListener {
            if (enterAnswer == cpu) {

                val intent: Intent = Intent(this, RightAnswer::class.java)
                intent.putExtra("OPERATOR", operator)
                intent.putExtra("NUMBER", number)
                intent.putExtra("NUMBER1", number1)
                intent.putExtra("ENTER", enterAnswer)

                startActivity(intent)

            } else {
                val intent1: Intent = Intent(this, WrongAnswer::class.java)
                intent.putExtra("OPERATOR", operator)
                intent.putExtra("NUMBER", number)
                intent.putExtra("NUMBER1", number1)
                intent.putExtra("ENTER",enterAnswer)

                startActivity(intent1)
            }


        }
    }
}