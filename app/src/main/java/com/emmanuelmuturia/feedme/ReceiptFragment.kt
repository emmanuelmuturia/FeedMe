package com.emmanuelmuturia.feedme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class ReceiptFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_receipt, container, false)

        val receiptResultPizza = view.findViewById<TextView>(R.id.receiptResult)
        val receiptResultBurger = view.findViewById<TextView>(R.id.receiptResultBurger)

        //val pizzaChoice = ReceiptFragmentArgs.fromBundle(requireArguments()).pizzaChoice
        val burgerChoice = ReceiptFragmentArgs.fromBundle(requireArguments()).burgerChoice

        when (ReceiptFragmentArgs.fromBundle(requireArguments()).pizzaChoice) {
            R.id.hawaiian -> {
                receiptResultPizza.text = " Hawaiian Pizza"
            }
            R.id.chickenbbq -> {
                receiptResultPizza.text = " Chicken BBQ"
            }
            R.id.vegetarian_pizza -> {
                receiptResultPizza.text = " Vegetarian Pizza"
            }
        }

        when (burgerChoice) {
            R.id.hamburger -> {
                receiptResultBurger.text = " Hamburger"
            }
            R.id.chickenbbq -> {
                receiptResultBurger.text = " Chicken Burger"
            }
            R.id.vegetarian_pizza -> {
                receiptResultBurger.text = " Vegetarian Burger"
            }
        }

        return view
    }
}