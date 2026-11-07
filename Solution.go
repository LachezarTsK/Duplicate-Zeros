
package main

func duplicateZeros(input []int) {
    countZeros := 0
    for _, value := range input {
        if value == 0 {
            countZeros++
        }
    }

    for i := len(input) - 1; i >= 0 && countZeros > 0; i-- {
        if input[i] > 0 {
            updateInput(input, i, countZeros)
            continue
        }
        updateInput(input, i, countZeros)
        countZeros--
        updateInput(input, i, countZeros)
    }
}

func updateInput(input []int, index int, countZeros int) {
    if index + countZeros < len(input) {
        input[index + countZeros] = input[index]
    }
}
