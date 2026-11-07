
using System;

public class Solution
{
    public void DuplicateZeros(int[] input)
    {
        int countZeros = 0;
        foreach (int value in input)
        {
            if (value == 0)
            {
                ++countZeros;
            }
        }

        for (int i = input.Length - 1; i >= 0 && countZeros > 0; --i)
        {
            if (input[i] > 0)
            {
                UpdateInput(input, i, countZeros);
                continue;
            }
            UpdateInput(input, i, countZeros);
            --countZeros;
            UpdateInput(input, i, countZeros);
        }
    }

    private static void UpdateInput(int[] input, int index, int countZeros)
    {
        if (index + countZeros < input.Length)
        {
            input[index + countZeros] = input[index];
        }
    }
}
