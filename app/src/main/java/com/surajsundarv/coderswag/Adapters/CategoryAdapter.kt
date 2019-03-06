package com.surajsundarv.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.surajsundarv.coderswag.Models.Category
import com.surajsundarv.coderswag.R

class CategoryAdapter(context: Context, categories: List<Category>): BaseAdapter() {
    val context = context
    val categories = categories

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holderView: ViewHolder

        if(convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holderView = ViewHolder()
            holderView.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holderView.categoryName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holderView
        } else {
            holderView = convertView.tag as ViewHolder
            categoryView = convertView
        }
        val category = categories[position]
        holderView.categoryName?.text = category.title
        val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holderView.categoryImage?.setImageResource(resourceID)
        return  categoryView
    }

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}