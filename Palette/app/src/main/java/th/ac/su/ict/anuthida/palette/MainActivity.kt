package th.ac.su.ict.anuthida.palette

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                viewPalette.setBackgroundColor(Color.parseColor("#e9e1de"))
                viewPalette.setText("233-225-222")
            }
        })
        button2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                viewPalette.setBackgroundColor(Color.parseColor("#e7cccb"))
                viewPalette.setText("231-204-203")
            }
        })

        button3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                viewPalette.setBackgroundColor(Color.parseColor("#77839a"))
                viewPalette.setText("119-131-154")
            }
        })

        button4.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                viewPalette.setBackgroundColor(Color.parseColor("#9ca9bd"))
                viewPalette.setText("156-169-189")
            }
        })

        button5.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                viewPalette.setBackgroundColor(Color.parseColor("#c4ccd4"))
                viewPalette.setText("196-204-212")
            }
        })

        button6.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                viewPalette.setBackgroundColor(Color.parseColor("#dee2e5"))
                viewPalette.setText("222-226-229")
            }
        })

    }
}