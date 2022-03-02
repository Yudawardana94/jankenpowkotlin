import java.util.Timer
import kotlin.concurrent.schedule

fun main(args: Array<String>) {
    println("===========================================")
    println("Selamat datang di permainal ter-jan-ken-pow \n")
    println("silahkan masukkan 'gunting', 'batu', atau 'kertas' untuk melanjutkan")
    println("===========================================")

    println("")
    println("Masukkan pemain 1 :")
    var player1 = readLine()
    var player1Validation = player1 == "kertas" || player1 == "gunting" || player1 == "batu"
    println("")
    println("Masukkan pemain 2: ")
    var player2 = readLine()
    var player2Validation = player2 =="kertas" || player2 == "gunting" || player2 == "batu"

    var isValid = player1Validation == true && player2Validation == true

    if(isValid) {
        var isSame = player1 == player2
        var result = ""
        if(player1 == "kertas" && player2 == "gunting") result = "Player 2"
        else if(player1 == "kertas" && player2 == "batu") result = "Player 1"
        else if(player1 == "gunting" && player2 == "batu") result = "Player 2"
        else if(player1 == "gunting" && player2 == "kertas") result = "Player 1"
        else if(player1 == "batu" && player2 == "kertas") result = "Player 2"
        else if(player1 == "batu" && player2 == "gunting") result = "Player 1"

        println("player 1 is ${player1?.uppercase()} vs player2 is ${player2?.uppercase()} \n")

        println("HASIL: ")
        println("tunggu yaa~")
        Thread.sleep(1000)
        if(isSame) {
            println("DRAW !!!")
        } else if(result != "") {
            println("${result.uppercase()} MENANG !!!")
        }
    } else {
        println("Kamu salah memasukkan pilihan, coba ulangi lagi ya :)")
    }
}