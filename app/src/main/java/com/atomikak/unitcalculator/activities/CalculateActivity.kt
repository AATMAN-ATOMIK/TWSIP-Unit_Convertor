package com.atomikak.unitcalculator.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.Spinner
import com.atomikak.unitcalculator.R
import com.atomikak.unitcalculator.supportClasses.Common
import com.atomikak.unitcalculator.supportClasses.It

import com.google.android.material.textfield.TextInputEditText

class CalculateActivity : AppCompatActivity() {
    private lateinit var c_from_editText: TextInputEditText
    private lateinit var c_to_editText: TextInputEditText
    private lateinit var c_back:ImageButton
    private lateinit var c_sp_from: Spinner
    private lateinit var c_sp_to: Spinner
    lateinit var fromUnit: String
    lateinit var toUnit: String
    private lateinit var category: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        init()
    }

    fun init() {

        val intent = getIntent()
        val units: ArrayList<String> = intent.getSerializableExtra("units") as ArrayList<String>
        category = intent.getStringExtra("category").toString()
        Log.d("Data:", units.toString())

        c_sp_from = findViewById(R.id.c_sp_from)
        c_sp_to = findViewById(R.id.c_sp_to)
        c_from_editText = findViewById(R.id.c_from_editText)
        c_back = findViewById(R.id.btn_back)

        c_to_editText = findViewById(R.id.c_to_editText)
        c_sp_from.adapter =
            ArrayAdapter(this@CalculateActivity, android.R.layout.simple_dropdown_item_1line, units)
        c_sp_to.adapter =
            ArrayAdapter(this@CalculateActivity, android.R.layout.simple_dropdown_item_1line, units)

        //OnBack Button Click Listener
        c_back.setOnClickListener {
            this.finish()
        }



        //Assigning OnClick Listener on spinner
        c_sp_from.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                fromUnit = units[position].toString()
                if(c_from_editText.text.toString()!=""){
                    Log.d("Data:", fromUnit)
                    c_to_editText.setText(getCalculated().toString())
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                fromUnit = units[0].toString()
            }
        }

        c_sp_to.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                toUnit = units[position].toString()
                if(c_from_editText.text.toString()!=""){
                    Log.d("Data:", toUnit)
                    c_to_editText.setText(getCalculated().toString())
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                toUnit = units[0].toString()
            }
        }

        c_from_editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                c_to_editText.setText("0.0")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (c_from_editText.text.toString().isNotEmpty()) {
                    c_to_editText.setText(getCalculated().toString())
                }
            }

            override fun afterTextChanged(s: Editable?) {
                if (c_from_editText.text.toString().isNotEmpty()) {
                    c_to_editText.setText(getCalculated().toString())
                }
            }
        })


    }

    fun getCalculated(): Double {
        Log.d("Data:", "Callsed")
        when (category) {
            "Length" -> {
                return Common.Length().calculate(
                    from = fromUnit,
                    to = toUnit,
                    number = c_from_editText.text.toString().toDouble()
                )
            }
            "Mass"->{
                return Common.Mass().calculate(
                    from = fromUnit,
                    to = toUnit,
                    number = c_from_editText.text.toString().toDouble()
                )
            }
            "Temperature"->{
                return Common.Temperature().calculate(
                    from = fromUnit,
                    to = toUnit,
                    number = c_from_editText.text.toString().toDouble()
                )
            }
            "Speed"->{
                return Common.Speed().calculate(
                    from = fromUnit,
                    to = toUnit,
                    number = c_from_editText.text.toString().toDouble()
                )
            }
            "Area"->{
                return Common.Area().calculate(
                    from = fromUnit,
                    to = toUnit,
                    number = c_from_editText.text.toString().toDouble()
                )
            }
            "Data Transfer"->{
                return It.DataTransfer().calculate(
                    from = fromUnit,
                    to = toUnit,
                    number = c_from_editText.text.toString().toDouble()
                )
            }
            "Storage"->{
                return It.DataStorage().calculate(
                    from = fromUnit,
                    to = toUnit,
                    number = c_from_editText.text.toString().toDouble()
                )
            }


            else -> return 0.0
        }
    }
}