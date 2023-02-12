package Lecture2;

public class program {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        // String str = "";
        // for (int i = 0; i < 100_000; i++) {
        //     str += "+";
        // }
        StringBuilder sb = new StringBuilder(); // с использованием API StringBuilder быстрее
        for (int i = 0; i < 100_000; i++) {
            sb.append("+");
        }
    System.out.println(System.currentTimeMillis() - s);
    }
}
