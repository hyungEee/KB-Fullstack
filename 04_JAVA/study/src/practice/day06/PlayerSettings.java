package practice.day06;

public class PlayerSettings {

    static class Mode{
        static boolean shuffle=false;
        static boolean repeat=true;
        static int volumeLevel=5;

        public static void printSettings(){
            System.out.println("\n🎛 현재 재생 설정 상태");
            if(shuffle){
                System.out.println(" - Shuffle: ON");
            }
            else{
                System.out.println(" - Shuffle: OFF");
            }
            if(repeat){
                System.out.println(" - Repeat: ON");
            }
            else{
                System.out.println(" - Repeat: OFF");
            }
            System.out.println(" - Volume: "+volumeLevel);
            System.out.println();
        }

        public static void setShuffle(boolean value){
            shuffle=!shuffle;
            if(shuffle){
                System.out.println("Shuffle 모드가 ON으로 설정되었습니다.");
            }
            else{
                System.out.println("Shuffle 모드가 OFF로 설정되었습니다.");
            }
        }

        public static void setRepeat(boolean value){
            repeat=!repeat;
            if(repeat){
                System.out.println("Repeat 모드가 ON으로 설정되었습니다.");
            }
            else{
                System.out.println("Repeat 모드가 OFF로 설정되었습니다.");
            }
        }

        public static void setVolumeLevel(int level){
            if(level>10 || level<0){
                System.out.println("볼륨은 0~10 사이로 설정해야 합니다.");
            }
            else{
                volumeLevel=level;
                System.out.printf("볼륨이 %d로 설정되었습니다.\n",level);
            }
        }
    }
}
