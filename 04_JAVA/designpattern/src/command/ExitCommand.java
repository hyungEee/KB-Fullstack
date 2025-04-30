package command;

import java.util.Scanner;

public class ExitCommand implements Command{
    @Override
    public void execute() {
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
