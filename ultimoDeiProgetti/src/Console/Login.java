package Console;

import java.io.FileInputStream;    
import java.io.IOException;    
import java.util.Scanner;    

public class Login {        
    public static void main(String[] args) throws IOException {
        Scanner scan1,scan2;
        scan1=new Scanner(new FileInputStream("C:/Users/Gabriele/Desktop/ciao.txt"));
        scan2=new Scanner(System.in);
        boolean flag=false;
        String name,pword,username,pass;
        System.out.println("Inserisci il tuo ID");
        username=scan2.next();
        System.out.println("Password:");
        pass=scan2.next();
        while(scan1.hasNext()) {
            name=scan1.next();
            pword=scan1.next();
            if(username.equals(name) && pass.equals(pword)) {
                System.out.println("Login effettuato");
                flag=true;
                break;
            }                
        }
        if(!flag)
        System.out.println("Password sbagliata");
    }
}