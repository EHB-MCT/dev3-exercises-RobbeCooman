fun main(){

    val persons = arrayOf(Student("Jef"), Teacher("Jos"), Comedian("Mike"),Chatbot())


    val chatPartner = persons.random()
    chatPartner.introduce()
    chatPartner.talk()





}