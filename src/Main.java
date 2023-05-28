public class Main {
    public static void main(String[] args) {
        for (int i = 500; i <= 650; i += 10) {
            System.out.println(i);
        }
        int i = 500;
        while (i <= 650) {
            System.out.println(i);
            i += 10;
        }
        do {
            System.out.println(i);
            i += 10;
        } while (i <= 650);
        //2
        int a = 2;
        int value = 0;

        while (a < 5000) {
            System.out.println(a);
            a = 2 * a - 1;
        }
        //3
        int num = 10;

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        //4
        num = 10;
        int fact = 1;
        i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        System.out.println("Факторіал числа " + num + " дорівнює " + fact);
    }
}