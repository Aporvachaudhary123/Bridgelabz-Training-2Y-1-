package LogicBuilding;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}