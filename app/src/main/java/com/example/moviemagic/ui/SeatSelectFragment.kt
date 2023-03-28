package com.example.moviemagic.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.moviemagic.databinding.FragmentSeatSelectBinding

class SeatSelectFragment : Fragment() {
    private var _binding: FragmentSeatSelectBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSeatSelectBinding.inflate(inflater, container, false)
        return binding.root
    }

    // todo add onViewCreated method
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}