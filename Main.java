package uts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class Main {
     public static void main(String[] args) {

         String namaFile = "D:\\uts pl\\uts\\src\\uts\\Trapezoid.csv";

         List<DataTrapezoid> Main = new ArrayList<>();

         try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
             String line;
             reader.readLine();
             while ((line = reader.readLine()) != null) {
                 String[] row = line.split(",");
                 DataTrapezoid r = new DataTrapezoid();
                 r.sisi1 = row[0];
                 r.sisi2 = row[1];
                 r.sisi3 = row[2];

                 Main.add(r);
             }
         } catch (IOException e) {
             System.err.println("Error reading the file: " + e.getMessage());
         }
         for (int i = 0; i < Main.size(); i++) {

             if (Main.get(i).Base > Main.get(i).BBase
                     && Main.get(i).Base > Main.get(i).Height) {
                 System.out.println(Main.get(i).Height + " " + Main.get(i).Base);
             }


         DataTrapezoid trapesium = new DataTrapezoid();
         System.out.println("Luas Trapesium: " + trapesium.hitungLuas());
         System.out.println("Keliling Trapesium: " + trapesium.hitungKeliling());
     }
}

