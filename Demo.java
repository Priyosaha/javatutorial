
public class Demo {

    public static void main(String[] args) {

        String x = "abcdef";
        String y = "abcdes";

        if (x != null && x.equals(y)) {
            System.out.println("true");
        } else {
        System.out.println("false");
        }
        System.out.println(x.substring(0, 6));
    }

}
