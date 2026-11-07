
public class Solution {

    public void duplicateZeros(int[] input) {
        int countZeros = 0;
        for (int value : input) {
            if (value == 0) {
                ++countZeros;
            }
        }

        for (int i = input.length - 1; i >= 0 && countZeros > 0; --i) {
            if (input[i] > 0) {
                updateInput(input, i, countZeros);
                continue;
            }
            updateInput(input, i, countZeros);
            --countZeros;
            updateInput(input, i, countZeros);
        }
    }

    private static void updateInput(int[] input, int index, int countZeros) {
        if (index + countZeros < input.length) {
            input[index + countZeros] = input[index];
        }
    }
}
