package com.emmanuelmuturia.feedme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.google.android.material.chip.ChipGroup
import com.google.android.material.floatingactionbutton.FloatingActionButton

class OrderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_order, container, false)

        val pizzaMessage = view.findViewById<RadioGroup>(R.id.pizza_group)
        val burgerMessage = view.findViewById<RadioGroup>(R.id.burger_group)
        //val beverageMessage = view.findViewById<ChipGroup>(R.id.beverage_group)

        //Floating Action Button...
        val fab = view.findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            val pizzaSelect = pizzaMessage.checkedRadioButtonId
            val burgerSelect = burgerMessage.checkedRadioButtonId
            val action = OrderFragmentDirections
                .actionOrderFragmentToReceiptFragment(pizzaSelect, burgerSelect)
            view.findNavController().navigate(action)
        }
        return view
    }
}