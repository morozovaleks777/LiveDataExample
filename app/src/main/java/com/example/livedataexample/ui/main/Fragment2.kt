package com.example.livedataexample.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.livedataexample.databinding.Fragment2Binding

class Fragment2 : Fragment() {

    companion object {
        fun newInstance() = Fragment2()
    }

    private val mainViewModel:MainViewModel by activityViewModels()
    private lateinit var binding: Fragment2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         binding=Fragment2Binding.inflate(inflater)
        return binding.root
       // return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button4.setOnClickListener {
            mainViewModel.messageForActivity.value="helloo from fragment2 to activity"
        }
        binding.button3.setOnClickListener {
            mainViewModel.messageForMainFragment.value="helloo from fragment2 to MainFragment"
        }
      mainViewModel.messageForFragment2.observe(activity as LifecycleOwner,{
          binding.messageFragment2.text=it
      })

    }

}