/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oprek;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Random;


/**
 *
 * @author Arif
 */
public class Clustering_Kopi {
    public double key;
    public String []modelpml;
    public HashMap<Double, ArrayList<String[]>>map=new HashMap<Double, ArrayList<String[]>>();
    public HashMap<Double, String[]>mapstruk=new HashMap<Double, String[]>();
    
    public static void main(String[] args) {
        Clustering_Kopi c= new Clustering_Kopi();
        String[]irisan={"p3","p2","p1","t2","t1"};
        String[]iris={"p3","p2"};
        c.inputclus(0.5, irisan, iris);
        c.inputclus(0.6, irisan, iris);
        c.inputclus(0.7, irisan, iris);
        
        c.tampilclus(0.6);
    }
    
    public void tampilclus(double treshol){
        for(Entry<Double, ArrayList<String[]>> entry:map.entrySet()){
            if(entry.getKey() >=treshol){
                System.out.print(entry.getKey()+"|");
                key=entry.getKey();
                for(int i=0; i<entry.getValue().size(); i++){
                modelpml=entry.getValue().get(i);
                for(int j=0; j<modelpml.length; j++){
                    System.out.print(modelpml[j]+" ");
                }
                }
                System.out.println();
            }
        }
    }
    public void inputclus(double nilaisim, String[] model, String[]modelstruk){
    ArrayList<String[]> modelnya=new ArrayList<>();
    modelnya.add(model);
        System.out.println("input key"+nilaisim);
        map.put(nilaisim, modelnya);
        mapstruk.put(nilaisim, modelstruk);
        
}
}
