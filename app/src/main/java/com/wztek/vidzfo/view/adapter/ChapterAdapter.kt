package com.wztek.vidzfo.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.wztek.vidzfo.databinding.ItemChapterBinding
import com.wztek.vidzfo.databinding.ItemViewPagerBinding
import com.wztek.vidzfo.model.ChapterModel
import java.util.*

class ChapterAdapter(
    private var mContext: Context,
    private var mListChapter: ArrayList<ChapterModel>,
    private var mItemHeight: Int,
    private var mItemWidth: Int,
): RecyclerView.Adapter<ChapterAdapter.ChapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChapterViewHolder {
        return ChapterAdapter.ChapterViewHolder(
            ItemChapterBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ChapterViewHolder, position: Int) {
        val chapter = mListChapter[position]
    }

    override fun getItemCount(): Int {
        return 0;
    }

    class ChapterViewHolder(binding: ItemChapterBinding) : RecyclerView.ViewHolder(binding.root) {
        var binding: ItemChapterBinding

        init {
            this.binding = binding
        }
    }
}