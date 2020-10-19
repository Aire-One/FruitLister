package com.example.fruitlister.ui.fruitdetail

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.fruitlister.R
import com.example.fruitlister.data.entities.Fruit
import com.example.fruitlister.databinding.FragmentFruitDetailBinding


class FruitDetailFragment : Fragment() {

    private val args: FruitDetailFragmentArgs by navArgs()

    private var fruit: Fruit? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fruit = args.fruit
    }

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

        binding.fruit = fruit

        // Change the Activity toolbar title. Need to manage this with nav_graph component.
        //activity?.findViewById<Toolbar>(R.id.toolbar)?.title = item?.name

        return binding.root
    }

}
