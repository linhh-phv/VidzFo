package com.wztek.vidzfo.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wztek.vidzfo.databinding.ItemViewPagerBinding
import com.wztek.vidzfo.model.ChapterModel
import java.util.*

class ViewPagerAdapter(
    public var mContext: Context,
    private var mListChapter: ArrayList<ChapterModel>,
    private var mItemHeight: Int,
    private var mItemWidth: Int,
    private var mSpanCount: Int
)  {


//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
//        return ViewPagerHolder(ItemViewPagerBinding.inflate(LayoutInflater.from(parent.context), parent, false))
//    }
//
//    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
//    }
//
//    override fun getItemCount(): Int {
//    }
//
//    class ViewPagerHolder(binding: ItemViewPagerBinding) : RecyclerView.ViewHolder(binding.root) {
//        var binding: ItemViewPagerBinding
//        init {
//            this.binding = binding
//            binding.rcvMovie.layoutManager = GridLayoutManager(
//                ,
//                ,
//                GridLayoutManager.VERTICAL,
//                false
//            )
//        }
//    }
}