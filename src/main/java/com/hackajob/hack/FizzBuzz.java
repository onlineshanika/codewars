package com.hackajob.hack;

public class FizzBuzz {


    public static String run(int N, int M) {
        StringBuilder sequence = new StringBuilder();
        for (int i = N; i <= M; i++) {
            if (i % 3 == 0) {
                sequence.append("Fizz");
            }
            if (i % 5 == 0) {
                sequence.append("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                sequence.append(i);
            }
            sequence.append(",");
        }
        return sequence.toString().substring(0, sequence.length() - 1);
    }

    public static void main(String[] args) {

        System.out.println(run(1, 30));
    }
}
