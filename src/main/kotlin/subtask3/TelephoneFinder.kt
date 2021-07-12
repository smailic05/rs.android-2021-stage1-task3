package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val array1 = intArrayOf(2, 4)
        val array2 = intArrayOf(1, 3, 5)
        val array3 = intArrayOf(2, 6)
        val array4 = intArrayOf(1, 5, 7)
        val array5 = intArrayOf(2, 4, 6, 8)
        val array6 = intArrayOf(3, 5, 9)
        val array7 = intArrayOf(4, 8)
        val array8 = intArrayOf(5, 7, 9, 0)
        val array9 = intArrayOf(6, 8)
        val array0 = intArrayOf(8)
        val numberArray = arrayListOf<String>()

        for (i in number.indices) {
            val t = Character.getNumericValue(number[i])
            when (t) {
                1 -> checkNumber(i, number, array1, numberArray)
                2 -> checkNumber(i, number, array2, numberArray)
                3 -> checkNumber(i, number, array3, numberArray)
                4 -> checkNumber(i, number, array4, numberArray)
                5 -> checkNumber(i, number, array5, numberArray)
                6 -> checkNumber(i, number, array6, numberArray)
                7 -> checkNumber(i, number, array7, numberArray)
                8 -> checkNumber(i, number, array8, numberArray)
                9 -> checkNumber(i, number, array9, numberArray)
                0 -> checkNumber(i, number, array0, numberArray)
                else -> return null
            }
        }
        val k = numberArray[0]
        return numberArray.toTypedArray()
    }

    private fun checkNumber(n: Int, number: String, array: IntArray, list: ArrayList<String>) {
        for (i in array) {
            val str = number.substring(0, n) + i + number.substring(n + 1)
            list.add(str)
        }
    }
}
