package lambda.ex1;

public class M1Before {

    public static void greetingMorning() {
        System.out.println("=== 시작 ===");
        System.out.println("Good Morning");
        System.out.println("=== 종료 ===");
    }

    public static void greetingAfternoon() {
        System.out.println("=== 시작 ===");
        System.out.println("Good Afternoon");
        System.out.println("=== 종료 ===");
    }

    public static void greetingEvening() {
        System.out.println("=== 시작 ===");
        System.out.println("Good Evening");
        System.out.println("=== 종료 ===");
    }

    public static void main(String[] args) {
        greetingMorning();
        greetingAfternoon();
        greetingEvening();
    }

}
