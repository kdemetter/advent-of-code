package com.kennydemetter.adventofcode

import java.lang.Exception

object Day02:AdventOfCodeDay {

   private val memory = arrayListOf<Int>(1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,13,1,19,1,10,19,23,1,6,23,27,1,5,27,31,1,10,31,35,2,10,35,39,1,39,5,43,2,43,6,47,2,9,47,51,1,51,5,55,1,5,55,59,2,10,59,63,1,5,63,67,1,67,10,71,2,6,71,75,2,6,75,79,1,5,79,83,2,6,83,87,2,13,87,91,1,91,6,95,2,13,95,99,1,99,5,103,2,103,10,107,1,9,107,111,1,111,6,115,1,115,2,119,1,119,10,0,99,2,14,0,0)

    fun process(memory:ArrayList<Int>):ArrayList<Int> {

        var instructionPointer:Int = 0

        while(instructionPointer < memory.size) {

            if (memory[instructionPointer] == (1)) {
                // we perform addition
                val inputPos1 = memory[(instructionPointer + 1)]
                val inputPos2 = memory[instructionPointer + 2]
                val outputPos = memory[instructionPointer + 3]

                val result = memory[inputPos1] + memory[inputPos2]
                memory[outputPos] = result

            } else if (memory[instructionPointer] == 2) {
                // we perform multiplication
                val inputPos1 = memory[(instructionPointer + 1)]
                val inputPos2 = memory[instructionPointer + 2]
                val outputPos = memory[instructionPointer + 3]

                val result = memory[inputPos1] * memory[inputPos2]
                memory[outputPos] = result
            } else if (memory[instructionPointer] == 99) {
                // we halt the program
                break
            } else {
                throw Exception("Something went wrong")
            }

            //  println(memory)
            instructionPointer +=4



        }

        return memory

    }

    override fun runPuzzle1() {
       val result =  process(ArrayList<Int>(memory))

        println("Day 02, puzzle 1 result : ${result[0]}")

    }

    override fun runPuzzle2() {

        for(noun in 0..99) {
            for(verb in 0..99) {

                // make a copy of the memory to make sure we don't accidentally overwrite it
                val newMemory = ArrayList<Int>(memory)
                newMemory[1] = noun
                newMemory[2] = verb
                val result = process(newMemory)

                if (result[0] == 19690720) {
                    println("Day 02, puzzle 2 result : ${100 * noun + verb}")
                    return
                }

            }
        }
    }

}