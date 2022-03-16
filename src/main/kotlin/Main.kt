
fun main () {
        println("===========================================")
        println("Selamat datang di permainal ter-jan-ken-pow \n")
        println("silahkan masukkan 'gunting', 'batu', atau 'kertas' untuk melanjutkan")
        println("===========================================")

        // set player 1
        println("\nMasukkan pemain 1 :")
        val handSign1: String? = readLine()
        val player1 = Player("Player 1", handSign1?.trim() )
        val isPlayer1Valid = player1.validateInput(handSign1?.trim()!!)

        // set player2
        println("\nMasukkan pemain 2 :")
        val handSign2: String? = readLine()
        val player2 = Player("Player 2", handSign2?.trim() )
        val isPlayer2Valid = player2.validateInput(handSign2?.trim()!!)

        // make game class
        val jankenpo = Game()
        val isGameValid = jankenpo.isValid(isPlayer1Valid, isPlayer2Valid)

        if(isGameValid) {
                println("mainkan gamenya")
                val result =  jankenpo.play(player1, player2)
                if(result == "draw") {
                        println("DRAW !!!")
                } else {
                        println("${result.uppercase()} MENANG !!!")
                }
        } else {
                println("Kamu salah memasukkan pilihan, coba ulangi lagi ya :)")
        }
}

class Player(name: String?, hand: String?) {
    val playerName: String? = name
    val playerHand: String? = hand
        fun validateInput(PlayerHand: String): Boolean {
                val options = arrayOf("gunting", "batu", "kertas")
                var valid = false
                for(option in options) {
                        if (!valid && option == PlayerHand) { valid = true }
                }
                return valid
        }
}

class Game {
        fun play(Player1: Player, Player2: Player): String {
                var result = "draw"

                when {
                    Player1.playerHand == "kertas" && Player2.playerHand == "gunting" -> result = Player2.playerName.toString()
                    Player1.playerHand == "kertas" && Player2.playerHand == "batu" -> result = Player1.playerName.toString()
                    Player1.playerHand == "gunting" && Player2.playerHand == "batu" -> result = Player2.playerName.toString()
                    Player1.playerHand == "gunting" && Player2.playerHand == "kertas" -> result = Player1.playerName.toString()
                    Player1.playerHand == "batu" && Player2.playerHand == "kertas" -> result = Player2.playerName.toString()
                    Player1.playerHand == "batu" && Player2.playerHand == "gunting" -> result = Player1.playerName.toString()
                }

                return result
        }

        fun isValid(player1Input: Boolean?, player2Input: Boolean?): Boolean {
                return player1Input == true && player2Input == true
        }
}