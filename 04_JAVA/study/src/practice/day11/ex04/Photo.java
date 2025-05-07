package practice.day11.ex04;

public class Photo {
    private String name; // 촬영자 이름
    private String pose; // 포즈

    public Photo(String name, String pose) {
        this.name = name;
        this.pose = pose;
    }

    @Override
    public String toString() {
        return name+"님이 '"+pose+"' 포즈로 사진을 찍었습니다.";
    }

    public String getName() {
        return name;
    }

    public String getPose() {
        return pose;
    }
}
