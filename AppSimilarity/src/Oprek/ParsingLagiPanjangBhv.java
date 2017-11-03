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

public class ParsingLagiPanjangBhv {

    NodeList NodeListArc;
    NodeList NodeListPlace;
    NodeList NodeListTrans;
    NodeList NodeListArc2;
    NodeList NodeListPlace2;
    NodeList NodeListTrans2;
    public int jumlahTARset = 0;
    public String gabungan = null;
    String place[] = new String[10];
    String trans[] = new String[10];
    String arc[] = new String[20];
    String place2[] = new String[10];
    String trans2[] = new String[10];
    String arc22[] = new String[20];
    String tampungsemua[] = new String[40];
    String tampungsemua2[] = new String[40];

    String tampung[] = new String[40];
    String tampung2[] = new String[40];

    public int jumpetri1;
    public int jumpetri2;
    public int Irisan;

    public static void main(String[] args) {

        ParsingLagiPanjangBhv phv = new ParsingLagiPanjangBhv();
        phv.main();
    }

    void main() {

        ParsingLagiPanjangBhv pl = new ParsingLagiPanjangBhv();
        int Min;
        pl.Parsing("E:MODEL/Cek1.pnml");
        System.out.println("=========");
        pl.Parsing2("E:MODEL/Cek2.pnml");
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

            for (int i = 0; i < NodeListArc.getLength(); i++) {
                String arc1 = NodeListArc.item(i).getAttributes().getNamedItem("target").getNodeValue();
                String Transisi1 = NodeListArc.item(i).getAttributes().getNamedItem("source").getNodeValue();
                String t1 = arc1.substring(0, 1);
                for (int j = 0; j < NodeListArc.getLength(); j++) {
                    String arc2 = NodeListArc.item(j).getAttributes().getNamedItem("source").getNodeValue();
                    String Transisi2 = NodeListArc.item(j).getAttributes().getNamedItem("target").getNodeValue();

                    if (arc1.equals(arc2) && !(t1.equals("t"))) {
                        jumlahTARset++;
                        gabungan = Transisi1 + Transisi2;
                        System.out.println(gabungan);

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
                            arc[5] = gabungan;
                        } else if (arc[16] == null) {
                            arc[16] = gabungan;
                        } else if (arc[17] == null) {
                            arc[17] = gabungan;
                        } else if (arc[18] == null) {
                            arc[18] = gabungan;
                        } else if (arc[19] == null) {
                            arc[19] = gabungan;
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

            for (int i = 0; i < NodeListArc2.getLength(); i++) {
                String arc1 = NodeListArc2.item(i).getAttributes().getNamedItem("target").getNodeValue();
                String Transisi1 = NodeListArc2.item(i).getAttributes().getNamedItem("source").getNodeValue();
                String t1 = arc1.substring(0, 1);
                for (int j = 0; j < NodeListArc2.getLength(); j++) {
                    String arc2 = NodeListArc2.item(j).getAttributes().getNamedItem("source").getNodeValue();
                    String Transisi2 = NodeListArc2.item(j).getAttributes().getNamedItem("target").getNodeValue();

                    if (arc1.equals(arc2) && !(t1.equals("t"))) {
                        jumlahTARset++;
                        gabungan = Transisi1 + Transisi2;
                        System.out.println(gabungan);
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
                            arc22[5] = gabungan;
                        } else if (arc22[16] == null) {
                            arc22[16] = gabungan;
                        } else if (arc22[17] == null) {
                            arc22[17] = gabungan;
                        } else if (arc22[18] == null) {
                            arc22[18] = gabungan;
                        } else if (arc22[19] == null) {
                            arc22[19] = gabungan;
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

//        List<String> list1 = new ArrayList<String>(Arrays.asList(A[0], A[1], A[2], A[3], A[4], A[5], A[6], A[7],
//                A[8], A[9], A[10], A[11], A[12], A[13], A[14], A[15],
//                A[16], A[17], A[18], A[19], A[20], A[21], A[22], A[23],
//                A[24], A[25], A[26], A[27], A[28], A[29], A[30], A[31],
//                A[32], A[33], A[34], A[35], A[36], A[37], A[38], A[39]));
////        for (int i = 0; i < A.length; i++) {
////            if (A[i] != null) {
////                //System.out.println(A[i]);
////            }
////        }
////        System.out.println();
////        for (int i = 0; i < B.length; i++) {
////            if (B[i] != null) {
////                //System.out.println(B[i]);
////            }
////        }
//
//        System.out.println(list1);
//        List<String> list2 = new ArrayList<String>(Arrays.asList(B[0], B[1], B[2], B[3], B[4], B[5], B[6], B[7],
//                B[8], B[9], B[10], B[11], B[12], B[13], B[14], B[15],
//                B[16], B[17], B[18], B[19], B[20], B[21], B[22], B[23],
//                B[24], B[25], B[26], B[27], B[28], B[29], B[30], B[31],
//                B[32], B[33], B[34], B[35], B[36], B[37], B[38], B[39]));
//        System.out.println(list2);
//        
//        list1.retainAll(list2);
//        System.out.println(list1);
        int jumlahirisan = 0;

        return jumlahirisan;
    }

    public double struktural(int A, int B, int Irisan) {
        System.out.println("Tars Coefficient Similarity");
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
