package me.blzr.aaa

fun main(args: Array<String>) {
    val status = when (args.size) {
        0 -> getStatus(0) {
            println("No Args!!! Status $it")
        }
        1 -> getStatus(1)
        2 -> getStatus(2)
        else -> getStatus(100) {
            args.forEach { println(it) }
        }
    }
    System.exit(status)
}

fun getStatus(status: Int, callback: (st: Int) -> Unit = {}): Int {
    callback(status)
    return status
}