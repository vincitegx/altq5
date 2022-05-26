
package altq5;

import java.util.Scanner;
public class Altq5 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int x;
double y;
System.out.print("how many numbers are you calculating: ");
x = input.nextInt();
        System.out.println("enter the numbers");
y = input.nextDouble();
int[] anArray = new int[x];
int total = 0;
for (int counter = 0; counter < x; counter+=1){
        anArray[counter]= input.nextInt();
    total = total + anArray[counter];
}
        System.out.println("the total is: ");
System.out.println(total);


    }
    
}
