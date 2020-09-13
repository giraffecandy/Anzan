package app.babachan.anzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_right_answer.*

class RightAnswer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_answer)

val questionText = intent.getStringExtra("question")
        val enterAnswer = intent.getStringExtra("answer")
        val correctAnswer = intent.getStringExtra("correct")

        question.text = questionText
        answerText.text = enterAnswer

        if(enterAnswer == correctAnswer){
            imageView3.setImageResource(R.drawable.correct_image)
            imageView2.setImageResource(R.drawable.randy_happy_image)
        }else{
            imageView3.setImageResource(R.drawable.miss_image)
            imageView2.setImageResource(R.drawable.randy_sad_image)
        }

        button2.setOnClickListener {
            val questionPage = Intent(this, MainActivity::class.java)
            startActivity(questionPage)
            finish()
        }
    }
}