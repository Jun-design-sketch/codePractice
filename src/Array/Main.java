package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayMagic arrayMagic = new ArrayMagic();
        int[] array = {-40, -20, 0, 100, 10};
        arrayMagic.reverseArray(array);
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

    /**
     * This method checks if the input array is sorted in ascending order.
     *
     * @param array the array to check
     * @return true if the array is sorted, false otherwise
     */
    public boolean isSorted(int[] array) {
        boolean result = false;
        if(array.length > 1 && array != null){
            result = true;
            for (int i = 0; i < array.length-1; i++){
                if(array[i]+1 == array[i+1] || array[i] == array[i+1]){
                    continue;
                }else{
                    result = false;
                    break;
                }
            }
        }else{
            result = true;
        }
        return result;


//        if(array.length <= 1){
//            return true;
//        }
//        for(int i = 0; i < array.length - 1; i++) {
//            if(array[i+1] < array[i]) {
//                return false;
//            }
//        }
//        return true;
    }

    /**
     * This method reverses an array.
     *
     * @param array the array to reverse
     * @return a new array with elements in reverse order
     */
    public int[] reverseArray(int[] array) {
        // 配列がNULLなら
        if(array == null){
            int result[] = {};
            return result;
        }
        // 配列の数が１つなら
        if(array.length == 1){
            // そのまま返却すれば良いので処理は不要
        }

        // 配列の数が２つ以上なら
        if(array.length > 1){
            int halfLine = array.length / 2;
            for(int i  = 0; i < halfLine; i++) {
                int head = array[i];
                int tail = array[array.length-i-1];
                array[i] = tail;
                array[array.length-i-1] = head;
            }
        }
        return array;

//        新しい返却用の配列を作る方が元の配列を保持する意味では優れていると感じた
//        int start = 0;
//        int end = array.length - 1;
//        int [] reversedArray = new int[array.length];
//        while (start < end) {
//            reversedArray[start] = array[end];
//            reversedArray[end] = array[start];
//            start++;
//            end--;
//        }
    }






}


























