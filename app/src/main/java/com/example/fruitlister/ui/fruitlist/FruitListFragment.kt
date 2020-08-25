package com.example.fruitlister.ui.fruitlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.fruitlister.R
import com.example.fruitlister.dummy.DummyContent
import com.example.fruitlister.ui.MainActivity

class FruitListFragment : Fragment() {

    companion object {
        fun newInstance(): FruitListFragment {
            return FruitListFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_fruit_list, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.item_list)
        recyclerView.adapter = FruitListAdapter(activity as MainActivity, DummyContent.ITEMS)

        return view
    }

}