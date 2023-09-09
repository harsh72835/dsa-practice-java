
import java.util.Scanner;

class StarPattern {
    // while doing pattern question always start the loop from 1
    public static void main(String[] args) {
        // System.out.println("Hello world");
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            // change the method here and run it
            pattern22(n);
        }
    }

    // think of like math of array and finding the distance of array element
    public static void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i; // distance from top
                int left = j; // distacne from left
                int right = (2 * n - 1) - 1 - i; // distance from right
                int bottom = (2 * n - 1) - 1 - j; // distance from bottom
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println("");

        }
    }

    public static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void pattern20(int n) {
        int space = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            // star
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println("");
            if (i < n)
                space -= 2;
            else
                space += 2;
        }
    }

    public static void pattern19(int n) {
        int space = 0;
        for (int i = 0; i < n; i++) {
            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println("");
        }
        space = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println("");
        }
    }

    public static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            // for space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // for character
            char ch = 'A';
            int breakPoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakPoint)
                    ch++;
                else
                    ch--;
            }

            // for space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
            ;
        }
    }

    // lookalke for pattern16
    // 1
    // 22
    // 333
    // 4444
    // 55555
    static void printAlike16(int n) {
        for (int i = 1; i <= n; i++) {
            int num = 0 + i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println("");

        }
    }

    static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println("");
        }
    }

    static void pattern15(int n) {
        for (int i = n; i >= 1; i--) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // pattern13
    static void pattern13(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number += 1; // because we need increased element for new line
            }
            System.out.println();
        }
    }

    // pattern12
    static void pattern12(int n) {
        int space = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            // number
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // space
            for (int j = 1; j < space; j++) {
                System.out.print(" ");
            }
            // number
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
            space -= 2; // to reduce the space by 2 times every time so that it becomes reverse cone

        }
    }

    // pattern11
    static void pattern11(int n) {
        int value = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                value = 0;
            } else {
                value = 1;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(value);
                value = 1 - value; // for flip
            }
            System.out.println("");
        }
    }

    // pattern 10
    static void pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // pattern9
    static void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    // pattern8
    static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < (2 * n) - ((2 * i) + 1); j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println("");

        }
    }

    // pattern7
    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println("");

        }
    }

    // pattern 6
    static void pattern6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // patten5
    static void pattern5(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // pattern4
    static void pattern4(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // pattern3
    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // pattern2
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // pattern1
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}