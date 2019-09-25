package com.ankitech.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class AppleAndOrange {

    static int[] countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        List<Integer> absoluteDistanceOfApples = Arrays.stream(apples).map(i -> i+a).boxed().collect(Collectors.toList());
        List<Integer> absoluteDistanceOfOranges = Arrays.stream(oranges).map(i -> i+b).boxed().collect(Collectors.toList());

        List<Integer> collectedApples = absoluteDistanceOfApples.stream().filter(apple -> apple >= s && apple <= t).collect(Collectors.toList());
        List<Integer> collectedOranges = absoluteDistanceOfOranges.stream().filter(orange -> orange >= s && orange <= t).collect(Collectors.toList());

        System.out.println(collectedApples.size());
        System.out.println(collectedOranges.size());
        return new int[]{collectedApples.size(),collectedOranges.size()};
    }
}
