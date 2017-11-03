/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

/**
 *
 * @author Arif
 */
public class TestReplace_Array_Lagi {

    public String arrayA[] = {"Tes Al Quran, Tes Akademik, Interview", "Bb", "Cc", "Ddd", "Dee", "Iid", "uiu"};
    public String arrayB[] = {"mendaftar di pondok pesantren", "Aabb", "AaaaCc", "aaaADd", "Aaauu", "AsddDyuyud", "AAbbhju", "AAaaaa", "Aass", "Asss"};

    double[] temp = new double[100];
    double min = 1000.0;
    double max = 0.0;

    public static void main(String[] args) {
        TestReplace_Array_Lagi tarr = new TestReplace_Array_Lagi();

        tarr.cek();

    }

    void cek() {
        Levenshtein_Array lvs = new Levenshtein_Array();
        for (int a = 0; a < arrayA.length; a++) {
            for (int b = 0; b < arrayB.length; b++) {
                //lvs.printSimilarity(arrayA[0],arrayB[0]);
                //System.out.println(lvs.similarity(arrayA[a],arrayB[b]));
                temp[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(arrayA[0], arrayB[0])));
                //System.out.println(temp[0]);
                temp[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(arrayA[0], arrayB[1])));
                //System.out.println(temp[1]);
                temp[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(arrayA[0], arrayB[2])));
                //System.out.println(temp[2]);
                temp[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(arrayA[0], arrayB[3])));
                //System.out.println(temp[3]);
                temp[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(arrayA[0], arrayB[4])));
                //System.out.println(temp[4]);
                temp[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(arrayA[0], arrayB[5])));
                //System.out.println(temp[5]);
                temp[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(arrayA[0], arrayB[6])));
                //System.out.println(temp[6]);
                temp[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(arrayA[0], arrayB[7])));
                //System.out.println(temp[7]);
                temp[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(arrayA[0], arrayB[8])));
                //System.out.println(temp[8]);
                temp[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(arrayA[0], arrayB[9])));
                //System.out.println(temp[9]);
            }
        }
        for (int y = 0; y < 10; y++) {
            if (temp[y] > max) {
                max = temp[y];
            } else if (temp[y] < min) {
                min = temp[y];
            }

            System.out.println(temp[y]);
        }
        System.out.println("maksimal " + max);

    }

}
