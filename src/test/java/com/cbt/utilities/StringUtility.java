package com.cbt.utilities;

public class StringUtility {

    public static String verifyEquals(String Expected, String Actual ){
        String result = "";
        if(Expected.equals(Actual)){
            result = "Pass";

        }
        else {
        result = "Fail";

        }
        return result;

    }
}
