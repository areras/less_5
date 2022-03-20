package less;
import java.util.ArrayList;

public class Main<T> {

    public static <T> T[] change(T[] arr, int a, int b) {
        T var;
        var = arr[a];
        arr[a] = arr[b];
        arr[b] = var;
        return arr;
    }

    public static <T> ArrayList<T> toArrayList(T[] arr) {
        ArrayList<T> arrL = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            arrL.add(arr[i]);
        }
        return arrL;
    }
    public static <T> void arrPrint(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4",};
        arrPrint(arr);
        System.out.println("arr ------------");
        change(arr, 1, 2);
        arrPrint(arr);
        System.out.println("arrChange ------");

        Box<Apple> appleBox = new Box<>();
        for (int i = 0; i < 5; i++) {
            appleBox.add(new Apple());
        }
        System.out.println("appleBox weight: " + appleBox.getWeight());

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.add(new Apple());
        System.out.println("appleBox1 weight: " + appleBox1.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        System.out.println("orangeBox weight: " + orangeBox.getWeight());
        System.out.println("Compare orangeBox and appleBox: " + orangeBox.compare(appleBox));

        appleBox.union(appleBox1);
        System.out.println("appleBox1 after union: " + appleBox1.getWeight());
    }
}