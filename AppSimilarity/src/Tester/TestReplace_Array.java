/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import java.util.ArrayList;

/**
 *
 * @author Arif
 */
public class TestReplace_Array {

    public String arrayB[] = {"Aa", "Bb", "Cc", "Ddd"};
    public String arrayA[] = {"Aa", "Bb", "Cc", "Dd"};
    double[] temp = new double[1];
    double min=1000.0;
    double max=0.0;
    
    
    public static void main(String[] args) {
        TestReplace_Array tarr = new TestReplace_Array();
        String ack="p1t5p2t6t8p5p6p7p8p9p10t8p9t3p8t8";
        if(ack.contains("p10")){
            
            //System.out.println(ack.replaceAll("p10", "abc"));
            tarr.pisahkanTeks(ack.replaceAll("p10", "p9"));
            
            
        }
        else{
            System.out.println("not found 2 digit");
        }
        
        

    }
     ArrayList<String[]> pisahText = new ArrayList<>();
    String[] pisahkanTeks(String text) {
        String teksnya = text;
        if (teksnya.length() % 2 == 0) {
            teksnya = text;
        } else {
            teksnya = text + "a";
        }
        assert teksnya.length() % 2 == 0;
        System.out.println(teksnya.length());
        String[] teks2karakter = new String[teksnya.length() / 2];
        for (int index = 0; index < teks2karakter.length; index++) {
            teks2karakter[index] = teksnya.substring(index * 2, index * 2 + 2);
            System.out.println(teks2karakter[index]);
            if (teks2karakter[index].substring(0, 1).equals("t")) {
            }
            pisahText.add(teks2karakter);

        }
        return teks2karakter;
    }

    

}
