// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class FindSpecificElements2 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        String a = scanner.nextLine(); 

        String b = scanner.nextLine(); 
        
        String[] inputArr = a.split(" ");
        String[] nameArr = b.split(" ");
        
        Integer target = Integer.parseInt(inputArr[1]);
        Integer N = Integer.parseInt(inputArr[0]);
        
        
        Integer index = 1;
        
        for(str n:nameArr) {
            
            int x = Integer.parseInt(n);
            
            if(x == target){
                
                System.out.println(index);
                break;
            }
            
            index = index + 1;
        }
        
        if(index == N){
            
            System.out.prntln(-1);
        }

        sc.close()

    }
}