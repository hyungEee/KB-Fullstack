package practice.day11.ex04;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        PhotoAlbum pa=new PhotoAlbum();
        Consumer<Photo> printer=photo -> System.out.println(photo);

        System.out.println("[\uD83D\uDCF8 사진 촬영 중...]");
        pa.addPhoto(new Photo("지우","브이✌\uFE0F"),printer);
        pa.addPhoto(new Photo("이슬이","하트❤\uFE0F"),printer);
        pa.addPhoto(new Photo("웅이","메타몽 모자\uD83C\uDFA9"),printer);
        System.out.println();

        System.out.println("[\uD83D\uDCE4 SNS에 업로드된 사진 목록]");
        Predicate<Photo> filter=p->p.getPose().equals("하트❤\uFE0F");
        pa.printFiltered(filter,printer);
    }
}
