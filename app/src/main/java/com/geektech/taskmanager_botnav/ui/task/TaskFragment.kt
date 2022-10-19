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
import com.geektech.taskmanager_botnav.R
import com.geektech.taskmanager_botnav.databinding.FragmentTaskBinding

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
    initLauncher()
        initListener()
    }
    private fun initListener() {
        binding.image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_PICK
            intent.type = "image/*"
            launcher.launch(intent)
        }
    }

    private fun initLauncher() {
        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {

            if (it.resultCode == AppCompatActivity.RESULT_OK) {
                val image = it.data?.data
                if (image != null) {
                    binding.image.setImageURI(image)
                }
            }
        }
    }
}