fun main () {
    array()
}

fun array (){
    val array = arrayOf<String>("jef","jos","erik","mark","dirk")

    for (`name` in array) {
        println("hello: " + `name`)
    }
}