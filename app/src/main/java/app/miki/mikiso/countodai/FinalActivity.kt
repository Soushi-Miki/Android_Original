package app.miki.mikiso.countodai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        //もう一回ボタンがタップされたら
        againButton.setOnClickListener {
            //クイズ画面へ移動する準備をする
            val question : Intent = Intent(this,MainActivity::class.java)
            //クイズ画面に移動する
            startActivity(question)
        }
    }
}