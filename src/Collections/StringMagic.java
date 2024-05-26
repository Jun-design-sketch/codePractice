package Collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMagic {
    public static void main(String[] args) {
        StringMagic stringMagic = new StringMagic();
        boolean result = stringMagic.areAnagrams("cinema", "iceman");
        System.out.println("anagrams? " + result);
    }

    public boolean areAnagrams(String str1, String str2) {
        boolean result = false;

        if(str1 != null && str2 != null){
            if(str1.length() == str2.length()) {
                // 全て小文字に統一しCharArrayにする
                char[] charArray1 = str1.toLowerCase().toCharArray();
                char[] charArray2 = str2.toLowerCase().toCharArray();
                // それぞれのArrayをソートする
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                result = Arrays.equals(charArray1, charArray2);
            }else{
                result = false;
            }
        }

        return result;
    }

    public String reverseWordsInSentence(String sentence) {
        if(sentence == null){
            return "INVALID";
        }

        if(sentence.isEmpty()){
            return "";
        }

        List<String> list = List.of(sentence.split(" "));
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < list.size(); i++){
            StringBuilder subSb = new StringBuilder();
            subSb.append(list.get(i));
            subSb.reverse();
            if(i < list.size()-1) {
                sb.append(subSb + " ");
            }else{
                sb.append(subSb);
            }
        }

        return sb.toString();
    }
}

class MyString {
    public String str;

    public MyString(String str) {
        this.str = str;
    }

    public boolean isHexadecimalChar(char ch) {
        boolean result = false;
        // スペースである場合
        if(Character.isSpaceChar(ch)){
            result = false;
        }
        // 数字である場合
        if(Character.isDigit((ch))){
            result = false;
        }
        // 数字ではない場合
        if(!Character.isDigit(ch)){
            if('a' <= ch && ch <= 'f'){
                result = true;
            }
            if('A' <= ch && ch <= 'F'){
                result = true;
            }
        }
        return result;
    }

    public boolean isHexadecimal() {
        // NULLか空はFALSEにする
        if(str == null || str.isEmpty()) {
            return false;
        }
        // 1つずつ判定
        for(char ch : str.toCharArray()){
            // 数字なら続ける
            if(Character.isDigit(ch)){
                continue;
            // 数字以外なら別途判定
            }else if(!isHexadecimalChar(ch)){
                return false;
            }
        }

        return true;
    }
}
