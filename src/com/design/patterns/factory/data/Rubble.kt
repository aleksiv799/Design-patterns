package com.design.patterns.factory.data

class Rubble : ICurrency {
    override fun code(): String {
        return "₽"
    }

    override fun symbol(): String {
        return "rub"
    }
}