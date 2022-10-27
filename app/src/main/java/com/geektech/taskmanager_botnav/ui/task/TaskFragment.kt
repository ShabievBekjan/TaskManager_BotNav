package com.geektech.taskmanager_botnav.ui.task

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.setFragmentResult
import com.geektech.taskmanager_botnav.R
import com.geektech.taskmanager_botnav.databinding.FragmentTaskBinding
import com.geektech.taskmanager_botnav.ui.home.HomeFragment

class TaskFragment : Fragment() {

    private lateinit var launcher: ActivityResultLauncher<Intent>
    private lateinit var binding:FragmentTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTaskBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnAdd.setOnClickListener {
            setFragmentResult(
                HomeFragment.TASK,bundleOf(
                    NoteListFragment.NOTE to binding.editText.text.toString()
                )
            )
        }
        )
    }
}