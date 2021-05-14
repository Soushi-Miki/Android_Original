package app.miki.mikiso.countodai

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        //Final画面へ移動する準備をする
        val final : Intent = Intent(this,FinalActivity::class.java)
        //falseボタンがタップされたら
        falseButton.setOnClickListener {
            //Final Activityに移動する
            startActivity(final)
        }
        val truesound1 = MediaPlayer.create(this, R.raw.huseikai)
        true1.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                truesound1.seekTo(0)
                truesound1.start()
            }
            true
        }

        val truesound2 = MediaPlayer.create(this, R.raw.huseikai)
        true2.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                truesound2.seekTo(0)
                truesound2.start()
            }
            true
        }
        val truesound3 = MediaPlayer.create(this, R.raw.huseikai)
        true3.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                truesound3.seekTo(0)
                truesound3.start()
            }
            true
        }
        val truesound4 = MediaPlayer.create(this, R.raw.huseikai)
        true4.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                truesound4.seekTo(0)
                truesound4.start()
            }
            true
        }
        val truesound5 = MediaPlayer.create(this, R.raw.huseikai)
        true5.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                truesound5.seekTo(0)
                truesound5.start()
            }
            true
        }
        val truesound6 = MediaPlayer.create(this, R.raw.huseikai)
        true6.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                truesound6.seekTo(0)
                truesound6.start()
            }
            true
        }
        val truesound7 = MediaPlayer.create(this, R.raw.huseikai)
        true7.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                truesound7.seekTo(0)
                truesound7.start()
            }
            true
        }
        val truesound8 = MediaPlayer.create(this, R.raw.huseikai)
        true8.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                truesound8.seekTo(0)
                truesound8.start()
            }
            true
        }
    }
}