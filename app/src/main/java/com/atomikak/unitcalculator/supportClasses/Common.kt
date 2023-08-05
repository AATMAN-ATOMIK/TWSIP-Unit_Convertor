package com.atomikak.unitcalculator.supportClasses


class Common {

    class Length {
        private var lengths: ArrayList<String> = ArrayList()

        init {
            lengths = arrayListOf(
                "Centimeter",
                "Meter",
                "Millimeter",
                "MicroMeter",
                "Kilometer",
                "Nanometer",
                "Mile",
                "Yard",
                "Foot",
                "Inch",
                "Light Year"
            )
        }

        fun getUnits(): ArrayList<String> {
            return this.lengths
        }

        fun calculate(from: String? = null, to: String? = null, number: Double = 0.0): Double {
            if (from.equals(to)) {
                return number
            }
            when (from) {
                "Centimeter" -> return when (to) {
                    "Meter" -> number / 100
                    "Kilometer" -> number / 100000
                    "Millimeter" -> number * 10
                    "MicroMeter" -> number * 10000
                    "Nanometer" -> number * 1e+7
                    "Mile" -> number / 160900
                    "Yard" -> number / 91.44
                    "Foot" -> number / 30.48
                    "Inch" -> number / 2.54
                    "Light Year" -> number / 9.461e+17
                    else -> 0.0
                }

                "Meter" -> return when (to) {
                    "Centimeter" -> number * 100
                    "Millimeter" -> number * 1000
                    "Micrometer" -> number * 1e+6
                    "Nanometer" -> number * 1e+9
                    "Mile" -> number / 1609
                    "Kilometer" -> number / 1000
                    "Yard" -> number * 1.094
                    "Foot" -> number * 3.281
                    "Inch" -> number * 39.37
                    "Light Year" -> number / 9.461e+15
                    else -> 0.0
                }

                "Millimeter" -> return when (to) {
                    "Centimeter" -> number / 10
                    "Meter" -> number / 1000
                    "Micrometer" -> number * 1000
                    "Nanometer" -> number * 1e+6
                    "Mile" -> number / 1.609e+6
                    "Yard" -> number / 914.4
                    "Foot" -> number / 304.8
                    "Kilometer" -> number / 100
                    "Inch" -> number / 25.4
                    "Light Year" -> number / 9.461e+18
                    else -> 0.0
                }

                "MicroMeter" -> return when (to) {
                    "Centimeter" -> number / 10000
                    "Meter" -> number / 1e+6
                    "Millimeter" -> number / 1000
                    "Kilometer" -> number / 1e+9
                    "Nanometer" -> number * 1000
                    "Mile" -> number / 1.609e+9
                    "Yard" -> number / 914400
                    "Foot" -> number / 304800
                    "Inch" -> number / 25400
                    "Light Year" -> number / 9.461e+21
                    else -> 0.0
                }

                "Nanometer" -> return when (to) {
                    "Centimeter" -> number / 1e+7
                    "Kilometer" -> number / 1e+12
                    "Meter" -> number / 1e+9
                    "Millimeter" -> number / 1e+6
                    "MicroMeter" -> number / 1000
                    "Mile" -> number / 1.609e+12
                    "Yard" -> number / 9.144e+8
                    "Foot" -> number / 3.048e+8
                    "Inch" -> number / 2.54e+7
                    "Light Year" -> number / 9.461e+24
                    else -> 0.0
                }

                "Mile" -> return when (to) {
                    "Centimeter" -> number * 160900
                    "Meter" -> number * 1609
                    "Millimeter" -> number * 1.609e+6
                    "MicroMeter" -> number * 1.609e+9
                    "Kilometer" -> number * 1.609
                    "Nanometer" -> number * 1.609e+12
                    "Yard" -> number * 1760
                    "Foot" -> number * 5280
                    "Inch" -> number * 63360
                    "Light Year" -> number / 5.879e+12
                    else -> 0.0
                }

                "Yard" -> return when (to) {
                    "Centimeter" -> number * 91.44
                    "Meter" -> number / 1.094
                    "Millimeter" -> number * 914.4
                    "MicroMeter" -> number * 914400
                    "Kilometer" -> number / 1094
                    "Nanometer" -> number * 9.144e+8
                    "Mile" -> number / 1760
                    "Foot" -> number * 3
                    "Inch" -> number * 36
                    "Light Year" -> number / 1.035e+16
                    else -> 0.0
                }

                "Foot" -> return when (to) {
                    "Centimeter" -> number * 30.48
                    "Meter" -> number / 3.281
                    "Millimeter" -> number * 304.8
                    "Kilometer" -> number / 3281
                    "MicroMeter" -> number * 304800
                    "Nanometer" -> number * 3.048e+8
                    "Mile" -> number / 5280
                    "Yard" -> number / 3
                    "Inch" -> number * 12
                    "Light Year" -> number / 3.104e+16
                    else -> 0.0
                }

                "Inch" -> return when (to) {
                    "Centimeter" -> number * 2.54
                    "Meter" -> number / 39.37
                    "Millimeter" -> number * 25.4
                    "MicroMeter" -> number * 25400
                    "Kilometer" -> number / 39370
                    "Nanometer" -> number * 2.54e+7
                    "Mile" -> number / 63360
                    "Yard" -> number / 36
                    "Foot" -> number / 12
                    "Light Year" -> number / 3.725e+17
                    else -> 0.0
                }

                "Light Year" -> return when (to) {
                    "Centimeter" -> number * 9.461e+17
                    "Meter" -> number * 9.461e+15
                    "Millimeter" -> number * 9.461e+18
                    "MicroMeter" -> number * 9.461e+21
                    "Nanometer" -> number * 9.461e+24
                    "Kilometer" -> number * 9.461e+12
                    "Mile" -> number * 5.879e+12
                    "Yard" -> number * 1.035e+16
                    "Foot" -> number * 3.104e+16
                    "Inch" -> number * 3.725e+17
                    else -> 0.0
                }

                "Kilometer" -> return when (to) {
                    "Centimeter" -> number * 100000
                    "Meter" -> number * 1000
                    "Millimeter" -> number * 1e+6
                    "MicroMeter" -> number * 1e+9
                    "Nanometer" -> number * 1e+12
                    "Mile" -> number / 1.609
                    "Yard" -> number * 1093.61
                    "Foot" -> number * 3280.84
                    "Inch" -> number * 39370.1
                    "Light Year" -> number / 9.461e+12
                    else -> 0.0
                }

                else -> return 0.0
            }
        }
    }

    class Area {
        private var lengths: ArrayList<String> = ArrayList()

        init {
            lengths = arrayListOf(
                "Square Kilometer",
                "Square Meter",
                "Square Mile",
                "Square Yard",
                "Square Foot",
                "Square Inch",
                "Hectare",
                "Acre"
            )
        }

        fun getUnits(): ArrayList<String> {
            return this.lengths
        }

        fun calculate(from: String? = null, to: String? = null, number: Double = 0.0): Double {
            if (from.equals(to)) {
                return number
            }
            when (from) {
                "Square Kilometer" -> return when (to) {
                    "Square Meter" -> number * 1e+6
                    "Square Mile" -> number / 2.59
                    "Square Yard" -> number * 1.196e+6
                    "Square Foot" -> number * 1.076e+7
                    "Square Inch" -> number * 1.55e+9
                    "Hectare" -> number * 100
                    "Acre" -> number * 247.1
                    else -> 0.0
                }

                "Square Meter" -> return when (to) {
                    "Square Kilometer" -> number / 1e+6
                    "Square Mile" -> number / 2.59e+6
                    "Square Yard" -> number * 1.196
                    "Square Foot" -> number * 10.764
                    "Square Inch" -> number * 1550
                    "Hectare" -> number / 10000
                    "Acre" -> number / 4047
                    else -> 0.0
                }

                "Square Mile" -> return when (to) {
                    "Square Kilometer" -> number * 2.59
                    "Square Meter" -> number * 2.59e+6
                    "Square Yard" -> number * 3.098e+6
                    "Square Foot" -> number * 2.788e+7
                    "Square Inch" -> number * 4.014e+9
                    "Hectare" -> number * 259
                    "Acre" -> number * 640
                    else -> 0.0
                }

                "Square Yard" -> return when (to) {
                    "Square Kilometer" -> number / 1.196e+6
                    "Square Meter" -> number / 1.196
                    "Square Mile" -> number / 3.098e+6
                    "Square Foot" -> number * 9
                    "Square Inch" -> number * 1296
                    "Hectare" -> number / 11960
                    "Acre" -> number / 4840
                    else -> 0.0
                }

                "Square Foot" -> return when (to) {
                    "Square Kilometer" -> number / 1.076e+7
                    "Square Meter" -> number / 10.764
                    "Square Mile" -> number / 2.788e+7
                    "Square Yard" -> number / 9
                    "Square Inch" -> number * 144
                    "Hectare" -> number / 107600
                    "Acre" -> number / 43560
                    else -> 0.0
                }

                "Square Inch" -> return when (to) {
                    "Square Kilometer" -> number / 1.55e+9
                    "Square Meter" -> number / 1550
                    "Square Mile" -> number / 4.014e+9
                    "Square Yard" -> number / 1296
                    "Square Foot" -> number / 144
                    "Hectare" -> number / 1.55e+7
                    "Acre" -> number / 6.273e+6
                    else -> 0.0
                }

                "Hectare" -> return when (to) {
                    "Square Kilometer" -> number / 100
                    "Square Meter" -> number * 10000
                    "Square Mile" -> number /  259
                    "Square Yard" -> number * 11960
                    "Square Foot" -> number * 107600
                    "Square Inch" -> number * 1.55e+7
                    "Acre" -> number * 2.471
                    else -> 0.0
                }

                "Acre" -> return when (to) {
                    "Square Kilometer" -> number / 247.1
                    "Square Meter" -> number * 4047
                    "Square Mile" -> number / 640
                    "Square Yard" -> number * 4840
                    "Square Foot" -> number * 43560
                    "Square Inch" -> number * 6.273e+6
                    "Hectare" -> number / 2.471
                    else -> 0.0
                }

                else -> return 0.0
            }
        }
    }

    class Mass {
        private var units: ArrayList<String> = ArrayList()

        init {
            units = arrayListOf(
                "Tonne",
                "Kilogram",
                "Gram",
                "Milligram",
                "Microgram",
                "Pound",
            )
        }

        fun getUnits(): ArrayList<String> {
            return this.units
        }

        fun calculate(from: String? = null, to: String? = null, number: Double = 0.0): Double {
            if (from.equals(to)) {
                return number
            }
            when (from) {
                "Tonne" -> return when (to) {
                    "Kilogram" -> number * 1000
                    "Gram" -> number * 1e+6
                    "Milligram" -> number * 1e+9
                    "Microgram" -> number * 1e+12
                    "Pound" -> number * 2205
                    else -> 0.0
                }

                "Kilogram" -> return when (to) {
                    "Tonne" -> number / 1000
                    "Gram" -> number * 1000
                    "Milligram" -> number * 1e+6
                    "Microgram" -> number * 1e+9
                    "Pound" -> number * 2.205
                    else -> 0.0
                }

                "Gram" -> return when (to) {
                    "Tonne" -> number / 1e+6
                    "Kilogram" -> number / 1000
                    "Milligram" -> number * 1000
                    "Microgram" -> number * 1e+6
                    "Pound" -> number / 453.6
                    else -> 0.0
                }

                "Milligram" -> return when (to) {
                    "Tonne" -> number / 1e+9
                    "Kilogram" -> number / 1e+6
                    "Gram" -> number / 1000
                    "Microgram" -> number * 1000
                    "Pound" -> number / 453600
                    else -> 0.0
                }

                "Microgram" -> return when (to) {
                    "Tonne" -> number / 1e+12
                    "Kilogram" -> number / 1e+9
                    "Gram" -> number / 1e+6
                    "Milligram" -> number / 1000
                    "Pound" -> number / 4.536e+8
                    else -> 0.0
                }

                "Pound" -> return when (to) {
                    "Tonne" -> number / 2205
                    "Kilogram" -> number / 2.205
                    "Gram" -> number * 453.6
                    "Milligram" -> number * 453600
                    "Microgram" -> number * 4.536e+8
                    else -> 0.0
                }

                else -> return 0.0
            }
        }
    }

    class Speed {
        private var units: ArrayList<String> = ArrayList()

        init {
            units = arrayListOf(
                "Mile Per Hour",
                "Foot Per Second",
                "Meter Per Second",
                "Kilometer Per Hour",
                "Knot",
            )
        }

        fun getUnits(): ArrayList<String> {
            return this.units
        }

        fun calculate(from: String? = null, to: String? = null, number: Double = 0.0): Double {
            if (from.equals(to)) {
                return number
            }
            when (from) {
                "Mile Per Hour" -> return when (to) {
                    "Foot Per Second" -> number * 1.467
                    "Meter Per Second" -> number / 2.237
                    "Kilometer Per Hour" -> number * 1.609
                    "Knot" -> number / 1.151
                    else -> 0.0
                }

                "Foot Per Second" -> return when (to) {
                    "Mile Per Hour" -> number / 1.467
                    "Meter Per Second" -> number / 3.281
                    "Kilometer Per Hour" -> number * 1.097
                    "Knot" -> number / 1.688
                    else -> 0.0
                }

                "Meter Per Second" -> return when (to) {
                    "Mile Per Hour" -> number * 2.237
                    "Foot Per Second" -> number * 3.281
                    "Kilometer Per Hour" -> number * 3.6
                    "Knot" -> number * 1.944
                    else -> 0.0
                }

                "Kilometer Per Hour" -> return when (to) {
                    "Mile Per Hour" -> number / 1.609
                    "Foot Per Second" -> number / 1.097
                    "Meter Per Second" -> number / 3.6
                    "Knot" -> number / 1.852
                    else -> 0.0
                }

                "Knot" -> return when (to) {
                    "Mile Per Hour" -> number * 1.151
                    "Foot Per Second" -> number * 1.688
                    "Meter Per Second" -> number / 1.944
                    "Kilometer Per Hour" -> number * 1.852
                    else -> 0.0
                }

                else -> return 0.0
            }
        }
    }

    class Temperature {
        private var units: ArrayList<String> = ArrayList()

        init {
            units = arrayListOf(
                "Degree Celsius",
                "Fahrenheit",
                "Kelvin"
            )
        }

        fun getUnits(): ArrayList<String> {
            return this.units
        }

        fun calculate(from: String? = null, to: String? = null, number: Double = 0.0): Double {
            if (from.equals(to)) {
                return number
            }
            when (from) {
                "Degree Celsius" -> return when (to) {
                    "Fahrenheit" -> (number * 9 / 5) + 32
                    "Kelvin" -> number + 273.15
                    else -> 0.0
                }

                "Fahrenheit" -> return when (to) {
                    "Degree Celsius" -> (number - 32) * (5 / 9)
                    "Kelvin" -> (number - 32) * (5 / 9) + 273.15
                    else -> 0.0
                }

                "Kelvin" -> return when (to) {
                    "Degree Celsius" -> number - 273.15
                    "Fahrenheit" -> (number - 273.15) * (9 / 5) + 32
                    else -> 0.0
                }

                else -> return 0.0
            }
        }

    }
}