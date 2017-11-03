/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;
import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Arif
 */
public class TestReplace_Acak {
    DecimalFormat decimalFormat = new DecimalFormat("#0.");
    static String satu= "budi makan apel";
    
    static Random rdm= new Random();
   
    
    static char karakter1=(char)('1'+Math.random()*('9'-'1'+1));
    static char karakter2=(char)('E'+Math.random()*('H'-'E'+1));
    static char karakter3=(char)('I'+Math.random()*('O'-'I'+1));
    
    int str=(int)(1+Math.random()*1000-1+1);
    String hasilavg = decimalFormat.format(str);
    
    public static void main(String[] args) {
       
        TestReplace_Acak ts=new TestReplace_Acak();
        
        System.out.println(satu.replace("apel", "pisang"));

        System.out.println(karakter1);
        System.out.println(karakter2);
        System.out.println(karakter3);
        
        System.out.println(ts.hasilavg);
        
        
    }
    
}
