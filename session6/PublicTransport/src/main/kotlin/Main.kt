import java.sql.*
import java.util.*

fun main() {
    val credentials = Credentials()


    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

// Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePass

// Create the connection: this will allow us to run queries on it later
    val connection = DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseUser,
        connectionProps)




    println("Where do you want to go?")
    val destination = readLine()

    val query = "SELECT rides LEFT JOIN trains ON rides.train_id = trains.id WHERE arrivalCity = ?"
    val statement = connection.prepareStatement(query)
    statement.setString(1, destination)
    val result = statement.executeQuery()

    while(result.next()) {
        println(result.getString("departure_time"))
    }
}