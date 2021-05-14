package app.miki.mikiso.countodai

import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.MotionEvent
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //残り秒数を10秒にセット
    var second = 5
    //タップを数える変数を準備する
    var tapCount = 0

    //タイマーを設定する
    val timer : CountDownTimer = object : CountDownTimer(5000,1000){
        override fun onFinish() {
            //STARTボタンを見える状態にする
            startButton.isVisible = true
            //残り秒数を10秒にセット
            second = 5
            //タップを数える変数を0に戻す
            tapCount = 0
        }

        override fun onTick(millisUntilFinished: Long) {
            //残り秒数にマイナス1する
            second = second - 1
            //残り秒数をテキストビューに反映する
            secondText.text = second.toString()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //STARTボタンがタップされた時に
        startButton.setOnClickListener {

            //タップされた数をテキストビューに反映する
            numberTextView.text = tapCount.toString()
            //STARTボタンを見えない状態にする
            startButton.isVisible = false

            //タイマーを開始する
            timer.start()
        }

        //ボタンがタップされた時に
        imageButton.setOnClickListener {
            //残り秒数が10秒より少ない時に
            if (second < 5) {
                //タップを数える変数にプラス1する
                tapCount = tapCount + 1
                //タップされた数をテキストビューに反映する
                numberTextView.text = tapCount.toString()
            }

        }



        val huseikaisound = MediaPlayer.create(this, R.raw.huseikai)
        huseikaiImage.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound.seekTo(0)
                huseikaisound.start()
            }
            true
        }
        val huseikaisound1 = MediaPlayer.create(this, R.raw.huseikai)
        huseikaiImage1.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound1.seekTo(0)
                huseikaisound1.start()
            }
            true
        }
        val huseikaisound2 = MediaPlayer.create(this, R.raw.huseikai2)
        huseikaiImage2.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound2.seekTo(0)
                huseikaisound2.start()
            }
            true
        }
        val huseikaisound3 = MediaPlayer.create(this, R.raw.huseikai)
        huseikaiImage3.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound3.seekTo(0)
                huseikaisound3.start()
            }
            true
        }
        val huseikaisound4 = MediaPlayer.create(this, R.raw.huseikai2)
        huseikaiImage4.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound4.seekTo(0)
                huseikaisound4.start()
            }
            true
        }
        val huseikaisound5 = MediaPlayer.create(this, R.raw.huseikai2)
        huseikaiImage5.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound5.seekTo(0)
                huseikaisound5.start()
            }
            true
        }
        val huseikaisound6 = MediaPlayer.create(this, R.raw.huseikai)
        huseikaiImage6.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound6.seekTo(0)
                huseikaisound6.start()
            }
            true
        }
        val huseikaisound7 = MediaPlayer.create(this, R.raw.huseikai2)
        huseikaiImage7.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound7.seekTo(0)
                huseikaisound7.start()
            }
            true
        }
        val huseikaisound8 = MediaPlayer.create(this, R.raw.huseikai)
        huseikaiImage8.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound8.seekTo(0)
                huseikaisound8.start()
            }
            true
        }
        val huseikaisound9 = MediaPlayer.create(this, R.raw.huseikai2)
        huseikaiImage9.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound9.seekTo(0)
                huseikaisound9.start()
            }
            true
        }
        val huseikaisound10 = MediaPlayer.create(this, R.raw.robot1)
        huseikaiImage10.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound10.seekTo(0)
                huseikaisound10.start()
            }
            true
        }
        val huseikaisound11 = MediaPlayer.create(this, R.raw.robot2)
        huseikaiImage11.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound11.seekTo(0)
                huseikaisound11.start()
            }
            true
        }
        val huseikaisound12 = MediaPlayer.create(this, R.raw.huseikai2)
        huseikaiImage12.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound12.seekTo(0)
                huseikaisound12.start()
            }
            true
        }
        val huseikaisound13 = MediaPlayer.create(this, R.raw.huseikai)
        huseikaiImage13.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound13.seekTo(0)
                huseikaisound13.start()
            }
            true
        }
        val huseikaisound14 = MediaPlayer.create(this, R.raw.huseikai2)
        huseikaiImage14.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound14.seekTo(0)
                huseikaisound14.start()
            }
            true
        }
        val huseikaisound15 = MediaPlayer.create(this, R.raw.huseikai2)
        huseikaiImage15.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound15.seekTo(0)
                huseikaisound15.start()
            }
            true
        }
        val huseikaisound16 = MediaPlayer.create(this, R.raw.robot1)
        huseikaiImage16.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound16.seekTo(0)
                huseikaisound16.start()
            }
            true
        }
        val huseikaisound17 = MediaPlayer.create(this, R.raw.robot2)
        huseikaiImage17.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound17.seekTo(0)
                huseikaisound17.start()
            }
            true
        }
        val huseikaisound18 = MediaPlayer.create(this, R.raw.huseikai)
        huseikaiImage18.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound18.seekTo(0)
                huseikaisound18.start()
            }
            true
        }
        val huseikaisound19 = MediaPlayer.create(this, R.raw.huseikai2)
        huseikaiImage19.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound19.seekTo(0)
                huseikaisound19.start()
            }
            true
        }
        val huseikaisound20 = MediaPlayer.create(this, R.raw.robot1)
        huseikaiImage20.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound20.seekTo(0)
                huseikaisound20.start()
            }
            true
        }
        val huseikaisound21 = MediaPlayer.create(this, R.raw.robot2)
        huseikaiImage21.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound21.seekTo(0)
                huseikaisound21.start()
            }
            true
        }
        val huseikaisound22 = MediaPlayer.create(this, R.raw.huseikai)
        huseikaiImage22.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound22.seekTo(0)
                huseikaisound22.start()
            }
            true
        }
        val huseikaisound23 = MediaPlayer.create(this, R.raw.huseikai2)
        huseikaiImage23.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound23.seekTo(0)
                huseikaisound23.start()
            }
            true
        }
        val huseikaisound24 = MediaPlayer.create(this, R.raw.robot1)
        huseikaiImage24.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound24.seekTo(0)
                huseikaisound24.start()
            }
            true
        }
        val huseikaisound25 = MediaPlayer.create(this, R.raw.robot2)
        huseikaiImage25.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound25.seekTo(0)
                huseikaisound25.start()
            }
            true
        }
        val huseikaisound26 = MediaPlayer.create(this, R.raw.huseikai)
        huseikaiImage26.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound26.seekTo(0)
                huseikaisound26.start()
            }
            true
        }
        val huseikaisound27 = MediaPlayer.create(this, R.raw.huseikai2)
        huseikaiImage27.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound27.seekTo(0)
                huseikaisound27.start()
            }
            true
        }
        val huseikaisound28 = MediaPlayer.create(this, R.raw.robot1)
        huseikaiImage28.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound28.seekTo(0)
                huseikaisound28.start()
            }
            true
        }
        val huseikaisound29 = MediaPlayer.create(this, R.raw.robot2)
        huseikaiImage29.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound29.seekTo(0)
                huseikaisound29.start()
            }
            true
        }
        val huseikaisound30 = MediaPlayer.create(this, R.raw.huseikai)
        huseikaiImage30.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                huseikaisound30.seekTo(0)
                huseikaisound30.start()
            }
            true
        }



    }
}

