package com.emmanuelmuturia.feedme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ReceiptFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_receipt, container, false)

        val pizzaChoice = ReceiptFragmentArgs.fromBundle(requireArguments()).pizzaChoice
        //val burgerChoice = ReceiptFragmentArgs.fromBundle(requireArguments()).burgerChoice

        val receiptView = view.findViewById<TextView>(R.id.receiptView)

        when (pizzaChoice) {
            1 -> {
                receiptView.text = getString(R.string.pizzaOrder)
            }
            2 -> {
                receiptView.text = getString(R.string.chickenbbqOrder)
            }
            3 -> {
                receiptView.text = getString(R.string.vegetarianOrder)
            }
        }

        return view
    }
}