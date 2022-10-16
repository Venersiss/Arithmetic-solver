/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package custodio;

import java.util.Scanner;

/**
 *
 * @author Venersis
 */
public class arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // variables etc 

        Scanner a = new Scanner(System.in);
        String b;
        float c;
        float d;
        float e;
        float f;
        //code
        do {
            
            System.out.println("Hello! this is Custodio's primitive arithmetic sequence solver" + "\n" + "Just choose the function you want to use" + "\n" + "==========================================================");
            System.out.println("Determine the nth element" + "\n" + "Determine the arithmetic mean" + "\n" + "Sum of an arithmetic series" + "\n" + "[element] [mean] [sum]");
            b = a.next();

            if (b.equals("element")) {
                System.out.println("Input the 1st term:");
                c = a.nextFloat();
                System.out.println("input the common difference: ");
                d = a.nextFloat();
                System.out.println("and what number of element you want to get: ");
                e = a.nextFloat();
                float ans = c + (e - 1) * d;
                if (ans == 1) {
                    System.out.println(ans + " is the " + e + "st element of the series");
                } else if (ans == 2) {
                    System.out.println(ans + " is the " + e + "nd element of the series");
                } else if (ans == 3) {
                    System.out.println(ans + " is the " + e + "rd element of the series");
                } else if (ans > 3) {
                    System.out.println(ans + " is the " + e + "th element of the series");
                } else {
                    System.out.println(ans + " is the " + e + " element of the series");
                }
            } else if (b.equals("mean")) {
                System.out.println("(note: 3 numbers lang akoa kaya karun hehe)"+"\n"+" inser the elements: ");
                c = a.nextFloat();;
                d = a.nextFloat();
                e = a.nextFloat();
                System.out.println("type pila ka kabuok elemet: ");
                f = a.nextInt();
                float ans = (c + d + e) / f;
                System.out.println(ans + " is the arithmetic mean of the series");
            } else {
                System.out.println("type how many numbers of element is in the series:");
                c = a.nextFloat();
                System.out.println("input first term: ");
                d = a.nextFloat();
                System.out.println("and the value of the last term:");
                e = a.nextFloat();
                float ans = ((c / 2) * (d + e));
                System.out.println(ans + " is the sum of all elements in the series");
            }
            System.out.println("do you want to try again? " + "\n" + "[yes] [no]");
            b = a.next();
        } while (b.equals("yes"));
    }

}
