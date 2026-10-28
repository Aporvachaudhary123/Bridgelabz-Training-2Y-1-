package String;

public class RemoveCharacters {

    public static String removeChar(String str, char ch, int index) {
        if (index == str.length()) {
            return "";
        }

        char current = str.charAt(index);
        String result = removeChar(str, ch, index + 1);

        if (current == ch) {
            return result;
        }

        return current + result;
    }

    public static void main(String[] args) {
        String str = "programming";
        char ch = 'r';

        System.out.println(removeChar(str, ch, 0));
    }
}