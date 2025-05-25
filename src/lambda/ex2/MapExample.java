package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

    public static List<String> map(List<String> list, StringFunction function) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            result.add(function.apply(str));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트 : " + words);


        // 1. 대문자 변환
        List<String> upperCase = map(words, s -> s.toUpperCase());

        System.out.println("대문자 : " + upperCase);

        // 2. 데코
        List<String> deco = map(words, s -> "***" + s + "***");
        System.out.println("데코 : " + deco);

    }

}
