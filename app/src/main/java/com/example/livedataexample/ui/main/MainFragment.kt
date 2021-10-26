package com.example.livedataexample.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.livedataexample.databinding.MainFragmentBinding


class MainFragment : Fragment() {
    private val mainViewModel:MainViewModel by activityViewModels()
    private lateinit var binding: MainFragmentBinding
    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         binding= MainFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainViewModel.messageForMainFragment.observe(activity as LifecycleOwner,{
           binding.messageMainFragment.text=it
        })

binding.button2.setOnClickListener{
    mainViewModel.messageForActivity.value="hello from mainFragment to activity"
}
        binding.button1.setOnClickListener{
            mainViewModel.messageForFragment2.value="hello from main fragment to Fragment2"
        }
    }

}