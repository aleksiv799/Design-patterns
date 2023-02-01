package com.design.patterns.factory.data

class Dollar : ICurrency {
    override fun code(): String {
        return "\$"
    }

    override fun symbol(): String {
        return "USD"
    }
}