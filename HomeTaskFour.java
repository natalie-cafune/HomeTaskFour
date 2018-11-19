package HomeTaskFour;

import java.util.Scanner;

public class HomeTaskFour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        choiceFun();
        int operationId = scanner.nextInt();

        while (operationId != 0) {
            switch (operationId) {
                case 0:
                    break;
                case 1:
                    System.out.println("Enter a number : ");
                    int num = scanner.nextInt();
                    func(num);
                    repeatMenu();
                    operationId = scanner.nextInt();
                    break;
                case 2:
                    System.out.print("Enter width ");
                    int width = scanner.nextInt();
                    System.out.print("Enter height ");
                    int height = scanner.nextInt();
                    System.out.println();
                    drawRectangle(width, height);
                    repeatMenu();
                    operationId = scanner.nextInt();
                    break;
                case 3:
                    System.out.print("Enter a number for rectangle ");
                    int side = scanner.nextInt();
                    System.out.println();
                    drawRectangle(side);
                    repeatMenu();
                    operationId = scanner.nextInt();
                    break;
                case 4:
                    int a = 20;
                    int b = 10;
                    int maxInt = maxNumber(a, b);
                    int c = 15;
                    float d = 30.2f;
                    float maxFloat = maxNumber(c, d);
                    System.out.println("Max number is " + maxInt);
                    System.out.println("Max number is " + maxFloat);
                    repeatMenu();
                    operationId = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Enter a number : ");
                    int number = scanner.nextInt();
                    function(number);
                    repeatMenu();
                    operationId = scanner.nextInt();
                    break;
                case 6:
                    System.out.print("Enter width ");
                    int widthForRec = scanner.nextInt();
                    System.out.print("Enter height ");
                    int heightForRec = scanner.nextInt();
                    System.out.println();
                    drawRectangleRec(widthForRec, heightForRec);
                    repeatMenu();
                    System.out.println();
                    operationId = scanner.nextInt();
                    break;
            }
        }
    }

    public static void repeatMenu() {
        System.out.println("Для повторного выбора из меню нажмите '1' ");
        System.out.println("Для выхода нажмите два раза '0' ");
        Scanner sc = new Scanner(System.in);
        int bool = sc.nextInt();
        switch (bool) {
            case 0:
                break;
            case 1:
                choiceFun();
                break;
        }
    }

    public static void choiceFun() {
        System.out.println("Выберите какую из функций выполнить : ");
        System.out.println("1. Функция первая :");
        System.out.println("2. Функция вторая :");
        System.out.println("3. Функция третья :");
        System.out.println("4. Функция четвертая :");
        System.out.println("5. Функция пятая :");
        System.out.println("6. Функция шестая :");
        System.out.println("0. Выход");
        System.out.println();

    }

    // Task one
    public static void func(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
    }

    // Task Two
    public static void drawRectangle(int w, int h) {
        String[][] mass = new String[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                mass[i][j] = "+";
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(mass[i][j]);
            }
            System.out.println();
        }
    }

    //TaskThree
    public static void drawRectangle(int s) {
        String[][] mass = new String[s][s];

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                mass[i][j] = "+";
            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print(mass[i][j]);
            }
            System.out.println();
        }
    }

    // TaskFour
    public static int maxNumber(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else if (a < b) {
            max = b;
        } else if (a == b) {
            max = a;
        }
        return max;
    }

    public static float maxNumber(int a, float b) {
        float max = 0;
        if (a > b) {
            max = a;
        } else if (a < b) {
            max = b;
        } else if (a == b) {
            max = a;
        }

        return max;
    }

    // Task Five
    public static int function(int n) {
        if (n == 1) {
            System.out.println(n);
            return 1;
        } else
            System.out.println(n);
        return function(n - 1);

    }

    // Task Six
    public static void drawRectangleRec(int width, int height) {
        if (height > 1) {
            drawRectangleRec(width, height - 1);
        }
        if (width > 0) {
            drawRectangleRec(width - 1, 0);
            System.out.print("+ ");
        } else {
            System.out.println();
        }
    }

}


