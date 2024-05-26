package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        FunctionalProgrammingMagic func = new FunctionalProgrammingMagic();
        List<Integer> list = List.of(-3,-2,-1,0,1,2);
        List list2 = func.filterOddNumbers(list);
    }
}

class FunctionalProgrammingMagic {

    /*
    ** INT型のリストを受け取り、
    ** 奇数のリストを返却する
     */
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        // プラス
        List<Integer> positiveList = new ArrayList<>();
        positiveList = numbers.stream().filter(number -> number%2 == 1)
                                .collect(Collectors.toList());
        // マイナス
        List<Integer> negativeList = new ArrayList<>();
        negativeList = numbers.stream().filter(number -> number%2 == -1)
                                .collect(Collectors.toList());
        // 結果を結合
        List<Integer> list = new ArrayList<>();
        list.addAll(positiveList);
        list.addAll(negativeList);

        return list;

//        複雑に書かずにこの１行でできるものなのであった。。
//        return numbers.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
    }

    /*
    ** １からnまでの自然数を三乗してリスト返却する
    */
    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        if(n > 0) {
            return IntStream.range(1,n+1)
                    .map(el -> (int) Math.pow(el, 3))
                    // 上記のMath.powはelementをdoubleタイプで受け取り、結果をdoubleタイプで返却する。
                    // 下記の場合、intの範囲になる。
                    //.map(el -> el*el*el)
                    .boxed()
                    .collect(Collectors.toList());
        }else{
            return List.of();
        }
    }
}
