public class Collections {
    public static void main(String[] args) {
        System.out.print("Hello world from collections");

        // array declaration
        int[] x; // initialized without valuee and without length
        int[] y = {1, 2, 3, 4, 5}; // initializing with some values

        int[] z = new int[5]; // initializing with value as 0 with length 5
        // z points to the reference of array so if u print it it vwill give u the
        // refercne hex code with class name
        // assigning the value one by one
        z[0] = 10;
        z[1] = 20;
        z[2] = 40;

        // initializing the 2d array
        int[][] a;
        int[][] b = new int[2][]; // this will hold value null as we haven't defined the length of one of the
        // array
        System.out.print(b[0][0]); // this will give runtime null pointer exeption
        int[][] c = new int[2][3]; // given all the array length
        int[][] d = {{1, 2}, {1, 2, 3,}};

        // for 3d array upeer level array holds object reference only the last element
        // array holds the value of it ̦


//        section 3 : collection overview
//

    }
}