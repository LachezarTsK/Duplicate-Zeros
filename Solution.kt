
class Solution {

    fun duplicateZeros(input: IntArray): Unit {
        var countZeros = 0
        for (value in input) {
            if (value == 0) {
                ++countZeros
            }
        }

        for (i in input.size - 1 downTo (0)) {
            if (input[i] > 0) {
                updateInput(input, i, countZeros)
                continue
            }
            updateInput(input, i, countZeros)
            --countZeros
            if (countZeros == 0) {
                break
            }
            updateInput(input, i, countZeros)
        }
    }

    private fun updateInput(input: IntArray, index: Int, countZeros: Int) {
        if (index + countZeros < input.size) {
            input[index + countZeros] = input[index]
        }
    }
}
