package com.mycompany.conversorhob;
import java.lang.Integer;

/**
 * @Samuel Rivas
 */
public class Conversion {
    
    public String intToHex(int n){
        return Integer.toHexString(n).toUpperCase();
    }
    
    public String intToOct(int n){
       return Integer.toOctalString(n);
    }
    
    public String intToBin(int n){
        return Integer.toBinaryString(n);
    }
    
}
