package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }
}

class ArrayMagic {
    public boolean doesHaveElementGreaterThan(int[] array, int number) {
        boolean answer = false;
        if(array != null && array.length != 0) {
            for (int element : array) {
                answer = number < element ? true : false;
                if (!answer) {
                    continue;
                } else {
                    break;
                }
            }
        }
        return answer;
    }

    public int findSecondLargestElement(int[] array) {
        int answer = -1;
        if(array.length > 1){
            boolean allEqual = Arrays.stream(array).distinct().limit(2).count() <= 1;
            if(!allEqual) {
                int max = Arrays.stream(array).max().getAsInt();
                List<Integer> newList = Arrays.stream(array)
                        .filter(x -> x < max)
                        .boxed()
                        .collect(Collectors.toList());
                answer = Collections.max(newList);
            }
        }
        return answer;
    }

//    int largestElement = Integer.MIN_VALUE;
//    int secondLargestElement = Integer.MIN_VALUE;
//
//    for(int value: array) {
//        if(value > largestElement) {
//            secondLargestElement = largestElement;
//            largestElement = value;
//        } else if (value > secondLargestElement && value != largestElement) {
//            secondLargestElement = value;
//        }
//    }
//
//    if(secondLargestElement == Integer.MIN_VALUE) {
//        return -1;
//    }


}