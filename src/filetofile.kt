fun main() {
    try {
        var arr = arrayOf(readln().toInt(), readln().toInt(), readln().toInt())
        if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
            if (arr[1] == arr[2] && arr[1] == arr[0]) print(3)
            else print(2)
        } else print(0)
    } catch (e: Exception) {
        print("Ошибка")
    }
}





