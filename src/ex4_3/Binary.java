package ex4_3;

public class Binary {
    static public String convert(int num) {
        String result = "";

        int mask = 1;

        for (int i = Integer.SIZE - 1; i >= 0; i--) {
            result = result + (((num & (mask << i)) == 0) ? "0" : "1");
        }

        return result;
    }

    static public void main(String[] args) {
        System.out.println(convert(-25589));
    }
}
