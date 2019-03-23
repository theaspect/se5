package me.blzr.aaa

fun main(args: Array<String>) {
    val status = when {
        args.isEmpty() -> {
            println("No Args!!!")
            0
        }
        args.size == 1 -> 1
        args.size == 2 -> 2
        else -> {
            args.forEach { println(it) }
            100
        }
    }
    System.exit(status)
}