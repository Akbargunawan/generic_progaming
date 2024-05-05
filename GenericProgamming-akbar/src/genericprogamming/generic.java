/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericprogamming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 *
 * @author ASUS ExpertBook
 */
public class generic {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<mahasiswa> ListV = new ArrayList();
        for (int i = 0; i < 100; i++) {
         mahasiswa m = new mahasiswa();
        m.setNim(i);
        m.setNama("Yaseru");
        m.setEmail("yaseru@example.com");    
        
        ListV.add(m);
        }
        for (mahasiswa mhs : ListV) {
            int nim = mhs.getNim();
            String nama = mhs.getNama();
            String email = mhs.getEmail();
            
            System.out.println("nim " + nim);
            System.out.println("nama" + nama);
            System.out.println("email" + email);
            System.out.println("================");
        }
    }
    
}
