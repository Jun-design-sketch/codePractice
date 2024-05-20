package NumberUtils;

public class Main {
    public static void main(String[] args) {
        BiNumber binumber = new BiNumber(15, 20);
        System.out.println(binumber.calculateLCM());
    }
    /*
    ** @param int number
    ** numberの最後の１桁を返却する。
     */
    public int getLastDigit(int number) {
        if(number >= 0){
            String stNum = Integer.toString(number);
            char lastChar = stNum.charAt(stNum.length() - 1);
            int lastNum = Character.getNumericValue(lastChar);
            return lastNum;
        } else {
            return -1;
        }
        // こんなまわりくどいことしなくても良かった。。
        // number % 10だけで最後の1文字（数字）を返却することができる。。
    }

    /*
     ** @param int number
     ** numberの桁数を返却する。
     */
    public int getNumberofDigits(int number) {
        if (number >= 0) {
            String stNum = Integer.toString(number);
            int ketasuu = stNum.length();
            return ketasuu;
        } else {
            return -1;
        }
        // これもNumber/10をwhileで繰り返す方法があった。。
    }

    /*
     ** @param int number
     ** numberの各桁の数字を合算し返却する。
     */
    public int getSumOfDigits(int number) {
        if(number >= 0){
            String stNum = Integer.toString(number);
            int sum = 0;
            for(int i=0; i < stNum.length(); i++){
                char particularChar = stNum.charAt(i);
                int particularNum = Character.getNumericValue(particularChar);
                sum = sum + particularNum;
            }
            return sum;
        } else {
            return -1;
        }
    }
    // これも簡略な解き方があった。。
    //    int sumOfDigits = 0;
    //    while(number > 0) {
    //        int digit = number % 10;
    //        sumOfDigits += digit;
    //        number = number/10;
    //    }
    //    return sumOfDigits;

    /*
     ** @param int number
     ** numberの数字を逆転させて返却する。ex.12345 > 54321
     */
    public int reverseNumber(int number) {
        if (number >= 0) {
            String intToStr = Integer.toString(number);
            StringBuilder sb = new StringBuilder(intToStr);
            String reversedString = sb.reverse().toString();
            int reversedInt = 0;
            try {
                reversedInt = Integer.parseInt(reversedString);
            } catch (NumberFormatException e) {
                System.out.printf("%d is not integer", number);
            } finally {
                return reversedInt;
            }
        } else {
            return -1;
        }

//        int reversedNumber = 0;
//        while (number > 0) {
//            int digit = number % 10;
//            reversedNumber = reversedNumber * 10 + digit;
//            number = number/10;
//        }
//        return reversedNumber;
    }
    // 問題を文字通りに読み取るよりは、問題に活用できる法則性があるかを考えるべき？
}

class BiNumber {

    private int number1;
    private int number2;

    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    /*
    ** 最小公倍数を求める
     */
    public int calculateLCM() {
        if(number1 < 0 || number2 <0){
            return -1;
        }else if(number1 == 0 || number2 == 0){
            return 0;
        }else{
            int max = Math.max(number1, number2);
            int lcm = max;
            while(lcm % number1 != 0 || lcm % number2 != 0){
                lcm += max;
            }
            return lcm;
        }
    }

    /*
    ** 最大公約数を求める
     */
    public int calculateGCD() {
        if(number1 == 0 || number2 == 0){
            return 0;
        }else if(number1 < 0 || number2 < 0){
            return 1;
        }else if(number1==number2){
            return number1;
        }else{
            int smallerOne = Math.min(number1, number2);
            while(number1 % smallerOne != 0 || number2 % smallerOne != 0){
                smallerOne--;
            }
            return smallerOne;
        }
    }
}
