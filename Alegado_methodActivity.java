/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alegado_methodactivity;

import java.util.Scanner;
public class Alegado_methodActivity {
    static int calculator(int num1 , int num2){ 
        return num1 + num2;
   
}
static double calculator(double num1, double num2, char operator){
        switch(operator){ 
            case '-': 
                return num1 - num2;
                
            case '+':
                return num1 + num2;
            
            case '/':
                return num1 / num2;
              
            case '*':
                return num1 * num2;
            
            default:
                System.out.println("INVALID OPERATOR");
                return 0;
            
            
        }
        
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================RESULT===============");
        System.out.println("The Sum is: " + calculator(6,6) );
        System.out.println("The defference: " + calculator (20,10,'-'));
        System.out.println("The quotient: " + calculator(20,10,'/'));
        System.out.println("The product: " + calculator(20,10,'*'));
        System.out.println("======================================");   
       
        
        
       
    }
    
}
