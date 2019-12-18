import java.util.*

fun main () {


    var Chats = Chats()
    var Chiens = Chiens()
    var Perroquets = Perroquets()

    print("Liste des animaux present dans l'animalerie ")
    Chats.nom()
    Chiens.nom()
    Perroquets.nom()
    do {
        val reader = Scanner(System.`in`)
        var userGuess: Int
        computerSays("Choisir Un nombre 1 = Chats 2 = Chiens 3 = Perroquets")
        userGuess = reader.nextInt()
        if (userGuess != 1) {
            println("Le Cri du chat est :")
            Chats.parler()
        } else if (userGuess != 2) {
            computerSays("Le Cri du Chien est : ")
            Chiens.parler()
        }
    } while (userGuess != 3)
    computerSays("Le Cri du Perroquets  est Perroquets.parler ")
    Perroquets.parler()

}





    interface Animaux {
        fun nom()
        fun parler()
        fun quiSuisJe()
    }

    class Chats : Animaux {
        override fun nom() {
            println("Chats")
        }

        override fun parler() {
            println("Miaou")
        }

        override fun quiSuisJe() {
            println("je suis un chat ")
        }
    }

    class Chiens : Animaux {
        override fun nom() {
            println("Chiens")
        }

        override fun parler() {
            println("Woof")
        }

        override fun quiSuisJe() {
            println("je suis un chien ")
        }
    }

    class Perroquets : Animaux {
        override fun nom() {
            println("Perroquets")
        }

        override fun parler() {
            println("CooooCooooo")
        }

        override fun quiSuisJe() {
            println("je suis un Perroquet ")
        }
    }





