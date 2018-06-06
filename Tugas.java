/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 8.1 PRO
 */
public class Tugas {
      public static void main (String[]args){
            System.out.println("nama: vina olyvia yunita ismail");
            System.out.println("nim : E1E117054");
        System.out.println(" tugas : Membuktikan apakah == untuk string benar atau salah");
        System.out.println("  ");
        String s1="saya suka makan bakso";
        String s2="Saya suka makan bakso";
        String s3="saya ";
        String s4="suka ";
        String s5="makan bakso";
        String s6=s3+s4+s5; 
        System.out.println("s1"+"="+s1);
        System.out.println("s6"+"="+s6);
        System.out.println("  ");
        System.out.println("untuk percobaan dengan ==");
        
         if(s6==s1){
            System.out.println("Benar, S6==S1 terbukti");
        } else{
            System.out.println("Salah, S6==S1 tidak terbukti");
            System.out.println("Maka dari itu, dibutuhkan s1.equals(s6)");
            System.out.println("   ");
            System.out.println(" s1.equals(s6)");
             if(s1.equals(s6)){
                 System.out.println("Benar " + s1 + "=" +s6 );
           } 
        }
}
}
