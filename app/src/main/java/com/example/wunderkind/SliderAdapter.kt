package com.example.wunderkind

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class SliderAdapter(/*sliderItems: List<SliderItem>,viewPager2: ViewPager2*/) : RecyclerView.Adapter<SliderAdapter.SliderViewHolder>() {
    lateinit var sliderItems: List<SliderItem>
    lateinit var viewPager2: ViewPager2
    constructor(sliderItems: List<SliderItem>,viewPager2: ViewPager2) : this() {
        this.sliderItems = sliderItems
        this.viewPager2 = viewPager2
    }

    inner class SliderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var RounderImageView: ImageView
        lateinit var imageView: ImageView
        fun SliderViewHolder(itemView: View) {
            //super(itemView)
            imageView = itemView.findViewById<ImageView>(R.id.imageSlide)
        }

        fun setImage(sliderItem: SliderItem) {
            imageView.setImageResource(sliderItem.getImage())
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder {
        return SliderViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slide_item_container,
                parent,
                false
            )
        )
    }

    fun SliderAdapter(sliderItems:List<SliderItem>,viewPager2: ViewPager2){
        this.sliderItems = sliderItems
        this.viewPager2 = viewPager2
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        holder.setImage(sliderItems.get(position))
    }

    override fun getItemCount(): Int {
        return sliderItems.size
    }
}