package me.blzr.aaa

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("No Args!!!")
    }else{
        for (arg in args) {
            println(arg)
        }
    }
}