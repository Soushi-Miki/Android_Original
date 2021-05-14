package app.miki.mikiso.countodai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        //カウント画面へ移動する準備をする
        val question: Intent = Intent(this,MainActivity::class.java)
        //Goボタンがタップされたら
        goButton.setOnClickListener {

            //カウント画面に移動する
            startActivity(question)
        }
    }
}