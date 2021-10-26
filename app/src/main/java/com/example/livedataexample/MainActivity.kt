package com.example.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.example.livedataexample.databinding.MainActivityBinding
import com.example.livedataexample.ui.main.Fragment2
import com.example.livedataexample.ui.main.MainFragment
import com.example.livedataexample.ui.main.MainViewModel


class MainActivity : AppCompatActivity() {
private lateinit var binding: MainActivityBinding
private val mainViewModel:MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
openFragment(MainFragment.newInstance(),R.id.fragmentContainerView)
openFragment(Fragment2.newInstance(),R.id.fragmentContainerView2)

mainViewModel.messageForActivity.observe(this,{
   binding.textView2.text=it
})
    }

    private fun openFragment(fragment:Fragment,id:Int){
        supportFragmentManager.beginTransaction()
               .replace( id,fragment)
               .commitNow()
    }
}