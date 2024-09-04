package org.example;

public class Solution {
    public int[] plusOne(int[] digits) {
        String temp = "";
        //create a String with all the integers from the given integer array
        for (int digit : digits) {
            temp += digit;
        }
        int carry = 1;
        int length = temp.length() - 1;
        StringBuilder sb = new StringBuilder();
        //add 1 to the String
        while (length >= 0) {
            int num = temp.charAt(length) - '0';
            sb.append((num + carry) % 10);
            carry = (num + carry)/10;
            length--;
        }
        if (carry != 0) {
            sb.append(1);
        }
        //convert StringBuilder to String
        String tempSB = sb.reverse().toString();
        int[] result = new int[tempSB.length()];
        //use the String just found to populate an integer array
        for (int i = 0; i < result.length; i++) {
            result[i] = tempSB.charAt(i) - '0';
        }
        return result;
    }
}
