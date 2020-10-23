package com.calderon.peggy.td6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {

    //    val minionsArray = arrayOf(Minions("Kevin"), Minions("Bob"), Minions("Stuart"), Minions("Dave"), Minions("Edith"), Minions("Agnès"), Minions("Margot"), Minions("Gru"), Minions("Dr Nefario"), Minions("Lucie"))
    var items = Array<Minions>(10, { Minions() })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seedItems()

//        minionRecyclerView.layoutManager = LinearLayoutManager(this)
//        minionRecyclerView.adapter = MinionAdapter(minionsArray)
    }

    fun seedItems(){
        val nameArray = resources.getStringArray(R.array.name)

        for (n in items.size) {
            items[n] = Minions(nameArray[n])
        }
    }
}