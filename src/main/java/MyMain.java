import java.util.ArrayList;

public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int count = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > count) {
                    count = mat[i][j];
                }

            }
        }
        return count;
    }


    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            int first = mat[row][0];
            for (int col = 0; col < mat[0].length - 1; col++) {
                mat[row][col] = mat[row][col + 1];

            }
            mat[row][mat[0].length - 1] = first;
        }

        return mat;
    }

    // Creates a new array list of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int[][] mat = new int[arraySize][arraySize];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                mat[row][col] = row + col;
            }
        }
        return mat;
    }


    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double x = 0;
        int c = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                x = x + mat[row][col];
                c++;
            }
        }
        return x / c;
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                list.add(mat[i][j]);
            }
        }
        int x = list.size() / 2;
        if (list.size() % 2 > 0) {
            return list.get(x);
        }
        //int t = list.get(x); //+ list.size();
        double f = x / 2.0;
        double c = list.get(x) + list.get(x - 1);
        double a = c / 2.0;
        return a;
    }


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        int z = 0;
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                list.add(mat[i][j]);
                for (int c = 0; c < list.size(); c++) {
                    for (int h = c + 1; h < list.size(); c++) {
                        if (list.get(c) == list.get(h)) {
                            list.add(c / 1.0);
                            z++;
                        }
                    }

                }

            }

        }
        return z;
    }
        public static void main (String[]args){

        }
    }

