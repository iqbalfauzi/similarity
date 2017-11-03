/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

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
public class Klaster {

    public String key;
    public Double keyangka;
    public String[] modelpml;
    public String[] modelpml2;
    public String[] modelpml3;
    public HashMap<String, ArrayList<String[]>> map = new HashMap<String, ArrayList<String[]>>();
    public HashMap<Double, ArrayList<String[]>> mapangka = new HashMap<Double, ArrayList<String[]>>();
    public HashMap<String, String[]> mapstruk = new HashMap<String, String[]>();
    public HashMap<Double, String[]> mapstrukangka = new HashMap<Double, String[]>();
    
    

    public static void main(String[] args) {
        
        Klaster c = new Klaster();
        String[] A = {"A3", "A2", "A1"};
        String[] a = {"a1", "a2"};
        String[] B = {"B3", "B2", "B1"};
        String[] b = {"b3", "b2"};
        String[] D = {"C3", "C2", "C3"};
        String[] d = {"c3", "c2"};

        c.inputclus("ta", A, a);
        c.inputclus("akadem-akuisaja", A, a);
        c.inputclus("to", B, b);
        c.inputclus("akademiiu", D, d);
        c.inputclus("akademikpo", D, d);
        c.inputclus("akademi-oiooio-iu-kpo-ioiooioi", D, d);
        
        
        
        System.out.println("=================================================");
        c.tampilclus("akademi","iu","kp");
    }
    


    public void tampilclus(String treshol, String th1, String th2) {
        for (Entry<String, ArrayList<String[]>> entry : map.entrySet()) {
            if (entry.getKey().contains(treshol)&&entry.getKey().contains(th1)&&entry.getKey().contains(th2)) {
                
                System.out.print(entry.getKey() + " | ");
                
                for (int i = 0; i < entry.getValue().size(); i++) {
                    modelpml = entry.getValue().get(i);
                    modelpml2 = entry.getValue().get(i);
                    modelpml3 = entry.getValue().get(i);
                    for (int j = 0; j < modelpml.length; j++) {
                        System.out.print(modelpml[j] + " + ");
                    }
                    for (int j = 0; j < modelpml2.length; j++) {
                        System.out.print(modelpml2[j] + " ");
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
        mapstruk.put(nilaisim, modelstruk);

    }
}
