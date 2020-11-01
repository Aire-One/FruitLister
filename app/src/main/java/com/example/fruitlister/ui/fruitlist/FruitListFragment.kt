package com.example.fruitlister.ui.fruitlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.navGraphViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.fruitlister.R
import com.example.fruitlister.data.entities.Fruit
import com.example.fruitlister.ui.MainActivity
import com.example.fruitlister.ui.viewmodel.FruitSharedViewModel

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

        val viewModel: FruitSharedViewModel by navGraphViewModels(R.id.nested_graph)
        viewModel.getFruits().observe(viewLifecycleOwner, Observer<List<Fruit>>{ fruits ->
            recyclerView.adapter = FruitListAdapter(activity as MainActivity, fruits) {
                viewModel.select(it)
                findNavController().navigate(R.id.action_fruitListFragment_to_fruitDetailFragment)
            }
        })

        return view
    }

}