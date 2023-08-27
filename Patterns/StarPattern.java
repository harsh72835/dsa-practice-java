package Patterns;

class StartPattern {
    public static void main(String[] args) {
        System.out.println("helo world");
        System.out.println(returnN(35));

    };

    public static int returnN(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum + n;
    }
}