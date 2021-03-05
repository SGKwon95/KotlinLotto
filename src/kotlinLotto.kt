fun main() {
    //랜덤 번호 8개 뽑기
    val nums = Array(8,{0})
    val picked = Array<Boolean>(46,{false})
    for (i in 0..7) {
        do {
            nums[i] = (1..45).random()
        } while(picked[nums[i]])
        picked[nums[i]] = true
    }
    nums.forEachIndexed { index, i -> println("${index+1} 번째 숫자 : ${i}") }
}