package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
    public List<Integer> filterOddNumbers(List<Integer> numbers) {
        // 考え方のメモ
        // listに対してstreamで流れを作る。filterで各要素をフィルタリングする。
        // collectでlistにまとめる。
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
    public List<Integer> getCubesOfFirstNNumbers(int n) {
        if(n > 0) {
            // 考え方のメモ
            // IntStreamで数々のstreamを作るのだが、その範囲を指定する
            // mapで各要素に与える関数を記載する
            // boxedでIntegerにする
            // collectしlistに変える
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

    /*
    ** 講座名のリストを受け取り、各講座名の文字数リストを返却する
     */
    public List<Integer> getCourseNameCharacterCount(List<String> courses) {
        if(courses != null && courses.size() > 0){
            // 考え方のメモ
            // listを受け取り、stream()で要素の流れ（stream）を生成する
            // map()で与えられる関数を、各要素に適用する。
            // collect()により結果をまとめる
            return courses.stream().map(el -> el.length()).collect(Collectors.toList());
            // 上記は普通にラムダ式だけど、
            // 下記はメソッド参照。Stringクラスのlength()メソッドを参照する。下記の方が推奨されるらしい
            // courses.stream().map(String::length).collect(Collectors.toList());
        }else{
            return List.of();
        }
    }

    /*
    ** 整数のリストを受け取り、整数の二乗した値の合計を返却する
     */
    public long sumOfSquares(List<Integer> numbers) {
        long answer;
        if(numbers == null) {
            return 0;
        }else{
            // 考え方のメモ
            // listを受け取りstreamにする。
            // mapToLongでlongに変え、各要素の行動を指定する。
            // 最後にsumで合計を求める。
            answer = numbers.stream().mapToLong(n -> n*n).sum();
        }
        return answer;
    }

    /*
    ** 一番大きい偶数を求める
     */
    public static int findMaxEvenNumber(List<Integer> numbers) {
        if(numbers == null || numbers.size() == 0){
            return 0;
        }else{
            return numbers.stream()
                            .filter(n -> n%2==0)
                            .reduce((max, element) -> max > element ? max : element)
                            .orElse(0);
        }

        // メモ
        // Optional(nullを明示的に処理するすべ）
        // reduceを使用するより、maxとメソッド参照を使う方が綺麗な気がする
        //Optional<Integer> maxEven = numbers.stream().filter(n -> n%2==0).max(Integer::compare)
        //return maxEven.orElse(0);
    }
}
