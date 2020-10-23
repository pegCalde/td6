package com.calderon.peggy.td6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.calderon.peggy.td6.R.drawable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val minionsArray = arrayOf(
        Minions("Kevin", drawable.kevin, "homme de main de Scarlett Overkill"),
        Minions("Bob", drawable.bob, "aime qu'on lui lise des histoires et jouer avec son ours en peluche"),
        Minions("Stuart", drawable.stuart, "doué en jeux vidéo, comme Dave"),
        Minions("Dave", drawable.dave, "doué en jeux vidéo"),
        Minions("Edith", drawable.edith, "cadette, adoptée par Gru"),
        Minions("Agnès", drawable.agnes, "benjamine, adoptée par Gru"),
        Minions("Margot", drawable.margot, "ainée, adoptée par Gru"),
        Minions("Gru", drawable.gru, "super méchant et agent de l'AVL"),
        Minions("Dr Nefario", drawable.dr_nefario, "scientifique, collègue de Gru"),
        Minions("Lucie", drawable.lucie, "espionne de l'AVL, femme de Gru")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        minionRecyclerView.layoutManager = LinearLayoutManager(this)
        minionRecyclerView.adapter = MinionAdapter(minionsArray)
    }
}
