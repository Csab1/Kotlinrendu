import java.lang.StringBuilder
import java.util.*


fun main (args:Array<String>) {

    var nbAttempts = 0
    val reader = Scanner(System.`in`)
    var userGuess: Int
    computerSays("Choisir un nombres")
    val goal = reader.nextInt()
    
    do {
        nbAttempts++
        computerSays("Quel est votre reponse ??")
        userGuess = reader.nextInt()
        if (userGuess > goal) computerSays("Moin!")
        else if (userGuess < goal) computerSays("Plus!")
    } while (userGuess != goal)
    computerSays("Bravo ! Vous avez trouver $goal en  $nbAttempts temptative.")
}
fun computerSays(text:String){
    println( text )
    }


