# advent-of-code-2019

Lessons learned for each day

## Day 01

- listOf() is handy 
- Kotlin has some nice collection features, such as a sum() on a list
- You can add to a list using +=  ( no push or add method) . Disadvantage: can't be a val that way

## Day 02
- listOf() doesn't have index, but there is arrayListOf() which does

## Day 03
- Implemented it first with just going step by step, but this took way too long , so implemented intersection logic instead
- Learned that the kotlin range (start..end) only goes up by default ( 5..1 loops nothing ) . Makes sense in hindsight, but would have been nice otherwise
- Lost some time with puzzle 2 as I forgot to add the results of both wires together per intersections

## Day 04

- 'in' keyword for range can also be used with if ( not just for)
- can store a range as a seperate object
