package co.techtiques.techtiques

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        startActivity<MainActivity>()

        finish()
    }
}
