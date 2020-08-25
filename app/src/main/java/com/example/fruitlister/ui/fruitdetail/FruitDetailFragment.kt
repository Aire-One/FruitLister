package com.example.fruitlister.ui.fruitdetail

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fruitlister.R
import com.example.fruitlister.data.entities.Fruit
import com.example.fruitlister.dummy.DummyContent

class FruitDetailFragment : Fragment() {

    companion object {
        const val ARG_ITEM_ID = "item_id"
    }

    private var item: Fruit? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        arguments?.let {
            if (it.containsKey(ARG_ITEM_ID)) {
                item = DummyContent.ITEM_MAP[it.getInt(ARG_ITEM_ID)]
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_fruit_detail, container, false)

        item?.let {
            rootView.findViewById<TextView>(R.id.item_detail)?.text = it.toString()
        }

        // Change the Activity toolbar title. Need to manage this with navigation component.
        //activity?.findViewById<Toolbar>(R.id.toolbar)?.title = item?.name

        return rootView
    }

}
