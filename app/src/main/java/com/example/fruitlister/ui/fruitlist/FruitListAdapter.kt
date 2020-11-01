package com.example.fruitlister.ui.fruitlist

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

class FruitListAdapter(private val parentActivity: MainActivity, private val values: List<Fruit>,
                       private val itemClickListener: (Fruit) -> Unit) :
    RecyclerView.Adapter<FruitListAdapter.ViewHolder>() {

    private val onClickListener: View.OnClickListener

    init {
        onClickListener = View.OnClickListener { v ->
            val fruit = v.tag as Fruit
            itemClickListener(fruit)
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