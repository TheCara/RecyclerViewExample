package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listExample = generateDummyList(500)
        recycler_view.adapter = ExampleAdapter(listExample)
        // 设置RecyclerView的布局管理器
        recycler_view.layoutManager = LinearLayoutManager(this)
        // 确保RecyclerView的尺寸是一个常数
        recycler_view.setHasFixedSize(true)
    }

    // 获得布局中的数据
    private fun generateDummyList(size: Int): List<ExampleItem> {
        val list = ArrayList<ExampleItem>()
        // 使⽤区间"until"
        for (i in 0 until size) {
            val drawable = when (i % 4) {
                0 -> R.drawable.ic_baseline_add_to_home_screen_24
                1 -> R.drawable.ic_baseline_airline_seat_flat_angled_24
                2 -> R.drawable.ic_baseline_airline_seat_recline_extra_24
                else -> R.drawable.ic_baseline_android_24
            }
            val item = ExampleItem(drawable, "Line $i", "Line 2")
            list += item

        }
        return list
    }
}