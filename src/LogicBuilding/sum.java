package LogicBuilding;

public class sum {

    public static void main(String[] args) {
        int n = 5;
        int total = 0;
        int i = 1;

        while (i <= n) {
            total = total + i;
            i++;
        }

        System.out.println("Sum = " + total);
    }
}