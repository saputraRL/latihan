/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_algoritma;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Latihan_Algoritma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Masukkan N: ");
        int n = scanner.nextInt();
        
        int mid = n / 2 + 1;
        int left = mid;
        int right = mid;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == left || j == right) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            if (i < mid) {
                left--;
                right++;
            }else {
                left++;
                right--;
            }
            System.out.println();
        }
    }
    
}
