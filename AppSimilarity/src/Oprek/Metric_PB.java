/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oprek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author CHARIS
 */
public class Metric_PB {

    public static double key;
    public static String[] modelPnml;
    public static HashMap<Double, ArrayList<String[]>> mapMetricStruk = new HashMap<Double, ArrayList<String[]>>();
    public static HashMap<Double, ArrayList<String[]>> mapMetricBhv = new HashMap<Double, ArrayList<String[]>>();
    public static HashMap<Double, ArrayList<String[]>> mapMetricSmt = new HashMap<Double, ArrayList<String[]>>();
    public static HashMap<Double, String[]> mapTARs = new HashMap<Double, String[]>();
    static Clustering clustering = new Clustering();

    public void inputClusterStruk(double nilaiSim, String[] model) {
        ArrayList<String[]> modelnya = new ArrayList<>();
        modelnya.add(model);
        System.out.println("input key " + nilaiSim);
        mapMetricStruk.put(nilaiSim, modelnya);
    }

    public void inputClusterBhv(double nilaiSim, String[] model) {
        ArrayList<String[]> modelnya = new ArrayList<>();
        modelnya.add(model);
        System.out.println("input key " + nilaiSim);
        mapMetricBhv.put(nilaiSim, modelnya);
    }

    public void inputClusterSmt(double nilaiSim, String[] model) {
        ArrayList<String[]> modelnya = new ArrayList<>();
        modelnya.add(model);
        System.out.println("input key " + nilaiSim);
        mapMetricSmt.put(nilaiSim, modelnya);
    }

    public void isiKlusterStruk() {
        double nilai1 = 1.001;
        String[] model1 = {"Akademik_Al-Rifai.pnml  dan ", "Akademik_Al-Rifai.pnml"};

        double nilai2 = 0.311;
        String[] model2 = {"Akademik_Al-Rifai.pnml dan ", "Akademik_Anwarul_Huda.pnml"};

        double nilai3 = 0.382;
        String[] model3 = {"Akademik_Al-Rifai.pnml dan ", "Akademik_Ar-Rohmah_2.pnml"};

        double nilai4 = 1.002;
        String[] model4 = {"Akademik_Anwarul_Huda.pnml dan", "Akademik_Anwarul_Huda.pnml"};

        double nilai5 = 0.3821;
        String[] model5 = {"Akademik_Anwarul_Huda.pnml dan", "Akademik_Ar-Rohmah_2.pnml"};

        double nilai6 = 1.003;
        String[] model6 = {"Akademik_Ar-Rohmah_2.pnml dan", "Akademik_Ar-Rohmah_2.pnml"};

        double nilai7 = 1.004;
        String[] model7 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Kepegawaian_Anwarul_Huda.pnml"};

        double nilai8 = 0.148;
        String[] model8 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Kepegawaian_Ar-Rohmah_2.pnml"};

        double nilai9 = 1.005;
        String[] model9 = {"Kepegawaian_Ar-Rohmah_2.pnml dan", "Kepegawaian_Ar-Rohmah_2.pnml"};

        double nilai10 = 1.006;
        String[] model10 = {"Kesantrian_Al-Rifai.pnml dan", "Kesantrian_Al-Rifai.pnml"};

        double nilai11 = 0.260;
        String[] model11 = {"Kesantrian_Al-Rifai.pnml dan", "Kesantrian_Luhur.pnml"};

        double nilai12 = 1.007;
        String[] model12 = {"Kesantrian_Luhur.pnml dan", "Kesantrian_Luhur.pnml"};

        double nilai13 = 1.008;
        String[] model13 = {"PSB_Al-Rifai.pnml dan", "PSB_Al-Rifai.pnml"};

        double nilai14 = 0.270;
        String[] model14 = {"PSB_Al-Rifai.pnml dan", "PSB_Annur_1.pnml"};

        double nilai15 = 0.219;
        String[] model15 = {"PSB_Al-Rifai.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai16 = 0.220;
        String[] model16 = {"PSB_Al-Rifai.pnml dan", "PSB_Luhur.pnml"};

        double nilai17 = 0.397;
        String[] model17 = {"PSB_Al-Rifai.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai18 = 0.500;
        String[] model18 = {"PSB_Al-Rifai.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai19 = 1.009;
        String[] model19 = {"PSB_Annur_1.pnml dan", "PSB_Annur_1.pnml"};

        double nilai20 = 0.346;
        String[] model20 = {"PSB_Annur_1.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai21 = 0.255;
        String[] model21 = {"PSB_Annur_1.pnml dan", "PSB_Luhur.pnml"};

        double nilai22 = 0.327;
        String[] model22 = {"PSB_Annur_1.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai23 = 0.321;
        String[] model23 = {"PSB_Annur_1.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai24 = 1.010;
        String[] model24 = {"PSB_Anwarul_Huda.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai25 = 0.265;
        String[] model25 = {"PSB_Anwarul_Huda.pnml dan", "PSB_Luhur.pnml"};

        double nilai26 = 0.291;
        String[] model26 = {"PSB_Anwarul_Huda.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai27 = 0.236;
        String[] model27 = {"PSB_Anwarul_Huda.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai28 = 1.011;
        String[] model28 = {"PSB_Luhur.pnml dan", "PSB_Luhur.pnml"};

        double nilai29 = 0.250;
        String[] model29 = {"PSB_Luhur.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai30 = 0.265;
        String[] model30 = {"PSB_Luhur.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai31 = 1.012;
        String[] model31 = {"PSB_SMP_Islam_Babulrohmah.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai32 = 0.449;
        String[] model32 = {"PSB_SMP_Islam_Babulrohmah.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai33 = 1.013;
        String[] model33 = {"PSB_SMPN_13_Malang.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai34 = 1.014;
        String[] model34 = {"Sarpras_Al-Rifai.pnml dan", "Sarpras_Al-Rifai.pnml"};

        double nilai35 = 0.364;
        String[] model35 = {"Sarpras_Al-Rifai.pnml dan", "Sarpras_Anwarul_Huda.pnml"};

        double nilai36 = 0.349;
        String[] model36 = {"Sarpras_Al-Rifai.pnml dan", "Sarpras_Luhur.pnml"};

        double nilai37 = 1.015;
        String[] model37 = {"Sarpras_Anwarul_Huda.pnml dan", "Sarpras_Anwarul_Huda.pnml"};

        double nilai38 = 0.324;
        String[] model38 = {"Sarpras_Anwarul_Huda.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        double nilai39 = 1.016;
        String[] model39 = {"Sarpras_Sarpras_Luhur.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        double nilai40 = 0.173;
        String[] model40 = {"Akademik_Al-Rifai.pnml dan", "Kepegawaian_Anwarul_Huda.pnml"};

        double nilai41 = 0.373;
        String[] model41 = {"Akademik_Al-Rifai.pnml dan", "Kepegawaian_Ar-Rohmah_2.pnml"};

        double nilai42 = 0.228;
        String[] model42 = {"Akademik_Al-Rifai.pnml dan", "Kesantrian_Al-Rifai.pnml"};

        double nilai43 = 0.377;
        String[] model43 = {"Akademik_Al-Rifai.pnml dan", "Kesantrian_Luhur.pnml"};

        double nilai44 = 0.273;
        String[] model44 = {"Akademik_Al-Rifai.pnml dan", "PSB_Al-Rifai.pnml"};

        double nilai45 = 0.617;
        String[] model45 = {"Akademik_Al-Rifai.pnml dan", "PSB_Annur_1.pnml"};

        double nilai46 = 0.345;
        String[] model46 = {"Akademik_Al-Rifai.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai47 = 0.236;
        String[] model47 = {"Sarpras_Sarpras_Luhur.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        double nilai48 = 0.305;
        String[] model48 = {"Akademik_Al-Rifai.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai49 = 0.276;
        String[] model49 = {"Akademik_Al-Rifai.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai50 = 0.353;
        String[] model50 = {"Akademik_Al-Rifai.pnml dan", "Sarpras_Al-Rifai.pnml"};

        double nilai51 = 0.217;
        String[] model51 = {"Akademik_Al-Rifai.pnml dan", "Sarpras_Anwarul_Huda.pnml"};

        double nilai52 = 0.380;
        String[] model52 = {"Akademik_Al-Rifai.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};
        
        double nilai53 = 0.1599;
        String[] model53 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Kesantrian_Al-Rifai.pnml"};

        double nilai54 = 0.1749;
        String[] model54 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Kesantrian_Luhur.pnml"};

        double nilai55 = 0.2759;
        String[] model55 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_Al-Rifai.pnml"};

        double nilai56 = 0.1639;
        String[] model56 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_Annur_1.pnml"};

        double nilai57 = 0.1969;
        String[] model57 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai58 = 0.2569;
        String[] model58 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        double nilai59 = 0.2089;
        String[] model59 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai60 = 0.2229;
        String[] model60 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai61 = 0.16391;
        String[] model61 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Sarpras_Al-Rifai.pnml"};

        double nilai62 = 0.1569;
        String[] model62 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Sarpras_Anwarul_Huda.pnml"};

        double nilai63 = 0.1909;
        String[] model63 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        new Metric_PB().inputClusterStruk(nilai1, model1);
        new Metric_PB().inputClusterStruk(nilai2, model2);
        new Metric_PB().inputClusterStruk(nilai3, model3);
        new Metric_PB().inputClusterStruk(nilai4, model4);
        new Metric_PB().inputClusterStruk(nilai5, model5);
        new Metric_PB().inputClusterStruk(nilai6, model6);
        new Metric_PB().inputClusterStruk(nilai7, model7);
        new Metric_PB().inputClusterStruk(nilai8, model8);
        new Metric_PB().inputClusterStruk(nilai9, model9);
        new Metric_PB().inputClusterStruk(nilai10, model10);
        new Metric_PB().inputClusterStruk(nilai11, model11);
        new Metric_PB().inputClusterStruk(nilai12, model12);
        new Metric_PB().inputClusterStruk(nilai13, model13);
        new Metric_PB().inputClusterStruk(nilai14, model14);
        new Metric_PB().inputClusterStruk(nilai15, model15);
        new Metric_PB().inputClusterStruk(nilai16, model16);
        new Metric_PB().inputClusterStruk(nilai17, model17);
        new Metric_PB().inputClusterStruk(nilai18, model18);
        new Metric_PB().inputClusterStruk(nilai19, model19);
        new Metric_PB().inputClusterStruk(nilai20, model20);
        new Metric_PB().inputClusterStruk(nilai21, model21);
        new Metric_PB().inputClusterStruk(nilai22, model22);
        new Metric_PB().inputClusterStruk(nilai23, model23);
        new Metric_PB().inputClusterStruk(nilai24, model24);
        new Metric_PB().inputClusterStruk(nilai25, model25);
        new Metric_PB().inputClusterStruk(nilai26, model26);
        new Metric_PB().inputClusterStruk(nilai27, model27);
        new Metric_PB().inputClusterStruk(nilai28, model28);
        new Metric_PB().inputClusterStruk(nilai29, model29);
        new Metric_PB().inputClusterStruk(nilai30, model30);
        new Metric_PB().inputClusterStruk(nilai31, model31);
        new Metric_PB().inputClusterStruk(nilai32, model32);
        new Metric_PB().inputClusterStruk(nilai33, model33);
        new Metric_PB().inputClusterStruk(nilai34, model34);
        new Metric_PB().inputClusterStruk(nilai35, model35);
        new Metric_PB().inputClusterStruk(nilai36, model36);
        new Metric_PB().inputClusterStruk(nilai37, model37);
        new Metric_PB().inputClusterStruk(nilai38, model38);
        new Metric_PB().inputClusterStruk(nilai39, model39);
        new Metric_PB().inputClusterStruk(nilai40, model40);
        new Metric_PB().inputClusterStruk(nilai41, model41);
        new Metric_PB().inputClusterStruk(nilai42, model42);
        new Metric_PB().inputClusterStruk(nilai43, model43);
        new Metric_PB().inputClusterStruk(nilai44, model44);
        new Metric_PB().inputClusterStruk(nilai45, model45);
        new Metric_PB().inputClusterStruk(nilai46, model46);
        new Metric_PB().inputClusterStruk(nilai47, model47);
        new Metric_PB().inputClusterStruk(nilai48, model48);
        new Metric_PB().inputClusterStruk(nilai49, model49);
        new Metric_PB().inputClusterStruk(nilai50, model50);
        new Metric_PB().inputClusterStruk(nilai51, model51);
        new Metric_PB().inputClusterStruk(nilai52, model52);
        new Metric_PB().inputClusterStruk(nilai53, model53);
        new Metric_PB().inputClusterStruk(nilai54, model54);
        new Metric_PB().inputClusterStruk(nilai55, model55);
        new Metric_PB().inputClusterStruk(nilai56, model56);
        new Metric_PB().inputClusterStruk(nilai57, model57);
        new Metric_PB().inputClusterStruk(nilai58, model58);
        new Metric_PB().inputClusterStruk(nilai59, model59);
        new Metric_PB().inputClusterStruk(nilai60, model60);
        new Metric_PB().inputClusterStruk(nilai61, model61);
        new Metric_PB().inputClusterStruk(nilai62, model62);
        new Metric_PB().inputClusterStruk(nilai63, model63);
    }

    public void isiKlusterBhv() {
        double nilai1 = 1.001;
        String[] model1 = {"Akademik_Al-Rifai.pnml  dan ", "Akademik_Al-Rifai.pnml"};

        double nilai2 = 0.125;
        String[] model2 = {"Akademik_Al-Rifai.pnml dan ", "Akademik_Anwarul_Huda.pnml"};

        double nilai3 = 0.214;
        String[] model3 = {"Akademik_Al-Rifai.pnml dan ", "Akademik_Ar-Rohmah_2.pnml"};

        double nilai4 = 1.002;
        String[] model4 = {"Akademik_Anwarul_Huda.pnml dan", "Akademik_Anwarul_Huda.pnml"};

        double nilai5 = 0.062;
        String[] model5 = {"Akademik_Anwarul_Huda.pnml dan", "Akademik_Ar-Rohmah_2.pnml"};

        double nilai6 = 1.003;
        String[] model6 = {"Akademik_Ar-Rohmah_2.pnml dan", "Akademik_Ar-Rohmah_2.pnml"};

        double nilai7 = 1.004;
        String[] model7 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Kepegawaian_Anwarul_Huda.pnml"};

        double nilai8 = 0.091;
        String[] model8 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Kepegawaian_Ar-Rohmah_2.pnml"};

        double nilai9 = 1.005;
        String[] model9 = {"Kepegawaian_Ar-Rohmah_2.pnml dan", "Kepegawaian_Ar-Rohmah_2.pnml"};

        double nilai10 = 1.006;
        String[] model10 = {"Kesantrian_Al-Rifai.pnml dan", "Kesantrian_Al-Rifai.pnml"};

        double nilai11 = 0.071;
        String[] model11 = {"Kesantrian_Al-Rifai.pnml dan", "Kesantrian_Luhur.pnml"};

        double nilai12 = 1.007;
        String[] model12 = {"Kesantrian_Luhur.pnml dan", "Kesantrian_Luhur.pnml"};

        double nilai13 = 1.008;
        String[] model13 = {"PSB_Al-Rifai.pnml dan", "PSB_Al-Rifai.pnml"};

        double nilai14 = 0.286;
        String[] model14 = {"PSB_Al-Rifai.pnml dan", "PSB_Annur_1.pnml"};

        double nilai15 = 0.1251;
        String[] model15 = {"PSB_Al-Rifai.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai16 = 0.143;
        String[] model16 = {"PSB_Al-Rifai.pnml dan", "PSB_Luhur.pnml"};

        double nilai17 = 0.2861;
        String[] model17 = {"PSB_Al-Rifai.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai18 = 0.286;
        String[] model18 = {"PSB_Al-Rifai.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai19 = 1.009;
        String[] model19 = {"PSB_Annur_1.pnml dan", "PSB_Annur_1.pnml"};

        double nilai20 = 0.1431;
        String[] model20 = {"PSB_Annur_1.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai21 = 0.167;
        String[] model21 = {"PSB_Annur_1.pnml dan", "PSB_Luhur.pnml"};

        double nilai22 = 0.333;
        String[] model22 = {"PSB_Annur_1.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai23 = 0.1432;
        String[] model23 = {"PSB_Annur_1.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai24 = 1.010;
        String[] model24 = {"PSB_Anwarul_Huda.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai25 = 0.273;
        String[] model25 = {"PSB_Anwarul_Huda.pnml dan", "PSB_Luhur.pnml"};

        double nilai26 = 0.1433;
        String[] model26 = {"PSB_Anwarul_Huda.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai27 = 0.231;
        String[] model27 = {"PSB_Anwarul_Huda.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai28 = 1.011;
        String[] model28 = {"PSB_Luhur.pnml dan", "PSB_Luhur.pnml"};

        double nilai29 = 0.1671;
        String[] model29 = {"PSB_Luhur.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai30 = 0.1672;
        String[] model30 = {"PSB_Luhur.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai31 = 1.012;
        String[] model31 = {"PSB_SMP_Islam_Babulrohmah.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai32 = 0.3331;
        String[] model32 = {"PSB_SMP_Islam_Babulrohmah.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai33 = 1.013;
        String[] model33 = {"PSB_SMPN_13_Malang.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai34 = 1.014;
        String[] model34 = {"Sarpras_Al-Rifai.pnml dan", "Sarpras_Al-Rifai.pnml"};

        double nilai35 = 0.111;
        String[] model35 = {"Sarpras_Al-Rifai.pnml dan", "Sarpras_Anwarul_Huda.pnml"};

        double nilai36 = 0.0911;
        String[] model36 = {"Sarpras_Al-Rifai.pnml dan", "Sarpras_Luhur.pnml"};

        double nilai37 = 1.015;
        String[] model37 = {"Sarpras_Anwarul_Huda.pnml dan", "Sarpras_Anwarul_Huda.pnml"};

        double nilai38 = 0.1111;
        String[] model38 = {"Sarpras_Anwarul_Huda.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        double nilai39 = 1.016;
        String[] model39 = {"Sarpras_Sarpras_Luhur.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        double nilai40 = 0.000;
        String[] model40 = {"Akademik_Al-Rifai.pnml dan", "Kepegawaian_Anwarul_Huda.pnml"};

        double nilai41 = 0.062;
        String[] model41 = {"Akademik_Al-Rifai.pnml dan", "Kepegawaian_Ar-Rohmah_2.pnml"};

        double nilai42 = 0.14310;
        String[] model42 = {"Akademik_Al-Rifai.pnml dan", "Kesantrian_Al-Rifai.pnml"};

        double nilai43 = 0.06210;
        String[] model43 = {"Akademik_Al-Rifai.pnml dan", "Kesantrian_Luhur.pnml"};

        double nilai44 = 0.056;
        String[] model44 = {"Akademik_Al-Rifai.pnml dan", "PSB_Al-Rifai.pnml"};

        double nilai45 = 0.21410;
        String[] model45 = {"Akademik_Al-Rifai.pnml dan", "PSB_Annur_1.pnml"};

        double nilai46 = 0.06211;
        String[] model46 = {"Akademik_Al-Rifai.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai47 = 0.07110;
        String[] model47 = {"Sarpras_Sarpras_Luhur.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        double nilai48 = 0.06212;
        String[] model48 = {"Akademik_Al-Rifai.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai49 = 0.06213;
        String[] model49 = {"Akademik_Al-Rifai.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai50 = 0.001;
        String[] model50 = {"Akademik_Al-Rifai.pnml dan", "Sarpras_Al-Rifai.pnml"};

        double nilai51 = 0.002;
        String[] model51 = {"Akademik_Al-Rifai.pnml dan", "Sarpras_Anwarul_Huda.pnml"};

        double nilai52 = 0.07111;
        String[] model52 = {"Akademik_Al-Rifai.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};
        
        double nilai53 = 0.0091;
        String[] model53 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Kesantrian_Al-Rifai.pnml"};

        double nilai54 = 0.0092;
        String[] model54 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Kesantrian_Luhur.pnml"};

        double nilai55 = 0.0093;
        String[] model55 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_Al-Rifai.pnml"};

        double nilai56 = 0.0094;
        String[] model56 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_Annur_1.pnml"};

        double nilai57 = 0.0095;
        String[] model57 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai58 = 0.0919;
        String[] model58 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        double nilai59 = 0.0096;
        String[] model59 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai60 = 0.0097;
        String[] model60 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai61 = 0.0098;
        String[] model61 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Sarpras_Al-Rifai.pnml"};

        double nilai62 = 0.0099;
        String[] model62 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Sarpras_Anwarul_Huda.pnml"};

        double nilai63 = 0.00100;
        String[] model63 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        new Metric_PB().inputClusterBhv(nilai1, model1);
        new Metric_PB().inputClusterBhv(nilai2, model2);
        new Metric_PB().inputClusterBhv(nilai3, model3);
        new Metric_PB().inputClusterBhv(nilai4, model4);
        new Metric_PB().inputClusterBhv(nilai5, model5);
        new Metric_PB().inputClusterBhv(nilai6, model6);
        new Metric_PB().inputClusterBhv(nilai7, model7);
        new Metric_PB().inputClusterBhv(nilai8, model8);
        new Metric_PB().inputClusterBhv(nilai9, model9);
        new Metric_PB().inputClusterBhv(nilai10, model10);
        new Metric_PB().inputClusterBhv(nilai11, model11);
        new Metric_PB().inputClusterBhv(nilai12, model12);
        new Metric_PB().inputClusterBhv(nilai13, model13);
        new Metric_PB().inputClusterBhv(nilai14, model14);
        new Metric_PB().inputClusterBhv(nilai15, model15);
        new Metric_PB().inputClusterBhv(nilai16, model16);
        new Metric_PB().inputClusterBhv(nilai17, model17);
        new Metric_PB().inputClusterBhv(nilai18, model18);
        new Metric_PB().inputClusterBhv(nilai19, model19);
        new Metric_PB().inputClusterBhv(nilai20, model20);
        new Metric_PB().inputClusterBhv(nilai21, model21);
        new Metric_PB().inputClusterBhv(nilai22, model22);
        new Metric_PB().inputClusterBhv(nilai23, model23);
        new Metric_PB().inputClusterBhv(nilai24, model24);
        new Metric_PB().inputClusterBhv(nilai25, model25);
        new Metric_PB().inputClusterBhv(nilai26, model26);
        new Metric_PB().inputClusterBhv(nilai27, model27);
        new Metric_PB().inputClusterBhv(nilai28, model28);
        new Metric_PB().inputClusterBhv(nilai29, model29);
        new Metric_PB().inputClusterBhv(nilai30, model30);
        new Metric_PB().inputClusterBhv(nilai31, model31);
        new Metric_PB().inputClusterBhv(nilai32, model32);
        new Metric_PB().inputClusterBhv(nilai33, model33);
        new Metric_PB().inputClusterBhv(nilai34, model34);
        new Metric_PB().inputClusterBhv(nilai35, model35);
        new Metric_PB().inputClusterBhv(nilai36, model36);
        new Metric_PB().inputClusterBhv(nilai37, model37);
        new Metric_PB().inputClusterBhv(nilai38, model38);
        new Metric_PB().inputClusterBhv(nilai39, model39);
        new Metric_PB().inputClusterBhv(nilai40, model40);
        new Metric_PB().inputClusterBhv(nilai41, model41);
        new Metric_PB().inputClusterBhv(nilai42, model42);
        new Metric_PB().inputClusterBhv(nilai43, model43);
        new Metric_PB().inputClusterBhv(nilai44, model44);
        new Metric_PB().inputClusterBhv(nilai45, model45);
        new Metric_PB().inputClusterBhv(nilai46, model46);
        new Metric_PB().inputClusterBhv(nilai47, model47);
        new Metric_PB().inputClusterBhv(nilai48, model48);
        new Metric_PB().inputClusterBhv(nilai49, model49);
        new Metric_PB().inputClusterBhv(nilai50, model50);
        new Metric_PB().inputClusterBhv(nilai51, model51);
        new Metric_PB().inputClusterBhv(nilai52, model52);
        new Metric_PB().inputClusterBhv(nilai53, model53);
        new Metric_PB().inputClusterBhv(nilai54, model54);
        new Metric_PB().inputClusterBhv(nilai55, model55);
        new Metric_PB().inputClusterBhv(nilai56, model56);
        new Metric_PB().inputClusterBhv(nilai57, model57);
        new Metric_PB().inputClusterBhv(nilai58, model58);
        new Metric_PB().inputClusterBhv(nilai59, model59);
        new Metric_PB().inputClusterBhv(nilai60, model60);
        new Metric_PB().inputClusterBhv(nilai61, model61);
        new Metric_PB().inputClusterBhv(nilai62, model62);
        new Metric_PB().inputClusterBhv(nilai63, model63);

    }

    public void isiKlusterSmt() {
        double nilai1 = 1.001;
        String[] model1 = {"Akademik_Al-Rifai.pnml  dan ", "Akademik_Al-Rifai.pnml"};

        double nilai2 = 0.817;
        String[] model2 = {"Akademik_Al-Rifai.pnml dan ", "Akademik_Anwarul_Huda.pnml"};

        double nilai3 = 0.893;
        String[] model3 = {"Akademik_Al-Rifai.pnml dan ", "Akademik_Ar-Rohmah_2.pnml"};

        double nilai4 = 1.002;
        String[] model4 = {"Akademik_Anwarul_Huda.pnml dan", "Akademik_Anwarul_Huda.pnml"};

        double nilai5 = 0.8171;
        String[] model5 = {"Akademik_Anwarul_Huda.pnml dan", "Akademik_Ar-Rohmah_2.pnml"};

        double nilai6 = 1.003;
        String[] model6 = {"Akademik_Ar-Rohmah_2.pnml dan", "Akademik_Ar-Rohmah_2.pnml"};

        double nilai7 = 1.004;
        String[] model7 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Kepegawaian_Anwarul_Huda.pnml"};

        double nilai8 = 0.736;
        String[] model8 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Kepegawaian_Ar-Rohmah_2.pnml"};

        double nilai9 = 1.005;
        String[] model9 = {"Kepegawaian_Ar-Rohmah_2.pnml dan", "Kepegawaian_Ar-Rohmah_2.pnml"};

        double nilai10 = 1.006;
        String[] model10 = {"Kesantrian_Al-Rifai.pnml dan", "Kesantrian_Al-Rifai.pnml"};

        double nilai11 = 0.787;
        String[] model11 = {"Kesantrian_Al-Rifai.pnml dan", "Kesantrian_Luhur.pnml"};

        double nilai12 = 1.007;
        String[] model12 = {"Kesantrian_Luhur.pnml dan", "Kesantrian_Luhur.pnml"};

        double nilai13 = 1.008;
        String[] model13 = {"PSB_Al-Rifai.pnml dan", "PSB_Al-Rifai.pnml"};

        double nilai14 = 0.724;
        String[] model14 = {"PSB_Al-Rifai.pnml dan", "PSB_Annur_1.pnml"};

        double nilai15 = 0.668;
        String[] model15 = {"PSB_Al-Rifai.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai16 = 0.648;
        String[] model16 = {"PSB_Al-Rifai.pnml dan", "PSB_Luhur.pnml"};

        double nilai17 = 0.8173;
        String[] model17 = {"PSB_Al-Rifai.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai18 = 0.851;
        String[] model18 = {"PSB_Al-Rifai.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai19 = 1.009;
        String[] model19 = {"PSB_Annur_1.pnml dan", "PSB_Annur_1.pnml"};

        double nilai20 = 0.819;
        String[] model20 = {"PSB_Annur_1.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai21 = 0.875;
        String[] model21 = {"PSB_Annur_1.pnml dan", "PSB_Luhur.pnml"};

        double nilai22 = 0.930;
        String[] model22 = {"PSB_Annur_1.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai23 = 0.792;
        String[] model23 = {"PSB_Annur_1.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai24 = 1.010;
        String[] model24 = {"PSB_Anwarul_Huda.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai25 = 0.845;
        String[] model25 = {"PSB_Anwarul_Huda.pnml dan", "PSB_Luhur.pnml"};

        double nilai26 = 0.865;
        String[] model26 = {"PSB_Anwarul_Huda.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai27 = 0.835;
        String[] model27 = {"PSB_Anwarul_Huda.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai28 = 1.011;
        String[] model28 = {"PSB_Luhur.pnml dan", "PSB_Luhur.pnml"};

        double nilai29 = 0.930;
        String[] model29 = {"PSB_Luhur.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai30 = 0.930;
        String[] model30 = {"PSB_Luhur.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai31 = 1.012;
        String[] model31 = {"PSB_SMP_Islam_Babulrohmah.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai32 = 0.867;
        String[] model32 = {"PSB_SMP_Islam_Babulrohmah.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai33 = 1.013;
        String[] model33 = {"PSB_SMPN_13_Malang.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai34 = 1.014;
        String[] model34 = {"Sarpras_Al-Rifai.pnml dan", "Sarpras_Al-Rifai.pnml"};

        double nilai35 = 0.842;
        String[] model35 = {"Sarpras_Al-Rifai.pnml dan", "Sarpras_Anwarul_Huda.pnml"};

        double nilai36 = 0.8174;
        String[] model36 = {"Sarpras_Al-Rifai.pnml dan", "Sarpras_Luhur.pnml"};

        double nilai37 = 1.015;
        String[] model37 = {"Sarpras_Anwarul_Huda.pnml dan", "Sarpras_Anwarul_Huda.pnml"};

        double nilai38 = 0.956;
        String[] model38 = {"Sarpras_Anwarul_Huda.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        double nilai39 = 1.016;
        String[] model39 = {"Sarpras_Sarpras_Luhur.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        double nilai40 = 0.392;
        String[] model40 = {"Akademik_Al-Rifai.pnml dan", "Kepegawaian_Anwarul_Huda.pnml"};

        double nilai41 = 0.459;
        String[] model41 = {"Akademik_Al-Rifai.pnml dan", "Kepegawaian_Ar-Rohmah_2.pnml"};

        double nilai42 = 0.444;
        String[] model42 = {"Akademik_Al-Rifai.pnml dan", "Kesantrian_Al-Rifai.pnml"};

        double nilai43 = 0.466;
        String[] model43 = {"Akademik_Al-Rifai.pnml dan", "Kesantrian_Luhur.pnml"};

        double nilai44 = 0.474;
        String[] model44 = {"Akademik_Al-Rifai.pnml dan", "PSB_Al-Rifai.pnml"};

        double nilai45 = 0.400;
        String[] model45 = {"Akademik_Al-Rifai.pnml dan", "PSB_Annur_1.pnml"};

        double nilai46 = 0.425;
        String[] model46 = {"Akademik_Al-Rifai.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai47 = 0.428;
        String[] model47 = {"Sarpras_Sarpras_Luhur.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        double nilai48 = 0.433;
        String[] model48 = {"Akademik_Al-Rifai.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai49 = 0.426;
        String[] model49 = {"Akademik_Al-Rifai.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai50 = 0.434;
        String[] model50 = {"Akademik_Al-Rifai.pnml dan", "Sarpras_Al-Rifai.pnml"};

        double nilai51 = 0.42610;
        String[] model51 = {"Akademik_Al-Rifai.pnml dan", "Sarpras_Anwarul_Huda.pnml"};

        double nilai52 = 0.437;
        String[] model52 = {"Akademik_Al-Rifai.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        double nilai53 = 0.4429;
        String[] model53 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Kesantrian_Al-Rifai.pnml"};

        double nilai54 = 0.4129;
        String[] model54 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Kesantrian_Luhur.pnml"};

        double nilai55 = 0.3649;
        String[] model55 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_Al-Rifai.pnml"};

        double nilai56 = 0.3739;
        String[] model56 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_Annur_1.pnml"};

        double nilai57 = 0.3999;
        String[] model57 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_Anwarul_Huda.pnml"};

        double nilai58 = 0.3969;
        String[] model58 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        double nilai59 = 0.3889;
        String[] model59 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_SMP_Islam_Babulrohmah.pnml"};

        double nilai60 = 0.3929;
        String[] model60 = {"Kepegawaian_Anwarul_Huda.pnml dan", "PSB_SMPN_13_Malang.pnml"};

        double nilai61 = 0.4239;
        String[] model61 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Sarpras_Al-Rifai.pnml"};

        double nilai62 = 0.4469;
        String[] model62 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Sarpras_Anwarul_Huda.pnml"};

        double nilai63 = 0.4449;
        String[] model63 = {"Kepegawaian_Anwarul_Huda.pnml dan", "Sarpras_Sarpras_Luhur.pnml"};

        new Metric_PB().inputClusterSmt(nilai1, model1);
        new Metric_PB().inputClusterSmt(nilai2, model2);
        new Metric_PB().inputClusterSmt(nilai3, model3);
        new Metric_PB().inputClusterSmt(nilai4, model4);
        new Metric_PB().inputClusterSmt(nilai5, model5);
        new Metric_PB().inputClusterSmt(nilai6, model6);
        new Metric_PB().inputClusterSmt(nilai7, model7);
        new Metric_PB().inputClusterSmt(nilai8, model8);
        new Metric_PB().inputClusterSmt(nilai9, model9);
        new Metric_PB().inputClusterSmt(nilai10, model10);
        new Metric_PB().inputClusterSmt(nilai11, model11);
        new Metric_PB().inputClusterSmt(nilai12, model12);
        new Metric_PB().inputClusterSmt(nilai13, model13);
        new Metric_PB().inputClusterSmt(nilai14, model14);
        new Metric_PB().inputClusterSmt(nilai15, model15);
        new Metric_PB().inputClusterSmt(nilai16, model16);
        new Metric_PB().inputClusterSmt(nilai17, model17);
        new Metric_PB().inputClusterSmt(nilai18, model18);
        new Metric_PB().inputClusterSmt(nilai19, model19);
        new Metric_PB().inputClusterSmt(nilai20, model20);
        new Metric_PB().inputClusterSmt(nilai21, model21);
        new Metric_PB().inputClusterSmt(nilai22, model22);
        new Metric_PB().inputClusterSmt(nilai23, model23);
        new Metric_PB().inputClusterSmt(nilai24, model24);
        new Metric_PB().inputClusterSmt(nilai25, model25);
        new Metric_PB().inputClusterSmt(nilai26, model26);
        new Metric_PB().inputClusterSmt(nilai27, model27);
        new Metric_PB().inputClusterSmt(nilai28, model28);
        new Metric_PB().inputClusterSmt(nilai29, model29);
        new Metric_PB().inputClusterSmt(nilai30, model30);
        new Metric_PB().inputClusterSmt(nilai31, model31);
        new Metric_PB().inputClusterSmt(nilai32, model32);
        new Metric_PB().inputClusterSmt(nilai33, model33);
        new Metric_PB().inputClusterSmt(nilai34, model34);
        new Metric_PB().inputClusterSmt(nilai35, model35);
        new Metric_PB().inputClusterSmt(nilai36, model36);
        new Metric_PB().inputClusterSmt(nilai37, model37);
        new Metric_PB().inputClusterSmt(nilai38, model38);
        new Metric_PB().inputClusterSmt(nilai39, model39);
        new Metric_PB().inputClusterSmt(nilai40, model40);
        new Metric_PB().inputClusterSmt(nilai41, model41);
        new Metric_PB().inputClusterSmt(nilai42, model42);
        new Metric_PB().inputClusterSmt(nilai43, model43);
        new Metric_PB().inputClusterSmt(nilai44, model44);
        new Metric_PB().inputClusterSmt(nilai45, model45);
        new Metric_PB().inputClusterSmt(nilai46, model46);
        new Metric_PB().inputClusterSmt(nilai47, model47);
        new Metric_PB().inputClusterSmt(nilai48, model48);
        new Metric_PB().inputClusterSmt(nilai49, model49);
        new Metric_PB().inputClusterSmt(nilai50, model50);
        new Metric_PB().inputClusterSmt(nilai51, model51);
        new Metric_PB().inputClusterSmt(nilai52, model52);
        new Metric_PB().inputClusterSmt(nilai53, model53);
        new Metric_PB().inputClusterSmt(nilai54, model54);
        new Metric_PB().inputClusterSmt(nilai55, model55);
        new Metric_PB().inputClusterSmt(nilai56, model56);
        new Metric_PB().inputClusterSmt(nilai57, model57);
        new Metric_PB().inputClusterSmt(nilai58, model58);
        new Metric_PB().inputClusterSmt(nilai59, model59);
        new Metric_PB().inputClusterSmt(nilai60, model60);
        new Metric_PB().inputClusterSmt(nilai61, model61);
        new Metric_PB().inputClusterSmt(nilai62, model62);
        new Metric_PB().inputClusterSmt(nilai63, model63);

    }

}
