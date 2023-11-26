package com.example.pract1_1_grebenukov

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment



// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Fragment1 : Fragment() {






    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentLayout = inflater.inflate(R.layout.fragment_1, container, false)
        val button2 = fragmentLayout.findViewById<Button>(R.id.button2);
        val button3 = fragmentLayout.findViewById<Button>(R.id.button3);
        val button4 = fragmentLayout.findViewById<Button>(R.id.button4);
        val navController = NavHostFragment.findNavController(this)
        button2.setOnClickListener {
            navController.navigate(R.id.fragment_2)
        }

        button3.setOnClickListener {
            navController.navigate(R.id.fragment_3)
        }
        button4.setOnClickListener {
            navController.navigate(R.id.fragment_4)
        }
        return fragmentLayout

    }


}