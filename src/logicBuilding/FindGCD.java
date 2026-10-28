package logicBuilding;

public class FindGCD {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 36;

        System.out.println("GCD = " + gcd(a, b));
    }
}