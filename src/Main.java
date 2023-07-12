
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
                break;
            }
            System.out.print(a[index] + ", ");
        }

        for (int index = 0; index < b.length; index++) {
            if (index == b.length - 1) {
                System.out.println(b[index]);
                break;
            }
            System.out.print(b[index] + ", ");
        }

        for (int index = 0; index < c.length; index++) {
            if (index == c.length - 1) {
                System.out.println(c[index]);
                break;
            }
            System.out.print(c[index] + ", ");
        }
        System.out.println("Задача 3");

        for (int index = a.length - 1; index >= 0; index--) {
            System.out.print(a[index] + ", ");
        }
        System.out.println();
        for (int indexb = b.length - 1; indexb >= 0; indexb--) {
            System.out.print(b[indexb] + ", ");
        }
        System.out.println();
        for (int indexc = c.length - 1; indexc >= 0; indexc--) {
            System.out.print(c[indexc] + ", ");
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int index = 0; index < a.length; index++) {
            if (index % 2 == 0) {
                System.out.print(a[index] + 1 + ", ");
            } else
                System.out.print(a[index] + ", ");
        }
    }
}
