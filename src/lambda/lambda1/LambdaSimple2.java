package lambda.lambda1;

import lambda.Procedure;

public class LambdaSimple2 {

    public static void main(String[] args) {
        Procedure procedure1 = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello lambda");
            }
        };
        procedure1.run();

        // 단일 표현식 중괄호 생략 가능
        Procedure procedure2 = () -> System.out.println("hello lambda2");
        procedure2.run();


    }
}
