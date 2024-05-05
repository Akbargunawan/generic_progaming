/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericprogamming;

/**
 *
 * @author ASUS ExpertBook
 */
public class myGenericTest {
    public static void main(String[] args) {
  myGeneric<Integer> iOb = new myGeneric<>(88);
 iOb.showType();
 int v = iOb.getob();   
 System.out.println("value : "+v);
 System.out.println();
 myGeneric<String> strOb = new myGeneric<>("Generic Test");
 String v2 = strOb.getob();
 strOb.showType();
 System.out.println("value: "+ v2);
 System.out.println();
 //Integer i = (Integer) strOb.getob();
 //Error: cannot cast from String to Integer
 }

}
