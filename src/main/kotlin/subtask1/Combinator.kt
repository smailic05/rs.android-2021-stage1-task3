package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m=array[0].toLong()
        val n=array[1]
        for(colorNumber in 0..n)
            if(m<= check(n,colorNumber))
                return colorNumber
        return null
    }

    private fun check(n: Int, k: Int): Long {
        return factorial(n) / (factorial(k) * factorial(n - k))
    }

    private fun factorial(n: Int): Long {
        // Мутирующая переменная (var)
        var result = 1L
        for (i in 1..n) {
            result = result * i
        }
        return result
    }
}
