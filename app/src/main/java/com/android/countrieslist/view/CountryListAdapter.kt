package com.android.countrieslist.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.countrieslist.R
import com.android.countrieslist.model.Country

class CountryListAdapter(var countries: ArrayList<Country>): RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {

    fun updateCountries(newCountries: List<Country>){
        countries.clear()
        countries.addAll(newCountries)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CountryViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
    )

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countries[position])
    }

    override fun getItemCount() = countries.size

    class CountryViewHolder(view: View): RecyclerView.ViewHolder(view){

        private var countryName = view.findViewById<TextView>(R.id.name)

        fun bind(country: Country){
            countryName.text = country.countryName
        }
    }
}