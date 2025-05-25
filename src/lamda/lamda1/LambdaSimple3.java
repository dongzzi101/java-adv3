package lamda.lamda1;

import lamda.MyFunction;

public class LambdaSimple3 {

    public static void main(String[] args) {
        // 타입 생략 전
        MyFunction myFunction1 = (int a, int b) -> a + b;
        myFunction1.apply(1, 2);

        // 타입 생략 후(타입 추론 가능)
        MyFunction myFunction2 = (a, b) -> a + b;
        int result = myFunction2.apply(1, 2);
        System.out.println(result);

    }
}
