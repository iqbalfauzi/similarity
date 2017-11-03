/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oprek;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.HashSet;
import java.util.Set;
import org.xml.sax.SAXException;

/**
 *
 * @author Arif
 */
public class ParsingSmtStruk {

    String tampung1;
    String tampung2;
    String transisi1[] = new String[40];
    String transisi2[] = new String[40];
    
    String tampungplace1;
    String tampungplace2;
    String placesss1[] = new String[40];
    String placesss2[] = new String[40];
    String tampungsemua[] = new String[20];

    public void Parsing1(String model) {

        try {
            File inputFile = new File(model);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nList1 = doc.getElementsByTagName("transition");
            NodeList nPlace1 = doc.getElementsByTagName("place");

            for (int temp = 0; temp < nList1.getLength(); temp++) {
                Node node = nList1.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    
                    tampung1 = eElement.getElementsByTagName("text").item(0).getTextContent();
                   
                    if (transisi1[0] == null) {
                        transisi1[0] = tampung1;
                    } else if (transisi1[1] == null) {
                        transisi1[1] = tampung1;
                    } else if (transisi1[2] == null) {
                        transisi1[2] = tampung1;
                    } else if (transisi1[3] == null) {
                        transisi1[3] = tampung1;
                    } else if (transisi1[4] == null) {
                        transisi1[4] = tampung1;
                    } else if (transisi1[5] == null) {
                        transisi1[5] = tampung1;
                    } else if (transisi1[6] == null) {
                        transisi1[6] = tampung1;
                    } else if (transisi1[7] == null) {
                        transisi1[7] = tampung1;
                    } else if (transisi1[8] == null) {
                        transisi1[8] = tampung1;
                    } else if (transisi1[9] == null) {
                        transisi1[9] = tampung1;
                    }

                }
            }
            for (int i = 0; i < transisi1.length; i++) {
                if (transisi1[i] != null) {
                    System.out.println(transisi1[i]);
                }
            }
            //=================================================================//
            for (int temp = 0; temp < nPlace1.getLength(); temp++) {
                Node node = nPlace1.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    
                    tampungplace1 = eElement.getElementsByTagName("text").item(0).getTextContent();
                   
                    if (placesss1[0] == null) {
                        placesss1[0] = tampungplace1;
                    } else if (placesss1[1] == null) {
                        placesss1[1] = tampungplace1;
                    } else if (placesss1[2] == null) {
                        placesss1[2] = tampungplace1;
                    } else if (placesss1[3] == null) {
                        placesss1[3] = tampungplace1;
                    } else if (placesss1[4] == null) {
                        placesss1[4] = tampungplace1;
                    } else if (placesss1[5] == null) {
                        placesss1[5] = tampungplace1;
                    } else if (placesss1[6] == null) {
                        placesss1[6] = tampungplace1;
                    } else if (placesss1[7] == null) {
                        placesss1[7] = tampungplace1;
                    } else if (placesss1[8] == null) {
                        placesss1[8] = tampungplace1;
                    } else if (placesss1[9] == null) {
                        placesss1[9] = tampungplace1;
                    } else if (placesss1[10] == null) {
                        placesss1[10] = tampungplace1;
                    } else if (placesss1[11] == null) {
                        placesss1[11] = tampungplace1;
                    } else if (placesss1[12] == null) {
                        placesss1[12] = tampungplace1;
                    } else if (placesss1[13] == null) {
                        placesss1[13] = tampungplace1;
                    } else if (placesss1[14] == null) {
                        placesss1[14] = tampungplace1;
                    } else if (placesss1[15] == null) {
                        placesss1[15] = tampungplace1;
                    } else if (placesss1[16] == null) {
                        placesss1[16] = tampungplace1;
                    } else if (placesss1[17] == null) {
                        placesss1[17] = tampungplace1;
                    } else if (placesss1[18] == null) {
                        placesss1[18] = tampungplace1;
                    } else if (placesss1[19] == null) {
                        placesss1[19] = tampungplace1;
                    }

                }
            
                
            }
            for (int i = 0; i < placesss1.length; i++) {
                if (placesss1[i] != null) {
                   // System.out.println(placesss1[i]);
                }
            }
            
            
        } catch (Exception e) {
        }
    }

    public void Parsing2(String model) {

        try {
            File inputFile = new File(model);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nList2 = doc.getElementsByTagName("transition");
            NodeList nPlace2 = doc.getElementsByTagName("place");

            for (int temp = 0; temp < nList2.getLength(); temp++) {
                Node node = nList2.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    //System.out.println("id Petri Net : " + eElement.getAttribute("id"));
                    tampung2 = eElement.getElementsByTagName("text").item(0).getTextContent();
                    //System.out.println("Transisi : " + tampung2 + "\n");
                    if (transisi2[0] == null) {
                        transisi2[0] = tampung2;
                    } else if (transisi2[1] == null) {
                        transisi2[1] = tampung2;
                    } else if (transisi2[2] == null) {
                        transisi2[2] = tampung2;
                    } else if (transisi2[3] == null) {
                        transisi2[3] = tampung2;
                    } else if (transisi2[4] == null) {
                        transisi2[4] = tampung2;
                    } else if (transisi2[5] == null) {
                        transisi2[5] = tampung2;
                    } else if (transisi2[6] == null) {
                        transisi2[6] = tampung2;
                    } else if (transisi2[7] == null) {
                        transisi2[7] = tampung2;
                    } else if (transisi2[8] == null) {
                        transisi2[8] = tampung2;
                    } else if (transisi2[9] == null) {
                        transisi2[9] = tampung2;
                    }

                }
            }
            for (int i = 0; i < transisi2.length; i++) {
                if (transisi2[i] != null) {
                    System.out.println(transisi2[i]);
                }

            }
            
            //===============================================================-//

            
            for (int temp = 0; temp < nPlace2.getLength(); temp++) {
                Node node = nPlace2.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    
                    tampungplace2 = eElement.getElementsByTagName("text").item(0).getTextContent();
                   
                    if (placesss2[0] == null) {
                        placesss2[0] = tampungplace2;
                    } else if (placesss2[1] == null) {
                        placesss2[1] = tampungplace2;
                    } else if (placesss2[2] == null) {
                        placesss2[2] = tampungplace2;
                    } else if (placesss2[3] == null) {
                        placesss2[3] = tampungplace2;
                    } else if (placesss2[4] == null) {
                        placesss2[4] = tampungplace2;
                    } else if (placesss2[5] == null) {
                        placesss2[5] = tampungplace2;
                    } else if (placesss2[6] == null) {
                        placesss2[6] = tampungplace2;
                    } else if (placesss2[7] == null) {
                        placesss2[7] = tampungplace2;
                    } else if (placesss2[8] == null) {
                        placesss2[8] = tampungplace2;
                    } else if (placesss2[9] == null) {
                        placesss2[9] = tampungplace2;
                    } else if (placesss2[10] == null) {
                        placesss2[10] = tampungplace2;
                    } else if (placesss2[11] == null) {
                        placesss2[11] = tampungplace2;
                    } else if (placesss2[12] == null) {
                        placesss2[12] = tampungplace2;
                    } else if (placesss2[13] == null) {
                        placesss2[13] = tampungplace2;
                    } else if (placesss2[14] == null) {
                        placesss2[14] = tampungplace2;
                    } else if (placesss2[15] == null) {
                        placesss2[15] = tampungplace2;
                    } else if (placesss2[16] == null) {
                        placesss2[16] = tampungplace2;
                    } else if (placesss2[17] == null) {
                        placesss2[17] = tampungplace2;
                    } else if (placesss2[18] == null) {
                        placesss2[18] = tampungplace2;
                    } else if (placesss2[19] == null) {
                        placesss2[19] = tampungplace2;
                    }

                }
            }
            for (int i = 0; i < placesss2.length; i++) {
                if (placesss2[i] != null) {
                    //System.out.println(placesss2[i]);
                }
            }
            
            
            
        } catch (Exception e) {

        }
    }
    public static Set<String> intersect(String[] Aa, String[] Bb) {
        Set<String> aSet = new HashSet<String>();
        Set<String> intersection = new HashSet<String>();
                
        for (String c : Aa) {
            aSet.add(c);
        }
        for (String c : Bb) {
            if (aSet.contains(c)) {
                intersection.add(c);
            }
        }
        return intersection;
    }

    public static void main(String[] args) {
ParsingSmtStruk jd = new ParsingSmtStruk();
        jd.Parsing1("E:MODEL/Kepegawaian_Ar-Rohmah_2.pnml");
        System.out.println("============");
        jd.Parsing2("E:MODEL/Kepegawaian_Anwarul_Huda.pnml");
        
        
        
        System.out.println(intersect(jd.transisi1, jd.transisi2));

    }

}
