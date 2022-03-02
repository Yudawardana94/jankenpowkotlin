
fun main (args: Array<String>) {
        println("===========================================")
        println("Selamat datang di permainal ter-jan-ken-pow \n")
        println("silahkan masukkan 'gunting', 'batu', atau 'kertas' untuk melanjutkan")
        println("===========================================")

        // set player 1
        println("\nMasukkan pemain 1 :")
        var handSign1: String? = readLine()
        val Player1 = Player("Player 1", handSign1?.trim() )
        var isPlayer1Valid = Player1.validateInput(handSign1?.trim()!!)

        // set player2
        println("\nMasukkan pemain 2 :")
        var handSign2: String? = readLine()
        val Player2 = Player("Player 2", handSign2?.trim() )
        var isPlayer2Valid = Player2.validateInput(handSign2?.trim()!!)

        // make game class
        val JanKenPo = Game()
        var isGameValid = JanKenPo.isValid(isPlayer1Valid, isPlayer2Valid)

        if(isGameValid) {
                println("mainkan gamenya")
                var result =  JanKenPo.play(Player1!!, Player2!!);
                if(result == "draw") {
                        println("DRAW !!!")
                } else {
                        println("${result.uppercase()} MENANG !!!")
                }
        } else {
                println("Kamu salah memasukkan pilihan, coba ulangi lagi ya :)")
        }

}

class Player(playerName: String?, playerHand: String?) {
    var playerName: String? = playerName
    var playerHand: String? = playerHand
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

                if(Player1.playerHand == "kertas" && Player2.playerHand == "gunting") result = Player2.playerName.toString()
                else if(Player1.playerHand == "kertas" && Player2.playerHand == "batu") result = Player1.playerName.toString()
                else if(Player1.playerHand == "gunting" && Player2.playerHand == "batu") result = Player2.playerName.toString()
                else if(Player1.playerHand == "gunting" && Player2.playerHand == "kertas") result = Player1.playerName.toString()
                else if(Player1.playerHand == "batu" && Player2.playerHand == "kertas") result = Player2.playerName.toString()
                else if(Player1.playerHand == "batu" && Player2.playerHand == "gunting") result = Player1.playerName.toString()

                return result;
        }

        fun isValid(player1Input: Boolean?, player2Input: Boolean?): Boolean {
                println("$player1Input, $player2Input, yang ini ya bosquee")
                if(player1Input == true && player2Input == true) return true;
                return false;
        }
}