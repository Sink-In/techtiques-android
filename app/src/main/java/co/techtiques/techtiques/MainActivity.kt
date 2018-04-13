package co.techtiques.techtiques

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.support.annotation.NonNull
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import co.techtiques.techtiques.R.id.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigation()
    }

    fun bottomNavigation() {
        bottom_navigation.setSelectedItemId(action_home)
        bottom_navigation.setOnNavigationItemSelectedListener(
            object : BottomNavigationView.OnNavigationItemSelectedListener {
                override fun onNavigationItemSelected(item: MenuItem): Boolean {
                    when (item.getItemId()) {
                        action_settings -> toast("Settings")
                        action_home -> toast("Home")
                        action_profile -> toast("Profile")
                    }
                    return true
                }
            }
        )
    }
}
