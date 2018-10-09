public class CircleTest {
    public static void main(String[] args) {
        ComparableCircle a = new ComparableCircle(3);
        ComparableCircle b = new ComparableCircle(3);
        System.out.println(a.compareTo(b));
    }
}
