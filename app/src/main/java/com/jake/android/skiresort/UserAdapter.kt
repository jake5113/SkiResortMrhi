package com.jake.android.skiresort

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class UserAdapter(val context: FragmentList, val UserList: ArrayList<User>) : BaseAdapter() {
    override fun getCount(): Int {
        return UserList.size
    }

    override fun getItem(position: Int): Any {
        return UserList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context.context).inflate(R.layout.list_item_user, null)
        val profile = view.findViewById<ImageView>(R.id.tv_ski)
        val name = view.findViewById<TextView>(R.id.tv_skiresort_name)
        val businessDay = view.findViewById<TextView>(R.id.tv_business_day)
        val region = view.findViewById<TextView>(R.id.tv_region)

        val user = UserList[position]

        profile.setImageResource(user.profile)
        name.text = user.name
        region.text = user.region
        businessDay.text = user.businessDay

        return view
    }

}