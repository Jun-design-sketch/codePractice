package Array;

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
}