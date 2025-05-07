package practice.day11.ex02;

public class Goods {
    private String name;
    private String color;
    private boolean useful;

    public Goods(String name, String color, boolean useful) {
        this.name = name;
        this.color = color;
        this.useful = useful;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isUseful() {
        return useful;
    }

    public void setUseful(boolean useful) {
        this.useful = useful;
    }
}
