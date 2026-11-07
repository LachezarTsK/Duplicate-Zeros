
/**
 * @param {number[]} input
 * @return {void} Do not return anything, modify arr in-place instead.
 */
var duplicateZeros = function (input) {
    let countZeros = 0;
    for (let value of input) {
        if (value === 0) {
            ++countZeros;
        }
    }

    for (let i = input.length - 1; i >= 0 && countZeros > 0; --i) {
        if (input[i] > 0) {
            updateInput(input, i, countZeros);
            continue;
        }
        updateInput(input, i, countZeros);
        --countZeros;
        updateInput(input, i, countZeros);
    }
};

/**
 * @param {number[]} input
 * @param {number} index
 * @param {number} countZeros
 * @return {void} 
 */
function updateInput(input, index, countZeros) {
    if (index + countZeros < input.length) {
        input[index + countZeros] = input[index];
    }
}
