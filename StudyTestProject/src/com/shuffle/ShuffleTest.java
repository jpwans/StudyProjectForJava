package com.shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jiangqin on 17/3/8.
 */
public class ShuffleTest {
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 49 ; i++) {
            numbers.add(i);
        }
        // 随机乱序
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }
}
