public class MathPractice2 {

    public static void main(String[] args) {
        // You can test your methods here, e.g.:
        // System.out.println(q1());
    }

    // 1. Generate a random integer between 100 and 200 inclusive.
    public static int q1() {
        // Random integer between 100 and 200 inclusive
        return (int) (Math.random() * 101) + 100; // 0..100 -> 100..200
    }

    // 2. Use Math.min() to return the smaller of two integers.
    public static int q2(int a, int b) {
        return Math.min(a, b);
    }

    // 3. Use Math.max() to return the largest of three integers.
    public static int q3(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    // 4. Simulate flipping a coin (randomly return "Heads" or "Tails").
    public static String q4() {
        // Simulate a fair coin flip
        return Math.random() < 0.5 ? "Heads" : "Tails";
    }

    // 5. Return the result of rounding 3.14159 to the nearest integer using Math.round().
    public static long q5() {
        return Math.round(3.14159);
    }

    // 6. Return the result of Math.ceil(7.2) and Math.floor(7.2).
    public static double[] q6() {
        double ceil = Math.ceil(7.2);
        double floor = Math.floor(7.2);
        return new double[] { ceil, floor };
    }

    // 7. Write a method that returns a random multiple of 5 between 10 and 100.
    public static int q7() {
        // Multiples of 5 between 10 and 100 inclusive are 2*5 .. 20*5
        int multiplier = (int) (Math.random() * 19) + 2; // 2..20
        return multiplier * 5;
    }

    // 8. Return the distance between two points (x1, y1) and (x2, y2) using Math.sqrt().
    public static double q8(int x1, int y1, int x2, int y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // 9. Simulate a random number between 1 and 10, then square it using Math.pow().
    public static int q9() {
        int n = (int) (Math.random() * 10) + 1; // 1..10
        return n * n; // square
    }

    // 10. Return the absolute difference between two integers.
    public static int q10(int a, int b) {
        return Math.abs(a - b);
    }
}
