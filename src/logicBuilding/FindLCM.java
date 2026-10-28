package logicBuilding;

public class FindLCM {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        System.out.println("LCM = " + lcm(a, b));
    }
}