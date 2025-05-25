package lambda.ex1;

import lambda.MyFunction;

public class M5Return {

    public static void main(String[] args) {
        MyFunction add = getOperator("add");
        MyFunction sub = getOperator("sub");
        MyFunction xxx = getOperator("xxx");

        System.out.println("add.apply(1,2) = " + add.apply(1, 2));
        System.out.println("sub.apply(1,2) = " + sub.apply(1, 2));
        System.out.println("xxx.apply(1,2) = " + xxx.apply(1, 2));
    }

    static MyFunction getOperator(String operation) {
        switch (operation) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0;
        }
    }


}
