public class DRoot {
    public static int digital_root(int n) {
        return (n == 0) ? 0 : 1 + (n - 1) % 9;
    }
}