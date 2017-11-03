/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oprek;

/**
 *
 * @author CHARIS
 */
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import static java.util.concurrent.ThreadLocalRandom.current;
import javax.swing.JOptionPane;
import javax.xml.transform.OutputKeys;

public class createXML_Common_Akademik {

    public static void place(String id, Document doc, Element net, String offsetX, String offSetY, String positionX, String positionY) {
        // place element
        Element place = doc.createElement("place");
        Attr attrType = doc.createAttribute("id");
        attrType.setValue(id);
        place.setAttributeNode(attrType);
        net.appendChild(place);

        Element name = doc.createElement("name");
        place.appendChild(name);

        Element grafik = doc.createElement("graphics");
        place.appendChild(grafik);

        Element text = doc.createElement("text");
        text.appendChild(
                doc.createTextNode(id));
        name.appendChild(text);

        Element grafikName = doc.createElement("graphics");
        name.appendChild(grafikName);

        Element offset = doc.createElement("offset");
        Attr attrTypeOffSet = doc.createAttribute("x");
        attrTypeOffSet.setValue(offsetX);
        offset.setAttributeNode(attrTypeOffSet);
        attrTypeOffSet = doc.createAttribute("y");
        attrTypeOffSet.setValue(offSetY);
        offset.setAttributeNode(attrTypeOffSet);
        grafikName.appendChild(offset);

        Element position = doc.createElement("position");
        Attr attrTypePosition = doc.createAttribute("x");
        attrTypePosition.setValue(positionX);
        position.setAttributeNode(attrTypePosition);
        attrTypePosition = doc.createAttribute("y");
        attrTypePosition.setValue(positionY);
        position.setAttributeNode(attrTypePosition);
        grafik.appendChild(position);

        Element dimention = doc.createElement("dimention");
        Attr attrTypeDimention = doc.createAttribute("x");
        attrTypeDimention.setValue("40");
        dimention.setAttributeNode(attrTypeDimention);
        attrTypeDimention = doc.createAttribute("y");
        attrTypeDimention.setValue("40");
        dimention.setAttributeNode(attrTypeDimention);
        grafik.appendChild(dimention);
    }

    public static void transisi(String id, Document doc, Element net, String offsetX, String offSetY, String positionX, String positionY) {
        // place element
        Element transisi = doc.createElement("transition");
        Attr attrType = doc.createAttribute("id");
        attrType.setValue(id);
        transisi.setAttributeNode(attrType);
        net.appendChild(transisi);

        Element name = doc.createElement("name");
        transisi.appendChild(name);

        Element grafik = doc.createElement("graphics");
        transisi.appendChild(grafik);

        Element text = doc.createElement("text");
        text.appendChild(
                doc.createTextNode(id));
        name.appendChild(text);

        Element grafikName = doc.createElement("graphics");
        name.appendChild(grafikName);

        Element offset = doc.createElement("offset");
        Attr attrTypeOffSet = doc.createAttribute("x");
        attrTypeOffSet.setValue(offsetX);
        offset.setAttributeNode(attrTypeOffSet);
        attrTypeOffSet = doc.createAttribute("y");
        attrTypeOffSet.setValue(offSetY);
        offset.setAttributeNode(attrTypeOffSet);
        grafikName.appendChild(offset);

        Element position = doc.createElement("position");
        Attr attrTypePosition = doc.createAttribute("x");
        attrTypePosition.setValue(positionX);
        position.setAttributeNode(attrTypePosition);
        attrTypePosition = doc.createAttribute("y");
        attrTypePosition.setValue(positionY);
        position.setAttributeNode(attrTypePosition);
        grafik.appendChild(position);

        Element dimention = doc.createElement("dimention");
        Attr attrTypeDimention = doc.createAttribute("x");
        attrTypeDimention.setValue("40");
        dimention.setAttributeNode(attrTypeDimention);
        attrTypeDimention = doc.createAttribute("y");
        attrTypeDimention.setValue("40");
        dimention.setAttributeNode(attrTypeDimention);
        grafik.appendChild(dimention);

        Element toolspecific = doc.createElement("toolspecific");
        Attr attrTypeToolSpe = doc.createAttribute("tool");
        attrTypeToolSpe.setValue("WoPed");
        toolspecific.setAttributeNode(attrTypeToolSpe);
        attrTypeToolSpe = doc.createAttribute("version");
        attrTypeToolSpe.setValue("1.0");
        toolspecific.setAttributeNode(attrTypeToolSpe);
        transisi.appendChild(toolspecific);

        Element time = doc.createElement("time");
        time.appendChild(
                doc.createTextNode("0"));
        toolspecific.appendChild(time);

        Element timeUnit = doc.createElement("timeUnit");
        timeUnit.appendChild(
                doc.createTextNode("1"));
        toolspecific.appendChild(timeUnit);

        Element orientation = doc.createElement("orientation");
        orientation.appendChild(
                doc.createTextNode("1"));
        toolspecific.appendChild(orientation);

    }

    public static void arc(String id, Document doc, Element net, String source, String target) {
        // place element
        Element arc = doc.createElement("arc");
        Attr attrType = doc.createAttribute("id");
        attrType.setValue(id);
        arc.setAttributeNode(attrType);
        attrType = doc.createAttribute("source");
        attrType.setValue(source);
        arc.setAttributeNode(attrType);
        attrType = doc.createAttribute("target");
        attrType.setValue(target);
        arc.setAttributeNode(attrType);
        net.appendChild(arc);

        Element inscription = doc.createElement("inscription");
        arc.appendChild(inscription);

        Element grafik = doc.createElement("graphics");
        arc.appendChild(grafik);

        Element text = doc.createElement("text");
        text.appendChild(
                doc.createTextNode("1"));
        inscription.appendChild(text);

        Element toolspecific = doc.createElement("toolspecific");
        Attr attrTypeToolSpe = doc.createAttribute("tool");
        attrTypeToolSpe.setValue("WoPed");
        toolspecific.setAttributeNode(attrTypeToolSpe);
        attrTypeToolSpe = doc.createAttribute("version");
        attrTypeToolSpe.setValue("1.0");
        toolspecific.setAttributeNode(attrTypeToolSpe);
        arc.appendChild(toolspecific);

        Element probability = doc.createElement("probability");
        probability.appendChild(
                doc.createTextNode("1.0"));
        toolspecific.appendChild(probability);

        Element displayProbabilityOn = doc.createElement("displayProbabilityOn");
        displayProbabilityOn.appendChild(
                doc.createTextNode("false"));
        toolspecific.appendChild(displayProbabilityOn);

        Element displayProbabilityPosition = doc.createElement("displayProbabilityPosition");
        Attr attrTypedisplayProbabilityPosition = doc.createAttribute("x");
        attrTypedisplayProbabilityPosition.setValue("500.0");
        displayProbabilityPosition.setAttributeNode(attrTypedisplayProbabilityPosition);
        attrTypedisplayProbabilityPosition = doc.createAttribute("y");
        attrTypedisplayProbabilityPosition.setValue("0.0");
        displayProbabilityPosition.setAttributeNode(attrTypedisplayProbabilityPosition);
        toolspecific.appendChild(displayProbabilityPosition);

    }

    public static void buatXML(String[] TARset) {
        //tarset0
        if (TARset.length == 2) {
            if (TARset[0] == "t1") {
                TARset[0] = "Daftar Ulang Santri Baru";
            }
            if (TARset[0] == "t2") {
                TARset[0] = "Daftar Ulang Santri Lama";
            }
            if (TARset[0] == "t3") {
                TARset[0] = "Pendataan Santri Pondok";
            }
            if (TARset[0] == "t5") {
                TARset[0] = "Pembuatan Kalender Akademik";
            }
            if (TARset[0] == "t6") {
                TARset[0] = "Proses KBM";
            }
            if (TARset[0] == "t7") {
                TARset[0] = "Ujian";
            }
            if (TARset[0] == "t8") {
                TARset[0] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[0] == "t9") {
                TARset[0] = "Proses Kelulusan";
            }
            //tarset1
            if (TARset[1] == "t1") {
                TARset[1] = "Daftar Ulang Santri Baru";
            }
            if (TARset[1] == "t2") {
                TARset[1] = "Daftar Ulang Santri Lama";
            }
            if (TARset[1] == "t3") {
                TARset[1] = "Pendataan Santri Pondok";
            }
            if (TARset[1] == "t5") {
                TARset[1] = "Pembuatan Kalender Akademik";
            }
            if (TARset[1] == "t6") {
                TARset[1] = "Proses KBM";
            }
            if (TARset[1] == "t7") {
                TARset[1] = "Ujian";
            }
            if (TARset[1] == "t8") {
                TARset[1] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[1] == "t9") {
                TARset[1] = "Proses Kelulusan";
            }
        }

        if (TARset.length == 3) {
            if (TARset[0] == "t1") {
                TARset[0] = "Daftar Ulang Santri Baru";
            }
            if (TARset[0] == "t2") {
                TARset[0] = "Daftar Ulang Santri Lama";
            }
            if (TARset[0] == "t3") {
                TARset[0] = "Pendataan Santri Pondok";
            }
            if (TARset[0] == "t5") {
                TARset[0] = "Pembuatan Kalender Akademik";
            }
            if (TARset[0] == "t6") {
                TARset[0] = "Proses KBM";
            }
            if (TARset[0] == "t7") {
                TARset[0] = "Ujian";
            }
            if (TARset[0] == "t8") {
                TARset[0] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[0] == "t9") {
                TARset[0] = "Proses Kelulusan";
            }
            //tarset1
            if (TARset[1] == "t1") {
                TARset[1] = "Daftar Ulang Santri Baru";
            }
            if (TARset[1] == "t2") {
                TARset[1] = "Daftar Ulang Santri Lama";
            }
            if (TARset[1] == "t3") {
                TARset[1] = "Pendataan Santri Pondok";
            }
            if (TARset[1] == "t5") {
                TARset[1] = "Pembuatan Kalender Akademik";
            }
            if (TARset[1] == "t6") {
                TARset[1] = "Proses KBM";
            }
            if (TARset[1] == "t7") {
                TARset[1] = "Ujian";
            }
            if (TARset[1] == "t8") {
                TARset[1] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[1] == "t9") {
                TARset[1] = "Proses Kelulusan";
            }
            //tarset
            if (TARset[2] == "t1") {
                TARset[2] = "Daftar Ulang Santri Baru";
            }
            if (TARset[2] == "t2") {
                TARset[2] = "Daftar Ulang Santri Lama";
            }
            if (TARset[2] == "t3") {
                TARset[2] = "Pendataan Santri Pondok";
            }
            if (TARset[2] == "t5") {
                TARset[2] = "Pembuatan Kalender Akademik";
            }
            if (TARset[2] == "t6") {
                TARset[2] = "Proses KBM";
            }
            if (TARset[2] == "t7") {
                TARset[2] = "Ujian";
            }
            if (TARset[2] == "t8") {
                TARset[2] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[2] == "t9") {
                TARset[2] = "Proses Kelulusan";
            }
        }
        //tarset3
        if (TARset.length == 4) {
            if (TARset[0] == "t1") {
                TARset[0] = "Daftar Ulang Santri Baru";
            }
            if (TARset[0] == "t2") {
                TARset[0] = "Daftar Ulang Santri Lama";
            }
            if (TARset[0] == "t3") {
                TARset[0] = "Pendataan Santri Pondok";
            }
            if (TARset[0] == "t5") {
                TARset[0] = "Pembuatan Kalender Akademik";
            }
            if (TARset[0] == "t6") {
                TARset[0] = "Proses KBM";
            }
            if (TARset[0] == "t7") {
                TARset[0] = "Ujian";
            }
            if (TARset[0] == "t8") {
                TARset[0] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[0] == "t9") {
                TARset[0] = "Proses Kelulusan";
            }
            //tarset1
            if (TARset[1] == "t1") {
                TARset[1] = "Daftar Ulang Santri Baru";
            }
            if (TARset[1] == "t2") {
                TARset[1] = "Daftar Ulang Santri Lama";
            }
            if (TARset[1] == "t3") {
                TARset[1] = "Pendataan Santri Pondok";
            }
            if (TARset[1] == "t5") {
                TARset[1] = "Pembuatan Kalender Akademik";
            }
            if (TARset[1] == "t6") {
                TARset[1] = "Proses KBM";
            }
            if (TARset[1] == "t7") {
                TARset[1] = "Ujian";
            }
            if (TARset[1] == "t8") {
                TARset[1] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[1] == "t9") {
                TARset[1] = "Proses Kelulusan";
            }
            //tarset2
            if (TARset[2] == "t1") {
                TARset[2] = "Daftar Ulang Santri Baru";
            }
            if (TARset[2] == "t2") {
                TARset[2] = "Daftar Ulang Santri Lama";
            }
            if (TARset[2] == "t3") {
                TARset[2] = "Pendataan Santri Pondok";
            }
            if (TARset[2] == "t5") {
                TARset[2] = "Pembuatan Kalender Akademik";
            }
            if (TARset[2] == "t6") {
                TARset[2] = "Proses KBM";
            }
            if (TARset[2] == "t7") {
                TARset[2] = "Ujian";
            }
            if (TARset[2] == "t8") {
                TARset[2] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[2] == "t9") {
                TARset[2] = "Proses Kelulusan";
            }
            //tarset3
            if (TARset[3] == "t1") {
                TARset[3] = "Daftar Ulang Santri Baru";
            }
            if (TARset[3] == "t2") {
                TARset[3] = "Daftar Ulang Santri Lama";
            }
            if (TARset[3] == "t3") {
                TARset[3] = "Pendataan Santri Pondok";
            }
            if (TARset[3] == "t5") {
                TARset[3] = "Pembuatan Kalender Akademik";
            }
            if (TARset[3] == "t6") {
                TARset[3] = "Proses KBM";
            }
            if (TARset[3] == "t7") {
                TARset[3] = "Ujian";
            }
            if (TARset[3] == "t8") {
                TARset[3] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[3] == "t9") {
                TARset[3] = "Proses Kelulusan";
            }
        }
        if (TARset.length == 5) {
            if (TARset[0] == "t1") {
                TARset[0] = "Daftar Ulang Santri Baru";
            }
            if (TARset[0] == "t2") {
                TARset[0] = "Daftar Ulang Santri Lama";
            }
            if (TARset[0] == "t3") {
                TARset[0] = "Pendataan Santri Pondok";
            }
            if (TARset[0] == "t5") {
                TARset[0] = "Pembuatan Kalender Akademik";
            }
            if (TARset[0] == "t6") {
                TARset[0] = "Proses KBM";
            }
            if (TARset[0] == "t7") {
                TARset[0] = "Ujian";
            }
            if (TARset[0] == "t8") {
                TARset[0] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[0] == "t9") {
                TARset[0] = "Proses Kelulusan";
            }
            //tarset1
            if (TARset[1] == "t1") {
                TARset[1] = "Daftar Ulang Santri Baru";
            }
            if (TARset[1] == "t2") {
                TARset[1] = "Daftar Ulang Santri Lama";
            }
            if (TARset[1] == "t3") {
                TARset[1] = "Pendataan Santri Pondok";
            }
            if (TARset[1] == "t5") {
                TARset[1] = "Pembuatan Kalender Akademik";
            }
            if (TARset[1] == "t6") {
                TARset[1] = "Proses KBM";
            }
            if (TARset[1] == "t7") {
                TARset[1] = "Ujian";
            }
            if (TARset[1] == "t8") {
                TARset[1] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[1] == "t9") {
                TARset[1] = "Proses Kelulusan";
            }
            //tarset2            
            if (TARset[2] == "t1") {
                TARset[2] = "Daftar Ulang Santri Baru";
            }
            if (TARset[2] == "t2") {
                TARset[2] = "Daftar Ulang Santri Lama";
            }
            if (TARset[2] == "t3") {
                TARset[2] = "Pendataan Santri Pondok";
            }
            if (TARset[2] == "t5") {
                TARset[2] = "Pembuatan Kalender Akademik";
            }
            if (TARset[2] == "t6") {
                TARset[2] = "Proses KBM";
            }
            if (TARset[2] == "t7") {
                TARset[2] = "Ujian";
            }
            if (TARset[2] == "t8") {
                TARset[2] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[2] == "t9") {
                TARset[2] = "Proses Kelulusan";
            }
            //tarset3
            if (TARset[3] == "t1") {
                TARset[3] = "Daftar Ulang Santri Baru";
            }
            if (TARset[3] == "t2") {
                TARset[3] = "Daftar Ulang Santri Lama";
            }
            if (TARset[3] == "t3") {
                TARset[3] = "Pendataan Santri Pondok";
            }
            if (TARset[3] == "t5") {
                TARset[3] = "Pembuatan Kalender Akademik";
            }
            if (TARset[3] == "t6") {
                TARset[3] = "Proses KBM";
            }
            if (TARset[3] == "t7") {
                TARset[3] = "Ujian";
            }
            if (TARset[3] == "t8") {
                TARset[3] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[3] == "t9") {
                TARset[3] = "Proses Kelulusan";
            }
            //tarset4
            if (TARset[4] == "t1") {
                TARset[4] = "Daftar Ulang Santri Baru";
            }
            if (TARset[4] == "t2") {
                TARset[4] = "Daftar Ulang Santri Lama";
            }
            if (TARset[4] == "t3") {
                TARset[4] = "Pendataan Santri Pondok";
            }
            if (TARset[4] == "t5") {
                TARset[4] = "Pembuatan Kalender Akademik";
            }
            if (TARset[4] == "t6") {
                TARset[4] = "Proses KBM";
            }
            if (TARset[4] == "t7") {
                TARset[4] = "Ujian";
            }
            if (TARset[4] == "t8") {
                TARset[4] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[4] == "t9") {
                TARset[4] = "Proses Kelulusan";
            }
        }
        if (TARset.length == 6) {
            if (TARset[0] == "t1") {
                TARset[0] = "Daftar Ulang Santri Baru";
            }
            if (TARset[0] == "t2") {
                TARset[0] = "Daftar Ulang Santri Lama";
            }
            if (TARset[0] == "t3") {
                TARset[0] = "Pendataan Santri Pondok";
            }
            if (TARset[0] == "t5") {
                TARset[0] = "Pembuatan Kalender Akademik";
            }
            if (TARset[0] == "t6") {
                TARset[0] = "Proses KBM";
            }
            if (TARset[0] == "t7") {
                TARset[0] = "Ujian";
            }
            if (TARset[0] == "t8") {
                TARset[0] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[0] == "t9") {
                TARset[0] = "Proses Kelulusan";
            }
            //tarset1
            if (TARset[1] == "t1") {
                TARset[1] = "Daftar Ulang Santri Baru";
            }
            if (TARset[1] == "t2") {
                TARset[1] = "Daftar Ulang Santri Lama";
            }
            if (TARset[1] == "t3") {
                TARset[1] = "Pendataan Santri Pondok";
            }
            if (TARset[1] == "t5") {
                TARset[1] = "Pembuatan Kalender Akademik";
            }
            if (TARset[1] == "t6") {
                TARset[1] = "Proses KBM";
            }
            if (TARset[1] == "t7") {
                TARset[1] = "Ujian";
            }
            if (TARset[1] == "t8") {
                TARset[1] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[1] == "t9") {
                TARset[1] = "Proses Kelulusan";
            }
            //tarset2            
            if (TARset[2] == "t1") {
                TARset[2] = "Daftar Ulang Santri Baru";
            }
            if (TARset[2] == "t2") {
                TARset[2] = "Daftar Ulang Santri Lama";
            }
            if (TARset[2] == "t3") {
                TARset[2] = "Pendataan Santri Pondok";
            }
            if (TARset[2] == "t5") {
                TARset[2] = "Pembuatan Kalender Akademik";
            }
            if (TARset[2] == "t6") {
                TARset[2] = "Proses KBM";
            }
            if (TARset[2] == "t7") {
                TARset[2] = "Ujian";
            }
            if (TARset[2] == "t8") {
                TARset[2] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[2] == "t9") {
                TARset[2] = "Proses Kelulusan";
            }
            //tarset3
            if (TARset[3] == "t1") {
                TARset[3] = "Daftar Ulang Santri Baru";
            }
            if (TARset[3] == "t2") {
                TARset[3] = "Daftar Ulang Santri Lama";
            }
            if (TARset[3] == "t3") {
                TARset[3] = "Pendataan Santri Pondok";
            }
            if (TARset[3] == "t5") {
                TARset[3] = "Pembuatan Kalender Akademik";
            }
            if (TARset[3] == "t6") {
                TARset[3] = "Proses KBM";
            }
            if (TARset[3] == "t7") {
                TARset[3] = "Ujian";
            }
            if (TARset[3] == "t8") {
                TARset[3] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[3] == "t9") {
                TARset[3] = "Proses Kelulusan";
            }
            //tarset4
            if (TARset[4] == "t1") {
                TARset[4] = "Daftar Ulang Santri Baru";
            }
            if (TARset[4] == "t2") {
                TARset[4] = "Daftar Ulang Santri Lama";
            }
            if (TARset[4] == "t3") {
                TARset[4] = "Pendataan Santri Pondok";
            }
            if (TARset[4] == "t5") {
                TARset[4] = "Pembuatan Kalender Akademik";
            }
            if (TARset[4] == "t6") {
                TARset[4] = "Proses KBM";
            }
            if (TARset[4] == "t7") {
                TARset[4] = "Ujian";
            }
            if (TARset[4] == "t8") {
                TARset[4] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[4] == "t9") {
                TARset[4] = "Proses Kelulusan";
            }
            //tarset5
            if (TARset[5] == "t1") {
                TARset[5] = "Daftar Ulang Santri Baru";
            }
            if (TARset[5] == "t2") {
                TARset[5] = "Daftar Ulang Santri Lama";
            }
            if (TARset[5] == "t3") {
                TARset[5] = "Pendataan Santri Pondok";
            }
            if (TARset[5] == "t5") {
                TARset[5] = "Pembuatan Kalender Akademik";
            }
            if (TARset[5] == "t6") {
                TARset[5] = "Proses KBM";
            }
            if (TARset[5] == "t7") {
                TARset[5] = "Ujian";
            }
            if (TARset[5] == "t8") {
                TARset[5] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[5] == "t9") {
                TARset[5] = "Proses Kelulusan";
            }

        }
        if (TARset.length == 7) {
            if (TARset[0] == "t1") {
                TARset[0] = "Daftar Ulang Santri Baru";
            }
            if (TARset[0] == "t2") {
                TARset[0] = "Daftar Ulang Santri Lama";
            }
            if (TARset[0] == "t3") {
                TARset[0] = "Pendataan Santri Pondok";
            }
            if (TARset[0] == "t5") {
                TARset[0] = "Pembuatan Kalender Akademik";
            }
            if (TARset[0] == "t6") {
                TARset[0] = "Proses KBM";
            }
            if (TARset[0] == "t7") {
                TARset[0] = "Ujian";
            }
            if (TARset[0] == "t8") {
                TARset[0] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[0] == "t9") {
                TARset[0] = "Proses Kelulusan";
            }
            //tarset1
            if (TARset[1] == "t1") {
                TARset[1] = "Daftar Ulang Santri Baru";
            }
            if (TARset[1] == "t2") {
                TARset[1] = "Daftar Ulang Santri Lama";
            }
            if (TARset[1] == "t3") {
                TARset[1] = "Pendataan Santri Pondok";
            }
            if (TARset[1] == "t5") {
                TARset[1] = "Pembuatan Kalender Akademik";
            }
            if (TARset[1] == "t6") {
                TARset[1] = "Proses KBM";
            }
            if (TARset[1] == "t7") {
                TARset[1] = "Ujian";
            }
            if (TARset[1] == "t8") {
                TARset[1] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[1] == "t9") {
                TARset[1] = "Proses Kelulusan";
            }
            //tarset2            
            if (TARset[2] == "t1") {
                TARset[2] = "Daftar Ulang Santri Baru";
            }
            if (TARset[2] == "t2") {
                TARset[2] = "Daftar Ulang Santri Lama";
            }
            if (TARset[2] == "t3") {
                TARset[2] = "Pendataan Santri Pondok";
            }
            if (TARset[2] == "t5") {
                TARset[2] = "Pembuatan Kalender Akademik";
            }
            if (TARset[2] == "t6") {
                TARset[2] = "Proses KBM";
            }
            if (TARset[2] == "t7") {
                TARset[2] = "Ujian";
            }
            if (TARset[2] == "t8") {
                TARset[2] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[2] == "t9") {
                TARset[2] = "Proses Kelulusan";
            }
            //tarset3
            if (TARset[3] == "t1") {
                TARset[3] = "Daftar Ulang Santri Baru";
            }
            if (TARset[3] == "t2") {
                TARset[3] = "Daftar Ulang Santri Lama";
            }
            if (TARset[3] == "t3") {
                TARset[3] = "Pendataan Santri Pondok";
            }
            if (TARset[3] == "t5") {
                TARset[3] = "Pembuatan Kalender Akademik";
            }
            if (TARset[3] == "t6") {
                TARset[3] = "Proses KBM";
            }
            if (TARset[3] == "t7") {
                TARset[3] = "Ujian";
            }
            if (TARset[3] == "t8") {
                TARset[3] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[3] == "t9") {
                TARset[3] = "Proses Kelulusan";
            }
            //tarset4
            if (TARset[4] == "t1") {
                TARset[4] = "Daftar Ulang Santri Baru";
            }
            if (TARset[4] == "t2") {
                TARset[4] = "Daftar Ulang Santri Lama";
            }
            if (TARset[4] == "t3") {
                TARset[4] = "Pendataan Santri Pondok";
            }
            if (TARset[4] == "t5") {
                TARset[4] = "Pembuatan Kalender Akademik";
            }
            if (TARset[4] == "t6") {
                TARset[4] = "Proses KBM";
            }
            if (TARset[4] == "t7") {
                TARset[4] = "Ujian";
            }
            if (TARset[4] == "t8") {
                TARset[4] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[4] == "t9") {
                TARset[4] = "Proses Kelulusan";
            }
            //tarset5
            if (TARset[5] == "t1") {
                TARset[5] = "Daftar Ulang Santri Baru";
            }
            if (TARset[5] == "t2") {
                TARset[5] = "Daftar Ulang Santri Lama";
            }
            if (TARset[5] == "t3") {
                TARset[5] = "Pendataan Santri Pondok";
            }
            if (TARset[5] == "t5") {
                TARset[5] = "Pembuatan Kalender Akademik";
            }
            if (TARset[5] == "t6") {
                TARset[5] = "Proses KBM";
            }
            if (TARset[5] == "t7") {
                TARset[5] = "Ujian";
            }
            if (TARset[5] == "t8") {
                TARset[5] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[5] == "t9") {
                TARset[5] = "Proses Kelulusan";
            }
            //tarset6
            if (TARset[6] == "t1") {
                TARset[6] = "Daftar Ulang Santri Baru";
            }
            if (TARset[6] == "t2") {
                TARset[6] = "Daftar Ulang Santri Lama";
            }
            if (TARset[6] == "t3") {
                TARset[6] = "Pendataan Santri Pondok";
            }
            if (TARset[6] == "t5") {
                TARset[6] = "Pembuatan Kalender Akademik";
            }
            if (TARset[6] == "t6") {
                TARset[6] = "Proses KBM";
            }
            if (TARset[6] == "t7") {
                TARset[6] = "Ujian";
            }
            if (TARset[6] == "t8") {
                TARset[6] = "Kalkulasi Nilai Ujian";
            }
            if (TARset[6] == "t9") {
                TARset[6] = "Proses Kelulusan";
            }
        }
        try {

            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            // PNML element
            Element rootElement = doc.createElement("pnml");
            doc.appendChild(rootElement);

            //  net element
            Element net = doc.createElement("net");
            rootElement.appendChild(net);
            // setting attribute to element
            Attr attr = doc.createAttribute("type");
            attr.setValue("\"http://www.informatik.hu-berlin.de/top/pntd/ptNetb\"");
            net.setAttributeNode(attr);
            attr = doc.createAttribute("id");
            attr.setValue("noID");
            net.setAttributeNode(attr);

            if (TARset.length == 2) {
                transisi(TARset[0], doc, net, "140", "150", "140", "110");
                place("mulai", doc, net, "40", "150", "40", "110");
                arc("a1", doc, net, "mulai", TARset[0]);

                place("p2", doc, net, "240", "150", "240", "110");
                arc("a1", doc, net, TARset[0], "p2");

                transisi(TARset[1], doc, net, "340", "150", "340", "110");
                arc("a1", doc, net, "p2", TARset[1]);

                place("selesai", doc, net, "440", "150", "440", "110");
                arc("a1", doc, net, TARset[1], "selesai");

            } else if(TARset.length==3){
                
                
                 place("mulai", doc, net, "40", "150", "40", "110");
                transisi(TARset[0], doc, net, "140", "150", "140", "110");
                arc("a1", doc, net, "mulai", TARset[0]);

                place("p2", doc, net, "240", "150", "240", "110");
                arc("a1", doc, net, TARset[0], "p2");

                transisi(TARset[1], doc, net, "340", "150", "340", "110");
                arc("a1", doc, net, "p2", TARset[1]);

                place("p3", doc, net, "440", "150", "440", "110");
                arc("a1", doc, net, TARset[1], "p3");
                
                transisi(TARset[2], doc, net, "540", "150", "540", "110");
                arc("a1", doc, net, "p3", TARset[2]);
                
                place("selesai", doc, net, "640", "150", "640", "110");
                arc("a1", doc, net, TARset[2], "selesai");
            }
            else if (TARset.length == 4) {
                place("mulai", doc, net, "40", "150", "40", "110");
                transisi(TARset[0], doc, net, "140", "150", "140", "110");
                arc("a1", doc, net, "mulai", TARset[0]);

                place("p2", doc, net, "240", "150", "240", "110");
                arc("a1", doc, net, TARset[0], "p2");

                transisi(TARset[1], doc, net, "340", "150", "340", "110");
                arc("a1", doc, net, "p2", TARset[1]);

                place("p3", doc, net, "440", "150", "440", "110");
                arc("a1", doc, net, TARset[1], "p3");
                
                transisi(TARset[2], doc, net, "540", "150", "540", "110");
                arc("a1", doc, net, "p3", TARset[2]);
                
                place("p4", doc, net, "640", "150", "640", "110");
                arc("a1", doc, net, TARset[2], "p4");
                
                transisi(TARset[3], doc, net, "740", "150", "740", "110");
                arc("a1", doc, net, "p4", TARset[3]);
                
                place("selesai", doc, net, "840", "150", "840", "110");
                arc("a1", doc, net, TARset[3], "selesai");
            }
            
            else if (TARset.length == 5) {
                place("mulai", doc, net, "40", "150", "40", "110");
                transisi(TARset[0], doc, net, "140", "150", "140", "110");
                arc("a1", doc, net, "mulai", TARset[0]);

                place("p2", doc, net, "240", "150", "240", "110");
                arc("a1", doc, net, TARset[0], "p2");

                transisi(TARset[1], doc, net, "340", "150", "340", "110");
                arc("a1", doc, net, "p2", TARset[1]);

                place("p3", doc, net, "440", "150", "440", "110");
                arc("a1", doc, net, TARset[1], "p3");
                
                transisi(TARset[2], doc, net, "540", "150", "540", "110");
                arc("a1", doc, net, "p3", TARset[2]);
                
                place("p4", doc, net, "640", "150", "640", "110");
                arc("a1", doc, net, TARset[2], "p4");
                
                transisi(TARset[3], doc, net, "740", "150", "740", "110");
                arc("a1", doc, net, "p4", TARset[3]);
                
                place("p5", doc, net, "840", "150", "840", "110");
                arc("a1", doc, net, TARset[3], "p5"); 
                
                transisi(TARset[4], doc, net, "940", "150", "940", "110");
                arc("a1", doc, net, "p5", TARset[4]);
                
                place("selesai", doc, net, "1040", "150", "1040", "110");
                arc("a1", doc, net, TARset[4], "selesai");
            }
            
            else if (TARset.length == 6) {
                place("mulai", doc, net, "40", "150", "40", "110");
                transisi(TARset[0], doc, net, "140", "150", "140", "110");
                arc("a1", doc, net, "mulai", TARset[0]);

                place("p2", doc, net, "240", "150", "240", "110");
                arc("a1", doc, net, TARset[0], "p2");

                transisi(TARset[1], doc, net, "340", "150", "340", "110");
                arc("a1", doc, net, "p2", TARset[1]);

                place("p3", doc, net, "440", "150", "440", "110");
                arc("a1", doc, net, TARset[1], "p3");
                
                transisi(TARset[2], doc, net, "540", "150", "540", "110");
                arc("a1", doc, net, "p3", TARset[2]);
                
                place("p4", doc, net, "640", "150", "640", "110");
                arc("a1", doc, net, TARset[2], "p4");
                
                transisi(TARset[3], doc, net, "740", "150", "740", "110");
                arc("a1", doc, net, "p4", TARset[3]);
                
                place("p5", doc, net, "840", "150", "840", "110");
                arc("a1", doc, net, TARset[3], "p5"); 
                
                transisi(TARset[4], doc, net, "940", "150", "940", "110");
                arc("a1", doc, net, "p5", TARset[4]);
                
                //
                place("p6", doc, net, "1040", "150", "1040", "110");
                arc("a1", doc, net, TARset[4], "p6"); 
                
                transisi(TARset[5], doc, net, "1140", "150", "1140", "110");
                arc("a1", doc, net, "p6", TARset[5]);
                //               
                
                
                place("selesai", doc, net, "1240", "150", "1240", "110");
                arc("a1", doc, net, TARset[5], "selesai");
            }
            
            else if (TARset.length == 7) {
                place("mulai", doc, net, "40", "150", "40", "110");
                transisi(TARset[0], doc, net, "140", "150", "140", "110");
                arc("a1", doc, net, "mulai", TARset[0]);

                place("p2", doc, net, "240", "150", "240", "110");
                arc("a1", doc, net, TARset[0], "p2");

                transisi(TARset[1], doc, net, "340", "150", "340", "110");
                arc("a1", doc, net, "p2", TARset[1]);

                place("p3", doc, net, "440", "150", "440", "110");
                arc("a1", doc, net, TARset[1], "p3");
                
                transisi(TARset[2], doc, net, "540", "150", "540", "110");
                arc("a1", doc, net, "p3", TARset[2]);
                
                place("p4", doc, net, "640", "150", "640", "110");
                arc("a1", doc, net, TARset[2], "p4");
                
                transisi(TARset[3], doc, net, "740", "150", "740", "110");
                arc("a1", doc, net, "p4", TARset[3]);
                
                place("p5", doc, net, "840", "150", "840", "110");
                arc("a1", doc, net, TARset[3], "p5"); 
                
                transisi(TARset[4], doc, net, "940", "150", "940", "110");
                arc("a1", doc, net, "p5", TARset[4]);
                
                
                place("p6", doc, net, "1040", "150", "1040", "110");
                arc("a1", doc, net, TARset[4], "p6"); 
                
                transisi(TARset[5], doc, net, "1140", "150", "1140", "110");
                arc("a1", doc, net, "p6", TARset[5]);
                   
                
                //
                place("p7", doc, net, "1240", "150", "1240", "110");
                arc("a1", doc, net, TARset[5], "p7"); 
                
                transisi(TARset[6], doc, net, "1340", "150", "1340", "110");
                arc("a1", doc, net, "p7", TARset[6]);
                //
                
                
                place("selesai", doc, net, "1440", "150", "1440", "110");
                arc("a1", doc, net, TARset[6], "selesai");
            }

            // tool spesifik
            Element toolspecific = doc.createElement("toolspecific");
            Attr attrTypeToolSpe = doc.createAttribute("tool");
            attrTypeToolSpe.setValue("WoPed");
            toolspecific.setAttributeNode(attrTypeToolSpe);
            attrTypeToolSpe = doc.createAttribute("version");
            attrTypeToolSpe.setValue("1.0");
            toolspecific.setAttributeNode(attrTypeToolSpe);
            net.appendChild(toolspecific);

            Element bounds = doc.createElement("bounds");
            toolspecific.appendChild(bounds);

            Element positionBounds = doc.createElement("position");
            Attr attrTypePositionBounds = doc.createAttribute("x");
            attrTypePositionBounds.setValue("2");
            positionBounds.setAttributeNode(attrTypePositionBounds);
            attrTypePositionBounds = doc.createAttribute("y");
            attrTypePositionBounds.setValue("25");
            positionBounds.setAttributeNode(attrTypePositionBounds);
            bounds.appendChild(positionBounds);

            Element dimentionBounds = doc.createElement("dimention");
            Attr attrTypeDimentionBounds = doc.createAttribute("x");
            attrTypeDimentionBounds.setValue("779");
            dimentionBounds.setAttributeNode(attrTypeDimentionBounds);
            attrTypeDimentionBounds = doc.createAttribute("y");
            attrTypeDimentionBounds.setValue("515");
            dimentionBounds.setAttributeNode(attrTypeDimentionBounds);
            bounds.appendChild(dimentionBounds);

            Element scale = doc.createElement("scale");
            scale.appendChild(
                    doc.createTextNode("100"));
            toolspecific.appendChild(scale);

            Element treeWidthRight = doc.createElement("treeWidthRight");
            treeWidthRight.appendChild(
                    doc.createTextNode("581"));
            toolspecific.appendChild(treeWidthRight);

            Element overviewPanelVisible = doc.createElement("overviewPanelVisible");
            overviewPanelVisible.appendChild(
                    doc.createTextNode("true"));
            toolspecific.appendChild(overviewPanelVisible);

            Element treeHeightOverview = doc.createElement("treeHeightOverview");
            treeHeightOverview.appendChild(
                    doc.createTextNode("100"));
            toolspecific.appendChild(treeHeightOverview);

            Element treePanelVisible = doc.createElement("treePanelVisible");
            treePanelVisible.appendChild(
                    doc.createTextNode("true"));
            toolspecific.appendChild(treePanelVisible);

            Element verticalLayout = doc.createElement("verticalLayout");
            verticalLayout.appendChild(
                    doc.createTextNode("false"));
            toolspecific.appendChild(verticalLayout);

            Element resources = doc.createElement("resources");
            toolspecific.appendChild(resources);

            Element simulations = doc.createElement("simulations");
            toolspecific.appendChild(simulations);

            Element partnerLinks = doc.createElement("partnerLinks");
            toolspecific.appendChild(partnerLinks);

            Element variables = doc.createElement("variables");
            toolspecific.appendChild(variables);

            // write the content into xml file
            TransformerFactory transformerFactory
                    = TransformerFactory.newInstance();
            Transformer transformer
                    = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource source = new DOMSource(doc);
            StreamResult result
                    = new StreamResult(new File("E:/MODEL/Model Baru/Common_Akademik.pnml"));
            transformer.transform(source, result);
            // Output to console for testing
            StreamResult consoleResult
                    = new StreamResult(System.out);
            transformer.transform(source, consoleResult);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, "Ekstraksi Common Fragment Sukses !");
    }

    static String[] hilangkanSimilarValue(String[] input) {

        String current = input[0];
        String[] hasil = new String[7];
        boolean found = false;

        for (int i = 0; i < input.length; i++) {
            if (current == input[i] && !found) {
                found = true;
            } else if (current != input[i]) {
                System.out.print(" " + current);
                current = input[i];
                hasil[i] = current;
                found = false;
            }
        }
        System.out.print(" " + current);
        return hasil;
    }

    public static void main(String argv[]) {
        String tar[] = {"t1","t2","t3","t4","t5","t1","t2"};
        //String tar[]={"Daftar Ulang Santri Baru","Daftar Ulang Lama","Daftar Ulang Santri Lama","Proses KBM","Ujian","Kalkulasi Nilai Ujian","Proses Kelulusan"};
        String[] hasil = hilangkanSimilarValue(tar);

        buatXML(tar);

    }
}
