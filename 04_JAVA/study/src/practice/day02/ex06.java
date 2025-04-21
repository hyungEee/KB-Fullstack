package practice.day02;

public class ex06 {
    public static void main(String[] args) {
        int [][] array={
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };
        int fullLength=0;
        int total=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                total+=array[i][j];
                fullLength+=1;
            }
        }
        System.out.println(total);
        System.out.println((double)total/fullLength);
    }
}
