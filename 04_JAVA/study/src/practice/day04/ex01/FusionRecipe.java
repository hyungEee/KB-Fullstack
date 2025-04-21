package practice.day04.ex01;

public class FusionRecipe extends Recipe {
    FusionRecipe(){
        super.title="불닭파스타";
        super.cookTime=20;
        super.isVegan=false;
    }

    @Override
    String getDescription() {
        return "매콤달콤한 "+title+"를 추천합니다!";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
