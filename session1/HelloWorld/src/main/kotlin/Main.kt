fun main () {
    val array = arrayOf<String>("jef","jos","erik","mark","dirk")

    for (name in array) {
        greet(name)
    }
   
}

fun greet (name: String){
    println("hello $name")
}

