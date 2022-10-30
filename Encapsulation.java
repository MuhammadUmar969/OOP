package Encapsulation;

import java.util.Scanner;

class login{
    private String name;
    private int password;
    private String EmailID;

//public void setName(String name){
// this.name= name;
//}
//public void setName(int password){
//    this.password=password;
//}
//public void setName(String EmailID){
//    this.EmailID = Email.ID;
//}

    public void setLogin(String name, int password, String EmailID){
        this.EmailID=EmailID;
        this.name=name;
        this.password=password;
    }

    public String getName(){
    return name;
}
    
    public String getEmailID(){
        return EmailID;
    }

    public int getpassword(){
    return password;
}
}

public class Encapsulation {
    public static void main(String[] args) {

       login l1 = new login();
       Scanner input = new Scanner(System.in);
       
       l1.setLogin(input.next(),input.nextInt(), input.next());
       l1.getName();
       l1.getpassword();
       l1.getEmailID();
    }
    
}
