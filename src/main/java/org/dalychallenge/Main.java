package org.dalychallenge;

public class Main {
    public static void main(String[] args) {
        //Test with Passay Library
        System.out.println(new Validator().generatePasswordWithPassyLibrary());

        //Test with Apache Common Text Library
        System.out.println(new Validator().generatePasswordWithApachCommonTextLibrary());
    }
}