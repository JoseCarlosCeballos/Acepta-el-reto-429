/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta.el.reto.pkg429;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class AceptaElReto429 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int x = 0;
        x = sc.nextInt();
        int hangar [] = new int [x];
        hangar [x] = sc.nextInt();
        
        int y = 0;
        y = sc.nextInt();
        int naves [] = new int [y];
        naves [y] = sc.nextInt();
        
        int pos;
        
        pos = 0;
        for (int i = 0; i < x; i++) {
            if (hangar[i] > hangar [pos]){
            pos = i;
            }
            
        }
        hangar[x] = hangar[x] - naves[y];

    }
    
}
