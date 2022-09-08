/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugascottage;

import java.util.Scanner;

/**
 *
 * @author MOKLET
 */
public class Tugascottage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.print("Your Name: ");
         String nama = sc.nextLine();
         System.out.print("Cottage: ");
         String cottage = sc.nextLine();
         int org = 0;
         System.out.print("Day: ");
         String day = sc.nextLine();
         int harga = 0;
                if (cottage.equalsIgnoreCase("Duku")) {
                       org = 2;
                    if (day.equalsIgnoreCase("Weekday")){
                       harga = 915000;
                   }else if (day.equalsIgnoreCase("Weekend")){
                       harga = 1025000; 
                   }else if (day.equalsIgnoreCase("Holiday")){
                       harga = 1225000;     
                    }
                }else if (cottage.equalsIgnoreCase("Jeruk")) {
                      org = 2;
                    if (day.equalsIgnoreCase("Weekday")){
                       harga = 915000;
                   }else if (day.equalsIgnoreCase("Weekend")){
                       harga = 1025000; 
                   }else if (day.equalsIgnoreCase("Holiday")){
                       harga = 1225000;     
                    }
                }else if (cottage.equalsIgnoreCase("Alpukat")) {
                       org = 1;
                    if (day.equalsIgnoreCase("Weekday")){
                       harga = 575000;
                   }else if (day.equalsIgnoreCase("Weekend")){
                       harga = 695000; 
                   }else if (day.equalsIgnoreCase("Holiday")){
                       harga = 895000;     
                     }
                }else if (cottage.equalsIgnoreCase("Jambu Air")) {
                      org = 1;
                    if (day.equalsIgnoreCase("Weekday")){
                       harga = 575000;
                   }else if (day.equalsIgnoreCase("Weekend")){
                       harga = 695000; 
                   }else if (day.equalsIgnoreCase("Holiday")){
                       harga = 895000;
                   }
                }else if (cottage.equalsIgnoreCase("Durian")) {
                      org = 2;
                    if (day.equalsIgnoreCase("Weekday")){
                       harga = 595000;
                   }else if (day.equalsIgnoreCase("Weekend")){
                       harga = 715000; 
                   }else if (day.equalsIgnoreCase("Holiday")){
                       harga = 915000;
                   }
                }else if (cottage.equalsIgnoreCase("Melon")) {
                       org = 2;
                    if (day.equalsIgnoreCase("Weekday")){
                       harga = 595000;
                   }else if (day.equalsIgnoreCase("Weekend")){
                       harga = 715000; 
                   }else if (day.equalsIgnoreCase("Holiday")){
                       harga = 915000;
                   }
                }else if (cottage.equalsIgnoreCase("Belimbing")) {
                     org = 2;
                    if (day.equalsIgnoreCase("Weekday")){
                       harga = 495000;
                   }else if (day.equalsIgnoreCase("Weekend")){
                       harga = 575000; 
                   }else if (day.equalsIgnoreCase("Holiday")){
                       harga = 755000;
                   }
                }else if (cottage.equalsIgnoreCase("Mangga")) {
                    org = 2;
                    if (day.equalsIgnoreCase("Weekday")){
                       harga = 495000;
                   }else if (day.equalsIgnoreCase("Weekend")){
                       harga = 575000; 
                   }else if (day.equalsIgnoreCase("Holiday")){
                       harga = 755000;
                   }
                }else if (cottage.equalsIgnoreCase("Kedondong")) {
                    org = 2;
                    if (day.equalsIgnoreCase("Weekday")){
                       harga = 495000;
                   }else if (day.equalsIgnoreCase("Weekend")){
                       harga = 575000; 
                   }else if (day.equalsIgnoreCase("Holiday")){
                       harga = 755000;   
                    }
                } 
                else { System.out.println("Kamar tidak tersedia");
                }
                
                System.out.println("Name: "+ nama + "\nCottage: "+ cottage + "\nOrang: " + org +
                        "\nDay: "+ day + "\nTotal: Rp."+ harga);
                   }
    }
    


   
