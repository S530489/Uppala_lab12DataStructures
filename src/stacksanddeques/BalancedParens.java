/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Sai Kumar Uppala
 */
public class BalancedParens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,NoSuchElementException {
        // TODO code application logic here
        
        Scanner scan=new Scanner(new File("expressions.txt"));
        int c;
        first:
        while (scan.hasNextLine()) {
            AStack<Character> parenStack=new AStack<Character>();
            String s = scan.nextLine();
           
            
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    parenStack.push(s.charAt(i));
                    
                }
                else if(s.charAt(i)==')'){
                    try{
                    parenStack.pop(); 
                    
                    }
                    catch (NoSuchElementException e){
                        System.out.println(s+": "+"INVALID");
                        System.out.println("Trying to pop, but the stack is empty!");
                        continue first;
                        
                    }
                }  
            }
           
            if(parenStack.isEmpty()){
                System.out.println(s+": "+"VALID");
            }
            
            else{
                System.out.println(s+": "+"INVALID");
                System.out.println("Parsing complete, but the stack is not empty!");
            }    
           
        
    }
    
}}
