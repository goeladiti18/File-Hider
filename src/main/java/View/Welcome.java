package View;

import java.util.Scanner;

public class Welcome {

    public void WelcomeScreen(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Welcome to my app");
        System.out.println("Press 1 to login");
        System.out.println("Press 2 to signup");
        System.out.println("Press 0 to exit");
        int choice=obj.nextInt();

        switch(choice){

            case 1: login();
            case 2: signUp();
            case 0: System.exit(0);
        }



    }

    private void login(){

    }

    private void signUp(){

    }
}
