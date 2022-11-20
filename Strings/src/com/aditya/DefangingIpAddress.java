package com.aditya;

public class DefangingIpAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans = defangIPaddr(address);
        System.out.println(ans);

        String ans1 = defangIPaddr1(address);
        System.out.println(ans1);

    }

    static String defangIPaddr(String address) {   // with String builder
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i<address.length(); i++) {
            if(address.charAt(i) == '.') {
                ans.append("[.]");
            }
            else {
                ans.append(address.charAt(i));
            }
        }
        return ans.toString();
    }

    static String defangIPaddr1(String address) {      //with String
        String ans = "";                                // need to be initialized or does not work
        for(int i = 0; i < address.length(); i++){      // not a good practice
            if(address.charAt(i) == '.') {
                ans += "[.]";
            }
            else {
                ans += address.charAt(i);
            }
        }
        return ans;
    }
}
