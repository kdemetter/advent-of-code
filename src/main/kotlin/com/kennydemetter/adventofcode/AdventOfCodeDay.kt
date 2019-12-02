package com.kennydemetter.adventofcode

interface AdventOfCodeDay {

    fun runPuzzle1()
    fun runPuzzle2()

    fun run() {
        runPuzzle1()
        runPuzzle2()
    }

}