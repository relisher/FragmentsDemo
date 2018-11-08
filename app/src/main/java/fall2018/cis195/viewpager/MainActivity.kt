package fall2018.cis195.viewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.view.View
import android.view.ViewGroup



class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager = findViewById<View>(R.id.viewpager) as ViewPager
        viewPager.adapter = CustomPagerAdapter(this)
    }

    fun onPreferences(view: View) {
        var pf = PrefsFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.thirdLayout, pf).commit()
    }
}
