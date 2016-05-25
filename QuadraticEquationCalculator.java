//SAFFATBOKUL.COM
//THIS JAVA PROGRAM CALCULATES THE ROOTS OF A QUADRATIC EQUATION
import java.util.Scanner;
public class test
{
  public static void main(String[] args)
  {
   double A, B, C, root1, root2, realPart, imaginaryPart;
   System.out.println("This program will give you the roots of a quadratic equation");
   Scanner saffat = new Scanner(System.in);
   System.out.println("Enter The co-efficient A");
   A = saffat.nextDouble();
   System.out.println("Enter The co-efficient B");
   B = saffat.nextDouble();
   System.out.println("Enter The co-efficient C");
   C = saffat.nextDouble();
   double discriminant = B*B-4*A*C;
   double discriminantsqrt = Math.sqrt(discriminant);
   
   if ( discriminant == 0)
   {
     root1 = (-B)/2*A;
     System.out.println("Because the discriminant is zero, this quadratic equation only has one value and it is " + root1);
     
   }
   else
   {
     if  ( discriminant > 0)
     {
       root1 = ((-B)+(discriminantsqrt))/2*A;
       root2 = ((-B)-(discriminantsqrt))/2*A;
       System.out.print("The discriminant is " + discriminant );
       System.out.print(" And the values are " + root1 );
       System.out.println(" And " + root2 );
     }
     else
     {
       realPart = -B/(2*A);
       double discriminantsqrt2 = Math.sqrt(-discriminant);
       imaginaryPart = discriminantsqrt2/(2*A);
       double sumForRPI = realPart + imaginaryPart;
       double sumForRMI = realPart - imaginaryPart;     
       System.out.print("root1 = " + realPart );
       System.out.println(" + " + sumForRPI +"i");
       System.out.print("root2 = " + realPart );
       System.out.println(" " + sumForRMI +"i");
       
     }
   }  
  }
}
