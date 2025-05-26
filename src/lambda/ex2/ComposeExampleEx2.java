package lambda.ex2;

public class ComposeExampleEx2 {

    public static void main(String[] args) {
        // 대문자
        MyTransformer toUpper = s -> s.toUpperCase();

        // **
        MyTransformer addDeco = s -> "**" + s + "**";

        // 합성
        MyTransformer composeFunc = compose(toUpper, addDeco);

        // 실행
        String result = composeFunc.transform("hello");
        System.out.println(result);
    }

    private static MyTransformer compose(MyTransformer f1, MyTransformer f2) {
        return s -> {
            String transform = f1.transform(s);
            return f2.transform(transform);
        };
    }
}
