package Factorial;

public class Main {
    public static void main(String[] args) {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        System.out.println(factorialCalculator.calculateFactorial(3));
        System.out.println(factorialCalculator.calculateFactorial(2));
        System.out.println(factorialCalculator.calculateFactorial(1));
        System.out.println(factorialCalculator.calculateFactorial(0));
        System.out.println(factorialCalculator.calculateFactorial(-1));
    }
}

class FactorialCalculator {

    public int calculateFactorial(int number) {
        if(number > 0) {
            int answer = 1;
            for (int i = 1; i <= number; i++) {
                answer = answer * i;
            }
            return answer;
        }else if(number == 0){
            return 1;
        }
        return -1;
    }
}