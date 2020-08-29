package com.example.fruitlister.ui.fruitlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.fruitlister.BR
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
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ViewDataBinding>(
            layoutInflater,
            R.layout.fruit_list_content,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = values[position]
        holder.bind(fruit)

        with(holder.itemView) {
            tag = fruit
            setOnClickListener(onClickListener)
        }
    }

    override fun getItemCount() = values.size

    inner class ViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(fruit: Fruit?) {
            binding.setVariable(BR.fruit, fruit)
            binding.executePendingBindings()
        }
    }

}