package com.design.patterns.factory

import com.design.patterns.factory.data.Dollar
import com.design.patterns.factory.data.Euro
import com.design.patterns.factory.data.ICurrency
import com.design.patterns.factory.data.Rubble

enum class Country {
    US, France, Russia
}

fun currency(country: Country): ICurrency {
    return when (country) {
        Country.Russia ->  Rubble()
        Country.France -> Euro()
        Country.US -> Dollar()
    }
}

fun main (args: Array<String>) {

    println(currency(Country.US).code())
    println(currency(Country.France).code())
    println(currency(Country.Russia).code())
}