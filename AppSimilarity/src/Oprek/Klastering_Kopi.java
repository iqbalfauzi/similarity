/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oprek;

import Tester.*;
import Oprek.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Arif
 */
public class Klastering_Kopi {

    public String key;
    public Double keyangka;
    public String[] modelpml;
    public String[] modelpml2;
    public HashMap<String, ArrayList<String[]>> map = new HashMap<String, ArrayList<String[]>>();
    public HashMap<String, String[]> mapstruk = new HashMap<String, String[]>();

    
    

    public static void main(String[] args) {
        
        Klastering_Kopi c = new Klastering_Kopi();
        String[] A = {"A3", "A2", "A1"};
        String[] a = {"a1", "a2"};
        String[] B = {"B3", "B2", "B1"};
        String[] b = {"b3", "b2"};
        String[] D = {"C3", "C2", "C3"};
        String[] d = {"c3", "c2"};

        c.inputclus("ta", A, a);
        c.inputclus("akadem", A, a);
        c.inputclus("to", B, b);
        c.inputclus("akademiiu", D, d);
        c.inputclus("akademikpo", D, d);
        
        
        
        System.out.println("=================================================");
        c.tampilclus("akade");
//        System.out.println("=================================================");
//        c.tampilclusangka(2.1, 2.3);
    }
    


    public void tampilclus(String treshol) {
        for (Entry<String, ArrayList<String[]>> entry : map.entrySet()) {
            if (entry.getKey().contains(treshol)) {
                System.out.print(entry.getKey() + "|");
                key = entry.getKey();
                for (int i = 0; i < entry.getValue().size(); i++) {
                    modelpml = entry.getValue().get(i);
                    for (int j = 0; j < modelpml.length; j++) {
                        System.out.print(modelpml[j] + " ");
                    }
                }
                System.out.println();
            } else {
            }
        }
    }

    public void inputclus(String nilaisim, String[] model, String[] modelstruk) {
        ArrayList<String[]> modelnya = new ArrayList<>();
        modelnya.add(model);
        System.out.println("input key " + nilaisim);
        map.put(nilaisim, modelnya);
        mapstruk.put(nilaisim, modelstruk);
    

    }
}
