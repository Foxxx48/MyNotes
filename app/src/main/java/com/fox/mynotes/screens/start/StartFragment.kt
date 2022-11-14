package com.fox.mynotes.screens.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.fox.mynotes.R
import com.fox.mynotes.databinding.FragmentStartBinding
import com.fox.mynotes.utilits.APP_ACTIVITY
import com.fox.mynotes.utilits.TYPE_ROOM

class StartFragment : Fragment() {

    private var _binding: FragmentStartBinding? = null
    private val binding get() = _binding!!
    private lateinit var mViewModel: StartFragmentViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    private fun initialization() {
        mViewModel = ViewModelProvider(this)[StartFragmentViewModel::class.java]
        binding.btnRoom.setOnClickListener {
            mViewModel.initDatabase(TYPE_ROOM) {
                APP_ACTIVITY.mNavController.navigate(R.id.action_startFragment_to_mainFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}