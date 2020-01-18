package com.kyawt.nike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.nike.adapter.NikeAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var NikeRecyclerView: RecyclerView = findViewById(R.id.recycler_nike)

        var nikeList = ArrayList<NikeModel>()
        nikeList.add(NikeModel(1, "Nike Superfly 6 Ellite FO", 799.0, R.drawable.superfly))
        nikeList.add(NikeModel(2, "Air Vopormax Flyknite", 1280.0, R.drawable.lebron))
        nikeList.add(NikeModel(3, "Air Jordon 14 Retro Se", 2400.0, R.drawable.air_jordan))
        nikeList.add(NikeModel(4, "LeBron XVI Low Ep", 1099.0, R.drawable.lebron))
        nikeList.add(NikeModel(5, "Jordon Why Not", 2699.0, R.drawable.whynot))
        nikeList.add(NikeModel(6, "LeBron XVI SB EP", 1280.0, R.drawable.sbep))

        var nikeAdapter = NikeAdapter(nikeList)
        NikeRecyclerView.layoutManager = GridLayoutManager(this, 2)
        NikeRecyclerView.adapter = nikeAdapter

    }
}

