package com.example.recyclerviewexample

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item.view.*

/**
 *   @DATE : 2020/7/27
 *   @Time : 15:54
 *   @By : TheCara
 *   需要继承RecyclerView.Adapter类型
 *   需要内嵌类继承RecyclerView.ViewHolder类型
 */
class ExampleAdapter(private val exampleList: List<ExampleItem>) :
    RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {
    // 关键方法，用于确定列表项
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.example_item, parent, false)
        return ExampleViewHolder(view)
    }

    override fun getItemCount() = exampleList.size

    // 将数据和容器绑定
    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currenItem = exampleList[position]
        holder.imageView.setImageResource(currenItem.imageResource)
        holder.textView1.setText(currenItem.text1)
        holder.textView2.setText(currenItem.text1)

    }

    // 获得每个控件的实例,需要ExampleViewHolder的参数(子项布局)作为RecyclerView.ViewHolder()用作实例化
    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.image_view
        val textView1: TextView = itemView.text_view_1
        val textView2: TextView = itemView.text_view_2
    }

}