package com.kennydemetter.adventofcode

interface AdventOfCodeDay {

    abstract val DAY: Int


    fun runPuzzle1()
    fun runPuzzle2()

    fun run() {
        runPuzzle1()
        runPuzzle2()
    }

    fun outputPuzzle1(output: Any?) {
        outputResult(1, output)
    }

    fun outputPuzzle2(output: Any?) {
        outputResult(2, output)
    }

    fun outputResult(puzzleNr: Long, output: Any?) {
        println("Day $DAY, puzzle $puzzleNr: $output")

    }

}