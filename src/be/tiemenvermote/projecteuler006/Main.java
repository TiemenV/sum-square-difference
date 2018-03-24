package be.tiemenvermote.projecteuler006;

//computes the difference between the square of sum and the sum of the squares of the first 100 numbers

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(sumSquareDifference(100));
        long endtime = System.currentTimeMillis();
        System.out.println(endtime - startTime + " ms");
    }

    private static long sumSquareDifference(int terms) {
        long sumOfSquares = 0L;
        long squareOfSum = 0L;
        for (int i = 1; i <= terms; i++) {
            sumOfSquares += Math.pow(i, 2);
            squareOfSum += i;
        }
        squareOfSum *= squareOfSum;
        long difference = squareOfSum - sumOfSquares;
        return difference;

    }
}
