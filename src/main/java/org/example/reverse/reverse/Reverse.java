package org.example.reverse.reverse;



public class Reverse {

    public static String reverseWord(String str) {
        int left = 0;
        int right = str.length() - 1;
        char [] chars = str.toCharArray();
        while (left < right) {

            if (!Character.isLetter(chars[left])) {
                left++;
                continue;
            }
            if (!Character.isLetter(chars[right])) {
                right--;
                continue;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
