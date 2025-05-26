package lambda.ex2;

public class BuildGreeterExample {

    public static StringFunction buildGreeter(String greeting) {
        return name -> greeting + ", " + name;
    }

    public static void main(String[] args) {
        StringFunction helloGreeter = buildGreeter("hello");
        StringFunction hiGreeter = buildGreeter("hi");
        String greetingJava = helloGreeter.apply("Java");// Hello, Java
        String greetingLambda = hiGreeter.apply("Lambda");// hi Lambda

        System.out.println("greetingJava = " + greetingJava);
        System.out.println("greetingLambda = " + greetingLambda);
    }

}



