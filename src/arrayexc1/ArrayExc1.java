/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayexc1;

/**
 *
 * @author user
 */
public class ArrayExc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //creat array
        int[] arry= new int[5];
        //fill array
        for (int i = 0; i < arry.length; i++) {
            arry[i]=(int)(Math.random()*100);
        }
        
        //Print array
        System.out.println("Before");
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+ " ");
        }
         System.out.println("");
         System.out.println("------------------");
         //Max MIN
         
         int maxIndex=0;
         int minIndex=0;
        
          for (int i = 0; i < arry.length; i++) {
           if(arry[i]>arry[maxIndex]) {maxIndex=i;}
           if(arry[i]<arry[minIndex]) { minIndex=i;}
        }
         
         System.out.println("MAX:"+arry[maxIndex] +"  MAX INDEX:"+maxIndex);
         System.out.println("MIN:"+arry[minIndex]+"  MIN INDEX:"+minIndex);
    }
    
}
