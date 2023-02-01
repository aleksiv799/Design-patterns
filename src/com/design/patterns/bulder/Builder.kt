package com.design.patterns.bulder

import com.design.patterns.bulder.data.Computer

fun main(args: Array<String>) {
    val computer = Computer.Builder()
        .isInstalledOS(true)
        .addPlatform("Linux")
        .addHDDSize(1024)
        .addDDR4Size(32)
        .addSSDSize(512)
        .build()

    print(computer)

}



