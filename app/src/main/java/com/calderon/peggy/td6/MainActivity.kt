package com.calderon.peggy.td6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.calderon.peggy.td6.R.drawable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val minionsArray = arrayOf(Minions("Kevin", drawable.kevin, "blabla"), Minions("Bob", drawable.bob, ""), Minions("Stuart", drawable.stuart, ""), Minions("Dave", drawable.dave, ""), Minions("Edith", drawable.edith, ""), Minions("Agnès", drawable.agnes, ""), Minions("Margot", drawable.margot, ""), Minions("Gru", drawable.gru, ""), Minions("Dr Nefario", drawable.dr_nefario, ""), Minions("Lucie", drawable.lucie, ""))
//    var items = Array<Minions>(10, { Minions() })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        seedItems()

        minionRecyclerView.layoutManager = LinearLayoutManager(this)
        minionRecyclerView.adapter = MinionAdapter(minionsArray)
    }

//    fun seedItems(){
//        val nameArray = resources.getStringArray(R.array.name)
//
//        for (m in minionsArray) {
//            minionsArray[m] = Minions(nameArray[m])
//        }
//    }
}
