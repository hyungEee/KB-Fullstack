package practice.day02;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int select=0;
        int balance=100000;
        while(select!=4){
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.print("선택> ");
            select=sc.nextInt();
            switch (select){
                case 1:
                    System.out.print("예금액> ");
                    balance+=sc.nextInt();
                    break;
                case 2:
                    System.out.print("출금액> ");
                    balance-=sc.nextInt();
                    break;
                case 3:
                    System.out.printf("잔고> %d\n",balance);
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
