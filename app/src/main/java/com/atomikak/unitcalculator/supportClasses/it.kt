package com.atomikak.unitcalculator.supportClasses

class It {

    class DataStorage {

        private var lengths: ArrayList<String> = ArrayList()

        init {
            lengths = arrayListOf(
                "Bit",
                "Byte",
                "Kilobyte",
                "Megabyte",
                "Gigabyte",
                "Terabyte",
                "Petabyte",
            )
        }

        fun getUnits(): ArrayList<String> {
            return lengths
        }

        fun calculate(from: String, to: String, number: Double): Double {

            if (from == to){
                return number
            }

            when(from){
                "Bit"-> return when(to){
                    "Byte"-> number/8
                    "Kilobyte"-> number/8000
                    "Megabyte"-> number/8e+6
                    "Gigabyte"-> number/8e+9
                    "Terabyte"-> number/8e+12
                    "Petabyte"-> number/8e+15
                    else->{
                        0.0
                    }
                }

                "Byte"-> return when(to){
                    "Bit"-> number*8
                    "Kilobyte"-> number/1000
                    "Megabyte"-> number/1e+6
                    "Gigabyte"-> number/1e+9
                    "Terabyte"-> number/1e+12
                    "Petabyte"-> number/1e+15
                    else->{
                        0.0
                    }
                }

                "Kilobyte"-> return when(to){
                    "Bit"-> number*8000
                    "Byte"-> number*1000
                    "Megabyte"-> number/1000
                    "Gigabyte"-> number/1e+6
                    "Terabyte"-> number/1e+9
                    "Petabyte"-> number/1e+12
                    else->{
                        0.0
                    }
                }

                "Megabyte"-> return when(to){
                    "Bit"-> number*8e+6
                    "Byte"-> number*1e+6
                    "Kilobyte"-> number*1000
                    "Gigabyte"-> number/1000
                    "Terabyte"-> number/1e+6
                    "Petabyte"-> number/1e+9
                    else->{
                        0.0
                    }
                }

                "Gigabyte"-> return when(to){
                    "Bit"-> number*8e+9
                    "Byte"-> number*1e+9
                    "Kilobyte"-> number*1e+6
                    "Megabyte"-> number*1000
                    "Terabyte"-> number/1000
                    "Petabyte"-> number/1e+6
                    else->{
                        0.0
                    }
                }

                "Terabyte"-> return when(to){
                    "Bit"-> number*8e+12
                    "Byte"-> number*1e+12
                    "Kilobyte"-> number*1e+9
                    "Megabyte"-> number*1e+6
                    "Gigabyte"-> number*1000
                    "Petabyte"-> number/1000
                    else->{
                        0.0
                    }
                }

                "Petabyte"-> return when(to){
                    "Bit"-> number*8e+15
                    "Byte"-> number*1e+15
                    "Kilobyte"-> number*1e+12
                    "Megabyte"-> number*1e+9
                    "Gigabyte"-> number*1e+6
                    "Terabyte"-> number*1000
                    else->{
                        0.0
                    }
                }

                else -> return 0.0
            }

        }

    }

    class DataTransfer{
        private var lengths: ArrayList<String> = ArrayList()

        init {
            lengths =arrayListOf(
                "Bit Per Second",
                "Kilobyte Per Second",
                "Megabyte Per Second",
                "Gigabyte Per Second",
                "Terabyte Per Second",
            )
        }

        fun getUnits(): ArrayList<String> {
            return lengths
        }

        fun calculate(from: String, to: String, number: Double): Double {

            if (from == to){
                return number
            }

            when(from){
                "Bit Per Second"-> return when(to){
                    "Kilobyte Per Second"-> number/8000
                    "Megabyte Per Second"-> number/8e+6
                    "Gigabyte Per Second"-> number/8e+6
                    "Terabyte Per Second"-> number/8e+12
                    else->{
                        0.0
                    }
                }

                "Kilobyte Per Second"-> return when(to){
                    "Bit Per Second"-> number*8000
                    "Megabyte Per Second"-> number/1000
                    "Gigabyte Per Second"-> number/1e+6
                    "Terabyte Per Second"-> number/1e+9
                    else->{
                        0.0
                    }
                }

                "Megabyte Per Second"-> return when(to){
                    "Bit Per Second"-> number*8e+6
                    "Kilobyte Per Second"-> number*1000
                    "Gigabyte Per Second"-> number/1000
                    "Terabyte Per Second"-> number/1e+6
                    else->{
                        0.0
                    }
                }

                "Gigabyte Per Second"-> return when(to){
                    "Bit Per Second"-> number*8e+9
                    "Kilobyte Per Second"-> number*1e+6
                    "Megabyte Per Second"-> number*1000
                    "Terabyte Per Second"-> number/1000
                    else->{
                        0.0
                    }
                }

                "Terabyte Per Second"-> return when(to){
                    "Bit Per Second"-> number*8e+12
                    "Kilobyte Per Second"-> number*1e+9
                    "Megabyte Per Second"-> number*1e+6
                    "Gigabyte Per Second"-> number*1000
                    else->{
                        0.0
                    }
                }

                else -> return 0.0
            }

        }
    }

}