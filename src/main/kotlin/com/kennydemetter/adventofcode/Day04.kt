package com.kennydemetter.adventofcode

object Day04:AdventOfCodeDay {

    override val DAY = 4

    val input = 130254 .. 678275

    fun checkAdjacencyPuzzle1(pass:Int): Boolean {
        val str = pass.toString()

        for (i in 0..str.length-2) {

            if (str[i] == str[i+1] ) {
                return true;
            }

        }

        return false
    }

    fun checkAdjacencyPuzzle2(pass:Int): Boolean {
        val str = pass.toString()

        var repeats = listOf<Int>()

        var counter = 1
        for (i in 0..str.length - 2) {

            if (str[i] == str[i + 1]) {
                counter += 1
            } else {
                // add number to list
                // reset the counter
                repeats += counter
                counter = 1
            }

        }
        repeats += counter

        // if we find 2 repeats , return true , otherwise false
        return 2 in repeats

    }

    fun checkDigitsDontDecrease(pass:Int):Boolean {
        val str = pass.toString()

        var highestNumber:Int = 0


        str.forEach {
            val nr = it.toInt()

            if (nr >= highestNumber) {
                highestNumber = nr
            } else {
                return false;
            }

        }
        return true

    }

    fun isValidPuzzle1(pass:Int):Boolean {

        if (!checkAdjacencyPuzzle1(pass)) {
            return false;
        }

        if (!checkDigitsDontDecrease(pass)) {
            return false
        }

        return true
        // has to of the same adjacent digits


    }

    fun isValidPuzzle2(pass:Int):Boolean {

        if (!checkAdjacencyPuzzle2(pass)) {
            return false;
        }

        if (!checkDigitsDontDecrease(pass)) {
            return false
        }

        return true
        // has to of the same adjacent digits


    }




    override fun runPuzzle1() {
        var validPasswords:List<Int> = listOf()

        for (pass in input) {

            if (isValidPuzzle1(pass)) {
                validPasswords += pass
            }
        }

        outputPuzzle1(validPasswords.size)


    }

    override fun runPuzzle2() {
        var validPasswords:List<Int> = listOf()

        for (pass in input) {

            if (isValidPuzzle2(pass)) {
                validPasswords += pass
            }
        }
        outputPuzzle2(validPasswords.size)


    }

}