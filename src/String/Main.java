package String;

public class Main {
    public static void main(String[] args) {
        StringMagic stringMagic = new StringMagic();
        System.out.println(stringMagic.findLongestWord("   "));
    }
}

class StringMagic {
    /*
    ** 大文字の数を返却する。ABcdeの場合returnは2
     */
    public int countUppercaseLetters(String str) {
        if(str == ""){
            return 0;
        }else{
            int upperCase = 0;
            for(int i=0; i<str.length(); i++){
                if(Character.isUpperCase(str.charAt(i))){
                    upperCase++;
                }
            }
            return upperCase;
        }
    }

    /*
    ** 2つの同じ文字が連続する場合trueを返却する
     */
    public boolean hasConsecutiveDuplicates(String str) {
        boolean which = false;
        if(str == "" || str.length() == 1 || null == str){
            // false
        }else{
            for(int i=0; i < str.length()-1; i++){
                if(str.charAt(i) == str.charAt(i+1)){
                    which = true;
                    break;
                }
            }
        }
        return which;
    }

    /*
    ** 一番右にある数字を求める
     */
    public int getRightmostDigit(String str) {
        if(str != null && str.length() > 1) {
            for(int i = str.length()-1; i >= 0; i--){
                if(Character.isDigit(str.charAt(i-1))){
                    return Character.getNumericValue(str.charAt(i));
                }
            }
        }
        return -1;
    }

    /*
    ** 一番長い単語を見つけて返却する
     */
    public String findLongestWord(String sentence) {
        if(sentence != null && !sentence.isEmpty() && !sentence.trim().isEmpty()){
            String[] parts = sentence.split(" ");
            if(parts.length > 1){
                String longestWord = parts[0];
                for(int i= 0; i < parts.length; i++){
                    if(longestWord.length() < parts[i].length()){
                        longestWord = parts[i];
                    }
                }
                return longestWord;
            }else {
                return parts[0];
            }
        } else {
            return "";
        }
    }


}
