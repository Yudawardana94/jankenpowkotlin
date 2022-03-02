fun main(args: Array<String>) {
    println("Welcome to terminal jan-ken-pow")
    println("choose 'gunting', 'batu', atau 'kertas'")

    var player1 = readLine()
    var player2 = readLine()
    var isValid = true

    if(isValid) {
        var isSame = player1 == player2
        var result = ""
        if(player1 == "kertas" && player2 == "gunting") result = "Player 2"
        else if(player1 == "kertas" && player2 == "batu") result = "Player 1"
        else if(player1 == "gunting" && player2 == "batu") result = "Player 2"
        else if(player1 == "gunting" && player2 == "kertas") result = "Player 1"
        else if(player1 == "batu" && player2 == "kertas") result = "Player 2"
        else if(player1 == "batu" && player2 == "gunting") result = "Player 1"

        println("player 1 is ${player1?.uppercase()} vs player2 is ${player2?.uppercase()}")
        if(isSame) {
            println("The result is draw")
        } else {
            println("The winner is $result")
        }
    } else {
        println("Choose the right option")
    }
}