package com.epam.advancedjvm.compilation;

public class CompilerOptimizations {

    //Constants arithmetic
    private static int SECONDS_IN_30_DAYS = 60*60*24*30;

    public void booleanExpressions(boolean a, boolean b) {
        if(!a || !b) {
            deadCode();
        }
    }

    public void booleanExpressions2(boolean a, boolean b) {
        if(!a || !b) {
            deadCode();
        }
    }

    public void deadCode() {
        if(false) {
            System.out.println("This code will not be included in the bytecode");
        }
        System.out.println("This one will be included.");
    }

    public String constantStringConcatenation() {
        return "Line 1\n" +
                "Line 2";
    }

    public String constantStringConcatenation2() {
        String result =  "Line 1\n";
        result += "Line 2";
        return result;
    }

    public String stringConcatenation(String param, String param2) {
        return "Line 1\n" +
                param +
                "Line 2" +
                param2;
    }

    public String stringConcatenation2(String param, String param2) {
        String result =  "Line 1\n";
        result += param;
        result += "Line 2";
        result += param2;
        return result;
    }

}