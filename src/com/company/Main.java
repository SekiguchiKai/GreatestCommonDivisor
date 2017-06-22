package com.company;

import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String[] str = bufferedReader.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);

            System.out.println(getCommonDivisor(x, y));

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static int getCommonDivisor(int x, int y) {
        int answer;
        int largerNum = Math.max(x, y);
        int smallerNum = Math.min(x, y);

        answer = largerNum % smallerNum;

        if (answer == 0) {
            return smallerNum;
        }
        answer = getCommonDivisor(smallerNum, answer);

        return answer;
    }
}