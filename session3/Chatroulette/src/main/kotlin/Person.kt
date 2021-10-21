open class Person (open val name: String): ChatPartner {

   override open fun introduce() {
        println("Hi, my name is $name")
    }

   override open fun  talk(){

    }
}
