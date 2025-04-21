package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("x값 입력: ");
        String strX=sc.nextLine(); // 입력값을 String으로 받아옴
        int x=Integer.parseInt(strX); // 받아온 값을 int로 변환

        System.out.print("y값 입력: ");
        String strY=sc.nextLine();
        int y=Integer.parseInt(strY);

        int res=x+y;
        System.out.println("x+y: "+res);
        System.out.println();
        
        while(true){
            System.out.print("입력 문자열: ");
            String data=sc.nextLine();
            if(data.equals("q")){
                break;
            }
            System.out.println("출력 문자열: "+data );
            System.out.println();
        }
        System.out.println("종료");
    }
}
