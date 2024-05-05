/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericprogamming;

/**
 *
 * @author ASUS ExpertBook
 */
public class myGeneric<T> {
    T ob;
//deklarasi sebuah objek dari tipe T
myGeneric (T o){
ob = o;
}
T getob() {
return ob;
}
void showType() {
System.out.println("Tipe T adalah"+
ob.getClass().getName());
}
}
