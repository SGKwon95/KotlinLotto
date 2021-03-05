import java.util.Scanner
fun main() {
    print("시도할 횟수 입력 : ")
    val numofPick = Scanner(System.`in`).nextInt()
    for (T in 1..numofPick) {
        println("===== ${T}번째 시도 =====")
        val nums = Array<Int>(7,{0})
        val picked = Array<Boolean>(46,{false})
        for (i in 0..6) {
            do {
                nums[i] = (1..45).random()
            } while(picked[nums[i]])
            picked[nums[i]] = true
        }
        nums.forEachIndexed { index, i -> println("${index+1} 번째 숫자 : ${i}") }
        println()
    }
}