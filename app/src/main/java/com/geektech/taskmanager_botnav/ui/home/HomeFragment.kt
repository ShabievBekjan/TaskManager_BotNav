package com.geektech.taskmanager_botnav.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import com.geektech.taskmanager_botnav.R
import com.geektech.taskmanager_botnav.data.Task
import com.geektech.taskmanager_botnav.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

                    binding.fab.setOnClickListener {
                findNavController().navigate(R.id.navigation_home)
            }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
     companion object {
        const val TASK = "task.key"
    }
}