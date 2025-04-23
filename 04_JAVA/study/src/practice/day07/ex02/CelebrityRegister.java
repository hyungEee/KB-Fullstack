package practice.day07.ex02;

import practice.day07.ex01.InvalidNameException;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CelebrityRegister {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("남자 연예인 몇 명 등록할까요?: ");
        int m=sc.nextInt();
        sc.nextLine();
        MaleCelebrity[] mcArr=new MaleCelebrity[m];

        for(int i=0;i<m;i++){
            System.out.print("이름 입력:");
            String name=sc.nextLine();
            if(!validation(name)){
                i--;
                continue;
            }
            boolean isDuplication=false;
            for(int j=0;j<i;j++){
                if(mcArr[j].equals(name)){
                    System.out.println(">> 중복된 이름입니다. 등록하지 않습니다.");
                    i--;
                    isDuplication=true;
                    break;
                }
            }
            if(!isDuplication){
                mcArr[i]=new MaleCelebrity(name);
            }
        }

        System.out.print("여자 연예인 몇 명 등록할까요?: ");
        int f=sc.nextInt();
        sc.nextLine();
        FemaleCelebrity[] fcArr=new FemaleCelebrity[f];

        for(int i=0;i<f;i++){
            System.out.print("이름 입력:");
            String name=sc.nextLine();
            if(!validation(name)){
                i--;
                continue;
            }
            boolean isDuplication=false;
            for(int j=0;j<i;j++){
                if(fcArr[j].equals(name)){
                    System.out.println(">> 중복된 이름입니다. 등록하지 않습니다.");
                    i--;
                    isDuplication=true;
                    break;
                }
            }
            if(!isDuplication){
                fcArr[i]=new FemaleCelebrity(name);
            }

        }

        System.out.println("[남자 연예인 리스트]");
        for(int i=0;i<m;i++) {
            System.out.println(mcArr[i].toString());
        }
        System.out.println("[여자 연예인 리스트]");
        for(int i=0;i<f;i++) {
            System.out.println(fcArr[i].toString());
        }
    }

    public static boolean validation(String name){
        try{
            if(!Pattern.matches("^[가-힣]{2,10}$",name)){
                throw new practice.day07.ex01.InvalidNameException("이름은 한글 2~10자여야 합니다!");
            }
            else{
                return true;
            }
        } catch (InvalidNameException e) {
            System.out.println("😡 탈락! 잘못된 이름입니다: "+e.getMessage());
            return false;
        }
    }

}
