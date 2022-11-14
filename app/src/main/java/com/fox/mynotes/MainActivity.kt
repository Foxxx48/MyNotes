package com.fox.mynotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.fox.mynotes.databinding.ActivityMainBinding
import com.fox.mynotes.utilits.APP_ACTIVITY

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    lateinit var mToolbar: androidx.appcompat.widget.Toolbar
    lateinit var mNavController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        APP_ACTIVITY = this
        mToolbar = binding.toolbar

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
                    as NavHostFragment
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mNavController = navHostFragment.navController

//        mNavController = Navigation.findNavController(this,R.id.navigation_graph)
        setSupportActionBar(mToolbar)
        title = getString(R.string.toolBar_title)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}