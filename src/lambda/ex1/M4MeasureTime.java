package lambda.ex1;

import lambda.Procedure;

import java.util.Arrays;

public class M4MeasureTime {

    private static void measure(Procedure procedure) {
        Long startNs = System.nanoTime();
        procedure.run(); // 바뀌는 로직
        Long endNs = System.nanoTime();
        System.out.println("Time taken: " + (endNs - startNs) + " ns");
    }

    public static void main(String[] args) {

        measure(() -> {
            int total = 0;
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            System.out.println("합계 : " + total);
        });


        measure(() -> {
            int[] arr = {4, 3, 2, 1};
            System.out.println("원본 배열 :" + Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println("배열 정렬: " + Arrays.toString(arr));
        });
    }


}
