package com.design.patterns.factory.data

class Euro: ICurrency {
    override fun code(): String {
        return "€"
    }

    override fun symbol(): String {
        return "EUR"
    }
}