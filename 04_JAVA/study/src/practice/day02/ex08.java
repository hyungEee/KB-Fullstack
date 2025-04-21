package practice.day02;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int select=0;
        int student=0;
        int[] scores=null;
        while(select!=5) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");
            select = sc.nextInt();
            switch (select){
                case 1:
                    System.out.print("학생수> ");
                    student=sc.nextInt();
                    scores=new int[student];
                    break;
                case 2:
                    for(int i=0;i<student;i++){
                        System.out.printf("scores[%d]> ",i);
                        scores[i]=sc.nextInt();
                    }
                    break;
                case 3:
                    for(int i=0;i<student;i++){
                        System.out.printf("scores[%d]: %d\n",i,scores[i]);
                    }
                    break;
                case 4:
                    int max=0;
                    int total=0;
                    for(int i=0;i<student;i++){
                        total+=scores[i];
                        if(scores[i]>max){
                            max=scores[i];
                        }
                    }
                    System.out.printf("최고점수: %d\n",max);
                    System.out.printf("평균 점수: %.1f\n",(double)total/student);
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
