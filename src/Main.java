import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача1");
        int a[] = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        double b[] = {1.57, 7.654, 9.986};

        int c[] = {10, 20, 30};

        System.out.println("Задача2");

        for (int index = 0; index < a.length; index++) {
            if (index == a.length - 1) {
                System.out.println(a[index]);
            } else {
                System.out.print(a[index] + ", ");
            }
        }
        for (int index = 0; index < b.length; index++) {
            if (index == b.length - 1) {
                System.out.println(b[index]);
            } else {
                System.out.print(b[index] + ", ");
            }
        }
        for (int index = 0; index < c.length; index++) {
            if (index == c.length - 1) {
                System.out.println(c[index]);
            } else {
                System.out.print(c[index] + ", ");
            }
        }
        System.out.println("Задача 3");

        for (int index = a.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(a[index]);
            } else {
                System.out.print(a[index] + ", ");
            }
        }
        System.out.println();

        for (int indexb = b.length - 1; indexb >= 0; indexb--) {
            if (indexb == 0) {
                System.out.print(b[indexb]);
            } else {
                System.out.print(b[indexb] + ", ");
            }
        }
        System.out.println();
        for (int indexc = c.length - 1; indexc >= 0; indexc--) {
            if (indexc == 0) {
                System.out.print(c[indexc]);
            } else {
                System.out.print(c[indexc] + ", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int index = 0; index < a.length; index++) {
            if (a[index] % 2 != 0) {
                a[index]++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
