package ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        action((x,y)->{
            int res=x+y;
            System.out.println("result: "+res);
        });
        action((x,y)->{
            int res=x-y;
            System.out.println("result: "+res);
        });
    }

    public static void action(Calculable calculable){

        int x=10;
        int y=4;

        calculable.calculate(x,y);
    }
}
