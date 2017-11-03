/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oprek;
/**
 *
 * @author Arif
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class ParsingLagiPanjangStruk {

    NodeList NodeListArc;
    NodeList NodeListPlace;
    NodeList NodeListTrans;
    NodeList NodeListArc2;
    NodeList NodeListPlace2;
    NodeList NodeListTrans2;
    String place[] = new String[20];
    String trans[] = new String[20];
    String arc[] = new String[40];
    String place2[] = new String[20];
    String trans2[] = new String[20];
    String arc22[] = new String[40];
    String tampungsemua[] = new String[80];
    String tampungsemua2[] = new String[80];

    String tampung[] = new String[80];
    String tampung2[] = new String[80];

    public int jumpetri1;
    public int jumpetri2;
    public int Irisan;

    public static void main(String[] args) {
        ParsingLagiPanjangStruk pbs = new ParsingLagiPanjangStruk();
        pbs.mai();
    }

    void mai() {

        ParsingLagiPanjangStruk pl = new ParsingLagiPanjangStruk();
        int Min;
        pl.Parsing("E:MODEL/Tipe Pesantren/tipeB.pnml");
        pl.Parsing2("E:MODEL/Tipe Pesantren/tipeC.pnml");
        System.out.print("Petri Net A ");
        for (int i = 0; i < tampungsemua.length; i++) {
            if (tampungsemua[i] != null) {
                System.out.print(tampungsemua[i] + " ");

                jumpetri1 += 1;
            }
        }
        System.out.println("jumlah : " + jumpetri1);
        System.out.println();
        System.out.print("Petri Net B ");
        for (int i = 0; i < tampungsemua2.length; i++) {
            if (tampungsemua2[i] != null) {
                System.out.print(tampungsemua2[i] + " ");

                jumpetri2 += 1;
            }
        }
        System.out.println("jumlah : " + jumpetri2);
        if (jumpetri1 < jumpetri2) {
            Min = jumpetri1;
        } else {
            Min = jumpetri2;
        }
        System.out.println();
        Irisan = intersect(tampungsemua, tampungsemua2).size() - 1;

        for (String tampil : intersect(tampungsemua, tampungsemua2)) {
            if (tampil != null) {
                System.out.println("hasilnya : " + tampil);
            }
        }

        //System.out.println("Irisan "+intersect(tampungsemua, tampungsemua2)+" jumlah : "+Irisan);
        System.out.println("==========================================");
        pl.struktural(jumpetri1, jumpetri2, Irisan);
        System.out.println("==========================================");
        pl.dice(jumpetri1, jumpetri2, Irisan);
        System.out.println("==========================================");
        pl.Cosine(jumpetri1, jumpetri2, Irisan);
        System.out.println("==========================================");
        pl.overlap(jumpetri1, jumpetri2, Min, Irisan);
        System.out.println("==========================================");
        pl.hitungirisan();

    }

    public void kekosongan() {
        Arrays.fill(this.tampungsemua, null);
        Arrays.fill(this.tampungsemua2, null);
        for (int i = 0; i < tampungsemua.length; i++) {
            tampungsemua[i] = null;
        }
        for (int i = 0; i < tampungsemua2.length; i++) {
            tampungsemua2[i] = null;
        }
    }

    public void Parsing(String model) {
        for (int i = 0; i < tampungsemua.length; i++) {
            tampungsemua[i] = null;
        }
        try {
            File inputFile = new File(model);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeListPlace = doc.getElementsByTagName("place");
            NodeListTrans = doc.getElementsByTagName("transition");
            NodeListArc = doc.getElementsByTagName("arc");

            for (int temp = 0; temp < NodeListPlace.getLength(); temp++) {
                String nNodeP = NodeListPlace.item(temp).getAttributes().getNamedItem("id").getNodeValue();
                //System.out.println("Element Place: " + nNodeP);
                if (place[0] == null) {
                    place[0] = nNodeP;
                } else if (place[1] == null) {
                    place[1] = nNodeP;
                } else if (place[2] == null) {
                    place[2] = nNodeP;
                } else if (place[3] == null) {
                    place[3] = nNodeP;
                } else if (place[4] == null) {
                    place[4] = nNodeP;
                } else if (place[5] == null) {
                    place[5] = nNodeP;
                } else if (place[6] == null) {
                    place[6] = nNodeP;
                } else if (place[7] == null) {
                    place[7] = nNodeP;
                } else if (place[8] == null) {
                    place[8] = nNodeP;
                } else if (place[9] == null) {
                    place[9] = nNodeP;
                } else if (place[10] == null) {
                    place[10] = nNodeP;
                } else if (place[11] == null) {
                    place[11] = nNodeP;
                } else if (place[12] == null) {
                    place[12] = nNodeP;
                } else if (place[13] == null) {
                    place[13] = nNodeP;
                } else if (place[14] == null) {
                    place[14] = nNodeP;
                } else if (place[15] == null) {
                    place[15] = nNodeP;
                } else if (place[16] == null) {
                    place[16] = nNodeP;
                } else if (place[17] == null) {
                    place[17] = nNodeP;
                } else if (place[18] == null) {
                    place[18] = nNodeP;
                } else if (place[19] == null) {
                    place[19] = nNodeP;
                }

            }
            for (int temp = 0; temp < NodeListTrans.getLength(); temp++) {
                String nNodeT = NodeListTrans.item(temp).getAttributes().getNamedItem("id").getNodeValue();
                //System.out.println("Element Transisi: " + nNodeT);
                if (trans[0] == null) {
                    trans[0] = nNodeT;
                } else if (trans[1] == null) {
                    trans[1] = nNodeT;
                } else if (trans[2] == null) {
                    trans[2] = nNodeT;
                } else if (trans[3] == null) {
                    trans[3] = nNodeT;
                } else if (trans[4] == null) {
                    trans[4] = nNodeT;
                } else if (trans[5] == null) {
                    trans[5] = nNodeT;
                } else if (trans[6] == null) {
                    trans[6] = nNodeT;
                } else if (trans[7] == null) {
                    trans[7] = nNodeT;
                } else if (trans[8] == null) {
                    trans[8] = nNodeT;
                } else if (trans[9] == null) {
                    trans[9] = nNodeT;
                } else if (trans[10] == null) {
                    trans[10] = nNodeT;
                } else if (trans[11] == null) {
                    trans[11] = nNodeT;
                } else if (trans[12] == null) {
                    trans[12] = nNodeT;
                } else if (trans[13] == null) {
                    trans[13] = nNodeT;
                } else if (trans[14] == null) {
                    trans[14] = nNodeT;
                } else if (trans[15] == null) {
                    trans[15] = nNodeT;
                } else if (trans[16] == null) {
                    trans[16] = nNodeT;
                } else if (trans[17] == null) {
                    trans[17] = nNodeT;
                } else if (trans[18] == null) {
                    trans[18] = nNodeT;
                } else if (trans[19] == null) {
                    trans[19] = nNodeT;
                }
            }

            for (int temp = 0; temp < NodeListArc.getLength(); temp++) {
                String arc1 = NodeListArc.item(temp).getAttributes().getNamedItem("source").getNodeValue();
                String arc2 = NodeListArc.item(temp).getAttributes().getNamedItem("target").getNodeValue();
                String gabungan = arc1 + arc2;
                //System.out.println("Elemen Arc " + gabungan);
                if (arc[0] == null) {
                    arc[0] = gabungan;
                } else if (arc[1] == null) {
                    arc[1] = gabungan;
                } else if (arc[2] == null) {
                    arc[2] = gabungan;
                } else if (arc[3] == null) {
                    arc[3] = gabungan;
                } else if (arc[4] == null) {
                    arc[4] = gabungan;
                } else if (arc[5] == null) {
                    arc[5] = gabungan;
                } else if (arc[6] == null) {
                    arc[6] = gabungan;
                } else if (arc[7] == null) {
                    arc[7] = gabungan;
                } else if (arc[8] == null) {
                    arc[8] = gabungan;
                } else if (arc[9] == null) {
                    arc[9] = gabungan;
                } else if (arc[10] == null) {
                    arc[10] = gabungan;
                } else if (arc[11] == null) {
                    arc[11] = gabungan;
                } else if (arc[12] == null) {
                    arc[12] = gabungan;
                } else if (arc[13] == null) {
                    arc[13] = gabungan;
                } else if (arc[14] == null) {
                    arc[14] = gabungan;
                } else if (arc[15] == null) {
                    arc[15] = gabungan;
                } else if (arc[16] == null) {
                    arc[16] = gabungan;
                } else if (arc[17] == null) {
                    arc[17] = gabungan;
                } else if (arc[18] == null) {
                    arc[18] = gabungan;
                } else if (arc[19] == null) {
                    arc[19] = gabungan;
                } else if (arc[20] == null) {
                    arc[20] = gabungan;
                } else if (arc[21] == null) {
                    arc[21] = gabungan;
                } else if (arc[22] == null) {
                    arc[22] = gabungan;
                } else if (arc[23] == null) {
                    arc[23] = gabungan;
                } else if (arc[24] == null) {
                    arc[24] = gabungan;
                } else if (arc[25] == null) {
                    arc[25] = gabungan;
                } else if (arc[26] == null) {
                    arc[26] = gabungan;
                } else if (arc[27] == null) {
                    arc[27] = gabungan;
                } else if (arc[28] == null) {
                    arc[28] = gabungan;
                } else if (arc[29] == null) {
                    arc[29] = gabungan;
                } else if (arc[30] == null) {
                    arc[30] = gabungan;
                } else if (arc[31] == null) {
                    arc[31] = gabungan;
                } else if (arc[32] == null) {
                    arc[32] = gabungan;
                } else if (arc[33] == null) {
                    arc[33] = gabungan;
                } else if (arc[34] == null) {
                    arc[34] = gabungan;
                } else if (arc[35] == null) {
                    arc[35] = gabungan;
                } else if (arc[36] == null) {
                    arc[36] = gabungan;
                } else if (arc[37] == null) {
                    arc[37] = gabungan;
                } else if (arc[38] == null) {
                    arc[38] = gabungan;
                } else if (arc[39] == null) {
                    arc[39] = gabungan;
                }

            }

            if (tampungsemua[0] == null) {
                tampungsemua[0] = place[0];
            }
            if (tampungsemua[1] == null) {
                tampungsemua[1] = place[1];
            }
            if (tampungsemua[2] == null) {
                tampungsemua[2] = place[2];
            }
            if (tampungsemua[3] == null) {
                tampungsemua[3] = place[3];
            }
            if (tampungsemua[4] == null) {
                tampungsemua[4] = place[4];
            }
            if (tampungsemua[5] == null) {
                tampungsemua[5] = place[5];
            }
            if (tampungsemua[6] == null) {
                tampungsemua[6] = place[6];
            }
            if (tampungsemua[7] == null) {
                tampungsemua[7] = place[7];
            }
            if (tampungsemua[8] == null) {
                tampungsemua[8] = place[8];
            }
            if (tampungsemua[9] == null) {
                tampungsemua[9] = place[9];

            }
            if (tampungsemua[56] == null) {
                tampungsemua[56] = place[10];
            }
            if (tampungsemua[57] == null) {
                tampungsemua[57] = place[11];
            }
            if (tampungsemua[10] == null) {
                tampungsemua[10] = trans[0];
            }
            if (tampungsemua[11] == null) {
                tampungsemua[11] = trans[1];
            }
            if (tampungsemua[12] == null) {
                tampungsemua[12] = trans[2];
            }
            if (tampungsemua[13] == null) {
                tampungsemua[13] = trans[3];
            }
            if (tampungsemua[14] == null) {
                tampungsemua[14] = trans[4];
            }
            if (tampungsemua[15] == null) {
                tampungsemua[15] = trans[5];
            }
            if (tampungsemua[16] == null) {
                tampungsemua[16] = trans[6];
            }
            if (tampungsemua[17] == null) {
                tampungsemua[17] = trans[7];
            }
            if (tampungsemua[18] == null) {
                tampungsemua[18] = trans[8];
            }
            if (tampungsemua[19] == null) {
                tampungsemua[19] = trans[9];
            }
            if (tampungsemua[20] == null) {
                tampungsemua[20] = arc[0];
            }
            if (tampungsemua[21] == null) {
                tampungsemua[21] = arc[1];
            }
            if (tampungsemua[22] == null) {
                tampungsemua[22] = arc[2];
            }
            if (tampungsemua[23] == null) {
                tampungsemua[23] = arc[3];
            }
            if (tampungsemua[24] == null) {
                tampungsemua[24] = arc[4];
            }
            if (tampungsemua[25] == null) {
                tampungsemua[25] = arc[5];
            }
            if (tampungsemua[26] == null) {
                tampungsemua[26] = arc[6];
            }
            if (tampungsemua[27] == null) {
                tampungsemua[27] = arc[7];
            }
            if (tampungsemua[28] == null) {
                tampungsemua[28] = arc[8];
            }
            if (tampungsemua[29] == null) {
                tampungsemua[29] = arc[9];
            }
            if (tampungsemua[30] == null) {
                tampungsemua[30] = arc[10];
            }
            if (tampungsemua[31] == null) {
                tampungsemua[31] = arc[11];
            }
            if (tampungsemua[32] == null) {
                tampungsemua[32] = arc[12];
            }
            if (tampungsemua[33] == null) {
                tampungsemua[33] = arc[13];
            }
            if (tampungsemua[34] == null) {
                tampungsemua[34] = arc[14];
            }
            if (tampungsemua[35] == null) {
                tampungsemua[35] = arc[15];
            }
            if (tampungsemua[36] == null) {
                tampungsemua[36] = arc[16];
            }
            if (tampungsemua[37] == null) {
                tampungsemua[37] = arc[17];
            }
            if (tampungsemua[38] == null) {
                tampungsemua[38] = arc[18];
            }
            if (tampungsemua[39] == null) {
                tampungsemua[39] = arc[19];
            }
            if (tampungsemua[40] == null) {
                tampungsemua[40] = arc[20];
            }
            if (tampungsemua[41] == null) {
                tampungsemua[41] = arc[21];
            }
            if (tampungsemua[42] == null) {
                tampungsemua[42] = arc[22];
            }
            if (tampungsemua[43] == null) {
                tampungsemua[43] = arc[23];
            }
            if (tampungsemua[44] == null) {
                tampungsemua[44] = arc[24];
                if (tampungsemua[45] == null) {
                    tampungsemua[45] = arc[25];
                }
                if (tampungsemua[46] == null) {
                    tampungsemua[46] = arc[26];
                }
                if (tampungsemua[47] == null) {
                    tampungsemua[47] = arc[27];
                }
                if (tampungsemua[48] == null) {
                    tampungsemua[48] = arc[28];
                }
                if (tampungsemua[49] == null) {
                    tampungsemua[49] = arc[29];
                }
                if (tampungsemua[50] == null) {
                    tampungsemua[50] = arc[30];
                }
                if (tampungsemua[51] == null) {
                    tampungsemua[51] = arc[31];
                }
                if (tampungsemua[53] == null) {
                    tampungsemua[53] = arc[32];
                }
                if (tampungsemua[54] == null) {
                    tampungsemua[54] = arc[33];
                }
                if (tampungsemua[55] == null) {
                    tampungsemua[55] = arc[34];
                }

            }

        } catch (Exception e) {

        }
    }

    public void Parsing2(String model) {
        for (int i = 0; i < tampungsemua2.length; i++) {
            tampungsemua2[i] = null;
        }
        try {
            File inputFile = new File(model);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeListPlace2 = doc.getElementsByTagName("place");
            NodeListTrans2 = doc.getElementsByTagName("transition");
            NodeListArc2 = doc.getElementsByTagName("arc");

            for (int temp = 0; temp < NodeListPlace2.getLength(); temp++) {
                String nNodeP = NodeListPlace2.item(temp).getAttributes().getNamedItem("id").getNodeValue();
                //System.out.println("Element Place: " + nNodeP);
                if (place2[0] == null) {
                    place2[0] = nNodeP;
                } else if (place2[1] == null) {
                    place2[1] = nNodeP;
                } else if (place2[2] == null) {
                    place2[2] = nNodeP;
                } else if (place2[3] == null) {
                    place2[3] = nNodeP;
                } else if (place2[4] == null) {
                    place2[4] = nNodeP;
                } else if (place2[5] == null) {
                    place2[5] = nNodeP;
                } else if (place2[6] == null) {
                    place2[6] = nNodeP;
                } else if (place2[7] == null) {
                    place2[7] = nNodeP;
                } else if (place2[8] == null) {
                    place2[8] = nNodeP;
                } else if (place2[9] == null) {
                    place2[9] = nNodeP;
                } else if (place2[10] == null) {
                    place2[10] = nNodeP;
                } else if (place2[11] == null) {
                    place2[11] = nNodeP;
                } else if (place2[12] == null) {
                    place2[12] = nNodeP;
                } else if (place2[13] == null) {
                    place2[13] = nNodeP;
                } else if (place2[14] == null) {
                    place2[14] = nNodeP;
                } else if (place2[15] == null) {
                    place2[15] = nNodeP;
                } else if (place2[16] == null) {
                    place2[16] = nNodeP;
                } else if (place2[17] == null) {
                    place2[17] = nNodeP;
                } else if (place2[18] == null) {
                    place2[18] = nNodeP;
                } else if (place2[19] == null) {
                    place2[19] = nNodeP;
                }

            }
            for (int temp = 0; temp < NodeListTrans2.getLength(); temp++) {
                String nNodeT = NodeListTrans2.item(temp).getAttributes().getNamedItem("id").getNodeValue();
                //System.out.println("Element Transisi: " + nNodeT);
                if (trans2[0] == null) {
                    trans2[0] = nNodeT;
                } else if (trans2[1] == null) {
                    trans2[1] = nNodeT;
                } else if (trans2[2] == null) {
                    trans2[2] = nNodeT;
                } else if (trans2[3] == null) {
                    trans2[3] = nNodeT;
                } else if (trans2[4] == null) {
                    trans2[4] = nNodeT;
                } else if (trans2[5] == null) {
                    trans2[5] = nNodeT;
                } else if (trans2[6] == null) {
                    trans2[6] = nNodeT;
                } else if (trans2[7] == null) {
                    trans2[7] = nNodeT;
                } else if (trans2[8] == null) {
                    trans2[8] = nNodeT;
                } else if (trans2[9] == null) {
                    trans2[9] = nNodeT;
                } else if (trans2[10] == null) {
                    trans2[10] = nNodeT;
                } else if (trans2[11] == null) {
                    trans2[11] = nNodeT;
                } else if (trans2[12] == null) {
                    trans2[12] = nNodeT;
                } else if (trans2[13] == null) {
                    trans2[13] = nNodeT;
                } else if (trans2[14] == null) {
                    trans2[14] = nNodeT;
                } else if (trans2[15] == null) {
                    trans2[15] = nNodeT;
                } else if (trans2[16] == null) {
                    trans2[16] = nNodeT;
                } else if (trans2[17] == null) {
                    trans2[17] = nNodeT;
                } else if (trans2[18] == null) {
                    trans2[18] = nNodeT;
                } else if (trans2[19] == null) {
                    trans2[19] = nNodeT;
                }
            }

            for (int temp = 0; temp < NodeListArc2.getLength(); temp++) {
                String arc1 = NodeListArc2.item(temp).getAttributes().getNamedItem("source").getNodeValue();
                String arc2 = NodeListArc2.item(temp).getAttributes().getNamedItem("target").getNodeValue();
                String gabungan = arc1 + arc2;
                //System.out.println("Elemen Arc " + gabungan);
                if (arc22[0] == null) {
                    arc22[0] = gabungan;
                } else if (arc22[1] == null) {
                    arc22[1] = gabungan;
                } else if (arc22[2] == null) {
                    arc22[2] = gabungan;
                } else if (arc22[3] == null) {
                    arc22[3] = gabungan;
                } else if (arc22[4] == null) {
                    arc22[4] = gabungan;
                } else if (arc22[5] == null) {
                    arc22[5] = gabungan;
                } else if (arc22[6] == null) {
                    arc22[6] = gabungan;
                } else if (arc22[7] == null) {
                    arc22[7] = gabungan;
                } else if (arc22[8] == null) {
                    arc22[8] = gabungan;
                } else if (arc22[9] == null) {
                    arc22[9] = gabungan;
                } else if (arc22[10] == null) {
                    arc22[10] = gabungan;
                } else if (arc22[11] == null) {
                    arc22[11] = gabungan;
                } else if (arc22[12] == null) {
                    arc22[12] = gabungan;
                } else if (arc22[13] == null) {
                    arc22[13] = gabungan;
                } else if (arc22[14] == null) {
                    arc22[14] = gabungan;
                } else if (arc22[15] == null) {
                    arc22[15] = gabungan;
                } else if (arc22[16] == null) {
                    arc22[16] = gabungan;
                } else if (arc22[17] == null) {
                    arc22[17] = gabungan;
                } else if (arc22[18] == null) {
                    arc22[18] = gabungan;
                } else if (arc22[19] == null) {
                    arc22[19] = gabungan;
                } else if (arc22[20] == null) {
                    arc22[20] = gabungan;
                } else if (arc22[21] == null) {
                    arc22[21] = gabungan;
                } else if (arc22[22] == null) {
                    arc22[22] = gabungan;
                } else if (arc22[23] == null) {
                    arc22[23] = gabungan;
                } else if (arc22[24] == null) {
                    arc22[24] = gabungan;
                } else if (arc22[25] == null) {
                    arc22[25] = gabungan;
                } else if (arc22[26] == null) {
                    arc22[26] = gabungan;
                } else if (arc22[27] == null) {
                    arc22[27] = gabungan;
                } else if (arc22[28] == null) {
                    arc22[28] = gabungan;
                } else if (arc22[29] == null) {
                    arc22[29] = gabungan;
                } else if (arc22[30] == null) {
                    arc22[30] = gabungan;
                } else if (arc22[31] == null) {
                    arc22[31] = gabungan;
                } else if (arc22[32] == null) {
                    arc22[32] = gabungan;
                } else if (arc22[33] == null) {
                    arc22[33] = gabungan;
                } else if (arc22[34] == null) {
                    arc22[34] = gabungan;
                } else if (arc22[35] == null) {
                    arc22[35] = gabungan;
                } else if (arc22[36] == null) {
                    arc22[36] = gabungan;
                } else if (arc22[37] == null) {
                    arc22[37] = gabungan;
                } else if (arc22[38] == null) {
                    arc22[38] = gabungan;
                } else if (arc22[39] == null) {
                    arc22[39] = gabungan;
                }

            }

            if (tampungsemua2[0] == null) {
                tampungsemua2[0] = place2[0];
            }
            if (tampungsemua2[1] == null) {
                tampungsemua2[1] = place2[1];
            }
            if (tampungsemua2[2] == null) {
                tampungsemua2[2] = place2[2];
            }
            if (tampungsemua2[3] == null) {
                tampungsemua2[3] = place2[3];
            }
            if (tampungsemua2[4] == null) {
                tampungsemua2[4] = place2[4];
            }
            if (tampungsemua2[5] == null) {
                tampungsemua2[5] = place2[5];
            }
            if (tampungsemua2[6] == null) {
                tampungsemua2[6] = place2[6];
            }
            if (tampungsemua2[7] == null) {
                tampungsemua2[7] = place2[7];
            }
            if (tampungsemua2[8] == null) {
                tampungsemua2[8] = place2[8];
            }
            if (tampungsemua2[9] == null) {
                tampungsemua2[9] = place2[9];

            }
            if (tampungsemua2[56] == null) {
                tampungsemua2[56] = place2[10];
            }
            if (tampungsemua2[57] == null) {
                tampungsemua2[57] = place2[11];
            }

            if (tampungsemua2[10] == null) {
                tampungsemua2[10] = trans2[0];
            }
            if (tampungsemua2[11] == null) {
                tampungsemua2[11] = trans2[1];
            }
            if (tampungsemua2[12] == null) {
                tampungsemua2[12] = trans2[2];
            }
            if (tampungsemua2[13] == null) {
                tampungsemua2[13] = trans2[3];
            }
            if (tampungsemua2[14] == null) {
                tampungsemua2[14] = trans2[4];
            }
            if (tampungsemua2[15] == null) {
                tampungsemua2[15] = trans2[5];
            }
            if (tampungsemua2[16] == null) {
                tampungsemua2[16] = trans2[6];
            }
            if (tampungsemua2[17] == null) {
                tampungsemua2[17] = trans2[7];
            }
            if (tampungsemua2[18] == null) {
                tampungsemua2[18] = trans2[8];
            }
            if (tampungsemua2[19] == null) {
                tampungsemua2[19] = trans2[9];
            }
            if (tampungsemua2[20] == null) {
                tampungsemua2[20] = arc22[0];
            }
            if (tampungsemua2[21] == null) {
                tampungsemua2[21] = arc22[1];
            }
            if (tampungsemua2[22] == null) {
                tampungsemua2[22] = arc22[2];
            }
            if (tampungsemua2[23] == null) {
                tampungsemua2[23] = arc22[3];
            }
            if (tampungsemua2[24] == null) {
                tampungsemua2[24] = arc22[4];
            }
            if (tampungsemua2[25] == null) {
                tampungsemua2[25] = arc22[5];
            }
            if (tampungsemua2[26] == null) {
                tampungsemua2[26] = arc22[6];
            }
            if (tampungsemua2[27] == null) {
                tampungsemua2[27] = arc22[7];
            }
            if (tampungsemua2[28] == null) {
                tampungsemua2[28] = arc22[8];
            }
            if (tampungsemua2[29] == null) {
                tampungsemua2[29] = arc22[9];
            }
            if (tampungsemua2[30] == null) {
                tampungsemua2[30] = arc22[10];
            }
            if (tampungsemua2[31] == null) {
                tampungsemua2[31] = arc22[11];
            }
            if (tampungsemua2[32] == null) {
                tampungsemua2[32] = arc22[12];
            }
            if (tampungsemua2[33] == null) {
                tampungsemua2[33] = arc22[13];
            }
            if (tampungsemua2[34] == null) {
                tampungsemua2[34] = arc22[14];
            }
            if (tampungsemua2[35] == null) {
                tampungsemua2[35] = arc22[15];
            }
            if (tampungsemua2[36] == null) {
                tampungsemua2[36] = arc22[16];
            }
            if (tampungsemua2[37] == null) {
                tampungsemua2[37] = arc22[17];
            }
            if (tampungsemua2[38] == null) {
                tampungsemua2[38] = arc22[18];
            }
            if (tampungsemua2[39] == null) {
                tampungsemua2[39] = arc22[19];
            }
            if (tampungsemua2[40] == null) {
                tampungsemua2[40] = arc22[20];
            }
            if (tampungsemua2[41] == null) {
                tampungsemua2[41] = arc22[21];
            }
            if (tampungsemua2[42] == null) {
                tampungsemua2[42] = arc22[22];
            }
            if (tampungsemua2[43] == null) {
                tampungsemua2[43] = arc22[23];
            }
            if (tampungsemua2[44] == null) {
                tampungsemua2[44] = arc22[24];
                if (tampungsemua2[45] == null) {
                    tampungsemua2[45] = arc22[25];
                }
                if (tampungsemua2[46] == null) {
                    tampungsemua2[46] = arc22[26];
                }
                if (tampungsemua2[47] == null) {
                    tampungsemua2[47] = arc22[27];
                }
                if (tampungsemua2[48] == null) {
                    tampungsemua2[48] = arc22[28];
                }
                if (tampungsemua2[49] == null) {
                    tampungsemua2[49] = arc22[29];
                }
                if (tampungsemua2[50] == null) {
                    tampungsemua2[50] = arc22[30];
                }
                if (tampungsemua2[51] == null) {
                    tampungsemua2[51] = arc22[31];
                }
                if (tampungsemua2[53] == null) {
                    tampungsemua2[53] = arc22[32];
                }
                if (tampungsemua2[54] == null) {
                    tampungsemua2[54] = arc22[33];
                }
                if (tampungsemua2[55] == null) {
                    tampungsemua2[55] = arc22[34];
                }

            }
        } catch (Exception e) {

        }
    }

    public static Set<String> intersect(String[] Aa, String[] Bb) {
        Set<String> aSet = new HashSet<String>();
        Set<String> intersection = new HashSet<String>();

        //     for(String cari :  )
        for (String c : Aa) {
            aSet.add(c);
        }
        for (String c : Bb) {
            if (aSet.contains(c)) {
                intersection.add(c);
            }
        }
//        boolean jumlah = intersection.contains(null);
//        System.out.println(jumlah);

        return intersection;
    }

    public int hitungirisan() {
        String A[] = {tampungsemua[0], tampungsemua[1], tampungsemua[2], tampungsemua[3], tampungsemua[4], tampungsemua[5], tampungsemua[6], tampungsemua[7],
            tampungsemua[8], tampungsemua[9], tampungsemua[10], tampungsemua[11], tampungsemua[12], tampungsemua[13], tampungsemua[14], tampungsemua[15],
            tampungsemua[16], tampungsemua[17], tampungsemua[18], tampungsemua[19], tampungsemua[20], tampungsemua[21], tampungsemua[22], tampungsemua[23],
            tampungsemua[24], tampungsemua[25], tampungsemua[26], tampungsemua[27], tampungsemua[28], tampungsemua[29], tampungsemua[30], tampungsemua[31],
            tampungsemua[32], tampungsemua[33], tampungsemua[34], tampungsemua[35], tampungsemua[36], tampungsemua[37], tampungsemua[38], tampungsemua[39]};
        String B[] = {tampungsemua2[0], tampungsemua2[1], tampungsemua2[2], tampungsemua2[3], tampungsemua2[4], tampungsemua2[5], tampungsemua2[6], tampungsemua2[7],
            tampungsemua2[8], tampungsemua2[9], tampungsemua2[10], tampungsemua2[11], tampungsemua2[12], tampungsemua2[13], tampungsemua2[14], tampungsemua2[15],
            tampungsemua2[16], tampungsemua2[17], tampungsemua2[18], tampungsemua2[19], tampungsemua2[20], tampungsemua2[21], tampungsemua2[22], tampungsemua2[23],
            tampungsemua2[24], tampungsemua2[25], tampungsemua2[26], tampungsemua2[27], tampungsemua2[28], tampungsemua2[29], tampungsemua2[30], tampungsemua2[31],
            tampungsemua2[32], tampungsemua2[33], tampungsemua2[34], tampungsemua2[35], tampungsemua2[36], tampungsemua2[37], tampungsemua2[38], tampungsemua2[39]};

        int jumlahirisan = 0;
        return jumlahirisan;
    }

    public double struktural(int A, int B, int Irisan) {
        System.out.println("Jaccard Structural Coefficient Similarity");
        System.out.println("Petri Net 1 = " + A);
        System.out.println("Petri Net 2 = " + B);
        System.out.println("Irisan = " + Irisan);
        double operasiatas = Irisan;
        double operasibawah = A + B - Irisan;
        double operasifix = operasiatas / operasibawah;
        System.out.println(operasifix);
        return operasifix;
    }

    public double overlap(int A, int B, int Min, int Irisan) {
        System.out.println("Overlap Coefficient Similarity");
        System.out.println("Petri Net 1= " + A);
        System.out.println("Petri Net 2= " + B);
        System.out.println("Irisan = " + Irisan);
        System.out.println("Min = " + Min);
        double operasiatas = Irisan;
        if (A < B) {
            Min = A;
        } else {
            Min = B;
        }
        double operasibawah = Min;
        double operasifix = operasiatas / operasibawah;
        System.out.println(operasifix);
        return operasifix;
    }

    public double dice(int A, int B, int Irisan) {
        System.out.println("Dice's Coefficient Similarity");
        System.out.println("Petri Net 1= " + A);
        System.out.println("Petri Net 2= " + B);
        System.out.println("Irisan = " + Irisan);
        double operasiatas = Irisan;
        double operasibawah = A + B;
        double operasifix = 2 * (operasiatas / operasibawah);
        System.out.println(operasifix);
        return operasifix;
    }

    public double Cosine(int A, int B, int Irisan) {
        System.out.println("Cosine Coefficient Similarity");
        System.out.println("Petri Net 1= " + A);
        System.out.println("Petri Net 2= " + B);
        System.out.println("Irisan = " + Irisan);
        double operasiatas = Irisan;
        double operasibawah = Math.sqrt(A) * Math.sqrt(B);
        double operasifix = operasiatas / operasibawah;
        System.out.println(operasifix);
        return operasifix;
    }
}
