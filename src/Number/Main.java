package Number;

import java.util.ArrayList;
import java.util.List;

public class Main {

}

class NumberMagic {

    /**
     * This method returns all factors of a given number in an ArrayList.
     *
     * @param number the number to find factors of
     * @return a List of factors of the number
     */
    public List<Integer> determineAllFactors(int number) {
        List<Integer> list = new ArrayList<Integer>();
        int biggestFactor = number;
        if(number > 0) {
            for(int i = 1; i <= biggestFactor; i++){
                if(number % i == 0){
                    list.add(i);
                }
            }
        }
        return list;
    }

    /**
     * This method generates a list of multiples of a given number less than a specified limit.
     *
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public List<Integer> determineMultiples(int number, int limit) {
        List<Integer> list = new ArrayList<Integer>();
        if(number > 0 && limit > 0) {
            int times = limit % number == 0 ? limit / number - 1 : limit / number;
            for(int i = 1; i <= times; i++){
                int multiple = number * i;
                list.add(multiple);
            }
        }

        return list;
    }
}