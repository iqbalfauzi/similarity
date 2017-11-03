/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this temp1ate file, choose Tools | Temp1ates
 * and open the temp1ate in the editor.
 */
package Oprek;

import Oprek.createXML;
import Oprek.createXML_Strk;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Arif
 */
public class AplikasiTATI extends javax.swing.JFrame {

    public String nam1;
    public String nam2;
    public String nil1;
    public String nil2;
    public String elem1;
    public String elem2;
    public String elem3;
    public String elem4;
    public String elem5;
    public String elem6;

    public String modelname1;
    public String modelname2;

    ResultSet rs = null;

    public int jumpetri1 = 0;
    public int jumpetri2 = 0;
    public int jumlah = 0;
    public int jumlahplc = 0;
    public int jumpetris1;
    public int jumpetris2;
    public int jumpeplace1;
    public int jumpeplace2;
    double[] temp = new double[10];

    DecimalFormat decimalFormat = new DecimalFormat("#0.000");
    DecimalFormat decimalFormatlagi = new DecimalFormat("#0.");
    public static int Irisan;
    public static int IrisanBhv;
    public static int Min;
    String Nama1;
    String Nama2;
    String NamaModel1;
    String NamaModel2;
    File filenya;
    String file;

    String modelSama1[];
    String modelSama2[];
    ArrayList<String[]> ListStrukCommonBhv;
    ArrayList<String[]> ListStrukCommonStruk;
    ArrayList<String[]> StrukCommonFragment1 = new ArrayList<>();
    ArrayList<String[]> StrukCommonFragment2 = new ArrayList<>();
    static Clustering clustering = new Clustering();
    static Clusteringfix clusteringfix = new Clusteringfix();
    static Clustering_Kopi clusteringkopi = new Clustering_Kopi();
    static Klastering klustering = new Klastering();
    static Klastering_Kopi klusteringkopi = new Klastering_Kopi();
    JFileChooser chooser = new JFileChooser(".");
    double jccrd;
    double dc;
    double cs;
    double ov;
    double modelPnml;
    //======Untuk Semantik Transisi===============//
    double leveintrans;
    double leveinplace;
    double jaccardstruk;
    double jaccardbhv;
    double dicestruk;
    double dicedbhv;
    double cosinestruk;
    double cosinebhv;
    double ovstruk;
    double ovbhv;
    double konstantaakad;
    double konstantakepeg;
    double konstantakesan;
    double konstantapsb;
    double konstantasarpras;
    double hasilclusteravg;
    double hasilclustekonstanta;
    double[] temporari1 = new double[100];
    double[] temporari2 = new double[100];
    double[] temporari3 = new double[100];
    double[] temporari4 = new double[100];
    double[] temporari5 = new double[100];
    double[] temporari6 = new double[100];
    double[] temporari7 = new double[100];
    double[] temporari8 = new double[100];
    double[] temporari9 = new double[100];
    double[] temporari10 = new double[100];
    double min1 = 1000.0;
    double max1 = 0.0;
    double min2 = 1000.0;
    double max2 = 0.0;
    double min3 = 1000.0;
    double max3 = 0.0;
    double min4 = 1000.0;
    double max4 = 0.0;
    double min5 = 1000.0;
    double max5 = 0.0;
    double min6 = 1000.0;
    double max6 = 0.0;
    double min7 = 1000.0;
    double max7 = 0.0;
    double min8 = 1000.0;
    double max8 = 0.0;
    double min9 = 1000.0;
    double max9 = 0.0;
    double min10 = 1000.0;
    double max10 = 0.0;
    double[] tampungmax = new double[10];
    double[] tampungmaxplace = new double[14];

    //======Untuk Semantik Place===============//
    double leveinhasil;

    double[] temporari1plc = new double[100];
    double[] temporari2plc = new double[100];
    double[] temporari3plc = new double[100];
    double[] temporari4plc = new double[100];
    double[] temporari5plc = new double[100];
    double[] temporari6plc = new double[100];
    double[] temporari7plc = new double[100];
    double[] temporari8plc = new double[100];
    double[] temporari9plc = new double[100];
    double[] temporari10plc = new double[100];
    double[] temporari11plc = new double[100];
    double[] temporari12plc = new double[100];
    double[] temporari13plc = new double[100];
    double[] temporari14plc = new double[100];

    double min1plc = 1000.0;
    double max1plc = 0.0;
    double min2plc = 1000.0;
    double max2plc = 0.0;
    double min3plc = 1000.0;
    double max3plc = 0.0;
    double min4plc = 1000.0;
    double max4plc = 0.0;
    double min5plc = 1000.0;
    double max5plc = 0.0;
    double min6plc = 1000.0;
    double max6plc = 0.0;
    double min7plc = 1000.0;
    double max7plc = 0.0;
    double min8plc = 1000.0;
    double max8plc = 0.0;
    double min9plc = 1000.0;
    double max9plc = 0.0;
    double min10plc = 1000.0;
    double max10plc = 0.0;
    double min11plc = 1000.0;
    double max11plc = 0.0;
    double min12plc = 1000.0;
    double max12plc = 0.0;
    double min13plc = 1000.0;
    double max13plc = 0.0;
    double min14plc = 1000.0;
    double max14plc = 0.0;

    /**
     * Creates new form CobaDesain
     */
    public AplikasiTATI() {

        initComponents();
        tampilcombo();
        setResizable(false); // insert this line

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel12 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        AreaPN1A = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        AreaPN1B = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        AreaPN2B = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        AreaPN2A = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        namamodel1 = new javax.swing.JLabel();
        namamodel2 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        AreaIrisanStruk = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        AreaIrisanBhv = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        AreaIrisanStruk_Smt = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        HasilHitungJC1 = new javax.swing.JTextField();
        HasilHitungDice1 = new javax.swing.JTextField();
        HasilHitungCS1 = new javax.swing.JTextField();
        HasilHitungOV1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        HasilHitungJC2 = new javax.swing.JTextField();
        HasilHitungDice2 = new javax.swing.JTextField();
        HasilHitungCS2 = new javax.swing.JTextField();
        HasilHitungOV2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        AreaSem1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        AreaSem2 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        cocok1a = new javax.swing.JTextField();
        cocok2a = new javax.swing.JTextField();
        cocok3a = new javax.swing.JTextField();
        cocok4a = new javax.swing.JTextField();
        cocok5a = new javax.swing.JTextField();
        cocok6a = new javax.swing.JTextField();
        cocok7a = new javax.swing.JTextField();
        cocok8a = new javax.swing.JTextField();
        cocok9a = new javax.swing.JTextField();
        cocok10a = new javax.swing.JTextField();
        cocok1b = new javax.swing.JTextField();
        cocok2b = new javax.swing.JTextField();
        cocok3b = new javax.swing.JTextField();
        cocok4b = new javax.swing.JTextField();
        cocok5b = new javax.swing.JTextField();
        cocok6b = new javax.swing.JTextField();
        cocok7b = new javax.swing.JTextField();
        cocok8b = new javax.swing.JTextField();
        cocok9b = new javax.swing.JTextField();
        cocok10b = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cokplace1a = new javax.swing.JTextField();
        cokplace2a = new javax.swing.JTextField();
        cokplace10a = new javax.swing.JTextField();
        cokplace9a = new javax.swing.JTextField();
        cokplace8a = new javax.swing.JTextField();
        cokplace7a = new javax.swing.JTextField();
        cokplace3a = new javax.swing.JTextField();
        cokplace5a = new javax.swing.JTextField();
        cokplace6a = new javax.swing.JTextField();
        cokplace4a = new javax.swing.JTextField();
        cokplace14a = new javax.swing.JTextField();
        cokplace11a = new javax.swing.JTextField();
        cokplace12a = new javax.swing.JTextField();
        cokplace13a = new javax.swing.JTextField();
        cokplace1b = new javax.swing.JTextField();
        cokplace2b = new javax.swing.JTextField();
        cokplace3b = new javax.swing.JTextField();
        cokplace4b = new javax.swing.JTextField();
        cokplace5b = new javax.swing.JTextField();
        cokplace6b = new javax.swing.JTextField();
        cokplace7b = new javax.swing.JTextField();
        cokplace8b = new javax.swing.JTextField();
        cokplace9b = new javax.swing.JTextField();
        cokplace10b = new javax.swing.JTextField();
        cokplace11b = new javax.swing.JTextField();
        cokplace12b = new javax.swing.JTextField();
        cokplace13b = new javax.swing.JTextField();
        cokplace14b = new javax.swing.JTextField();
        resultall = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        cck1a = new javax.swing.JTextField();
        cck2a = new javax.swing.JTextField();
        cck3a = new javax.swing.JTextField();
        cck4a = new javax.swing.JTextField();
        cck5a = new javax.swing.JTextField();
        cck6a = new javax.swing.JTextField();
        cck7a = new javax.swing.JTextField();
        cck8a = new javax.swing.JTextField();
        cck9a = new javax.swing.JTextField();
        cck10a = new javax.swing.JTextField();
        cckb10 = new javax.swing.JTextField();
        cckb1 = new javax.swing.JTextField();
        cckb2 = new javax.swing.JTextField();
        cckb3 = new javax.swing.JTextField();
        cckb4 = new javax.swing.JTextField();
        cckb5 = new javax.swing.JTextField();
        cckb6 = new javax.swing.JTextField();
        cckb7 = new javax.swing.JTextField();
        cckb8 = new javax.swing.JTextField();
        cckb9 = new javax.swing.JTextField();
        compare11 = new javax.swing.JTextField();
        compare12 = new javax.swing.JTextField();
        compare13 = new javax.swing.JTextField();
        compare14 = new javax.swing.JTextField();
        compare15 = new javax.swing.JTextField();
        compare16 = new javax.swing.JTextField();
        compare17 = new javax.swing.JTextField();
        compare18 = new javax.swing.JTextField();
        compare19 = new javax.swing.JTextField();
        compare110 = new javax.swing.JTextField();
        compare21 = new javax.swing.JTextField();
        compare29 = new javax.swing.JTextField();
        compare28 = new javax.swing.JTextField();
        compare24 = new javax.swing.JTextField();
        compare26 = new javax.swing.JTextField();
        compare25 = new javax.swing.JTextField();
        compare210 = new javax.swing.JTextField();
        compare22 = new javax.swing.JTextField();
        compare23 = new javax.swing.JTextField();
        compare27 = new javax.swing.JTextField();
        compare310 = new javax.swing.JTextField();
        compare35 = new javax.swing.JTextField();
        compare37 = new javax.swing.JTextField();
        compare32 = new javax.swing.JTextField();
        compare34 = new javax.swing.JTextField();
        compare33 = new javax.swing.JTextField();
        compare38 = new javax.swing.JTextField();
        compare36 = new javax.swing.JTextField();
        compare39 = new javax.swing.JTextField();
        compare31 = new javax.swing.JTextField();
        compare41 = new javax.swing.JTextField();
        compare45 = new javax.swing.JTextField();
        compare43 = new javax.swing.JTextField();
        compare47 = new javax.swing.JTextField();
        compare48 = new javax.swing.JTextField();
        compare46 = new javax.swing.JTextField();
        compare49 = new javax.swing.JTextField();
        compare410 = new javax.swing.JTextField();
        compare44 = new javax.swing.JTextField();
        compare42 = new javax.swing.JTextField();
        compare57 = new javax.swing.JTextField();
        compare510 = new javax.swing.JTextField();
        compare55 = new javax.swing.JTextField();
        compare52 = new javax.swing.JTextField();
        compare53 = new javax.swing.JTextField();
        compare56 = new javax.swing.JTextField();
        compare59 = new javax.swing.JTextField();
        compare54 = new javax.swing.JTextField();
        compare58 = new javax.swing.JTextField();
        compare51 = new javax.swing.JTextField();
        compare67 = new javax.swing.JTextField();
        compare66 = new javax.swing.JTextField();
        compare69 = new javax.swing.JTextField();
        compare63 = new javax.swing.JTextField();
        compare61 = new javax.swing.JTextField();
        compare62 = new javax.swing.JTextField();
        compare610 = new javax.swing.JTextField();
        compare68 = new javax.swing.JTextField();
        compare64 = new javax.swing.JTextField();
        compare65 = new javax.swing.JTextField();
        compare73 = new javax.swing.JTextField();
        compare710 = new javax.swing.JTextField();
        compare71 = new javax.swing.JTextField();
        compare77 = new javax.swing.JTextField();
        compare72 = new javax.swing.JTextField();
        compare78 = new javax.swing.JTextField();
        compare75 = new javax.swing.JTextField();
        compare79 = new javax.swing.JTextField();
        compare76 = new javax.swing.JTextField();
        compare74 = new javax.swing.JTextField();
        compare83 = new javax.swing.JTextField();
        compare85 = new javax.swing.JTextField();
        compare810 = new javax.swing.JTextField();
        compare88 = new javax.swing.JTextField();
        compare89 = new javax.swing.JTextField();
        compare84 = new javax.swing.JTextField();
        compare81 = new javax.swing.JTextField();
        compare82 = new javax.swing.JTextField();
        compare87 = new javax.swing.JTextField();
        compare86 = new javax.swing.JTextField();
        compare910 = new javax.swing.JTextField();
        compare97 = new javax.swing.JTextField();
        compare95 = new javax.swing.JTextField();
        compare93 = new javax.swing.JTextField();
        compare99 = new javax.swing.JTextField();
        compare92 = new javax.swing.JTextField();
        compare96 = new javax.swing.JTextField();
        compare98 = new javax.swing.JTextField();
        compare91 = new javax.swing.JTextField();
        compare94 = new javax.swing.JTextField();
        compare108 = new javax.swing.JTextField();
        compare109 = new javax.swing.JTextField();
        compare105 = new javax.swing.JTextField();
        compare103 = new javax.swing.JTextField();
        compare104 = new javax.swing.JTextField();
        compare1010 = new javax.swing.JTextField();
        compare107 = new javax.swing.JTextField();
        compare102 = new javax.swing.JTextField();
        compare106 = new javax.swing.JTextField();
        compare101 = new javax.swing.JTextField();
        rank1 = new javax.swing.JTextField();
        rank2 = new javax.swing.JTextField();
        rank3 = new javax.swing.JTextField();
        rank4 = new javax.swing.JTextField();
        rank5 = new javax.swing.JTextField();
        rank6 = new javax.swing.JTextField();
        rank7 = new javax.swing.JTextField();
        rank8 = new javax.swing.JTextField();
        rank9 = new javax.swing.JTextField();
        rank10 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        AreaMatrikStrk = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        AreaMatrikBhv = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        AreaMatrikSmt = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        areacluster = new javax.swing.JTextArea();
        threshfield = new javax.swing.JTextField();
        threshbutton = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        generatepnmlbutton = new javax.swing.JButton();
        jScrollPane23 = new javax.swing.JScrollPane();
        areacommon = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<String>();
        tptcmncluster = new javax.swing.JTextField();
        jScrollPane24 = new javax.swing.JScrollPane();
        clusterfix = new javax.swing.JTextArea();
        TempatPNMLStrk = new javax.swing.JTextField();
        buatcommon = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        TF_Path = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        struk = new javax.swing.JTextField();
        smt = new javax.swing.JTextField();
        jml = new javax.swing.JTextField();
        bhv = new javax.swing.JTextField();
        hasiljml = new javax.swing.JTextField();
        get = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Reset = new javax.swing.JButton();
        LoadArea1 = new javax.swing.JTextField();
        LoadArea2 = new javax.swing.JTextField();
        Proses = new javax.swing.JButton();
        Load1 = new javax.swing.JButton();
        Load2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel12.setLayout(null);

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", 0, 0, null, new java.awt.Color(102, 255, 102))));
        jPanel14.setLayout(null);

        AreaPN1A.setEditable(false);
        AreaPN1A.setColumns(20);
        AreaPN1A.setRows(5);
        jScrollPane7.setViewportView(AreaPN1A);

        jPanel14.add(jScrollPane7);
        jScrollPane7.setBounds(20, 70, 130, 230);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("STRUCTURAL");
        jPanel14.add(jLabel9);
        jLabel9.setBounds(40, 50, 81, 18);

        AreaPN1B.setEditable(false);
        AreaPN1B.setColumns(20);
        AreaPN1B.setRows(5);
        jScrollPane8.setViewportView(AreaPN1B);

        jPanel14.add(jScrollPane8);
        jScrollPane8.setBounds(160, 70, 130, 230);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setText("TARS");
        jPanel14.add(jLabel10);
        jLabel10.setBounds(210, 50, 32, 18);

        AreaPN2B.setEditable(false);
        AreaPN2B.setColumns(20);
        AreaPN2B.setRows(5);
        jScrollPane9.setViewportView(AreaPN2B);

        jPanel14.add(jScrollPane9);
        jScrollPane9.setBounds(470, 70, 130, 230);

        AreaPN2A.setEditable(false);
        AreaPN2A.setColumns(20);
        AreaPN2A.setRows(5);
        jScrollPane13.setViewportView(AreaPN2A);

        jPanel14.add(jScrollPane13);
        jScrollPane13.setBounds(330, 70, 130, 230);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel15.setText("MODEL 1");
        jPanel14.add(jLabel15);
        jLabel15.setBounds(60, 20, 55, 18);

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel25.setText("STRUCTURAL");
        jPanel14.add(jLabel25);
        jLabel25.setBounds(350, 50, 81, 18);

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel26.setText("TARS");
        jPanel14.add(jLabel26);
        jLabel26.setBounds(520, 50, 32, 18);

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel27.setText("MODEL 2");
        jPanel14.add(jLabel27);
        jLabel27.setBounds(360, 20, 55, 18);

        namamodel1.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        namamodel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namamodel1.setText("-");
        jPanel14.add(namamodel1);
        namamodel1.setBounds(140, 20, 150, 15);

        namamodel2.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        namamodel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namamodel2.setText("-");
        jPanel14.add(namamodel2);
        namamodel2.setBounds(440, 20, 150, 15);

        jTabbedPane2.addTab("PARSING", jPanel14);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", 0, 0, null, new java.awt.Color(102, 255, 102)));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("STRUC - INTERSECTION");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("TARS - INTERSECTION");

        AreaIrisanStruk.setEditable(false);
        AreaIrisanStruk.setColumns(20);
        AreaIrisanStruk.setRows(5);
        jScrollPane14.setViewportView(AreaIrisanStruk);

        AreaIrisanBhv.setEditable(false);
        AreaIrisanBhv.setColumns(20);
        AreaIrisanBhv.setRows(5);
        jScrollPane15.setViewportView(AreaIrisanBhv);

        AreaIrisanStruk_Smt.setEditable(false);
        AreaIrisanStruk_Smt.setColumns(20);
        AreaIrisanStruk_Smt.setRows(5);
        jScrollPane5.setViewportView(AreaIrisanStruk_Smt);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jScrollPane14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPane2.addTab("INTERSECTION", jPanel15);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", 0, 0, null, new java.awt.Color(102, 255, 102)));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel16.setText("JACCARD COEFF");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel17.setText("DICE COEFF");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel18.setText("COSINE COEFF");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel19.setText("OVERLAP COEFF");

        HasilHitungJC1.setEditable(false);

        HasilHitungDice1.setEditable(false);

        HasilHitungCS1.setEditable(false);

        HasilHitungOV1.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("STRUCTURAL SIMILARITY");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("BEHAVIOUR SIMILARITY");

        HasilHitungJC2.setEditable(false);

        HasilHitungDice2.setEditable(false);

        HasilHitungCS2.setEditable(false);

        HasilHitungOV2.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HasilHitungDice1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HasilHitungJC1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HasilHitungCS1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HasilHitungOV1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HasilHitungOV2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HasilHitungJC2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(HasilHitungCS2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HasilHitungDice2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel17)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel18)
                            .addGap(37, 37, 37))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(HasilHitungJC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(HasilHitungDice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(HasilHitungCS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(HasilHitungOV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(HasilHitungJC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HasilHitungDice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HasilHitungCS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(HasilHitungOV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("SIM - VALUE", jPanel2);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        AreaSem1.setEditable(false);
        AreaSem1.setColumns(20);
        AreaSem1.setRows(5);
        jScrollPane19.setViewportView(AreaSem1);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setText("MODEL 1");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("MODEL 2");

        AreaSem2.setEditable(false);
        AreaSem2.setColumns(20);
        AreaSem2.setRows(5);
        jScrollPane20.setViewportView(AreaSem2);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("SEMANTIC - COMPARE", jPanel4);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cocok1a.setEditable(false);
        cocok1a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok2a.setEditable(false);
        cocok2a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok3a.setEditable(false);
        cocok3a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok4a.setEditable(false);
        cocok4a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok5a.setEditable(false);
        cocok5a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cocok5a.setFocusable(false);

        cocok6a.setEditable(false);
        cocok6a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok7a.setEditable(false);
        cocok7a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok8a.setEditable(false);
        cocok8a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok9a.setEditable(false);
        cocok9a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok10a.setEditable(false);
        cocok10a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok1b.setEditable(false);
        cocok1b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok2b.setEditable(false);
        cocok2b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok3b.setEditable(false);
        cocok3b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok4b.setEditable(false);
        cocok4b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok5b.setEditable(false);
        cocok5b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok6b.setEditable(false);
        cocok6b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok7b.setEditable(false);
        cocok7b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok8b.setEditable(false);
        cocok8b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok9b.setEditable(false);
        cocok9b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cocok10b.setEditable(false);
        cocok10b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel21.setText("RESULT");

        cokplace1a.setEditable(false);
        cokplace1a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace2a.setEditable(false);
        cokplace2a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace10a.setEditable(false);
        cokplace10a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace9a.setEditable(false);
        cokplace9a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace8a.setEditable(false);
        cokplace8a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace7a.setEditable(false);
        cokplace7a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace3a.setEditable(false);
        cokplace3a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace5a.setEditable(false);
        cokplace5a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace6a.setEditable(false);
        cokplace6a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace4a.setEditable(false);
        cokplace4a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace14a.setEditable(false);
        cokplace14a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace11a.setEditable(false);
        cokplace11a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace12a.setEditable(false);
        cokplace12a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace13a.setEditable(false);
        cokplace13a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace1b.setEditable(false);
        cokplace1b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace2b.setEditable(false);
        cokplace2b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace3b.setEditable(false);
        cokplace3b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace4b.setEditable(false);
        cokplace4b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace5b.setEditable(false);
        cokplace5b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace6b.setEditable(false);
        cokplace6b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace7b.setEditable(false);
        cokplace7b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace8b.setEditable(false);
        cokplace8b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace9b.setEditable(false);
        cokplace9b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace10b.setEditable(false);
        cokplace10b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace11b.setEditable(false);
        cokplace11b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace12b.setEditable(false);
        cokplace12b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace13b.setEditable(false);
        cokplace13b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cokplace14b.setEditable(false);
        cokplace14b.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        resultall.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(cocok1a, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cokplace1a, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(cokplace11a, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(cocok2a, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cokplace2a, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(cokplace12a, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(cocok3a, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cokplace3a, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(cokplace13a, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cocok10a, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cocok9a, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cocok8a, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cocok7a, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cocok6a, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cocok4a, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cocok5a, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cokplace9a, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace8a, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace7a, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace6a, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace5a, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace4a, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace10a, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addComponent(cokplace14a, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cocok10b, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cocok3b, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cocok4b, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cocok5b, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cocok6b, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cocok7b, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cocok8b, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cocok9b, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cocok1b, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cocok2b, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cokplace5b, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace6b, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cokplace1b, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cokplace4b, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cokplace2b, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cokplace3b, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cokplace11b, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cokplace12b, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cokplace13b, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cokplace14b, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(24, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cokplace7b, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace8b, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace9b, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace10b, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(resultall, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 217, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cocok1a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cokplace1a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cokplace11a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cokplace1b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cokplace11b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cocok2a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace2a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace12a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cocok3a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace3a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace13a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cocok4a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace4a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace14a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cokplace3b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokplace13b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cokplace5a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cocok5a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cocok6a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cokplace6a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cocok7a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cokplace7a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cocok8a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cokplace8a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cocok9a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cokplace9a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cocok10a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cokplace10a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cocok1b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cocok2b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cokplace2b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cokplace12b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(cocok3b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cocok4b, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cokplace4b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cokplace14b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addComponent(cocok5b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cocok6b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cocok7b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cokplace7b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cocok8b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cokplace8b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cocok9b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cokplace9b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cocok10b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cokplace10b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(cokplace5b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cokplace6b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(resultall, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("SEMANTIC - SIM - VALUE", jPanel5);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cck1a.setEditable(false);
        cck1a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cck1a.setAutoscrolls(false);

        cck2a.setEditable(false);
        cck2a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cck2a.setAutoscrolls(false);

        cck3a.setEditable(false);
        cck3a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cck3a.setAutoscrolls(false);

        cck4a.setEditable(false);
        cck4a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cck4a.setAutoscrolls(false);

        cck5a.setEditable(false);
        cck5a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cck5a.setAutoscrolls(false);
        cck5a.setFocusable(false);

        cck6a.setEditable(false);
        cck6a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cck6a.setAutoscrolls(false);

        cck7a.setEditable(false);
        cck7a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cck7a.setAutoscrolls(false);

        cck8a.setEditable(false);
        cck8a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cck8a.setAutoscrolls(false);

        cck9a.setEditable(false);
        cck9a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cck9a.setAutoscrolls(false);

        cck10a.setEditable(false);
        cck10a.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cck10a.setAutoscrolls(false);

        cckb10.setEditable(false);
        cckb10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cckb10.setAutoscrolls(false);

        cckb1.setEditable(false);
        cckb1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cckb1.setAutoscrolls(false);

        cckb2.setEditable(false);
        cckb2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cckb2.setAutoscrolls(false);

        cckb3.setEditable(false);
        cckb3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cckb3.setAutoscrolls(false);

        cckb4.setEditable(false);
        cckb4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cckb4.setAutoscrolls(false);

        cckb5.setEditable(false);
        cckb5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cckb5.setAutoscrolls(false);
        cckb5.setFocusable(false);

        cckb6.setEditable(false);
        cckb6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cckb6.setAutoscrolls(false);

        cckb7.setEditable(false);
        cckb7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cckb7.setAutoscrolls(false);

        cckb8.setEditable(false);
        cckb8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cckb8.setAutoscrolls(false);

        cckb9.setEditable(false);
        cckb9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cckb9.setAutoscrolls(false);

        compare11.setEditable(false);
        compare11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare12.setEditable(false);
        compare12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare13.setEditable(false);
        compare13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare14.setEditable(false);
        compare14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare15.setEditable(false);
        compare15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        compare15.setFocusable(false);

        compare16.setEditable(false);
        compare16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare17.setEditable(false);
        compare17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare18.setEditable(false);
        compare18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare19.setEditable(false);
        compare19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare110.setEditable(false);
        compare110.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare21.setEditable(false);
        compare21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare29.setEditable(false);
        compare29.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare28.setEditable(false);
        compare28.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare24.setEditable(false);
        compare24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare26.setEditable(false);
        compare26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare25.setEditable(false);
        compare25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        compare25.setFocusable(false);

        compare210.setEditable(false);
        compare210.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare22.setEditable(false);
        compare22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare23.setEditable(false);
        compare23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare27.setEditable(false);
        compare27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare310.setEditable(false);
        compare310.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare35.setEditable(false);
        compare35.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        compare35.setFocusable(false);

        compare37.setEditable(false);
        compare37.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare32.setEditable(false);
        compare32.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare34.setEditable(false);
        compare34.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare33.setEditable(false);
        compare33.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare38.setEditable(false);
        compare38.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare36.setEditable(false);
        compare36.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare39.setEditable(false);
        compare39.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare31.setEditable(false);
        compare31.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare41.setEditable(false);
        compare41.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare45.setEditable(false);
        compare45.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        compare45.setFocusable(false);

        compare43.setEditable(false);
        compare43.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare47.setEditable(false);
        compare47.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare48.setEditable(false);
        compare48.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare46.setEditable(false);
        compare46.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare49.setEditable(false);
        compare49.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare410.setEditable(false);
        compare410.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare44.setEditable(false);
        compare44.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare42.setEditable(false);
        compare42.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare57.setEditable(false);
        compare57.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare510.setEditable(false);
        compare510.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare55.setEditable(false);
        compare55.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        compare55.setFocusable(false);

        compare52.setEditable(false);
        compare52.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare53.setEditable(false);
        compare53.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare56.setEditable(false);
        compare56.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare59.setEditable(false);
        compare59.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare54.setEditable(false);
        compare54.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare58.setEditable(false);
        compare58.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare51.setEditable(false);
        compare51.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare67.setEditable(false);
        compare67.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare66.setEditable(false);
        compare66.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare69.setEditable(false);
        compare69.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare63.setEditable(false);
        compare63.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare61.setEditable(false);
        compare61.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare62.setEditable(false);
        compare62.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare610.setEditable(false);
        compare610.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare68.setEditable(false);
        compare68.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare64.setEditable(false);
        compare64.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare65.setEditable(false);
        compare65.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        compare65.setFocusable(false);

        compare73.setEditable(false);
        compare73.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare710.setEditable(false);
        compare710.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare71.setEditable(false);
        compare71.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare77.setEditable(false);
        compare77.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare72.setEditable(false);
        compare72.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare78.setEditable(false);
        compare78.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare75.setEditable(false);
        compare75.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        compare75.setFocusable(false);

        compare79.setEditable(false);
        compare79.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare76.setEditable(false);
        compare76.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare74.setEditable(false);
        compare74.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare83.setEditable(false);
        compare83.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare85.setEditable(false);
        compare85.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        compare85.setFocusable(false);

        compare810.setEditable(false);
        compare810.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare88.setEditable(false);
        compare88.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare89.setEditable(false);
        compare89.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare84.setEditable(false);
        compare84.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare81.setEditable(false);
        compare81.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare82.setEditable(false);
        compare82.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare87.setEditable(false);
        compare87.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare86.setEditable(false);
        compare86.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare910.setEditable(false);
        compare910.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare97.setEditable(false);
        compare97.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare95.setEditable(false);
        compare95.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        compare95.setFocusable(false);

        compare93.setEditable(false);
        compare93.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare99.setEditable(false);
        compare99.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare92.setEditable(false);
        compare92.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare96.setEditable(false);
        compare96.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare98.setEditable(false);
        compare98.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare91.setEditable(false);
        compare91.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare94.setEditable(false);
        compare94.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare108.setEditable(false);
        compare108.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare109.setEditable(false);
        compare109.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare105.setEditable(false);
        compare105.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        compare105.setFocusable(false);

        compare103.setEditable(false);
        compare103.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare104.setEditable(false);
        compare104.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare1010.setEditable(false);
        compare1010.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare107.setEditable(false);
        compare107.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare102.setEditable(false);
        compare102.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare106.setEditable(false);
        compare106.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        compare101.setEditable(false);
        compare101.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        rank1.setEditable(false);
        rank1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        rank2.setEditable(false);
        rank2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        rank3.setEditable(false);
        rank3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        rank4.setEditable(false);
        rank4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        rank5.setEditable(false);
        rank5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        rank6.setEditable(false);
        rank6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        rank7.setEditable(false);
        rank7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        rank8.setEditable(false);
        rank8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        rank9.setEditable(false);
        rank9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        rank10.setEditable(false);
        rank10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel22.setText("T-Rank");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(cckb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cckb2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cckb3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cckb4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cckb5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cckb6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cckb7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cckb8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cckb9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cckb10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(cck3a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(compare31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(compare34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare310, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cck5a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cck10a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cck9a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cck8a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cck7a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cck6a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cck4a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(compare41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(compare44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare410, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(compare51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(compare54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare510, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(compare61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(compare64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare610, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(compare71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(compare74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare710, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(compare81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(compare84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare810, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(compare91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare93, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(compare94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare95, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare99, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare910, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(compare101, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare102, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare103, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(compare104, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare105, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare106, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare107, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare108, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare109, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compare1010, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(cck1a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(compare11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(compare14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare110, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(cck2a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(compare21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(compare24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare210, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rank3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rank4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rank5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rank6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rank7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rank8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rank9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rank10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rank1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rank2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(23, 23, 23))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cckb1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cckb2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cckb3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cckb4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cckb5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cckb6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cckb7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cckb8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cckb9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cckb10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cck1a, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare110, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cck2a, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare210, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cck3a, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare310, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cck4a, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare410, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cck5a, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare56, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare58, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare59, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare510, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cck6a, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare61, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare62, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare63, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare64, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare65, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare66, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare67, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare68, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare69, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare610, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cck7a, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare71, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare72, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare73, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare74, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare75, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare76, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare77, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare78, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare79, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare710, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cck8a, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare81, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare82, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare83, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare84, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare85, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare86, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare87, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare88, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare89, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare810, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cck9a, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare91, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare92, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare93, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare94, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare95, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare96, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare97, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare98, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare99, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare910, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cck10a, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare101, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare102, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare103, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare104, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare105, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare106, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare107, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare108, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare109, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compare1010, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(rank1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rank2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rank3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rank4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rank5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rank6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rank7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rank8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rank9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rank10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("COMPARE MTR", jPanel9);

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", 0, 0, null, new java.awt.Color(102, 255, 102)));
        jPanel18.setLayout(null);

        AreaMatrikStrk.setEditable(false);
        AreaMatrikStrk.setColumns(20);
        AreaMatrikStrk.setRows(5);
        jScrollPane10.setViewportView(AreaMatrikStrk);

        jPanel18.add(jScrollPane10);
        jScrollPane10.setBounds(50, 50, 166, 250);

        AreaMatrikBhv.setEditable(false);
        AreaMatrikBhv.setColumns(20);
        AreaMatrikBhv.setRows(5);
        jScrollPane16.setViewportView(AreaMatrikBhv);

        jPanel18.add(jScrollPane16);
        jScrollPane16.setBounds(240, 50, 166, 250);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setText("STRUCTURAL");
        jPanel18.add(jLabel11);
        jLabel11.setBounds(90, 20, 81, 18);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setText("SEMANTIC");
        jPanel18.add(jLabel12);
        jLabel12.setBounds(480, 20, 70, 18);

        AreaMatrikSmt.setEditable(false);
        AreaMatrikSmt.setColumns(20);
        AreaMatrikSmt.setRows(5);
        jScrollPane22.setViewportView(AreaMatrikSmt);

        jPanel18.add(jScrollPane22);
        jScrollPane22.setBounds(430, 50, 166, 250);

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel29.setText("BEHAVIOURAL");
        jPanel18.add(jLabel29);
        jLabel29.setBounds(270, 20, 89, 18);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("METRIC MODEL COMPARE", jPanel17);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        areacluster.setEditable(false);
        areacluster.setColumns(20);
        areacluster.setRows(5);
        jScrollPane21.setViewportView(areacluster);

        threshfield.setEditable(false);

        threshbutton.setBackground(new java.awt.Color(102, 255, 255));
        threshbutton.setFont(new java.awt.Font("Alien League Italic", 0, 18)); // NOI18N
        threshbutton.setText("THRESHOLD");
        threshbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threshbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane21)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addComponent(threshfield, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(threshbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(threshfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threshbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("CLUSTERING", jPanel11);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        generatepnmlbutton.setBackground(new java.awt.Color(102, 255, 255));
        generatepnmlbutton.setFont(new java.awt.Font("Alien League Italic", 0, 18)); // NOI18N
        generatepnmlbutton.setText("GENERATE");
        generatepnmlbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatepnmlbuttonActionPerformed(evt);
            }
        });

        areacommon.setEditable(false);
        areacommon.setColumns(20);
        areacommon.setRows(5);
        jScrollPane23.setViewportView(areacommon);

        jComboBox2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Business Process --", "Akademik", "Kesantrian", "Penerimaan Siswa Baru", "Sarana Prasarana" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        clusterfix.setEditable(false);
        clusterfix.setColumns(20);
        clusterfix.setRows(5);
        jScrollPane24.setViewportView(clusterfix);

        TempatPNMLStrk.setEditable(false);

        buatcommon.setBackground(new java.awt.Color(102, 255, 255));
        buatcommon.setFont(new java.awt.Font("Alien League Italic", 0, 18)); // NOI18N
        buatcommon.setText("GENERATE PNML");
        buatcommon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buatcommonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(tptcmncluster, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(generatepnmlbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TempatPNMLStrk, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(98, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buatcommon, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generatepnmlbutton)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tptcmncluster, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(jScrollPane24))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TempatPNMLStrk, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buatcommon))
                .addGap(32, 32, 32))
        );

        jTabbedPane2.addTab("COMMON FRAGMENT", jPanel13);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Alien League Italic", 0, 18)); // NOI18N
        jButton1.setText("GET MORE CALCULATIONS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bhv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhvActionPerformed(evt);
            }
        });

        hasiljml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasiljmlActionPerformed(evt);
            }
        });

        get.setBackground(new java.awt.Color(102, 255, 255));
        get.setFont(new java.awt.Font("Alien League Italic", 0, 18)); // NOI18N
        get.setText("GET BASED DATABASE");
        get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(102, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Alien League Italic", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--CATEGORY BASED NO--" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel20.setText("RATA-RATA");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel23.setText("JACCARD BHV");

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel24.setText("SEMANTIC");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel28.setText("JACCARD STRUC");

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel30.setText("JUMLAH");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(get, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hasiljml, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jml, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(smt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bhv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(struk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(TF_Path, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(44, 44, 44))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(struk, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bhv, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(get)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel20))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(smt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jml, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hasiljml, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TF_Path, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("ADDICTION", jPanel3);

        jPanel12.add(jTabbedPane2);
        jTabbedPane2.setBounds(90, 200, 800, 330);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Reset.setBackground(new java.awt.Color(102, 255, 255));
        Reset.setFont(new java.awt.Font("Alien League Italic", 0, 18)); // NOI18N
        Reset.setText("RESET");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        LoadArea1.setEditable(false);
        LoadArea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadArea1ActionPerformed(evt);
            }
        });

        LoadArea2.setEditable(false);

        Proses.setBackground(new java.awt.Color(102, 255, 255));
        Proses.setFont(new java.awt.Font("Alien League Italic", 0, 18)); // NOI18N
        Proses.setText("PROCESS");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });

        Load1.setBackground(new java.awt.Color(102, 255, 255));
        Load1.setFont(new java.awt.Font("Alien League Italic", 0, 18)); // NOI18N
        Load1.setText("LOAD 1");
        Load1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load1ActionPerformed(evt);
            }
        });

        Load2.setBackground(new java.awt.Color(102, 255, 255));
        Load2.setFont(new java.awt.Font("Alien League Italic", 0, 18)); // NOI18N
        Load2.setText("LOAD 2");
        Load2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Load2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Load1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoadArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoadArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Proses)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoadArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Load1))
                        .addGap(18, 18, 18)
                        .addComponent(Proses))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoadArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Load2))))
                .addContainerGap())
        );

        jPanel12.add(jPanel1);
        jPanel1.setBounds(90, 80, 800, 99);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Alien League 3D", 0, 24)); // NOI18N
        jLabel1.setText("Bussiness Process Management - Similarity Application");
        jPanel12.add(jLabel1);
        jLabel1.setBounds(200, 30, 640, 28);

        jButton4.setBackground(new java.awt.Color(102, 255, 255));
        jButton4.setFont(new java.awt.Font("Alien League Italic", 0, 18)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton4);
        jButton4.setBounds(750, 550, 125, 25);

        jMenu1.setText("File");

        jMenuItem2.setText("Reset");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Option");

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(986, 649));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoadArea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadArea1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadArea1ActionPerformed

    private void Load1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load1ActionPerformed
        // TODO add your handling code here:
        int buka_dialog = chooser.showOpenDialog(AplikasiTATI.this);
        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            filenya = chooser.getSelectedFile();
            LoadArea1.setText(filenya.getPath());
            NamaModel1 = filenya.getPath();
            Nama1 = filenya.getName();
            if (namamodel1.getText().equals("-")) {
                namamodel1.setText(Nama1);
            }
        }
    }//GEN-LAST:event_Load1ActionPerformed

    private void Load2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load2ActionPerformed
        int buka_dialog = chooser.showOpenDialog(AplikasiTATI.this);
        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            filenya = chooser.getSelectedFile();
            LoadArea2.setText(filenya.getPath());
            NamaModel2 = filenya.getPath();
            Nama2 = filenya.getName();
            if (namamodel2.getText().equals("-")) {
                namamodel2.setText(Nama2);
            }
        }

    }//GEN-LAST:event_Load2ActionPerformed

    void simpan() {
        try {

            String sql = "insert into kemiripan (model_1, model_2, s_jaccard, s_dice, s_cosine, s_overlap, b_jaccard, b_dice, b_cosine, b_overlap, semantic) "
                    + "values ('" + namamodel1.getText() + "','" + namamodel2.getText() + "','" + HasilHitungJC1.getText() + "','" + HasilHitungDice1.getText() + "','" + HasilHitungCS1.getText() + "','" + HasilHitungOV1.getText() + "','" + HasilHitungJC2.getText() + "','" + HasilHitungDice2.getText() + "','" + HasilHitungCS2.getText() + "', '" + HasilHitungOV2.getText() + "','" + resultall.getText() + "');";

            PreparedStatement p = (PreparedStatement) new Conn().connect().prepareStatement(sql);
            p.executeUpdate();

            //JOptionPane.showMessageDialog(null, "Berhasil disimpan");
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, " data sudah ada");
            System.err.print(ex);
        }

    }

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        //simpan();
        struk.setText("");
        bhv.setText("");
        smt.setText("");
        jml.setText("");

        hasiljml.setText("");
        ParsingLagiPanjangStruk p1 = new ParsingLagiPanjangStruk();
        ParsingLagiPanjangBhv p2 = new ParsingLagiPanjangBhv();

        max1 = 0.0;
        max2 = 0.0;
        max3 = 0.0;
        max4 = 0.0;
        max5 = 0.0;
        max6 = 0.0;
        max7 = 0.0;
        max8 = 0.0;
        max9 = 0.0;
        max10 = 0.0;
        leveintrans = 0.0;

        max1plc = 0.0;
        max2plc = 0.0;
        max3plc = 0.0;
        max4plc = 0.0;
        max5plc = 0.0;
        max6plc = 0.0;
        max7plc = 0.0;
        max8plc = 0.0;
        max9plc = 0.0;
        max10plc = 0.0;
        max11plc = 0.0;
        max12plc = 0.0;
        max13plc = 0.0;
        max14plc = 0.0;
        leveinplace = 0.0;

        leveinhasil = 0.0;

        namamodel1.setText("-");
        namamodel2.setText("-");
        LoadArea1.setText(null);
        LoadArea2.setText(null);
        AreaPN1A.setText(null);
        AreaPN1B.setText(null);
        AreaPN2A.setText(null);
        AreaPN2B.setText(null);
        AreaSem1.setText(null);
        AreaSem2.setText(null);
        AreaIrisanStruk_Smt.setText("");
        AreaIrisanStruk.setText("");
        AreaIrisanBhv.setText("");
        HasilHitungJC1.setText("");
        HasilHitungDice1.setText("");
        HasilHitungCS1.setText("");
        HasilHitungOV1.setText("");
        HasilHitungJC2.setText("");
        HasilHitungDice2.setText("");
        HasilHitungCS2.setText("");
        HasilHitungOV2.setText("");

        //valueavgsmn.setText("");
        cocok1a.setText("");
        cocok2a.setText("");
        cocok3a.setText("");
        cocok4a.setText("");
        cocok5a.setText("");
        cocok6a.setText("");
        cocok7a.setText("");
        cocok8a.setText("");
        cocok9a.setText("");
        cocok10a.setText("");
        cocok1b.setText("");
        cocok2b.setText("");
        cocok3b.setText("");
        cocok4b.setText("");
        cocok5b.setText("");
        cocok6b.setText("");
        cocok7b.setText("");
        cocok8b.setText("");
        cocok9b.setText("");
        cocok10b.setText("");

        cck1a.setText("");
        cck2a.setText("");
        cck3a.setText("");
        cck4a.setText("");
        cck5a.setText("");
        cck6a.setText("");
        cck7a.setText("");
        cck8a.setText("");
        cck9a.setText("");
        cck10a.setText("");
        cckb1.setText("");
        cckb2.setText("");
        cckb3.setText("");
        cckb4.setText("");
        cckb5.setText("");
        cckb6.setText("");
        cckb7.setText("");
        cckb8.setText("");
        cckb9.setText("");
        cckb10.setText("");

//        valueavgplc.setText("");
        cokplace1a.setText("");
        cokplace2a.setText("");
        cokplace3a.setText("");
        cokplace4a.setText("");
        cokplace5a.setText("");
        cokplace6a.setText("");
        cokplace7a.setText("");
        cokplace8a.setText("");
        cokplace9a.setText("");
        cokplace10a.setText("");
        cokplace11a.setText("");
        cokplace12a.setText("");
        cokplace13a.setText("");
        cokplace14a.setText("");
        cokplace1b.setText("");
        cokplace2b.setText("");
        cokplace3b.setText("");
        cokplace4b.setText("");
        cokplace5b.setText("");
        cokplace6b.setText("");
        cokplace7b.setText("");
        cokplace8b.setText("");
        cokplace9b.setText("");
        cokplace10b.setText("");
        cokplace11b.setText("");
        cokplace12b.setText("");
        cokplace13b.setText("");
        cokplace14b.setText("");

        //===========================================//
        compare11.setText("");
        compare12.setText("");
        compare13.setText("");
        compare14.setText("");
        compare15.setText("");
        compare16.setText("");
        compare17.setText("");
        compare18.setText("");
        compare19.setText("");
        compare110.setText("");

        compare21.setText("");
        compare22.setText("");
        compare23.setText("");
        compare24.setText("");
        compare25.setText("");
        compare26.setText("");
        compare27.setText("");
        compare28.setText("");
        compare29.setText("");
        compare210.setText("");

        compare31.setText("");
        compare32.setText("");
        compare33.setText("");
        compare34.setText("");
        compare35.setText("");
        compare36.setText("");
        compare37.setText("");
        compare38.setText("");
        compare39.setText("");
        compare310.setText("");

        compare41.setText("");
        compare42.setText("");
        compare43.setText("");
        compare44.setText("");
        compare45.setText("");
        compare46.setText("");
        compare47.setText("");
        compare48.setText("");
        compare49.setText("");
        compare410.setText("");

        compare51.setText("");
        compare52.setText("");
        compare53.setText("");
        compare54.setText("");
        compare55.setText("");
        compare56.setText("");
        compare57.setText("");
        compare58.setText("");
        compare59.setText("");
        compare510.setText("");

        compare61.setText("");
        compare62.setText("");
        compare63.setText("");
        compare64.setText("");
        compare65.setText("");
        compare66.setText("");
        compare67.setText("");
        compare68.setText("");
        compare69.setText("");
        compare610.setText("");

        compare71.setText("");
        compare72.setText("");
        compare73.setText("");
        compare74.setText("");
        compare75.setText("");
        compare76.setText("");
        compare77.setText("");
        compare78.setText("");
        compare79.setText("");
        compare710.setText("");

        compare81.setText("");
        compare82.setText("");
        compare83.setText("");
        compare84.setText("");
        compare85.setText("");
        compare86.setText("");
        compare87.setText("");
        compare88.setText("");
        compare89.setText("");
        compare810.setText("");

        compare91.setText("");
        compare92.setText("");
        compare93.setText("");
        compare94.setText("");
        compare95.setText("");
        compare96.setText("");
        compare97.setText("");
        compare98.setText("");
        compare99.setText("");
        compare910.setText("");

        compare101.setText("");
        compare102.setText("");
        compare103.setText("");
        compare104.setText("");
        compare105.setText("");
        compare106.setText("");
        compare107.setText("");
        compare108.setText("");
        compare109.setText("");
        compare1010.setText("");

        rank1.setText("");
        rank2.setText("");
        rank3.setText("");
        rank4.setText("");
        rank5.setText("");
        rank6.setText("");
        rank7.setText("");
        rank8.setText("");
        rank9.setText("");
        rank10.setText("");

        resultall.setText("");

        NamaModel1 = null;
        NamaModel2 = null;

    }//GEN-LAST:event_ResetActionPerformed

    public void addModel1(double hasilSim1, String[] PNML1) {

        ArrayList<String[]> modelnya = new ArrayList<>();
        modelnya.add(PNML1);
        for (int i = 0; i < modelnya.size(); i++) {
            String[] modelPnml = modelnya.get(i);
            for (int j = 0; j < modelPnml.length; j++) {
                AreaMatrikStrk.append(modelPnml[j] + "  ");
            }
            AreaMatrikStrk.append("\n");

        }

    }

    public void addModel2(double hasilSim2, String[] PNML2) {

        ArrayList<String[]> modelnya = new ArrayList<>();
        modelnya.add(PNML2);
        for (int i = 0; i < modelnya.size(); i++) {
            String[] modelPnml = modelnya.get(i);
            for (int j = 0; j < modelPnml.length; j++) {
                AreaMatrikBhv.append(modelPnml[j] + "  ");
            }
            AreaMatrikBhv.append("\n");
        }
    }

    public void addModelSemantik(String[] PNML1) {

        ArrayList<String[]> modelnya = new ArrayList<>();
        modelnya.add(PNML1);
        for (int i = 0; i < modelnya.size(); i++) {
            String[] modelPnml = modelnya.get(i);
            for (int j = 0; j < modelPnml.length; j++) {
                AreaMatrikSmt.append(modelPnml[j] + "  ");
            }
            AreaMatrikSmt.append("\n");

        }

    }

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed

        gabunganparsing();

        double CS1 = Double.parseDouble(HasilHitungCS1.getText());
        double CS2 = Double.parseDouble(HasilHitungCS2.getText());
        double JC1 = Double.parseDouble(HasilHitungJC1.getText());
        double JC2 = Double.parseDouble(HasilHitungJC2.getText());
        double DC1 = Double.parseDouble(HasilHitungDice1.getText());
        double DC2 = Double.parseDouble(HasilHitungDice2.getText());
        double OV1 = Double.parseDouble(HasilHitungOV1.getText());
        double OV2 = Double.parseDouble(HasilHitungOV2.getText());
        double semantic = Double.parseDouble(resultall.getText());
        AplikasiTATI result = new AplikasiTATI();

        double penjumlahan = jaccardstruk + jaccardbhv + leveintrans;
        double hasilrata = result.resultrata(jaccardstruk, jaccardbhv, leveinhasil, 3.0);
        struk.setText(String.valueOf(decimalFormat.format(jaccardstruk)));
        bhv.setText(String.valueOf(decimalFormat.format(jaccardbhv)));
        smt.setText(String.valueOf(decimalFormat.format(leveinhasil)));
        jml.setText(String.valueOf(decimalFormat.format(penjumlahan)));
        hasiljml.setText(String.valueOf(decimalFormat.format(hasilrata)));


    }//GEN-LAST:event_ProsesActionPerformed
    void gabunganparsing() {

        ParsingSmtStruk jdm = new ParsingSmtStruk();
        NamaModel1 = LoadArea1.getText();
        NamaModel2 = LoadArea2.getText();

//        try {
//            String sql = "SELECT  * FROM datapb WHERE  `no` =1";;
//            PreparedStatement p = (PreparedStatement) new Conn().connect().prepareStatement(sql);
//            rs = p.executeQuery(sql);
//            if (rs.next()) {
//                namamodel1.setText(rs.getString(2));
//                namamodel2.setText(rs.getString(3));
//
//            }
//
//        } catch (Exception e) {
//
//        }

        jdm.Parsing1(NamaModel1);
        jdm.Parsing2(NamaModel2);
        jumpetris1 = 0;
        jumpetris2 = 0;
        jumpeplace1 = 0;
        jumpeplace2 = 0;

        for (int i = 0; i < jdm.transisi1.length; i++) {
            if (jdm.transisi1[i] != null) {
                System.out.println(jdm.transisi1[i]);
                jumpetris1++;
                AreaSem1.append(jdm.transisi1[i] + "\n");
            }
        }
        cocok1a.setText(jdm.transisi1[0]);
        cck1a.setText(jdm.transisi1[0]);
        cocok2a.setText(jdm.transisi1[1]);
        cck2a.setText(jdm.transisi1[1]);
        cocok3a.setText(jdm.transisi1[2]);
        cck3a.setText(jdm.transisi1[2]);
        cocok4a.setText(jdm.transisi1[3]);
        cck4a.setText(jdm.transisi1[3]);
        cocok5a.setText(jdm.transisi1[4]);
        cck5a.setText(jdm.transisi1[4]);
        cocok6a.setText(jdm.transisi1[5]);
        cck6a.setText(jdm.transisi1[5]);
        cocok7a.setText(jdm.transisi1[6]);
        cck7a.setText(jdm.transisi1[6]);
        cocok8a.setText(jdm.transisi1[7]);
        cck8a.setText(jdm.transisi1[7]);
        cocok9a.setText(jdm.transisi1[8]);
        cck9a.setText(jdm.transisi1[8]);
        cocok10a.setText(jdm.transisi1[9]);
        cck10a.setText(jdm.transisi1[9]);

        for (int i = 0; i < jdm.transisi2.length; i++) {
            if (jdm.transisi2[i] != null) {
                System.out.println(jdm.transisi2[i]);
                jumpetris2++;
                AreaSem2.append(jdm.transisi2[i] + "\n");
            }
        }
        cocok1b.setText(jdm.transisi2[0]);
        cckb1.setText(jdm.transisi2[0]);
        cocok2b.setText(jdm.transisi2[1]);
        cckb2.setText(jdm.transisi2[1]);
        cocok3b.setText(jdm.transisi2[2]);
        cckb3.setText(jdm.transisi2[2]);
        cocok4b.setText(jdm.transisi2[3]);
        cckb4.setText(jdm.transisi2[3]);
        cocok5b.setText(jdm.transisi2[4]);
        cckb5.setText(jdm.transisi2[4]);
        cocok6b.setText(jdm.transisi2[5]);
        cckb6.setText(jdm.transisi2[5]);
        cocok7b.setText(jdm.transisi2[6]);
        cckb7.setText(jdm.transisi2[6]);
        cocok8b.setText(jdm.transisi2[7]);
        cckb8.setText(jdm.transisi2[7]);
        cocok9b.setText(jdm.transisi2[8]);
        cckb9.setText(jdm.transisi2[8]);
        cocok10b.setText(jdm.transisi2[9]);
        cckb10.setText(jdm.transisi2[9]);

        //======================Place=======================================//
//        for (int i = 0; i < jdm.placesss1.length; i++) {
//            if (jdm.placesss1[i] != null) {
//                System.out.println(jdm.placesss1[i]);
//                jumpeplace1++;
//                AreaSem1.append(jdm.placesss1[i] + "\n");
//            }
//        }
        cokplace1a.setText(jdm.placesss1[0]);
        cokplace2a.setText(jdm.placesss1[1]);
        cokplace3a.setText(jdm.placesss1[2]);
        cokplace4a.setText(jdm.placesss1[3]);
        cokplace5a.setText(jdm.placesss1[4]);
        cokplace6a.setText(jdm.placesss1[5]);
        cokplace7a.setText(jdm.placesss1[6]);
        cokplace8a.setText(jdm.placesss1[7]);
        cokplace9a.setText(jdm.placesss1[8]);
        cokplace10a.setText(jdm.placesss1[9]);
        cokplace11a.setText(jdm.placesss1[10]);
        cokplace12a.setText(jdm.placesss1[11]);
        cokplace13a.setText(jdm.placesss1[12]);
        cokplace14a.setText(jdm.placesss1[13]);

//        for (int i = 0; i < jdm.placesss2.length; i++) {
//            if (jdm.placesss2[i] != null) {
//                System.out.println(jdm.placesss2[i]);
//                jumpeplace2++;
//                AreaSem2.append(jdm.placesss2[i] + "\n");
//            }
//        }
        cokplace1b.setText(jdm.placesss2[0]);
        cokplace2b.setText(jdm.placesss2[1]);
        cokplace3b.setText(jdm.placesss2[2]);
        cokplace4b.setText(jdm.placesss2[3]);
        cokplace5b.setText(jdm.placesss2[4]);
        cokplace6b.setText(jdm.placesss2[5]);
        cokplace7b.setText(jdm.placesss2[6]);
        cokplace8b.setText(jdm.placesss2[7]);
        cokplace9b.setText(jdm.placesss2[8]);
        cokplace10b.setText(jdm.placesss2[9]);
        cokplace11b.setText(jdm.placesss2[10]);
        cokplace12b.setText(jdm.placesss2[11]);
        cokplace13b.setText(jdm.placesss2[12]);
        cokplace14b.setText(jdm.placesss2[13]);

        String[] tampungirisanstrksmt = new String[20];

        for (String tampil : jdm.intersect(jdm.transisi1, jdm.transisi2)) {
            if (tampil != null) {
                if (tampungirisanstrksmt[0] == null) {
                    tampungirisanstrksmt[0] = tampil;
                } else if (tampungirisanstrksmt[1] == null) {
                    tampungirisanstrksmt[1] = tampil;
                } else if (tampungirisanstrksmt[2] == null) {
                    tampungirisanstrksmt[2] = tampil;
                } else if (tampungirisanstrksmt[3] == null) {
                    tampungirisanstrksmt[3] = tampil;
                } else if (tampungirisanstrksmt[4] == null) {
                    tampungirisanstrksmt[4] = tampil;
                } else if (tampungirisanstrksmt[5] == null) {
                    tampungirisanstrksmt[5] = tampil;
                } else if (tampungirisanstrksmt[6] == null) {
                    tampungirisanstrksmt[6] = tampil;
                } else if (tampungirisanstrksmt[7] == null) {
                    tampungirisanstrksmt[7] = tampil;
                } else if (tampungirisanstrksmt[8] == null) {
                    tampungirisanstrksmt[8] = tampil;
                } else if (tampungirisanstrksmt[9] == null) {
                    tampungirisanstrksmt[9] = tampil;
                } else if (tampungirisanstrksmt[10] == null) {
                    tampungirisanstrksmt[10] = tampil;
                } else if (tampungirisanstrksmt[11] == null) {
                    tampungirisanstrksmt[11] = tampil;
                } else if (tampungirisanstrksmt[12] == null) {
                    tampungirisanstrksmt[12] = tampil;
                } else if (tampungirisanstrksmt[13] == null) {
                    tampungirisanstrksmt[13] = tampil;
                } else if (tampungirisanstrksmt[14] == null) {
                    tampungirisanstrksmt[14] = tampil;
                } else if (tampungirisanstrksmt[15] == null) {
                    tampungirisanstrksmt[15] = tampil;
                } else if (tampungirisanstrksmt[16] == null) {
                    tampungirisanstrksmt[16] = tampil;
                } else if (tampungirisanstrksmt[17] == null) {
                    tampungirisanstrksmt[17] = tampil;
                } else if (tampungirisanstrksmt[18] == null) {
                    tampungirisanstrksmt[18] = tampil;
                } else if (tampungirisanstrksmt[19] == null) {
                    tampungirisanstrksmt[19] = tampil;
                }
                System.out.println("hasilnya : " + tampil);
                AreaIrisanStruk_Smt.append(tampil + "\n");
            }
        }

        //=========================Hitung Similarity=========================//        
        Levenshtein lvs = new Levenshtein();
        AplikasiTATI apk = new AplikasiTATI();
        //place 1a
        for (int a = 0; a < 14; a++) {
            for (int b = 0; b < 14; b++) {
                temporari1plc[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace1a.getText(), cokplace1b.getText())));
                temporari1plc[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace1a.getText(), cokplace2b.getText())));
                temporari1plc[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace1a.getText(), cokplace3b.getText())));
                temporari1plc[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace1a.getText(), cokplace4b.getText())));
                temporari1plc[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace1a.getText(), cokplace5b.getText())));
                temporari1plc[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace1a.getText(), cokplace6b.getText())));
                temporari1plc[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace1a.getText(), cokplace7b.getText())));
                temporari1plc[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace1a.getText(), cokplace8b.getText())));
                temporari1plc[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace1a.getText(), cokplace9b.getText())));
                temporari1plc[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace1a.getText(), cokplace10b.getText())));
                temporari1plc[10] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace1a.getText(), cokplace11b.getText())));
                temporari1plc[11] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace1a.getText(), cokplace12b.getText())));
                temporari1plc[12] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace1a.getText(), cokplace13b.getText())));
                temporari1plc[13] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace1a.getText(), cokplace14b.getText())));

            }
        }
        for (int c = 0; c < 14; c++) {
            if (temporari1plc[c] > max1plc) {
                max1plc = temporari1plc[c];
            } else if (temporari1plc[c] < min1plc) {
                min1plc = temporari1plc[c];
            }
            System.out.println(temporari1plc[c]);

        }
        tampungmaxplace[0] = max1plc;
        System.out.println("maksimal place 1 " + max1plc);
        if (cokplace1a.getText().equals("") && cokplace1b.getText().equals("")) {
            tampungmaxplace[0] = 0.0;
            //cekplace1.setText(String.valueOf(tampungmaxplace[0]));
        } else {
            //cekplace1.setText(String.valueOf(tampungmaxplace[0]));
        }

        //place 2a
        for (int a = 0; a < 14; a++) {
            for (int b = 0; b < 14; b++) {
                temporari2plc[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace2a.getText(), cokplace1b.getText())));
                temporari2plc[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace2a.getText(), cokplace2b.getText())));
                temporari2plc[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace2a.getText(), cokplace3b.getText())));
                temporari2plc[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace2a.getText(), cokplace4b.getText())));
                temporari2plc[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace2a.getText(), cokplace5b.getText())));
                temporari2plc[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace2a.getText(), cokplace6b.getText())));
                temporari2plc[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace2a.getText(), cokplace7b.getText())));
                temporari2plc[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace2a.getText(), cokplace8b.getText())));
                temporari2plc[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace2a.getText(), cokplace9b.getText())));
                temporari2plc[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace2a.getText(), cokplace10b.getText())));
                temporari2plc[10] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace2a.getText(), cokplace11b.getText())));
                temporari2plc[11] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace2a.getText(), cokplace12b.getText())));
                temporari2plc[12] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace2a.getText(), cokplace13b.getText())));
                temporari2plc[13] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace2a.getText(), cokplace14b.getText())));

            }
        }
        for (int c = 0; c < 14; c++) {
            if (temporari2plc[c] > max2plc) {
                max2plc = temporari2plc[c];
            } else if (temporari2plc[c] < min2plc) {
                min2plc = temporari2plc[c];
            }
            System.out.println(temporari2plc[c]);

        }
        tampungmaxplace[1] = max2plc;
        System.out.println("maksimal place 2 " + max2plc);
        if (cokplace2a.getText().equals("") && cokplace2b.getText().equals("")) {
            tampungmaxplace[1] = 0.0;
            //cekplace2.setText(String.valueOf(tampungmaxplace[1]));
        } else {
            //cekplace2.setText(String.valueOf(tampungmaxplace[1]));
        }
        //place 3a
        for (int a = 0; a < 14; a++) {
            for (int b = 0; b < 14; b++) {
                temporari3plc[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace3a.getText(), cokplace1b.getText())));
                temporari3plc[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace3a.getText(), cokplace2b.getText())));
                temporari3plc[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace3a.getText(), cokplace3b.getText())));
                temporari3plc[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace3a.getText(), cokplace4b.getText())));
                temporari3plc[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace3a.getText(), cokplace5b.getText())));
                temporari3plc[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace3a.getText(), cokplace6b.getText())));
                temporari3plc[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace3a.getText(), cokplace7b.getText())));
                temporari3plc[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace3a.getText(), cokplace8b.getText())));
                temporari3plc[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace3a.getText(), cokplace9b.getText())));
                temporari3plc[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace3a.getText(), cokplace10b.getText())));
                temporari3plc[10] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace3a.getText(), cokplace11b.getText())));
                temporari3plc[11] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace3a.getText(), cokplace12b.getText())));
                temporari3plc[12] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace3a.getText(), cokplace13b.getText())));
                temporari3plc[13] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace3a.getText(), cokplace14b.getText())));

            }
        }
        for (int c = 0; c < 14; c++) {
            if (temporari3plc[c] > max3plc) {
                max3plc = temporari3plc[c];
            } else if (temporari3plc[c] < min3plc) {
                min3plc = temporari3plc[c];
            }
            System.out.println(temporari3plc[c]);

        }
        tampungmaxplace[2] = max3plc;
        System.out.println("maksimal place 3 " + max3plc);
        if (cokplace3a.getText().equals("") && cokplace3b.getText().equals("")) {
            tampungmaxplace[2] = 0.0;
//            cekplace3.setText(String.valueOf(tampungmaxplace[2]));
        } else {
//            cekplace3.setText(String.valueOf(tampungmaxplace[2]));
        }

        //place 4a
        for (int a = 0; a < 14; a++) {
            for (int b = 0; b < 14; b++) {
                temporari4plc[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace4a.getText(), cokplace1b.getText())));
                temporari4plc[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace4a.getText(), cokplace2b.getText())));
                temporari4plc[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace4a.getText(), cokplace3b.getText())));
                temporari4plc[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace4a.getText(), cokplace4b.getText())));
                temporari4plc[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace4a.getText(), cokplace5b.getText())));
                temporari4plc[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace4a.getText(), cokplace6b.getText())));
                temporari4plc[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace4a.getText(), cokplace7b.getText())));
                temporari4plc[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace4a.getText(), cokplace8b.getText())));
                temporari4plc[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace4a.getText(), cokplace9b.getText())));
                temporari4plc[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace4a.getText(), cokplace10b.getText())));
                temporari4plc[10] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace4a.getText(), cokplace11b.getText())));
                temporari4plc[11] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace4a.getText(), cokplace12b.getText())));
                temporari4plc[12] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace4a.getText(), cokplace13b.getText())));
                temporari4plc[13] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace4a.getText(), cokplace14b.getText())));

            }
        }
        for (int c = 0; c < 14; c++) {
            if (temporari4plc[c] > max4plc) {
                max4plc = temporari4plc[c];
            } else if (temporari4plc[c] < min4plc) {
                min4plc = temporari4plc[c];
            }
            System.out.println(temporari4plc[c]);

        }
        tampungmaxplace[3] = max4plc;
        System.out.println("maksimal place 4 " + max4plc);
        if (cokplace4a.getText().equals("") && cokplace4b.getText().equals("")) {
            tampungmaxplace[3] = 0.0;
//            cekplace4.setText(String.valueOf(tampungmaxplace[3]));
        } else {
//            cekplace4.setText(String.valueOf(tampungmaxplace[3]));
        }
        //place 5a
        for (int a = 0; a < 14; a++) {
            for (int b = 0; b < 14; b++) {
                temporari5plc[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace5a.getText(), cokplace1b.getText())));
                temporari5plc[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace5a.getText(), cokplace2b.getText())));
                temporari5plc[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace5a.getText(), cokplace3b.getText())));
                temporari5plc[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace5a.getText(), cokplace4b.getText())));
                temporari5plc[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace5a.getText(), cokplace5b.getText())));
                temporari5plc[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace5a.getText(), cokplace6b.getText())));
                temporari5plc[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace5a.getText(), cokplace7b.getText())));
                temporari5plc[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace5a.getText(), cokplace8b.getText())));
                temporari5plc[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace5a.getText(), cokplace9b.getText())));
                temporari5plc[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace5a.getText(), cokplace10b.getText())));
                temporari5plc[10] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace5a.getText(), cokplace11b.getText())));
                temporari5plc[11] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace5a.getText(), cokplace12b.getText())));
                temporari5plc[12] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace5a.getText(), cokplace13b.getText())));
                temporari5plc[13] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace5a.getText(), cokplace14b.getText())));

            }
        }
        for (int c = 0; c < 14; c++) {
            if (temporari5plc[c] > max5plc) {
                max5plc = temporari5plc[c];
            } else if (temporari5plc[c] < min5plc) {
                min5plc = temporari5plc[c];
            }
            System.out.println(temporari5plc[c]);

        }
        tampungmaxplace[4] = max5plc;
        System.out.println("maksimal place 5 " + max5plc);
        if (cokplace5a.getText().equals("") && cokplace5b.getText().equals("")) {
            tampungmaxplace[4] = 0.0;
//            cekplace5.setText(String.valueOf(tampungmaxplace[4]));
        } else {
//            cekplace5.setText(String.valueOf(tampungmaxplace[4]));
        }

        //place 6a
        for (int a = 0; a < 14; a++) {
            for (int b = 0; b < 14; b++) {
                temporari6plc[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace6a.getText(), cokplace1b.getText())));
                temporari6plc[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace6a.getText(), cokplace2b.getText())));
                temporari6plc[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace6a.getText(), cokplace3b.getText())));
                temporari6plc[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace6a.getText(), cokplace4b.getText())));
                temporari6plc[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace6a.getText(), cokplace5b.getText())));
                temporari6plc[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace6a.getText(), cokplace6b.getText())));
                temporari6plc[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace6a.getText(), cokplace7b.getText())));
                temporari6plc[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace6a.getText(), cokplace8b.getText())));
                temporari6plc[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace6a.getText(), cokplace9b.getText())));
                temporari6plc[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace6a.getText(), cokplace10b.getText())));
                temporari6plc[10] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace6a.getText(), cokplace11b.getText())));
                temporari6plc[11] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace6a.getText(), cokplace12b.getText())));
                temporari6plc[12] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace6a.getText(), cokplace13b.getText())));
                temporari6plc[13] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace6a.getText(), cokplace14b.getText())));

            }
        }
        for (int c = 0; c < 14; c++) {
            if (temporari6plc[c] > max6plc) {
                max6plc = temporari6plc[c];
            } else if (temporari6plc[c] < min6plc) {
                min6plc = temporari6plc[c];
            }
            System.out.println(temporari6plc[c]);

        }
        tampungmaxplace[5] = max6plc;
        System.out.println("maksimal place 6 " + max6plc);
        if (cokplace6a.getText().equals("") && cokplace6b.getText().equals("")) {
            tampungmaxplace[5] = 0.0;
//            cekplace6.setText(String.valueOf(tampungmaxplace[5]));
        } else {
//            cekplace6.setText(String.valueOf(tampungmaxplace[5]));
        }
        //place 7a
        for (int a = 0; a < 14; a++) {
            for (int b = 0; b < 14; b++) {
                temporari7plc[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace7a.getText(), cokplace1b.getText())));
                temporari7plc[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace7a.getText(), cokplace2b.getText())));
                temporari7plc[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace7a.getText(), cokplace3b.getText())));
                temporari7plc[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace7a.getText(), cokplace4b.getText())));
                temporari7plc[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace7a.getText(), cokplace5b.getText())));
                temporari7plc[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace7a.getText(), cokplace6b.getText())));
                temporari7plc[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace7a.getText(), cokplace7b.getText())));
                temporari7plc[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace7a.getText(), cokplace8b.getText())));
                temporari7plc[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace7a.getText(), cokplace9b.getText())));
                temporari7plc[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace7a.getText(), cokplace10b.getText())));
                temporari7plc[10] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace7a.getText(), cokplace11b.getText())));
                temporari7plc[11] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace7a.getText(), cokplace12b.getText())));
                temporari7plc[12] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace7a.getText(), cokplace13b.getText())));
                temporari7plc[13] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace7a.getText(), cokplace14b.getText())));

            }
        }
        for (int c = 0; c < 14; c++) {
            if (temporari7plc[c] > max7plc) {
                max7plc = temporari7plc[c];
            } else if (temporari7plc[c] < min7plc) {
                min7plc = temporari7plc[c];
            }
            System.out.println(temporari7plc[c]);

        }
        tampungmaxplace[6] = max7plc;
        System.out.println("maksimal place 7 " + max7plc);
        if (cokplace7a.getText().equals("") && cokplace7b.getText().equals("")) {
            tampungmaxplace[6] = 0.0;
//            cekplace7.setText(String.valueOf(tampungmaxplace[6]));
        } else {
//            cekplace7.setText(String.valueOf(tampungmaxplace[6]));
        }

        //place 8a
        for (int a = 0; a < 14; a++) {
            for (int b = 0; b < 14; b++) {
                temporari8plc[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace8a.getText(), cokplace1b.getText())));
                temporari8plc[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace8a.getText(), cokplace2b.getText())));
                temporari8plc[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace8a.getText(), cokplace3b.getText())));
                temporari8plc[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace8a.getText(), cokplace4b.getText())));
                temporari8plc[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace8a.getText(), cokplace5b.getText())));
                temporari8plc[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace8a.getText(), cokplace6b.getText())));
                temporari8plc[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace8a.getText(), cokplace7b.getText())));
                temporari8plc[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace8a.getText(), cokplace8b.getText())));
                temporari8plc[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace8a.getText(), cokplace9b.getText())));
                temporari8plc[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace8a.getText(), cokplace10b.getText())));
                temporari8plc[10] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace8a.getText(), cokplace11b.getText())));
                temporari8plc[11] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace8a.getText(), cokplace12b.getText())));
                temporari8plc[12] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace8a.getText(), cokplace13b.getText())));
                temporari8plc[13] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace8a.getText(), cokplace14b.getText())));

            }
        }
        for (int c = 0; c < 14; c++) {
            if (temporari8plc[c] > max8plc) {
                max8plc = temporari8plc[c];
            } else if (temporari8plc[c] < min8plc) {
                min8plc = temporari8plc[c];
            }
            System.out.println(temporari8plc[c]);

        }
        tampungmaxplace[7] = max8plc;
        System.out.println("maksimal place 8 " + max8plc);
        if (cokplace8a.getText().equals("") && cokplace8b.getText().equals("")) {
            tampungmaxplace[7] = 0.0;
//            cekplace8.setText(String.valueOf(tampungmaxplace[7]));
        } else {
//            cekplace8.setText(String.valueOf(tampungmaxplace[7]));
        }

        //place 9a
        for (int a = 0; a < 14; a++) {
            for (int b = 0; b < 14; b++) {
                temporari9plc[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace9a.getText(), cokplace1b.getText())));
                temporari9plc[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace9a.getText(), cokplace2b.getText())));
                temporari9plc[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace9a.getText(), cokplace3b.getText())));
                temporari9plc[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace9a.getText(), cokplace4b.getText())));
                temporari9plc[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace9a.getText(), cokplace5b.getText())));
                temporari9plc[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace9a.getText(), cokplace6b.getText())));
                temporari9plc[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace9a.getText(), cokplace7b.getText())));
                temporari9plc[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace9a.getText(), cokplace8b.getText())));
                temporari9plc[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace9a.getText(), cokplace9b.getText())));
                temporari9plc[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace9a.getText(), cokplace10b.getText())));
                temporari9plc[10] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace9a.getText(), cokplace11b.getText())));
                temporari9plc[11] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace9a.getText(), cokplace12b.getText())));
                temporari9plc[12] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace9a.getText(), cokplace13b.getText())));
                temporari9plc[13] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace9a.getText(), cokplace14b.getText())));

            }
        }
        for (int c = 0; c < 14; c++) {
            if (temporari9plc[c] > max9plc) {
                max9plc = temporari9plc[c];
            } else if (temporari9plc[c] < min9plc) {
                min9plc = temporari9plc[c];
            }
            System.out.println(temporari9plc[c]);

        }
        tampungmaxplace[8] = max9plc;
        System.out.println("maksimal place 9 " + max9plc);
        if (cokplace9a.getText().equals("") && cokplace9b.getText().equals("")) {
            tampungmaxplace[8] = 0.0;
//            cekplace9.setText(String.valueOf(tampungmaxplace[8]));
        } else {
//            cekplace9.setText(String.valueOf(tampungmaxplace[8]));
        }

        //place 10a
        for (int a = 0; a < 14; a++) {
            for (int b = 0; b < 14; b++) {
                temporari10plc[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace10a.getText(), cokplace1b.getText())));
                temporari10plc[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace10a.getText(), cokplace2b.getText())));
                temporari10plc[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace10a.getText(), cokplace3b.getText())));
                temporari10plc[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace10a.getText(), cokplace4b.getText())));
                temporari10plc[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace10a.getText(), cokplace5b.getText())));
                temporari10plc[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace10a.getText(), cokplace6b.getText())));
                temporari10plc[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace10a.getText(), cokplace7b.getText())));
                temporari10plc[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace10a.getText(), cokplace8b.getText())));
                temporari10plc[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace10a.getText(), cokplace9b.getText())));
                temporari10plc[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace10a.getText(), cokplace10b.getText())));
                temporari10plc[10] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace10a.getText(), cokplace11b.getText())));
                temporari10plc[11] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace10a.getText(), cokplace12b.getText())));
                temporari10plc[12] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace10a.getText(), cokplace13b.getText())));
                temporari10plc[13] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace10a.getText(), cokplace14b.getText())));

            }
        }
        for (int c = 0; c < 14; c++) {
            if (temporari10plc[c] > max10plc) {
                max10plc = temporari10plc[c];
            } else if (temporari10plc[c] < min10plc) {
                min10plc = temporari10plc[c];
            }
            System.out.println(temporari10plc[c]);

        }
        tampungmaxplace[9] = max10plc;
        System.out.println("maksimal place 10 " + max10plc);
        if (cokplace10a.getText().equals("") && cokplace10b.getText().equals("")) {
            tampungmaxplace[9] = 0.0;
//            cekplace10.setText(String.valueOf(tampungmaxplace[9]));
        } else {
//            cekplace10.setText(String.valueOf(tampungmaxplace[9]));
        }
        //place 11a
        for (int a = 0; a < 14; a++) {
            for (int b = 0; b < 14; b++) {
                temporari11plc[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace11a.getText(), cokplace1b.getText())));
                temporari11plc[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace11a.getText(), cokplace2b.getText())));
                temporari11plc[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace11a.getText(), cokplace3b.getText())));
                temporari11plc[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace11a.getText(), cokplace4b.getText())));
                temporari11plc[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace11a.getText(), cokplace5b.getText())));
                temporari11plc[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace11a.getText(), cokplace6b.getText())));
                temporari11plc[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace11a.getText(), cokplace7b.getText())));
                temporari11plc[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace11a.getText(), cokplace8b.getText())));
                temporari11plc[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace11a.getText(), cokplace9b.getText())));
                temporari11plc[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace11a.getText(), cokplace10b.getText())));
                temporari11plc[10] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace11a.getText(), cokplace11b.getText())));
                temporari11plc[11] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace11a.getText(), cokplace12b.getText())));
                temporari11plc[12] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace11a.getText(), cokplace13b.getText())));
                temporari11plc[13] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace11a.getText(), cokplace14b.getText())));

            }
        }
        for (int c = 0; c < 14; c++) {
            if (temporari11plc[c] > max11plc) {
                max11plc = temporari11plc[c];
            } else if (temporari11plc[c] < min11plc) {
                min11plc = temporari11plc[c];
            }
            System.out.println(temporari11plc[c]);

        }
        tampungmaxplace[10] = max11plc;
        System.out.println("maksimal place 11 " + max11plc);
        if (cokplace11a.getText().equals("") && cokplace11b.getText().equals("")) {
            tampungmaxplace[10] = 0.0;
//            cekplace11.setText(String.valueOf(tampungmaxplace[10]));
        } else {
//            cekplace11.setText(String.valueOf(tampungmaxplace[10]));
        }

        //place 12a
        for (int a = 0; a < 14; a++) {
            for (int b = 0; b < 14; b++) {
                temporari12plc[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace12a.getText(), cokplace1b.getText())));
                temporari12plc[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace12a.getText(), cokplace2b.getText())));
                temporari12plc[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace12a.getText(), cokplace3b.getText())));
                temporari12plc[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace12a.getText(), cokplace4b.getText())));
                temporari12plc[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace12a.getText(), cokplace5b.getText())));
                temporari12plc[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace12a.getText(), cokplace6b.getText())));
                temporari12plc[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace12a.getText(), cokplace7b.getText())));
                temporari12plc[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace12a.getText(), cokplace8b.getText())));
                temporari12plc[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace12a.getText(), cokplace9b.getText())));
                temporari12plc[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace12a.getText(), cokplace10b.getText())));
                temporari12plc[10] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace12a.getText(), cokplace11b.getText())));
                temporari12plc[11] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace12a.getText(), cokplace12b.getText())));
                temporari12plc[12] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace12a.getText(), cokplace13b.getText())));
                temporari12plc[13] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace12a.getText(), cokplace14b.getText())));

            }
        }
        for (int c = 0; c < 14; c++) {
            if (temporari12plc[c] > max12plc) {
                max12plc = temporari12plc[c];
            } else if (temporari12plc[c] < min12plc) {
                min12plc = temporari12plc[c];
            }
            System.out.println(temporari12plc[c]);

        }
        tampungmaxplace[11] = max12plc;
        System.out.println("maksimal place 12 " + max12plc);
        if (cokplace12a.getText().equals("") && cokplace12b.getText().equals("")) {
            tampungmaxplace[11] = 0.0;
            //        cekplace12.setText(String.valueOf(tampungmaxplace[11]));
        } else {
            //        cekplace12.setText(String.valueOf(tampungmaxplace[11]));
        }

        //place 13a
        for (int a = 0; a < 14; a++) {
            for (int b = 0; b < 14; b++) {
                temporari13plc[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace13a.getText(), cokplace1b.getText())));
                temporari13plc[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace13a.getText(), cokplace2b.getText())));
                temporari13plc[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace13a.getText(), cokplace3b.getText())));
                temporari13plc[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace13a.getText(), cokplace4b.getText())));
                temporari13plc[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace13a.getText(), cokplace5b.getText())));
                temporari13plc[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace13a.getText(), cokplace6b.getText())));
                temporari13plc[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace13a.getText(), cokplace7b.getText())));
                temporari13plc[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace13a.getText(), cokplace8b.getText())));
                temporari13plc[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace13a.getText(), cokplace9b.getText())));
                temporari13plc[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace13a.getText(), cokplace10b.getText())));
                temporari13plc[10] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace13a.getText(), cokplace11b.getText())));
                temporari13plc[11] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace13a.getText(), cokplace12b.getText())));
                temporari13plc[12] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace13a.getText(), cokplace13b.getText())));
                temporari13plc[13] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace13a.getText(), cokplace14b.getText())));

            }
        }
        for (int c = 0; c < 14; c++) {
            if (temporari13plc[c] > max13plc) {
                max13plc = temporari13plc[c];
            } else if (temporari13plc[c] < min13plc) {
                min13plc = temporari13plc[c];
            }
            System.out.println(temporari13plc[c]);

        }
        tampungmaxplace[12] = max13plc;
        System.out.println("maksimal place 13 " + max13plc);
        if (cokplace13a.getText().equals("") && cokplace13b.getText().equals("")) {
            tampungmaxplace[12] = 0.0;
//            cekplace13.setText(String.valueOf(tampungmaxplace[12]));
        } else {
//            cekplace13.setText(String.valueOf(tampungmaxplace[12]));
        }

        //place 14a
        for (int a = 0; a < 14; a++) {
            for (int b = 0; b < 14; b++) {
                temporari14plc[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace14a.getText(), cokplace1b.getText())));
                temporari14plc[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace14a.getText(), cokplace2b.getText())));
                temporari14plc[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace14a.getText(), cokplace3b.getText())));
                temporari14plc[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace14a.getText(), cokplace4b.getText())));
                temporari14plc[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace14a.getText(), cokplace5b.getText())));
                temporari14plc[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace14a.getText(), cokplace6b.getText())));
                temporari14plc[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace14a.getText(), cokplace7b.getText())));
                temporari14plc[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace14a.getText(), cokplace8b.getText())));
                temporari14plc[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace14a.getText(), cokplace9b.getText())));
                temporari14plc[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace14a.getText(), cokplace10b.getText())));
                temporari14plc[10] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace14a.getText(), cokplace11b.getText())));
                temporari14plc[11] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace14a.getText(), cokplace12b.getText())));
                temporari14plc[12] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace14a.getText(), cokplace13b.getText())));
                temporari14plc[13] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cokplace14a.getText(), cokplace14b.getText())));

            }
        }
        for (int c = 0; c < 14; c++) {
            if (temporari14plc[c] > max14plc) {
                max14plc = temporari14plc[c];
            } else if (temporari14plc[c] < min14plc) {
                min14plc = temporari14plc[c];
            }
            System.out.println(temporari14plc[c]);

        }
        tampungmaxplace[13] = max14plc;
        System.out.println("maksimal place 14 " + max14plc);
        if (cokplace14a.getText().equals("") && cokplace14b.getText().equals("")) {
            tampungmaxplace[13] = 0.0;
            //cekplace14.setText(String.valueOf(tampungmaxplace[13]));
        } else {
            //  cekplace14.setText(String.valueOf(tampungmaxplace[13]));
        }

        //===================================================================//
        jumlahplc = 0;

        for (int d = 0; d < tampungmaxplace.length; d++) {
            if (tampungmaxplace[d] != 0.0) {
                jumlahplc++;
            }
        }

        System.out.println("jumlahnya plc " + jumlahplc);

        leveinplace = apk.rataplc(tampungmaxplace[0], tampungmaxplace[1], tampungmaxplace[2], tampungmaxplace[3], tampungmaxplace[4], tampungmaxplace[5], tampungmaxplace[6], tampungmaxplace[7], tampungmaxplace[8], tampungmaxplace[9], tampungmaxplace[10], tampungmaxplace[11], tampungmaxplace[12], tampungmaxplace[13], jumlahplc);
        String hasilavgplc = decimalFormat.format(leveinplace);
        System.out.println("hasilnya adalah place " + leveinplace);
        //valueavgplc.setText(String.valueOf(decimalFormat.format(avgplc)));

        //=================================Transisi===========================//
        //1a
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                temporari1[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok1a.getText(), cocok1b.getText())));
                temporari1[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok1a.getText(), cocok2b.getText())));
                temporari1[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok1a.getText(), cocok3b.getText())));
                temporari1[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok1a.getText(), cocok4b.getText())));
                temporari1[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok1a.getText(), cocok5b.getText())));
                temporari1[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok1a.getText(), cocok6b.getText())));
                temporari1[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok1a.getText(), cocok7b.getText())));
                temporari1[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok1a.getText(), cocok8b.getText())));
                temporari1[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok1a.getText(), cocok9b.getText())));
                temporari1[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok1a.getText(), cocok10b.getText())));
            }
        }
        for (int c = 0; c < 10; c++) {

            if (temporari1[c] > max1) {
                max1 = temporari1[c];
            } else if (temporari1[c] < min1) {
                min1 = temporari1[c];
            }
            System.out.println(temporari1[c]);

        }
        tampungmax[0] = max1;
        System.out.println("maksimal 1 " + max1);
        compare11.setText(String.valueOf(temporari1[0]));
        compare12.setText(String.valueOf(temporari1[1]));
        compare13.setText(String.valueOf(temporari1[2]));
        compare14.setText(String.valueOf(temporari1[3]));
        compare15.setText(String.valueOf(temporari1[4]));
        compare16.setText(String.valueOf(temporari1[5]));
        compare17.setText(String.valueOf(temporari1[6]));
        compare18.setText(String.valueOf(temporari1[7]));
        compare19.setText(String.valueOf(temporari1[8]));
        compare110.setText(String.valueOf(temporari1[9]));

        if (cocok1a.getText().equals("") && cocok1b.getText().equals("")) {
            tampungmax[0] = 0.0;
            rank1.setText(String.valueOf(tampungmax[0]));
        } else {
            rank1.setText(String.valueOf(tampungmax[0]));
        }

        //2a
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                temporari2[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok2a.getText(), cocok1b.getText())));
                temporari2[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok2a.getText(), cocok2b.getText())));
                temporari2[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok2a.getText(), cocok3b.getText())));
                temporari2[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok2a.getText(), cocok4b.getText())));
                temporari2[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok2a.getText(), cocok5b.getText())));
                temporari2[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok2a.getText(), cocok6b.getText())));
                temporari2[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok2a.getText(), cocok7b.getText())));
                temporari2[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok2a.getText(), cocok8b.getText())));
                temporari2[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok2a.getText(), cocok9b.getText())));
                temporari2[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok2a.getText(), cocok10b.getText())));
            }
        }
        for (int c = 0; c < 10; c++) {
            if (temporari2[c] > max2) {
                max2 = temporari2[c];
            } else if (temporari2[c] < min2) {
                min2 = temporari2[c];
            }
            System.out.println(temporari2[c]);

        }
        tampungmax[1] = max2;
        System.out.println("maksimal 2 " + max2);

        compare21.setText(String.valueOf(temporari2[0]));
        compare22.setText(String.valueOf(temporari2[1]));
        compare23.setText(String.valueOf(temporari2[2]));
        compare24.setText(String.valueOf(temporari2[3]));
        compare25.setText(String.valueOf(temporari2[4]));
        compare26.setText(String.valueOf(temporari2[5]));
        compare27.setText(String.valueOf(temporari2[6]));
        compare28.setText(String.valueOf(temporari2[7]));
        compare29.setText(String.valueOf(temporari2[8]));
        compare210.setText(String.valueOf(temporari2[9]));

        if (cocok2a.getText().equals("") && cocok2b.getText().equals("")) {
            tampungmax[1] = 0.0;
            rank2.setText(String.valueOf(tampungmax[1]));
        } else {
            rank2.setText(String.valueOf(tampungmax[1]));
        }

        //3a
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                temporari3[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok3a.getText(), cocok1b.getText())));
                temporari3[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok3a.getText(), cocok2b.getText())));
                temporari3[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok3a.getText(), cocok3b.getText())));
                temporari3[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok3a.getText(), cocok4b.getText())));
                temporari3[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok3a.getText(), cocok5b.getText())));
                temporari3[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok3a.getText(), cocok6b.getText())));
                temporari3[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok3a.getText(), cocok7b.getText())));
                temporari3[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok3a.getText(), cocok8b.getText())));
                temporari3[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok3a.getText(), cocok9b.getText())));
                temporari3[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok3a.getText(), cocok10b.getText())));
            }
        }
        for (int c = 0; c < 10; c++) {
            if (temporari3[c] > max3) {
                max3 = temporari3[c];
            } else if (temporari3[c] < min3) {
                min3 = temporari3[c];
            }
            System.out.println(temporari3[c]);

        }
        tampungmax[2] = max3;
        System.out.println("maksimal 3 " + max3);

        compare31.setText(String.valueOf(temporari3[0]));
        compare32.setText(String.valueOf(temporari3[1]));
        compare33.setText(String.valueOf(temporari3[2]));
        compare34.setText(String.valueOf(temporari3[3]));
        compare35.setText(String.valueOf(temporari3[4]));
        compare36.setText(String.valueOf(temporari3[5]));
        compare37.setText(String.valueOf(temporari3[6]));
        compare38.setText(String.valueOf(temporari3[7]));
        compare39.setText(String.valueOf(temporari3[8]));
        compare310.setText(String.valueOf(temporari3[9]));

        if (cocok3a.getText().equals("") && cocok3b.getText().equals("")) {
            tampungmax[2] = 0.0;
            rank3.setText(String.valueOf(tampungmax[2]));
        } else {

            rank3.setText(String.valueOf(tampungmax[2]));
        }

        //4a
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                temporari4[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok4a.getText(), cocok1b.getText())));
                temporari4[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok4a.getText(), cocok2b.getText())));
                temporari4[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok4a.getText(), cocok3b.getText())));
                temporari4[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok4a.getText(), cocok4b.getText())));
                temporari4[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok4a.getText(), cocok5b.getText())));
                temporari4[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok4a.getText(), cocok6b.getText())));
                temporari4[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok4a.getText(), cocok7b.getText())));
                temporari4[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok4a.getText(), cocok8b.getText())));
                temporari4[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok4a.getText(), cocok9b.getText())));
                temporari4[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok4a.getText(), cocok10b.getText())));
            }
        }
        for (int c = 0; c < 10; c++) {
            if (temporari4[c] > max4) {
                max4 = temporari4[c];
            } else if (temporari4[c] < min4) {
                min4 = temporari4[c];
            }
            System.out.println(temporari4[c]);

        }
        tampungmax[3] = max4;
        System.out.println("maksimal 4 " + max4);

        compare41.setText(String.valueOf(temporari4[0]));
        compare42.setText(String.valueOf(temporari4[1]));
        compare43.setText(String.valueOf(temporari4[2]));
        compare44.setText(String.valueOf(temporari4[3]));
        compare45.setText(String.valueOf(temporari4[4]));
        compare46.setText(String.valueOf(temporari4[5]));
        compare47.setText(String.valueOf(temporari4[6]));
        compare48.setText(String.valueOf(temporari4[7]));
        compare49.setText(String.valueOf(temporari4[8]));
        compare410.setText(String.valueOf(temporari4[9]));

        if (cocok4a.getText().equals("") && cocok4b.getText().equals("")) {
            tampungmax[3] = 0.0;
            rank4.setText(String.valueOf(tampungmax[3]));
        } else {

            rank4.setText(String.valueOf(tampungmax[3]));
        }

        //5a
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                temporari5[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok5a.getText(), cocok1b.getText())));
                temporari5[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok5a.getText(), cocok2b.getText())));
                temporari5[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok5a.getText(), cocok3b.getText())));
                temporari5[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok5a.getText(), cocok4b.getText())));
                temporari5[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok5a.getText(), cocok5b.getText())));
                temporari5[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok5a.getText(), cocok6b.getText())));
                temporari5[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok5a.getText(), cocok7b.getText())));
                temporari5[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok5a.getText(), cocok8b.getText())));
                temporari5[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok5a.getText(), cocok9b.getText())));
                temporari5[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok5a.getText(), cocok10b.getText())));
            }
        }
        for (int c = 0; c < 10; c++) {
            if (temporari5[c] > max5) {
                max5 = temporari5[c];
            } else if (temporari5[c] < min5) {
                min5 = temporari5[c];
            }
            System.out.println(temporari5[c]);

        }
        tampungmax[4] = max5;
        System.out.println("maksimal 5 " + max5);

        compare51.setText(String.valueOf(temporari5[0]));
        compare52.setText(String.valueOf(temporari5[1]));
        compare53.setText(String.valueOf(temporari5[2]));
        compare54.setText(String.valueOf(temporari5[3]));
        compare55.setText(String.valueOf(temporari5[4]));
        compare56.setText(String.valueOf(temporari5[5]));
        compare57.setText(String.valueOf(temporari5[6]));
        compare58.setText(String.valueOf(temporari5[7]));
        compare59.setText(String.valueOf(temporari5[8]));
        compare510.setText(String.valueOf(temporari5[9]));

        if (cocok5a.getText().equals("") && cocok5b.getText().equals("")) {
            tampungmax[4] = 0.0;
            rank5.setText(String.valueOf(tampungmax[4]));
        } else {
            rank5.setText(String.valueOf(tampungmax[4]));
        }

        //6a
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                temporari6[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok6a.getText(), cocok1b.getText())));
                temporari6[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok6a.getText(), cocok2b.getText())));
                temporari6[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok6a.getText(), cocok3b.getText())));
                temporari6[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok6a.getText(), cocok4b.getText())));
                temporari6[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok6a.getText(), cocok5b.getText())));
                temporari6[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok6a.getText(), cocok6b.getText())));
                temporari6[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok6a.getText(), cocok7b.getText())));
                temporari6[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok6a.getText(), cocok8b.getText())));
                temporari6[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok6a.getText(), cocok9b.getText())));
                temporari6[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok6a.getText(), cocok10b.getText())));
            }
        }
        for (int c = 0; c < 10; c++) {
            if (temporari6[c] > max6) {
                max6 = temporari6[c];
            } else if (temporari6[c] < min6) {
                min6 = temporari6[c];
            }
            System.out.println(temporari6[c]);

        }
        tampungmax[5] = max6;
        System.out.println("maksimal 6 " + max6);

        compare61.setText(String.valueOf(temporari6[0]));
        compare62.setText(String.valueOf(temporari6[1]));
        compare63.setText(String.valueOf(temporari6[2]));
        compare64.setText(String.valueOf(temporari6[3]));
        compare65.setText(String.valueOf(temporari6[4]));
        compare66.setText(String.valueOf(temporari6[5]));
        compare67.setText(String.valueOf(temporari6[6]));
        compare68.setText(String.valueOf(temporari6[7]));
        compare69.setText(String.valueOf(temporari6[8]));
        compare610.setText(String.valueOf(temporari6[9]));

        if (cocok6a.getText().equals("") && cocok6b.getText().equals("")) {
            tampungmax[5] = 0.0;
            rank6.setText(String.valueOf(tampungmax[5]));
        } else {
            rank6.setText(String.valueOf(tampungmax[5]));
        }

        //7a
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                temporari7[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok7a.getText(), cocok1b.getText())));
                temporari7[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok7a.getText(), cocok2b.getText())));
                temporari7[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok7a.getText(), cocok3b.getText())));
                temporari7[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok7a.getText(), cocok4b.getText())));
                temporari7[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok7a.getText(), cocok5b.getText())));
                temporari7[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok7a.getText(), cocok6b.getText())));
                temporari7[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok7a.getText(), cocok7b.getText())));
                temporari7[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok7a.getText(), cocok8b.getText())));
                temporari7[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok7a.getText(), cocok9b.getText())));
                temporari7[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok7a.getText(), cocok10b.getText())));
            }
        }
        for (int c = 0; c < 10; c++) {
            if (temporari7[c] > max7) {
                max7 = temporari7[c];
            } else if (temporari7[c] < min7) {
                min7 = temporari7[c];
            }
            System.out.println(temporari7[c]);

        }
        tampungmax[6] = max7;
        System.out.println("maksimal 7 " + max7);

        compare71.setText(String.valueOf(temporari7[0]));
        compare72.setText(String.valueOf(temporari7[1]));
        compare73.setText(String.valueOf(temporari7[2]));
        compare74.setText(String.valueOf(temporari7[3]));
        compare75.setText(String.valueOf(temporari7[4]));
        compare76.setText(String.valueOf(temporari7[5]));
        compare77.setText(String.valueOf(temporari7[6]));
        compare78.setText(String.valueOf(temporari7[7]));
        compare79.setText(String.valueOf(temporari7[8]));
        compare710.setText(String.valueOf(temporari7[9]));

        if (cocok7a.getText().equals("") && cocok7b.getText().equals("")) {
            tampungmax[6] = 0.0;
            rank7.setText(String.valueOf(tampungmax[6]));
        } else {
            rank7.setText(String.valueOf(tampungmax[6]));
        }

        //8a
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                temporari8[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok8a.getText(), cocok1b.getText())));
                temporari8[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok8a.getText(), cocok2b.getText())));
                temporari8[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok8a.getText(), cocok3b.getText())));
                temporari8[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok8a.getText(), cocok4b.getText())));
                temporari8[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok8a.getText(), cocok5b.getText())));
                temporari8[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok8a.getText(), cocok6b.getText())));
                temporari8[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok8a.getText(), cocok7b.getText())));
                temporari8[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok8a.getText(), cocok8b.getText())));
                temporari8[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok8a.getText(), cocok9b.getText())));
                temporari8[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok8a.getText(), cocok10b.getText())));
            }
        }
        for (int c = 0; c < 10; c++) {
            if (temporari8[c] > max8) {
                max8 = temporari8[c];
            } else if (temporari8[c] < min8) {
                min8 = temporari8[c];
            }
            System.out.println(temporari8[c]);

        }
        tampungmax[7] = max8;
        System.out.println("maksimal 8 " + max8);

        compare81.setText(String.valueOf(temporari8[0]));
        compare82.setText(String.valueOf(temporari8[1]));
        compare83.setText(String.valueOf(temporari8[2]));
        compare84.setText(String.valueOf(temporari8[3]));
        compare85.setText(String.valueOf(temporari8[4]));
        compare86.setText(String.valueOf(temporari8[5]));
        compare87.setText(String.valueOf(temporari8[6]));
        compare88.setText(String.valueOf(temporari8[7]));
        compare89.setText(String.valueOf(temporari8[8]));
        compare810.setText(String.valueOf(temporari8[9]));

        if (cocok8a.getText().equals("") && cocok8b.getText().equals("")) {
            tampungmax[7] = 0.0;
            rank8.setText(String.valueOf(tampungmax[7]));
        } else {
            rank8.setText(String.valueOf(tampungmax[7]));
        }

        //9a
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                temporari9[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok9a.getText(), cocok1b.getText())));
                temporari9[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok9a.getText(), cocok2b.getText())));
                temporari9[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok9a.getText(), cocok3b.getText())));
                temporari9[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok9a.getText(), cocok4b.getText())));
                temporari9[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok9a.getText(), cocok5b.getText())));
                temporari9[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok9a.getText(), cocok6b.getText())));
                temporari9[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok9a.getText(), cocok7b.getText())));
                temporari9[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok9a.getText(), cocok8b.getText())));
                temporari9[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok9a.getText(), cocok9b.getText())));
                temporari9[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok9a.getText(), cocok10b.getText())));
            }
        }
        for (int c = 0; c < 10; c++) {
            if (temporari9[c] > max9) {
                max9 = temporari9[c];
            } else if (temporari9[c] < min9) {
                min9 = temporari9[c];
            }
            System.out.println(temporari9[c]);

        }
        tampungmax[8] = max9;
        System.out.println("maksimal 9 " + max9);

        compare91.setText(String.valueOf(temporari9[0]));
        compare92.setText(String.valueOf(temporari9[1]));
        compare93.setText(String.valueOf(temporari9[2]));
        compare94.setText(String.valueOf(temporari9[3]));
        compare95.setText(String.valueOf(temporari9[4]));
        compare96.setText(String.valueOf(temporari9[5]));
        compare97.setText(String.valueOf(temporari9[6]));
        compare98.setText(String.valueOf(temporari9[7]));
        compare99.setText(String.valueOf(temporari9[8]));
        compare910.setText(String.valueOf(temporari9[9]));

        if (cocok9a.getText().equals("") && cocok9b.getText().equals("")) {
            tampungmax[8] = 0.0;
            rank9.setText(String.valueOf(tampungmax[8]));
        } else {
            rank9.setText(String.valueOf(tampungmax[8]));
        }

        //10a
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                temporari10[0] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok10a.getText(), cocok1b.getText())));
                temporari10[1] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok10a.getText(), cocok2b.getText())));
                temporari10[2] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok10a.getText(), cocok3b.getText())));
                temporari10[3] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok10a.getText(), cocok4b.getText())));
                temporari10[4] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok10a.getText(), cocok5b.getText())));
                temporari10[5] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok10a.getText(), cocok6b.getText())));
                temporari10[6] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok10a.getText(), cocok7b.getText())));
                temporari10[7] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok10a.getText(), cocok8b.getText())));
                temporari10[8] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok10a.getText(), cocok9b.getText())));
                temporari10[9] = Double.parseDouble(String.format("%.3f ", lvs.similarity(cocok10a.getText(), cocok10b.getText())));
            }
        }
        for (int c = 0; c < 10; c++) {
            if (temporari10[c] > max10) {
                max10 = temporari10[c];
            } else if (temporari10[c] < min10) {
                min10 = temporari10[c];
            }
            System.out.println(temporari10[c]);

        }
        tampungmax[9] = max10;
        System.out.println("maksimal 10 " + max10);

        compare101.setText(String.valueOf(temporari10[0]));
        compare102.setText(String.valueOf(temporari10[1]));
        compare103.setText(String.valueOf(temporari10[2]));
        compare104.setText(String.valueOf(temporari10[3]));
        compare105.setText(String.valueOf(temporari10[4]));
        compare106.setText(String.valueOf(temporari10[5]));
        compare107.setText(String.valueOf(temporari10[6]));
        compare108.setText(String.valueOf(temporari10[7]));
        compare109.setText(String.valueOf(temporari10[8]));
        compare1010.setText(String.valueOf(temporari10[9]));

        if (cocok10a.getText().equals("") && cocok10b.getText().equals("")) {
            tampungmax[9] = 0.0;
            rank10.setText(String.valueOf(tampungmax[9]));
        } else {
            rank10.setText(String.valueOf(tampungmax[9]));
        }

        //=================================================================
        jumlah = 0;

        for (int d = 0; d < tampungmax.length; d++) {
            if (tampungmax[d] != 0.0) {
                jumlah++;
            }
        }

        System.out.println("jumlahnya " + jumlah);

        leveintrans = apk.ratatrans(tampungmax[0], tampungmax[1], tampungmax[2], tampungmax[3], tampungmax[4], tampungmax[5], tampungmax[6], tampungmax[7], tampungmax[8], tampungmax[9], jumlah);
        String hasilavg = decimalFormat.format(leveintrans);
        System.out.println("hasilnya adalah " + leveintrans);
//        valueavgsmn.setText(String.valueOf(decimalFormat.format(avg)));

        leveinhasil = apk.resulttotal(leveintrans, leveinplace, 2);
        String gabunganhasilavg = decimalFormat.format(leveinhasil);
        resultall.setText(String.valueOf(decimalFormat.format(leveinhasil)));

        //=================================Masukkan Di Matrik==================//
        String InputNama1StrukGB = namamodel1.getText();
        String InputNama2StrukGB = namamodel2.getText();
        String InputKeMetricStruk[] = {InputNama1StrukGB, InputNama2StrukGB, gabunganhasilavg};
        addModelSemantik(InputKeMetricStruk);

        //==================================================================================================================//
        //Panggil kelas parsing
        ParsingLagiPanjangStruk p2 = new ParsingLagiPanjangStruk();

        p2.Parsing(NamaModel1);
        p2.Parsing2(NamaModel2);

        jumpetri1 = 0;
        jumpetri2 = 0;

        //Struktural
        for (int i = 0; i < p2.tampungsemua.length; i++) {
            if (p2.tampungsemua[i] != null) {
                System.out.println(p2.tampungsemua[i]);
                jumpetri1++;
                AreaPN1A.append(p2.tampungsemua[i] + "\n");
            }
        }

        for (int i = 0; i < p2.tampungsemua2.length; i++) {
            if (p2.tampungsemua2[i] != null) {
                System.out.println(p2.tampungsemua2[i]);
                jumpetri2++;
                AreaPN2A.append(p2.tampungsemua2[i] + "\n");
            }
        }

        Irisan = p2.intersect(p2.tampungsemua, p2.tampungsemua2).size() - 1;
        String[] tampungirisanstrk = new String[40];

        for (String tampil : p2.intersect(p2.tampungsemua, p2.tampungsemua2)) {
            if (tampil != null) {
                if (tampungirisanstrk[0] == null) {
                    tampungirisanstrk[0] = tampil;
                } else if (tampungirisanstrk[1] == null) {
                    tampungirisanstrk[1] = tampil;
                } else if (tampungirisanstrk[2] == null) {
                    tampungirisanstrk[2] = tampil;
                } else if (tampungirisanstrk[3] == null) {
                    tampungirisanstrk[3] = tampil;
                } else if (tampungirisanstrk[4] == null) {
                    tampungirisanstrk[4] = tampil;
                } else if (tampungirisanstrk[5] == null) {
                    tampungirisanstrk[5] = tampil;
                } else if (tampungirisanstrk[6] == null) {
                    tampungirisanstrk[6] = tampil;
                } else if (tampungirisanstrk[7] == null) {
                    tampungirisanstrk[7] = tampil;
                } else if (tampungirisanstrk[8] == null) {
                    tampungirisanstrk[8] = tampil;
                } else if (tampungirisanstrk[9] == null) {
                    tampungirisanstrk[9] = tampil;
                } else if (tampungirisanstrk[10] == null) {
                    tampungirisanstrk[10] = tampil;
                } else if (tampungirisanstrk[11] == null) {
                    tampungirisanstrk[11] = tampil;
                } else if (tampungirisanstrk[12] == null) {
                    tampungirisanstrk[12] = tampil;
                } else if (tampungirisanstrk[13] == null) {
                    tampungirisanstrk[13] = tampil;
                } else if (tampungirisanstrk[14] == null) {
                    tampungirisanstrk[14] = tampil;
                } else if (tampungirisanstrk[15] == null) {
                    tampungirisanstrk[15] = tampil;
                } else if (tampungirisanstrk[16] == null) {
                    tampungirisanstrk[16] = tampil;
                } else if (tampungirisanstrk[17] == null) {
                    tampungirisanstrk[17] = tampil;
                } else if (tampungirisanstrk[18] == null) {
                    tampungirisanstrk[18] = tampil;
                } else if (tampungirisanstrk[19] == null) {
                    tampungirisanstrk[19] = tampil;
                } else if (tampungirisanstrk[20] == null) {
                    tampungirisanstrk[20] = tampil;
                } else if (tampungirisanstrk[21] == null) {
                    tampungirisanstrk[21] = tampil;
                } else if (tampungirisanstrk[22] == null) {
                    tampungirisanstrk[22] = tampil;
                } else if (tampungirisanstrk[23] == null) {
                    tampungirisanstrk[23] = tampil;
                } else if (tampungirisanstrk[24] == null) {
                    tampungirisanstrk[24] = tampil;
                } else if (tampungirisanstrk[25] == null) {
                    tampungirisanstrk[25] = tampil;
                } else if (tampungirisanstrk[26] == null) {
                    tampungirisanstrk[26] = tampil;
                } else if (tampungirisanstrk[27] == null) {
                    tampungirisanstrk[27] = tampil;
                } else if (tampungirisanstrk[28] == null) {
                    tampungirisanstrk[28] = tampil;
                } else if (tampungirisanstrk[29] == null) {
                    tampungirisanstrk[29] = tampil;
                } else if (tampungirisanstrk[30] == null) {
                    tampungirisanstrk[30] = tampil;
                } else if (tampungirisanstrk[31] == null) {
                    tampungirisanstrk[31] = tampil;
                } else if (tampungirisanstrk[32] == null) {
                    tampungirisanstrk[32] = tampil;
                } else if (tampungirisanstrk[33] == null) {
                    tampungirisanstrk[33] = tampil;
                } else if (tampungirisanstrk[34] == null) {
                    tampungirisanstrk[34] = tampil;
                } else if (tampungirisanstrk[35] == null) {
                    tampungirisanstrk[35] = tampil;
                } else if (tampungirisanstrk[36] == null) {
                    tampungirisanstrk[36] = tampil;
                } else if (tampungirisanstrk[37] == null) {
                    tampungirisanstrk[37] = tampil;
                } else if (tampungirisanstrk[38] == null) {
                    tampungirisanstrk[38] = tampil;
                } else if (tampungirisanstrk[39] == null) {
                    tampungirisanstrk[39] = tampil;
                }
                System.out.println("hasilnya : " + tampil);
                AreaIrisanStruk.append(tampil + " ");
            }
        }

        //Perhitungan Struktural   
        double jccrd1 = p2.struktural(jumpetri1, jumpetri2, Irisan);
        HasilHitungJC1.setText(String.valueOf(decimalFormat.format(jccrd1)));

        Arrays.fill(p2.tampungsemua, null);
        Arrays.fill(p2.tampungsemua2, null);

        double dice1 = p2.dice(jumpetri1, jumpetri2, Irisan);
        HasilHitungDice1.setText(String.valueOf(decimalFormat.format(dice1)));

        double cosine1 = p2.Cosine(jumpetri1, jumpetri2, Irisan);
        HasilHitungCS1.setText(String.valueOf(decimalFormat.format(cosine1)));

        if (jumpetri1 < jumpetri2) {
            Min = jumpetri1;
        } else {
            Min = jumpetri2;
        }

        double ov1 = p2.overlap(jumpetri1, jumpetri2, Min, Irisan);
        HasilHitungOV1.setText(String.valueOf(decimalFormat.format(ov1)));

        Random rand1 = new Random();
        double n1 = rand1.nextInt(100) + 1;
        n1 = n1 / 1000000;
        double hasil1 = jccrd1 + n1;
        jaccardstruk = jccrd1 + n1;

        String hasilSimilarity1 = decimalFormat.format(hasil1);

        int randomlagi = (int) (1 + Math.random() * 1000 - 1 + 1);
        String stringrandom = decimalFormatlagi.format(randomlagi);

        modelSama1 = tampungirisanstrk;
        StrukCommonFragment1.add(modelSama1);
        //clustering.inputclus(Double.parseDouble(hasilSimilarity1), tampungirisanstrk, modelSama1);
        String InputNama1StrukGBSTRK = namamodel1.getText();
        String InputNama2StrukGBSTRK = namamodel2.getText();
        String InputKeMetricStrukGBSTRK[] = {InputNama1StrukGBSTRK, InputNama2StrukGBSTRK, hasilSimilarity1};
        String InputKeClusterStrukGBSTRK[] = {InputNama1StrukGBSTRK, " dan ", InputNama2StrukGBSTRK};
        addModel1(jccrd1, InputKeMetricStrukGBSTRK);
        //===================================================================================================================//
        ParsingLagiPanjangBhv pl = new ParsingLagiPanjangBhv();

        pl.Parsing(NamaModel1);
        pl.Parsing2(NamaModel2);
        jumpetri1 = 0;
        jumpetri2 = 0;
        for (int i = 0; i < pl.tampungsemua.length; i++) {
            if (pl.tampungsemua[i] != null) {
                System.out.println(pl.tampungsemua[i]);
                jumpetri1++;
                AreaPN1B.append(pl.tampungsemua[i] + "\n");

            }
        }
        for (int i = 0; i < pl.tampungsemua2.length; i++) {
            if (pl.tampungsemua2[i] != null) {
                System.out.println(pl.tampungsemua2[i]);
                jumpetri2++;
                AreaPN2B.append(pl.tampungsemua2[i] + "\n");
            }
        }

        Irisan = pl.intersect(pl.tampungsemua, pl.tampungsemua2).size() - 1;
        String[] tampungirisan = new String[40];
        for (String tampil : pl.intersect(pl.tampungsemua, pl.tampungsemua2)) {
            if (tampil != null) {
                if (tampungirisan[0] == null) {
                    tampungirisan[0] = tampil;
                } else if (tampungirisan[1] == null) {
                    tampungirisan[1] = tampil;
                } else if (tampungirisan[2] == null) {
                    tampungirisan[2] = tampil;
                } else if (tampungirisan[3] == null) {
                    tampungirisan[3] = tampil;
                } else if (tampungirisan[4] == null) {
                    tampungirisan[4] = tampil;
                } else if (tampungirisan[5] == null) {
                    tampungirisan[5] = tampil;
                } else if (tampungirisan[6] == null) {
                    tampungirisan[6] = tampil;
                } else if (tampungirisan[7] == null) {
                    tampungirisan[7] = tampil;
                } else if (tampungirisan[8] == null) {
                    tampungirisan[8] = tampil;
                } else if (tampungirisan[9] == null) {
                    tampungirisan[9] = tampil;

                } else if (tampungirisan[10] == null) {
                    tampungirisan[10] = tampil;

                } else if (tampungirisan[11] == null) {
                    tampungirisan[11] = tampil;

                } else if (tampungirisan[12] == null) {
                    tampungirisan[12] = tampil;

                } else if (tampungirisan[13] == null) {
                    tampungirisan[13] = tampil;

                } else if (tampungirisan[14] == null) {
                    tampungirisan[14] = tampil;

                } else if (tampungirisan[15] == null) {
                    tampungirisan[15] = tampil;

                } else if (tampungirisan[16] == null) {
                    tampungirisan[16] = tampil;

                } else if (tampungirisan[17] == null) {
                    tampungirisan[17] = tampil;

                } else if (tampungirisan[18] == null) {
                    tampungirisan[18] = tampil;

                } else if (tampungirisan[19] == null) {
                    tampungirisan[19] = tampil;

                } else if (tampungirisan[20] == null) {
                    tampungirisan[20] = tampil;

                } else if (tampungirisan[21] == null) {
                    tampungirisan[21] = tampil;

                } else if (tampungirisan[22] == null) {
                    tampungirisan[22] = tampil;

                } else if (tampungirisan[23] == null) {
                    tampungirisan[23] = tampil;

                } else if (tampungirisan[24] == null) {
                    tampungirisan[24] = tampil;

                } else if (tampungirisan[25] == null) {
                    tampungirisan[25] = tampil;

                } else if (tampungirisan[26] == null) {
                    tampungirisan[26] = tampil;

                } else if (tampungirisan[27] == null) {
                    tampungirisan[27] = tampil;

                } else if (tampungirisan[28] == null) {
                    tampungirisan[28] = tampil;

                } else if (tampungirisan[29] == null) {
                    tampungirisan[29] = tampil;

                } else if (tampungirisan[30] == null) {
                    tampungirisan[30] = tampil;

                } else if (tampungirisan[31] == null) {
                    tampungirisan[31] = tampil;

                } else if (tampungirisan[32] == null) {
                    tampungirisan[32] = tampil;

                } else if (tampungirisan[33] == null) {
                    tampungirisan[33] = tampil;

                } else if (tampungirisan[34] == null) {
                    tampungirisan[34] = tampil;

                } else if (tampungirisan[35] == null) {
                    tampungirisan[35] = tampil;

                } else if (tampungirisan[36] == null) {
                    tampungirisan[36] = tampil;

                } else if (tampungirisan[37] == null) {
                    tampungirisan[37] = tampil;

                } else if (tampungirisan[38] == null) {
                    tampungirisan[38] = tampil;

                } else if (tampungirisan[39] == null) {
                    tampungirisan[39] = tampil;

                }
                System.out.println("hasilnya : " + tampil);
                AreaIrisanBhv.append(tampil + " ");
            }
        }

        double jccrd = pl.struktural(jumpetri1, jumpetri2, Irisan);
        HasilHitungJC2.setText(String.valueOf(decimalFormat.format(jccrd)));
        Arrays.fill(pl.tampungsemua, null);
        Arrays.fill(pl.tampungsemua2, null);

        double dice = pl.dice(jumpetri1, jumpetri2, Irisan);
        HasilHitungDice2.setText(String.valueOf(decimalFormat.format(dice)));

        double cosine = pl.Cosine(jumpetri1, jumpetri2, Irisan);
        HasilHitungCS2.setText(String.valueOf(decimalFormat.format(cosine)));

        if (jumpetri1 < jumpetri2) {
            Min = jumpetri1;
        } else {
            Min = jumpetri2;
        }

        double ov = pl.overlap(jumpetri1, jumpetri2, Min, Irisan);
        HasilHitungOV2.setText(String.valueOf(decimalFormat.format(ov)));

        Random rand = new Random();
        double n = rand.nextInt(100) + 1;
        n = n / 1000000;
        jaccardbhv = jccrd + n;
        double hasilclusterbhv;

        String hasilSimilarity = decimalFormat.format(jaccardbhv);

        modelSama2 = tampungirisan;
        StrukCommonFragment2.add(modelSama2);

        String InputNamaBhv1 = namamodel1.getText();
        String InputNamaBhv2 = namamodel2.getText();
        String InputKeMetricBhv[] = {InputNamaBhv1, InputNamaBhv2, hasilSimilarity};
        String InputKeClusterBhv[] = {InputNamaBhv1, " dan ", InputNamaBhv2};
        addModel2(jccrd, InputKeMetricBhv);
        hasilclusteravg = (0.40 * jaccardstruk) + (0.10 * jaccardbhv) + (0.50 * leveinhasil);
        //clustering.inputclus(hasilcluster, InputKeClusterStrukGBSTRK, modelSama1);

        if (namamodel1.getText().contains("Akademik") && namamodel2.getText().contains("Akademik")) {
            konstantaakad = 1.0;
            hasilclustekonstanta = konstantaakad + hasilclusteravg;
            clustering.inputclus(hasilclusteravg, InputKeClusterStrukGBSTRK, modelSama1);
            clusteringfix.inputclus(hasilclustekonstanta, InputKeClusterStrukGBSTRK, modelSama1);
        } else if (namamodel1.getText().contains("Kepegawaian") && namamodel2.getText().contains("Kepegawaian")) {
            konstantakepeg = 3.0;
            hasilclustekonstanta = konstantakepeg + hasilclusteravg;
            clustering.inputclus(hasilclusteravg, InputKeClusterStrukGBSTRK, modelSama1);
            clusteringfix.inputclus(hasilclustekonstanta, InputKeClusterStrukGBSTRK, modelSama1);
        } else if (namamodel1.getText().contains("Kesantrian") && namamodel2.getText().contains("Kesantrian")) {
            konstantakesan = 5.0;
            hasilclustekonstanta = konstantakesan + hasilclusteravg;
            clustering.inputclus(hasilclusteravg, InputKeClusterStrukGBSTRK, modelSama1);
            clusteringfix.inputclus(hasilclustekonstanta, InputKeClusterStrukGBSTRK, modelSama1);
        } else if (namamodel1.getText().contains("PSB") && namamodel2.getText().contains("PSB")) {
            konstantapsb = 7.0;
            hasilclustekonstanta = konstantapsb + hasilclusteravg;
            clustering.inputclus(hasilclusteravg, InputKeClusterStrukGBSTRK, modelSama1);
            clusteringfix.inputclus(hasilclustekonstanta, InputKeClusterStrukGBSTRK, modelSama1);
        } else if (namamodel1.getText().contains("Sarpras") && namamodel2.getText().contains("Sarpras")) {
            konstantasarpras = 9.0;
            hasilclustekonstanta = konstantasarpras + hasilclusteravg;
            clustering.inputclus(hasilclusteravg, InputKeClusterStrukGBSTRK, modelSama1);
            clusteringfix.inputclus(hasilclustekonstanta, InputKeClusterStrukGBSTRK, modelSama1);
        } else {
            double konstanta = 0.0;
            hasilclustekonstanta = konstanta + hasilclusteravg;
            clustering.inputclus(hasilclustekonstanta, InputKeClusterStrukGBSTRK, modelSama1);
            clusteringfix.inputclus(hasilclusteravg, InputKeClusterStrukGBSTRK, modelSama1);
        }
//=============================================================================================================//

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    void commonstrk() {
        Set<String> s1 = new HashSet<String>(Arrays.asList(ListStrukCommonStruk.get(0)));
        Set<String> s2 = new HashSet<String>(Arrays.asList(ListStrukCommonStruk.get(1)));
        s1.retainAll(s2);
        String[] result = s1.toArray(new String[s1.size()]);

        TempatPNMLStrk.setText("");
        for (int j = 0; j < result.length; j++) {
            if (result[j] != null) {
                TempatPNMLStrk.setText(TempatPNMLStrk.getText() + " " + result[j]);
            }
        }

        String[] result1 = null, result2 = null, result3 = null, result4 = null, result5 = null, result6;

        if (3 <= ListStrukCommonStruk.size()) {
            TempatPNMLStrk.setText("");
            Set<String> s3 = new HashSet<String>(Arrays.asList(result));
            Set<String> s4 = new HashSet<String>(Arrays.asList(ListStrukCommonStruk.get(2)));
            s3.retainAll(s4);
            result1 = s3.toArray(new String[s3.size()]);

            for (int j = 0; j < result1.length; j++) {
                if (result1[j] != null) {
                    TempatPNMLStrk.setText(TempatPNMLStrk.getText() + " " + result1[j]);
                    System.out.print(result1[j] + "  ");
                }
            }
        }

        if (4 <= ListStrukCommonStruk.size()) {
            TempatPNMLStrk.setText("");
            Set<String> s3 = new HashSet<String>(Arrays.asList(result1));
            Set<String> s4 = new HashSet<String>(Arrays.asList(ListStrukCommonStruk.get(3)));
            s3.retainAll(s4);
            result2 = s3.toArray(new String[s3.size()]);

            for (int j = 0; j < result2.length; j++) {
                if (result2[j] != null) {
                    TempatPNMLStrk.setText(TempatPNMLStrk.getText() + " " + result2[j]);
                    System.out.print(result2[j] + "  ");
                }
            }
        }

        if (5 <= ListStrukCommonStruk.size()) {
            TempatPNMLStrk.setText("");
            Set<String> s3 = new HashSet<String>(Arrays.asList(result2));
            Set<String> s4 = new HashSet<String>(Arrays.asList(ListStrukCommonStruk.get(4)));
            s3.retainAll(s4);
            result3 = s3.toArray(new String[s3.size()]);

            for (int j = 0; j < result3.length; j++) {
                if (result3[j] != null) {
                    TempatPNMLStrk.setText(TempatPNMLStrk.getText() + " " + result3[j]);
                    System.out.print(result3[j] + "  ");
                }
            }
        }

        if (6 <= ListStrukCommonStruk.size()) {
            TempatPNMLStrk.setText("");
            Set<String> s3 = new HashSet<String>(Arrays.asList(result3));
            Set<String> s4 = new HashSet<String>(Arrays.asList(ListStrukCommonStruk.get(5)));
            s3.retainAll(s4);
            result4 = s3.toArray(new String[s3.size()]);

            for (int j = 0; j < result4.length; j++) {
                if (result4[j] != null) {
                    TempatPNMLStrk.setText(TempatPNMLStrk.getText() + " " + result4[j]);
                    System.out.print(result4[j] + "  ");
                }
            }
        }
        if (7 <= ListStrukCommonStruk.size()) {
            TempatPNMLStrk.setText("");
            Set<String> s3 = new HashSet<String>(Arrays.asList(result4));
            Set<String> s4 = new HashSet<String>(Arrays.asList(ListStrukCommonStruk.get(6)));
            s3.retainAll(s4);
            result5 = s3.toArray(new String[s3.size()]);

            for (int j = 0; j < result5.length; j++) {
                if (result5[j] != null) {
                    TempatPNMLStrk.setText(TempatPNMLStrk.getText() + " " + result5[j]);
                    System.out.print(result5[j] + "  ");
                }
            }
        }

        if (8 <= ListStrukCommonStruk.size()) {
            TempatPNMLStrk.setText("");
            Set<String> s3 = new HashSet<String>(Arrays.asList(result5));
            Set<String> s4 = new HashSet<String>(Arrays.asList(ListStrukCommonStruk.get(7)));
            s3.retainAll(s4);
            result6 = s3.toArray(new String[s3.size()]);

            for (int j = 0; j < result6.length; j++) {
                if (result6[j] != null) {
                    TempatPNMLStrk.setText(TempatPNMLStrk.getText() + " " + result6[j]);
                    System.out.print(result6[j] + "  ");
                }
            }
        }
        String hasil = TempatPNMLStrk.getText().replaceAll("\\s+", "");
        String[] pisah = pisahkanTeks(hasil);

        Set<String> s3 = new HashSet<String>(Arrays.asList(pisah));
        Set<String> s4 = new HashSet<String>(Arrays.asList("t1", "t2", "t3", "t4", "t5", "t6", "t7", "t8", "t9", "t10", "t11", "t12", "t13", "t14", "t15", "t16", "t17"));
        String[] hasilGenerate = null;
        s3.retainAll(s4);
        hasilGenerate = s3.toArray(new String[s3.size()]);

        for (int i = 0; i < hasilGenerate.length; i++) {
            System.out.print(hasilGenerate[i] + " ");
        }

        new createXML_Common().buatXML(hasilGenerate);
//        if (clusterfix.getText().contains("Akademik_")) {
//            new createXML_Common_Akademik().buatXML(hasilGenerate);
//            System.out.println("akademik");
//
//        } else if (clusterfix.getText().contains("Kepegawaian_")) {
//            new createXML_Common_Kepegawaian().buatXML(hasilGenerate);
//            System.out.println("kepegawaian");
//
//        } else if (clusterfix.getText().contains("Kesantrian_")) {
//            new createXML_Common_Kesantrian().buatXML(hasilGenerate);
//            System.out.println("Kesantrian");
//
//        } else if (clusterfix.getText().contains("PSB_")) {
//            new createXML_Common_PSB().buatXML(hasilGenerate);
//            System.out.println("PSB");
//
//        } else if (clusterfix.getText().contains("Sarpras_")) {
//            new createXML_Common_Sarpras().buatXML(hasilGenerate);
//            System.out.println("Sarpras");
//        }
//        if (clusterfix.getText().contains("Akademik_")) {
//            String[] kepetrinet1 = {"Daftar Ulang Santri Baru", "Daftar Ulang Lama", "Daftar Ulang Santri Lama", "Proses KBM", "Ujian", "Kalkulasi Nilai Ujian", "Proses Kelulusan"};
//            new createXML_Common_Akademik().buatXML(kepetrinet1);
//            System.out.println("akademik");
//
//        } else if (clusterfix.getText().contains("Kepegawaian_")) {
//            String[] kepetrinet2 = {"Melakukan Tes Pegawai", "Pengesahan Pegawai"};
//            new createXML_Common_Kepegawaian().buatXML(kepetrinet2);
//            System.out.println("kepegawaian");
//
//        } else if (clusterfix.getText().contains("Kesantrian_")) {
//            String[] kepetrinet3 = {"Kegiatan agama pagi", "Kegiatan sore harian", "Aktivitas diniyah"};
//            new createXML_Common_Kesantrian().buatXML(kepetrinet3);
//            System.out.println("Kesantrian");
//
//        } else if (clusterfix.getText().contains("PSB_")) {
//            String[] kepetrinet4 = {"mengambil dan mengisi formulir data pendaftaran", "entri data pendaftaran", "mencetak tanda bukti pendaftaran"};
//            new createXML_Common_PSB().buatXML(kepetrinet4);
//            System.out.println("PSB");
//
//        } else if (clusterfix.getText().contains("Sarpras_")) {
//            String[] kepetrinet5 = {"Pendataan Sarpras", "Pengecekan Barang", "Perbaikan Sarana"};
//            new createXML_Common_Sarpras().buatXML(kepetrinet5);
//            System.out.println("Sarpras");
//        }
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

    String[] pisahkanTeksStrk(String text) {
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

    public void tampilcluster(double treshol) {
        areacluster.setText("");
        for (Map.Entry<Double, ArrayList<String[]>> entry : clustering.map.entrySet()) {
            if (entry.getKey() >= treshol) {

                System.out.print(entry.getKey() + " | ");
                areacluster.append(decimalFormat.format(entry.getKey()) + " | ");
                for (int i = 0; i < entry.getValue().size(); i++) {
                    String[] modelpml = entry.getValue().get(i);
                    for (int j = 0; j < modelpml.length; j++) {
                        if (modelpml[j] != null) {
                            System.out.print(modelpml[j] + " ");
                            areacluster.append(modelpml[j] + " ");
                        }
                    }
                }
                System.out.println();
                areacluster.append("\n");

            }
        }
        areacommon.setText("");
        ListStrukCommonStruk = new ArrayList<>();
        for (Map.Entry<Double, String[]> entry : clustering.mapstruk.entrySet()) {
            if (entry.getKey() >= treshol) {
                String[] modelPNML = entry.getValue();
                ListStrukCommonStruk.add(modelPNML);
                for (int j = 0; j < modelPNML.length; j++) {
                    if (modelPNML[j] != null) {
                        System.out.print(modelPNML[j] + " ");
                        areacommon.append("{" + modelPNML[j] + "}");
                    }
                }
                System.out.println();
                areacommon.append("\n");
            }
        }
    }

    public void tampilclusfix(double treshol, double bts) {

        clusterfix.setText("");
        for (Map.Entry<Double, ArrayList<String[]>> entry : clusteringfix.map.entrySet()) {
            if (entry.getKey() >= treshol && entry.getKey() < bts) {

                System.out.print(entry.getKey() + " | ");
                clusterfix.append(decimalFormat.format(entry.getKey()) + " | ");
                for (int i = 0; i < entry.getValue().size(); i++) {
                    String[] modelpml = entry.getValue().get(i);
                    for (int j = 0; j < modelpml.length; j++) {
                        if (modelpml[j] != null) {
                            System.out.print(modelpml[j] + " ");
                            clusterfix.append(modelpml[j] + " ");
                        }
                    }
                }
                System.out.println();
                clusterfix.append("\n");

            }
        }

        areacommon.setText("");
        ListStrukCommonStruk = new ArrayList<>();
        for (Map.Entry<Double, String[]> entry : clusteringfix.mapstruk.entrySet()) {
            if (entry.getKey() >= treshol && entry.getKey() < bts) {
                String[] modelPNML = entry.getValue();
                ListStrukCommonStruk.add(modelPNML);
                for (int j = 0; j < modelPNML.length; j++) {
                    if (modelPNML[j] != null) {
                        System.out.print(modelPNML[j] + " ");
                        areacommon.append("{" + modelPNML[j] + "}");
                    }
                }
                System.out.println();
                areacommon.append("\n");
            }
        }
    }


    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ParsingLagiPanjangStruk p1 = new ParsingLagiPanjangStruk();
        ParsingLagiPanjangBhv p2 = new ParsingLagiPanjangBhv();

        max1 = 0.0;
        max2 = 0.0;
        max3 = 0.0;
        max4 = 0.0;
        max5 = 0.0;
        max6 = 0.0;
        max7 = 0.0;
        max8 = 0.0;
        max9 = 0.0;
        max10 = 0.0;
        leveintrans = 0.0;

        namamodel1.setText("-");
        namamodel2.setText("-");
        LoadArea1.setText(null);
        LoadArea2.setText(null);
        AreaPN1A.setText(null);
        AreaPN1B.setText(null);
        AreaPN2A.setText(null);
        AreaPN2B.setText(null);
        AreaSem1.setText(null);
        AreaSem2.setText(null);
        AreaIrisanStruk.setText("");
        AreaIrisanBhv.setText("");
        HasilHitungJC1.setText("");
        HasilHitungDice1.setText("");
        HasilHitungCS1.setText("");
        HasilHitungOV1.setText("");
        HasilHitungJC2.setText("");
        HasilHitungDice2.setText("");
        HasilHitungCS2.setText("");
        HasilHitungOV2.setText("");
//        valueavgsmn.setText("");
        cocok1a.setText("");
        cocok2a.setText("");
        cocok3a.setText("");
        cocok4a.setText("");
        cocok5a.setText("");
        cocok6a.setText("");
        cocok7a.setText("");
        cocok8a.setText("");
        cocok9a.setText("");
        cocok10a.setText("");
        cocok1b.setText("");
        cocok2b.setText("");
        cocok3b.setText("");
        cocok4b.setText("");
        cocok5b.setText("");
        cocok6b.setText("");
        cocok7b.setText("");
        cocok8b.setText("");
        cocok9b.setText("");
        cocok10b.setText("");

        NamaModel1 = null;
        NamaModel2 = null;
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void hasiljmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasiljmlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasiljmlActionPerformed

    private void bhvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bhvActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("choosertitle");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
        } else {
            System.out.println("No Selection ");
        }

        File folder = chooser.getSelectedFile();
        //File[] listOfFiles = folder.listFiles();
        TF_Path.setText(folder.getPath());

        Metric_PB pbs = new Metric_PB();
        pbs.isiKlusterStruk();

        AreaMatrikStrk.setText("");
        for (Map.Entry<Double, ArrayList<String[]>> entry : pbs.mapMetricStruk.entrySet()) {

            if (entry.getKey() >= 0.0) {

                System.out.print(entry.getKey() + " | ");
                AreaMatrikStrk.append(decimalFormat.format(entry.getKey()) + " | ");
                for (int i = 0; i < entry.getValue().size(); i++) {
                    String[] modelPnml = entry.getValue().get(i);
                    for (int j = 0; j < modelPnml.length; j++) {
                        System.out.print(modelPnml[j] + "  ");
                        AreaMatrikStrk.append(modelPnml[j] + " ");
                    }
                }
                System.out.println();
                AreaMatrikStrk.append("\n");
            }
        }

        Metric_PB pb = new Metric_PB();
        pb.isiKlusterBhv();

        AreaMatrikBhv.setText("");
        for (Map.Entry<Double, ArrayList<String[]>> entry : pb.mapMetricBhv.entrySet()) {

            if (entry.getKey() >= 0.0) {

                System.out.print(entry.getKey() + " | ");
                AreaMatrikBhv.append(decimalFormat.format(entry.getKey()) + " | ");
                for (int i = 0; i < entry.getValue().size(); i++) {
                    String[] modelPnml = entry.getValue().get(i);
                    for (int j = 0; j < modelPnml.length; j++) {
                        System.out.print(modelPnml[j] + "  ");
                        AreaMatrikBhv.append(modelPnml[j] + " ");
                    }
                }
                System.out.println();
                AreaMatrikBhv.append("\n");
            }
        }

        Metric_PB pbhv = new Metric_PB();
        pbhv.isiKlusterSmt();

        AreaMatrikSmt.setText("");
        for (Map.Entry<Double, ArrayList<String[]>> entry : pbhv.mapMetricSmt.entrySet()) {

            if (entry.getKey() >= 0.0) {

                System.out.print(entry.getKey() + " | ");
                AreaMatrikSmt.append(decimalFormat.format(entry.getKey()) + " | ");
                for (int i = 0; i < entry.getValue().size(); i++) {
                    String[] modelPnml = entry.getValue().get(i);
                    for (int j = 0; j < modelPnml.length; j++) {
                        System.out.print(modelPnml[j] + "  ");
                        AreaMatrikSmt.append(modelPnml[j] + " ");
                    }
                }
                System.out.println();
                AreaMatrikSmt.append("\n");
            }
        }

        try {
            String cluster1 = "SELECT  * FROM datakemiripan WHERE  `no` =1";
            PreparedStatement p1 = (PreparedStatement) new Conn().connect().prepareStatement(cluster1);
            rs = p1.executeQuery(cluster1);
            if (rs.next()) {
                nam1 = rs.getString(2);
                nam2 = rs.getString(3);
                nil1 = rs.getString(4);
                nil2 = rs.getString(5);
                elem1 = rs.getString(6);
                elem2 = rs.getString(7);
                elem3 = rs.getString(8);
                elem4 = rs.getString(9);
                elem5 = rs.getString(10);
                elem6 = rs.getString(11);
            }

            double nilai1a = Double.parseDouble(nil1);
            double nilai1b = Double.parseDouble(nil2);
            String[] model1 = {nam1, nam2};
            String[] modelSama1 = {elem1, elem2, elem3, elem4, elem5, elem6};
            clustering.inputclus(nilai1a, model1, modelSama1);
            clusteringfix.inputclus(nilai1b, model1, modelSama1);

            //=================================================//
            String cluster2 = "SELECT  * FROM datakemiripan WHERE  `no` =2";
            PreparedStatement p2 = (PreparedStatement) new Conn().connect().prepareStatement(cluster2);
            rs = p2.executeQuery(cluster2);
            if (rs.next()) {
                nam1 = rs.getString(2);
                nam2 = rs.getString(3);
                nil1 = rs.getString(4);
                nil2 = rs.getString(5);
                elem1 = rs.getString(6);
                elem2 = rs.getString(7);
                elem3 = rs.getString(8);
                elem4 = rs.getString(9);
                elem5 = rs.getString(10);
                elem6 = rs.getString(11);
            }

            double nilai2a = Double.parseDouble(nil1);
            double nilai2b = Double.parseDouble(nil2);
            String[] model2 = {nam1, nam2};
            String[] modelSama2 = {elem1, elem2, elem3, elem4, elem5, elem6};
            clustering.inputclus(nilai2a, model2, modelSama2);
            clusteringfix.inputclus(nilai2b, model2, modelSama2);

            //=================================================//
            String cluster3 = "SELECT  * FROM datakemiripan WHERE  `no` =3";
            PreparedStatement p3 = (PreparedStatement) new Conn().connect().prepareStatement(cluster3);
            rs = p3.executeQuery(cluster3);
            if (rs.next()) {
                nam1 = rs.getString(2);
                nam2 = rs.getString(3);
                nil1 = rs.getString(4);
                nil2 = rs.getString(5);
                elem1 = rs.getString(6);
                elem2 = rs.getString(7);
                elem3 = rs.getString(8);
                elem4 = rs.getString(9);
                elem5 = rs.getString(10);
                elem6 = rs.getString(11);
            }

            double nilai3a = Double.parseDouble(nil1);
            double nilai3b = Double.parseDouble(nil2);
            String[] model3 = {nam1, nam2};
            String[] modelSama3 = {elem1, elem2, elem3, elem4, elem5, elem6};
            clustering.inputclus(nilai3a, model3, modelSama3);
            clusteringfix.inputclus(nilai3b, model3, modelSama3);

            //=================================================//
            String cluster4 = "SELECT  * FROM datakemiripan WHERE  `no` =4";
            PreparedStatement p4 = (PreparedStatement) new Conn().connect().prepareStatement(cluster4);
            rs = p4.executeQuery(cluster4);
            if (rs.next()) {
                nam1 = rs.getString(2);
                nam2 = rs.getString(3);
                nil1 = rs.getString(4);
                nil2 = rs.getString(5);
                elem1 = rs.getString(6);
                elem2 = rs.getString(7);
                elem3 = rs.getString(8);
                elem4 = rs.getString(9);
                elem5 = rs.getString(10);
                elem6 = rs.getString(11);
            }

            double nilai4a = Double.parseDouble(nil1);
            double nilai4b = Double.parseDouble(nil2);
            String[] model4 = {nam1, nam2};
            String[] modelSama4 = {elem1, elem2, elem3, elem4, elem5, elem6};
            clustering.inputclus(nilai4a, model4, modelSama4);
            clusteringfix.inputclus(nilai4b, model4, modelSama4);

            //JOptionPane.showMessageDialog(null, "Berhasil");
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Gagal");
            System.err.print(ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void buatcommonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buatcommonActionPerformed

        commonstrk();

    }//GEN-LAST:event_buatcommonActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        //
        if (jComboBox2.getSelectedItem() == "-- Business Process --") {
            tampilclusfix(1.0, 10.9);
        }
        if (jComboBox2.getSelectedItem() == "Akademik") {
            tampilclusfix(1.0, 2.9);

        }
        if (jComboBox2.getSelectedItem() == "Kepegawaian") {
            tampilclusfix(3.0, 4.9);

        }
        if (jComboBox2.getSelectedItem() == "Kesantrian") {
            tampilclusfix(5.0, 6.9);

        }
        if (jComboBox2.getSelectedItem() == "Penerimaan Siswa Baru") {
            tampilclusfix(7.0, 8.9);

        }
        if (jComboBox2.getSelectedItem() == "Sarana Prasarana") {
            tampilclusfix(9.0, 10.9);

        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void generatepnmlbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatepnmlbuttonActionPerformed
        // TODO add your handling code here:
        System.out.println("Threshold : " + tptcmncluster.getText() + " ");
        if (tptcmncluster.getText().equals("")) {
            tampilclusfix(1.0, 10.9);
        } else {

            double nilaiThres = Double.parseDouble(tptcmncluster.getText());

            if (nilaiThres >= 0.0 && nilaiThres <= 1.0) {

                if (jComboBox2.getSelectedItem() == "Akademik") {
                    double kons = nilaiThres + 1.0;
                    tampilclusfix(kons, 2.9);
                }
                if (jComboBox2.getSelectedItem() == "Kepegawaian") {
                    double kons = nilaiThres + 3.0;
                    tampilclusfix(kons, 4.9);
                }
                if (jComboBox2.getSelectedItem() == "Kesantrian") {
                    double kons = nilaiThres + 5.0;
                    tampilclusfix(kons, 6.9);
                }
                if (jComboBox2.getSelectedItem() == "Penerimaan Siswa Baru") {
                    double kons = nilaiThres + 7.0;
                    tampilclusfix(kons, 8.9);
                }
                if (jComboBox2.getSelectedItem() == "Sarana Prasarana") {
                    double kons = nilaiThres + 9.0;
                    tampilclusfix(kons, 10.9);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nilai Threshold antara 0 dan 1");
            }
        }
    }//GEN-LAST:event_generatepnmlbuttonActionPerformed

    private void threshbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threshbuttonActionPerformed
        // TODO add your handling code here:
        System.out.println("Treshol : " + threshfield.getText() + " ");
        if (threshfield.getText().equals("")) {
            tampilcluster(0.0);
        } else {
            double nilaitres = Double.parseDouble(threshfield.getText());
            if (nilaitres >= 0 && nilaitres <= 1) {
                tampilcluster(nilaitres);
            } else {
                JOptionPane.showMessageDialog(null, "nilai treshol antara 0-1");
            }
        }
    }//GEN-LAST:event_threshbuttonActionPerformed

    private void getActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getActionPerformed
        // TODO add your handling code here:
        if (jComboBox1.getSelectedItem() == "--No--") {
            JOptionPane.showMessageDialog(null, "Masukkan model yang ingin dibandingkan");
        } else {
            String pilih = (String) jComboBox1.getSelectedItem();

        try {
            String sql = "SELECT  * FROM datapb WHERE  `no` ="+pilih;
            //String sql = "SELECT  * FROM datapb WHERE  `no` =1";
            PreparedStatement p = (PreparedStatement) new Conn().connect().prepareStatement(sql);
            rs = p.executeQuery(sql);
            if (rs.next()) {
                LoadArea1.setText("E:MODEL/#Model Skripsi Revisi/Akademik/" + rs.getString(2));
                LoadArea2.setText("E:MODEL/#Model Skripsi Revisi/Akademik/" + rs.getString(3));
            }

        } catch (Exception e) {

        }
        }
    }//GEN-LAST:event_getActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void tampilcombo() {
        try {
            String sql = "SELECT  no FROM datapb order by no asc";
            Statement stt = (Statement) new Conn().connect().createStatement();
            rs = stt.executeQuery(sql);
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("no"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal");
        }
    }

    public double ratatrans(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double pembagi) {
        double operasiatas = (a + b + c + d + e + f + g + h + i + j);
        double operasibawah = operasiatas / pembagi;
        return operasibawah;

    }

    public double rataplc(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double pembagi) {
        double operasiatas = (a + b + c + d + e + f + g + h + i + j + k + l + m + n);
        double operasibawah = operasiatas / pembagi;
        return operasibawah;

    }

    public double ratatotal(double a, double b, double c, double d, double e, double f, double g, double h, double i, double pembagi) {
        double operasiatas = (a + b + c + d + e + f + g + h + i);
        double operasibawah = operasiatas / pembagi;
        return operasibawah;

    }

    public double resulttotal(double a, double b, double pembagi) {
        double operasiatas = (a + b);
        double operasibawah = operasiatas / pembagi;
        return operasibawah;
    }

    public double resultstruk(double a, double b, double c, double d, double pembagi) {
        double operasiatas = (a + b + c + d);
        double operasibawah = operasiatas / pembagi;
        return operasibawah;
    }

    public double resultbhv(double a, double b, double c, double d, double pembagi) {
        double operasiatas = (a + b + c + d);
        double operasibawah = operasiatas / pembagi;
        return operasibawah;
    }

    public double resultrata(double a, double b, double c, double pembagi) {
        double operasiatas = (a + b + c);
        double operasibawah = operasiatas / pembagi;
        return operasibawah;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");

            //SwingUtilities.updateComponentTreeUI(new AplikasiTATI());
        } catch (Exception e) {

        }
        new AplikasiTATI().setVisible(true);

        //new AplikasiTATI().setResizable(false);

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/p1af.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiTATI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiTATI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiTATI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiTATI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and disp1ay the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            //new AplikasiTATI().setVisible(true);
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaIrisanBhv;
    private javax.swing.JTextArea AreaIrisanStruk;
    private javax.swing.JTextArea AreaIrisanStruk_Smt;
    private javax.swing.JTextArea AreaMatrikBhv;
    private javax.swing.JTextArea AreaMatrikSmt;
    private javax.swing.JTextArea AreaMatrikStrk;
    private javax.swing.JTextArea AreaPN1A;
    private javax.swing.JTextArea AreaPN1B;
    private javax.swing.JTextArea AreaPN2A;
    private javax.swing.JTextArea AreaPN2B;
    private javax.swing.JTextArea AreaSem1;
    private javax.swing.JTextArea AreaSem2;
    private javax.swing.JTextField HasilHitungCS1;
    private javax.swing.JTextField HasilHitungCS2;
    private javax.swing.JTextField HasilHitungDice1;
    private javax.swing.JTextField HasilHitungDice2;
    private javax.swing.JTextField HasilHitungJC1;
    private javax.swing.JTextField HasilHitungJC2;
    private javax.swing.JTextField HasilHitungOV1;
    private javax.swing.JTextField HasilHitungOV2;
    private javax.swing.JButton Load1;
    private javax.swing.JButton Load2;
    private javax.swing.JTextField LoadArea1;
    private javax.swing.JTextField LoadArea2;
    private javax.swing.JButton Proses;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField TF_Path;
    private javax.swing.JTextField TempatPNMLStrk;
    private javax.swing.JTextArea areacluster;
    private javax.swing.JTextArea areacommon;
    private javax.swing.JTextField bhv;
    private javax.swing.JButton buatcommon;
    private javax.swing.JTextField cck10a;
    private javax.swing.JTextField cck1a;
    private javax.swing.JTextField cck2a;
    private javax.swing.JTextField cck3a;
    private javax.swing.JTextField cck4a;
    private javax.swing.JTextField cck5a;
    private javax.swing.JTextField cck6a;
    private javax.swing.JTextField cck7a;
    private javax.swing.JTextField cck8a;
    private javax.swing.JTextField cck9a;
    private javax.swing.JTextField cckb1;
    private javax.swing.JTextField cckb10;
    private javax.swing.JTextField cckb2;
    private javax.swing.JTextField cckb3;
    private javax.swing.JTextField cckb4;
    private javax.swing.JTextField cckb5;
    private javax.swing.JTextField cckb6;
    private javax.swing.JTextField cckb7;
    private javax.swing.JTextField cckb8;
    private javax.swing.JTextField cckb9;
    private javax.swing.JTextArea clusterfix;
    private javax.swing.JTextField cocok10a;
    private javax.swing.JTextField cocok10b;
    private javax.swing.JTextField cocok1a;
    private javax.swing.JTextField cocok1b;
    private javax.swing.JTextField cocok2a;
    private javax.swing.JTextField cocok2b;
    private javax.swing.JTextField cocok3a;
    private javax.swing.JTextField cocok3b;
    private javax.swing.JTextField cocok4a;
    private javax.swing.JTextField cocok4b;
    private javax.swing.JTextField cocok5a;
    private javax.swing.JTextField cocok5b;
    private javax.swing.JTextField cocok6a;
    private javax.swing.JTextField cocok6b;
    private javax.swing.JTextField cocok7a;
    private javax.swing.JTextField cocok7b;
    private javax.swing.JTextField cocok8a;
    private javax.swing.JTextField cocok8b;
    private javax.swing.JTextField cocok9a;
    private javax.swing.JTextField cocok9b;
    private javax.swing.JTextField cokplace10a;
    private javax.swing.JTextField cokplace10b;
    private javax.swing.JTextField cokplace11a;
    private javax.swing.JTextField cokplace11b;
    private javax.swing.JTextField cokplace12a;
    private javax.swing.JTextField cokplace12b;
    private javax.swing.JTextField cokplace13a;
    private javax.swing.JTextField cokplace13b;
    private javax.swing.JTextField cokplace14a;
    private javax.swing.JTextField cokplace14b;
    private javax.swing.JTextField cokplace1a;
    private javax.swing.JTextField cokplace1b;
    private javax.swing.JTextField cokplace2a;
    private javax.swing.JTextField cokplace2b;
    private javax.swing.JTextField cokplace3a;
    private javax.swing.JTextField cokplace3b;
    private javax.swing.JTextField cokplace4a;
    private javax.swing.JTextField cokplace4b;
    private javax.swing.JTextField cokplace5a;
    private javax.swing.JTextField cokplace5b;
    private javax.swing.JTextField cokplace6a;
    private javax.swing.JTextField cokplace6b;
    private javax.swing.JTextField cokplace7a;
    private javax.swing.JTextField cokplace7b;
    private javax.swing.JTextField cokplace8a;
    private javax.swing.JTextField cokplace8b;
    private javax.swing.JTextField cokplace9a;
    private javax.swing.JTextField cokplace9b;
    private javax.swing.JTextField compare101;
    private javax.swing.JTextField compare1010;
    private javax.swing.JTextField compare102;
    private javax.swing.JTextField compare103;
    private javax.swing.JTextField compare104;
    private javax.swing.JTextField compare105;
    private javax.swing.JTextField compare106;
    private javax.swing.JTextField compare107;
    private javax.swing.JTextField compare108;
    private javax.swing.JTextField compare109;
    private javax.swing.JTextField compare11;
    private javax.swing.JTextField compare110;
    private javax.swing.JTextField compare12;
    private javax.swing.JTextField compare13;
    private javax.swing.JTextField compare14;
    private javax.swing.JTextField compare15;
    private javax.swing.JTextField compare16;
    private javax.swing.JTextField compare17;
    private javax.swing.JTextField compare18;
    private javax.swing.JTextField compare19;
    private javax.swing.JTextField compare21;
    private javax.swing.JTextField compare210;
    private javax.swing.JTextField compare22;
    private javax.swing.JTextField compare23;
    private javax.swing.JTextField compare24;
    private javax.swing.JTextField compare25;
    private javax.swing.JTextField compare26;
    private javax.swing.JTextField compare27;
    private javax.swing.JTextField compare28;
    private javax.swing.JTextField compare29;
    private javax.swing.JTextField compare31;
    private javax.swing.JTextField compare310;
    private javax.swing.JTextField compare32;
    private javax.swing.JTextField compare33;
    private javax.swing.JTextField compare34;
    private javax.swing.JTextField compare35;
    private javax.swing.JTextField compare36;
    private javax.swing.JTextField compare37;
    private javax.swing.JTextField compare38;
    private javax.swing.JTextField compare39;
    private javax.swing.JTextField compare41;
    private javax.swing.JTextField compare410;
    private javax.swing.JTextField compare42;
    private javax.swing.JTextField compare43;
    private javax.swing.JTextField compare44;
    private javax.swing.JTextField compare45;
    private javax.swing.JTextField compare46;
    private javax.swing.JTextField compare47;
    private javax.swing.JTextField compare48;
    private javax.swing.JTextField compare49;
    private javax.swing.JTextField compare51;
    private javax.swing.JTextField compare510;
    private javax.swing.JTextField compare52;
    private javax.swing.JTextField compare53;
    private javax.swing.JTextField compare54;
    private javax.swing.JTextField compare55;
    private javax.swing.JTextField compare56;
    private javax.swing.JTextField compare57;
    private javax.swing.JTextField compare58;
    private javax.swing.JTextField compare59;
    private javax.swing.JTextField compare61;
    private javax.swing.JTextField compare610;
    private javax.swing.JTextField compare62;
    private javax.swing.JTextField compare63;
    private javax.swing.JTextField compare64;
    private javax.swing.JTextField compare65;
    private javax.swing.JTextField compare66;
    private javax.swing.JTextField compare67;
    private javax.swing.JTextField compare68;
    private javax.swing.JTextField compare69;
    private javax.swing.JTextField compare71;
    private javax.swing.JTextField compare710;
    private javax.swing.JTextField compare72;
    private javax.swing.JTextField compare73;
    private javax.swing.JTextField compare74;
    private javax.swing.JTextField compare75;
    private javax.swing.JTextField compare76;
    private javax.swing.JTextField compare77;
    private javax.swing.JTextField compare78;
    private javax.swing.JTextField compare79;
    private javax.swing.JTextField compare81;
    private javax.swing.JTextField compare810;
    private javax.swing.JTextField compare82;
    private javax.swing.JTextField compare83;
    private javax.swing.JTextField compare84;
    private javax.swing.JTextField compare85;
    private javax.swing.JTextField compare86;
    private javax.swing.JTextField compare87;
    private javax.swing.JTextField compare88;
    private javax.swing.JTextField compare89;
    private javax.swing.JTextField compare91;
    private javax.swing.JTextField compare910;
    private javax.swing.JTextField compare92;
    private javax.swing.JTextField compare93;
    private javax.swing.JTextField compare94;
    private javax.swing.JTextField compare95;
    private javax.swing.JTextField compare96;
    private javax.swing.JTextField compare97;
    private javax.swing.JTextField compare98;
    private javax.swing.JTextField compare99;
    private javax.swing.JButton generatepnmlbutton;
    private javax.swing.JButton get;
    private javax.swing.JTextField hasiljml;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jml;
    private javax.swing.JLabel namamodel1;
    private javax.swing.JLabel namamodel2;
    private javax.swing.JTextField rank1;
    private javax.swing.JTextField rank10;
    private javax.swing.JTextField rank2;
    private javax.swing.JTextField rank3;
    private javax.swing.JTextField rank4;
    private javax.swing.JTextField rank5;
    private javax.swing.JTextField rank6;
    private javax.swing.JTextField rank7;
    private javax.swing.JTextField rank8;
    private javax.swing.JTextField rank9;
    private javax.swing.JTextField resultall;
    private javax.swing.JTextField smt;
    private javax.swing.JTextField struk;
    private javax.swing.JButton threshbutton;
    private javax.swing.JTextField threshfield;
    private javax.swing.JTextField tptcmncluster;
    // End of variables declaration//GEN-END:variables
}
