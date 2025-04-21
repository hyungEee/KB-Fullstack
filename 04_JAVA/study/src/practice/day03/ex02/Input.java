package practice.day03.ex02;

import java.util.Scanner;

public class Input {
    static Scanner sc=new Scanner(System.in);

    static String read(String title){
        System.out.print(title+": ");
        return sc.nextLine();
    }

    static String read(String title, String defaultValue){
        System.out.print(title+"("+defaultValue+"): ");
        String str=sc.nextLine();
        if(str.equals(""))
            return defaultValue;
        else{
            return str;
        }
    }

    static int readInt(String title){
        System.out.print(title+": ");
        String str=sc.nextLine();
        return Integer.parseInt(str);
    }

    static boolean confirm(String title,boolean defaultValue){
        System.out.print(title+" (Y/n): ");
        String str=sc.nextLine();
        if(str.equals("y")){
            return true;
        }
        else if(str.equals("n")){
            return false;
        }
        else {
            return defaultValue;
        }
    }
    static boolean confirm(String title){
        return confirm(title,true);
    }

}
