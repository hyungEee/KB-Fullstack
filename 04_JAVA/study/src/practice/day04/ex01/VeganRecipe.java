package practice.day04.ex01;

public class VeganRecipe extends Recipe{
    VeganRecipe(){
        super.title="두부 샐러드";
        super.cookTime=10;
        super.isVegan=true;
    }

    @Override
    String getDescription() {
        return "신선한 "+title+"를 추천합니다!";
    }
}
