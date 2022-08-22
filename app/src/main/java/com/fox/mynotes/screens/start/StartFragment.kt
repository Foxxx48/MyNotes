package com.fox.mynotes.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.fox.mynotes.R
import com.fox.mynotes.databinding.FragmentStartBinding
import com.fox.mynotes.utilits.TYPE_ROOM
import kotlinx.android.synthetic.main.fragment_start.*

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
        mViewModel = ViewModelProvider(this).get(StartFragmentViewModel::class.java)
        binding.btnRoom.setOnClickListener {
            mViewModel.initDatabase(TYPE_ROOM)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}