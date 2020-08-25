package com.example.fruitlister.ui.fruitlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fruitlister.R
import com.example.fruitlister.data.entities.Fruit
import com.example.fruitlister.ui.MainActivity
import com.example.fruitlister.ui.fruitdetail.FruitDetailFragment

class FruitListAdapter(private val parentActivity: MainActivity, private val values: List<Fruit>) :
    RecyclerView.Adapter<FruitListAdapter.ViewHolder>() {

    private val onClickListener: View.OnClickListener

    init {
        onClickListener = View.OnClickListener { v ->
            val item = v.tag as Fruit

            val fragment = FruitDetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(FruitDetailFragment.ARG_ITEM_ID, item.id)
                }
            }

            parentActivity.supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container_view, fragment)
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parentActivity)
            .inflate(R.layout.fruit_list_content, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.id.toString()
        holder.contentView.text = item.name

        with(holder.itemView) {
            tag = item
            setOnClickListener(onClickListener)
        }
    }

    override fun getItemCount() = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idView: TextView = view.findViewById(R.id.id_text)
        val contentView: TextView = view.findViewById(R.id.content)
    }
}