package ejercicios;
import java.util.Scanner;
public class Ejercicios2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num[]= new int[6];
        int num1[]=new int [5];
        int caja[]=new int [5];
        int pord;
    System.out.println("Biembenido Usuario");
     System.out.println("Ingrese los numeros que desee guardar, en la primera caja");
    for (int i=0;i<num.length;i++){
    System.out.println("Digite su numero , en el epacio #" + (i+1));
    num[i] = in.nextInt();
    }
   
    
    System.out.println( "Digite el numero con el que quiere multiplicar la primera caja");
    pord=in.nextInt();
   
    
    for (int i=0;i < num.length;i++){
    num[i] *= pord;
    }
         System.out.println("Ingrese los numeros que desee guardar, en la segunda caja");
    for (int i=0;i<num1.length;i++){
    System.out.println("Digite su numero , en el epacio #" + (i+1));
    num1[i] = in.nextInt();
    }
    System.out.println( "Digite el numero con el que quiere multiplicar la segunda caja");
    pord=in.nextInt();
    for (int i=0;i < num.length;i++){
    num1[i] *= pord;
    }
    for (int i=0;i<caja.length;i++){
      caja[i] += num[i];
      caja[i] += num1 [i];
      }
 
for( int i =0; i< caja.length;i++){
  System.out.println("La ultma caja , con el producto escalar de tus numeros son:"+ caja[i]);
}
}            
}
    
    

