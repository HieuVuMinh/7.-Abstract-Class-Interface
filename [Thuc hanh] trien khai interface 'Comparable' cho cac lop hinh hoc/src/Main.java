import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircle = new ComparableCircle[3];
            comparableCircle[0] = new ComparableCircle(3.6);
            comparableCircle[1] = new ComparableCircle();
            comparableCircle[2] = new ComparableCircle("indigo",false, 3.5);

        System.out.println("Trước khi sort:");
        for (ComparableCircle comparableCircles : comparableCircle){
            System.out.println(comparableCircles);
        }

        Arrays.sort(comparableCircle);

        System.out.println("Sau khi sort:");
        for (ComparableCircle comparableCircles : comparableCircle){
            System.out.println(comparableCircles);
        }
    }
}
