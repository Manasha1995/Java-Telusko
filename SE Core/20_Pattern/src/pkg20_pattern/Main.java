/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_pattern;

/**
 *
 * @author manas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            1
            1 0 
            0 1 0
            1 0 1 0
        */
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j<=i; j++) {
                if(i%2==1&&j%2==1){
                    System.out.print(" 1");
                }else if(i%2==1&&j%2==0){
                    System.out.print(" 0");
                }else if(i%2==0&&j%2==1){
                    System.out.print(" 0");
                }else{
                    System.out.print(" 1");
                }
            }
            System.out.println(" ");
        }
    }
    
}
