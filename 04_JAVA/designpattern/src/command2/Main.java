package command2;

import java.util.Scanner;

// 이 예제에서는 command 예제에서의 코드를 함수형 인터페이스로 나타낸다.
public class Main {
    public static void main(String[] args) {

        FileService fs=new FileService();

        Command[] commands={
                //new AddCommand(),
                ()-> System.out.println("Add command"),
                fs::open, // () -> fs.open()
                fs::print, // () -> fs.print()
                Main::exit // () -> Main.exit()
        };

        while(true){
            Scanner scanner=new Scanner(System.in);
            System.out.println("1: Add, 2: Open, 3: Print, 4: Exit");
            System.out.print("선택: ");
            int sel= scanner.nextInt();
            commands[sel-1].execute();
        }
    }

    public static void exit(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("종료할까요?(Y/n) ");
        String answer=scanner.nextLine();

        scanner.close();
        if(answer.isEmpty()||answer.equalsIgnoreCase("Y")){
            // equalsIgnoreCase: 대소문자 구분 안하는 equals
            System.exit(0);
        }
    }
}
