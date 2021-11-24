package data.raid

object Ultimate {
    var ultimateArr = arrayOf("究极神兵绝境战", "巴哈姆特绝境战", "亚历山大绝境战")
    val randomUltimate: String
        get() {
            var index = ultimateArr.size - 1
            val random = (0..index).random()
            return ultimateArr[random]
        }
}