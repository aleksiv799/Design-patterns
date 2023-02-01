package com.design.patterns.bulder.data

class Computer(
    private val isInstalledOS: Boolean,
    private val platform: String?,
    private val HDDSize: Int?,
    private val SSDSize: Int?,
    private val RAMSize: Int,
) {

    data class Builder(
        private var isInstalledOS: Boolean = false,
        private var platform: String? = null,
        private var HDDSize: Int? = 0,
        private var SSDSize: Int? = 0,
        private var RAMSize: Int? = 0,
    ) {
        fun isInstalledOS(isInstalledOS: Boolean) = apply { this.isInstalledOS = isInstalledOS }
        fun addPlatform(platform: String) = apply { this.platform = platform }
        fun addHDDSize(HDDSize: Int) = apply { this.HDDSize = HDDSize }
        fun addSSDSize(SSDSize: Int) = apply { this.SSDSize = SSDSize }
        fun addDDR4Size(RAMSize: Int) = apply { this.RAMSize = RAMSize }

        fun build(): String {
            return (
                    "Your configuration is:\n" +
                            "Installed OS: \t$isInstalledOS\n" +
                            "Platform: \t$platform\n" +
                            "HDD Size: \t${HDDSize.toString()}Gb\n" +
                            "SSD Size: \t${SSDSize.toString()}Gb\n" +
                            "RAM Size: \t${RAMSize.toString()}Gb\n")
        }
    }
}