package practice.day04;

public class Recipe {
    protected String title;
    protected int cookTime;
    protected boolean isVegan;

    String getDescription(){
        return "";
    }
    public String toString(){
        if(isVegan) {
            return title + "(" + cookTime + "분) - 비건";
        }
        else{
            return title + "(" + cookTime + "분) - 비건 아님";
        }
    }

}
