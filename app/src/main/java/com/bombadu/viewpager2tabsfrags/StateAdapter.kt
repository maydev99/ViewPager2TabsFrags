package com.bombadu.viewpager2tabsfrags

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bombadu.viewpager2tabsfrags.fragments.CallFragment
import com.bombadu.viewpager2tabsfrags.fragments.ChatFragment
import com.bombadu.viewpager2tabsfrags.fragments.StatusFragment

class StateAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle){

    private val fragments:ArrayList<Fragment> = arrayListOf(
            ChatFragment(),
            StatusFragment(),
            CallFragment()
    )

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }


}