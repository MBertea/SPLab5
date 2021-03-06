package ro.uvt;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Hi!");

//        Section section = new Section();
//        List<Autor> autori = Arrays.asList(new Autor("Ion Barbu"));
//
//        Carte c = new Carte(autori, "CarteX");
//        c.add(new Paragraf());
//        Section s1 = new Section();
////        s1.add(new Imagine());
//        c.add(s1);
//       // c.createCapitol("Introducere", Arrays.asList(new Paragraf(), new Imagine(), new Tabel(), new Tabel()));
//
//        c.render();


//        long startTime = System.currentTimeMillis();
//        ImageProxy img1 = new ImageProxy("Porsche");
//        ImageProxy img2 = new ImageProxy("Bugatti");
//        ImageProxy img3 = new ImageProxy("Ferrari");
//
//        Section topGearS1 = new Section("Front Cover");
//        topGearS1.add(img1);
//
//        Section topGearS2 = new Section("Cars");
//        topGearS2.add(img2);
//        topGearS2.add(img3);
//
//        List<Autor> autori = Arrays.asList(new Autor("Team Top Gear"));
//
//
//        Carte topGear = new Carte(autori, "Top Gear");
//
//        topGear.add(topGearS1);
//        topGear.add(topGearS2);
//
//        long endTime = System.currentTimeMillis();
//        System.out.println("Creation of the content took " + (endTime - startTime) + " miliseconds.");
//
//        startTime = System.currentTimeMillis();
//        topGearS1.render();
//        endTime = System.currentTimeMillis();
//
//        System.out.println("Printing again the section 1 took " + (endTime - startTime) + " miliseconds.");
//
//        startTime = System.currentTimeMillis();
//        topGearS2.render();
//        endTime = System.currentTimeMillis();
//
//        System.out.println("Printing again the section 2 took " + (endTime - startTime) + " miliseconds.");

        Section cap1 = new Section("Cap 1");

        Paragraph p1 = new Paragraph("Paragraph 1", "Text1");
        cap1.add(p1);

        Paragraph p2 = new Paragraph("Paragraph 2", "Text2");
        cap1.add(p2);

        Paragraph p3 = new Paragraph("Paragraph 3", "Text3");
        cap1.add(p3);

        Paragraph p4 = new Paragraph("Paragraph 4", "Text4");
        cap1.add(p4);

        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();

        System.out.println();
        p1.setAlignStrategy(new AlignLeft());
        p2.setAlignStrategy(new AlignCenter());
        p3.setAlignStrategy(new AlignRight());
        p4.setAlignStrategy(new AlignRight());

        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print();
    }
}
