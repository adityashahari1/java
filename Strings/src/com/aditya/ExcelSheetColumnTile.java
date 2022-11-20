package com.aditya;

public class ExcelSheetColumnTile {
    public static void main(String[] args) {
        int columnNumber = 5;
        String str = convertToTitle(columnNumber);
        System.out.println(str);
    }

    static String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();

        while(columnNumber != 0) {
            char ch = (char)((columnNumber - 1) % 26 + 'A');
            columnNumber = (columnNumber - 1) / 26;
            str.append(ch);
        }
        str.reverse();

        return str.toString();
    }
}
