package com.example.fruitlister.ui.fruitdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.navGraphViewModels
import com.example.fruitlister.R
import com.example.fruitlister.databinding.FragmentFruitDetailBinding
import com.example.fruitlister.ui.viewmodel.FruitSharedViewModel


class FruitDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentFruitDetailBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_fruit_detail,
            container,
            false)

        val viewModel: FruitSharedViewModel by navGraphViewModels(R.id.nested_graph)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel

        // Change the Activity toolbar title. Need to manage this with nav_graph component.
        //activity?.findViewById<Toolbar>(R.id.toolbar)?.title = item?.name

        return binding.root
    }

}
