package com.atomikak.unitcalculator.activities

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.atomikak.unitcalculator.R
import com.atomikak.unitcalculator.adapters.CategoryAdapter
import com.atomikak.unitcalculator.supportClasses.Category
import com.atomikak.unitcalculator.supportClasses.Common
import com.atomikak.unitcalculator.supportClasses.It


class MainActivity : AppCompatActivity() {

    private lateinit var recv_common:RecyclerView
    private lateinit var recv_it:RecyclerView
    private lateinit var common_Adapter: CategoryAdapter
    private lateinit var it_Adapter: CategoryAdapter
    private lateinit var common_List: ArrayList<Category>
    private lateinit var it_List: ArrayList<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Initializing Widgets
        init()
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }

    fun init(){
        recv_common = findViewById(R.id.recv_common)
        recv_it = findViewById(R.id.recv_it)
        common_List = arrayListOf(
            Category(name = "Length" , image = R.drawable.baseline_straighten_24,units= Common.Length().getUnits()),
            Category(name = "Mass" , image = R.drawable.baseline_scale_24,units=Common.Mass().getUnits()),
            Category(name = "Temperature" , image = R.drawable.baseline_device_thermostat_24,units=Common.Temperature().getUnits()),
            Category(name = "Speed" , image = R.drawable.baseline_speed_24,units=Common.Speed().getUnits()),
            Category(name = "Area" , image = R.drawable.baseline_aspect_ratio_24,units=Common.Area().getUnits()),
        )
        it_List = arrayListOf(
            Category(name = "Storage" , image = R.drawable.baseline_storage_24,units= It.DataStorage().getUnits()),
            Category(name = "Data Transfer" , image = R.drawable.baseline_compare_arrows_24,units=It.DataTransfer().getUnits()),
        )

        common_Adapter = CategoryAdapter(categoryList = common_List, context = applicationContext)
        recv_common.layoutManager = GridLayoutManager(applicationContext,2,GridLayoutManager.VERTICAL,false)
        recv_common.isLayoutFrozen = true
        recv_common.setHasFixedSize(false)
        recv_common.adapter = common_Adapter

        it_Adapter = CategoryAdapter(categoryList = it_List, context = applicationContext)
        recv_it.layoutManager = GridLayoutManager(applicationContext,2,GridLayoutManager.VERTICAL,false)
        recv_it.setHasFixedSize(false)
        recv_it.adapter = it_Adapter

    }
}