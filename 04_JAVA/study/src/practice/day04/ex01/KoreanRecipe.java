package practice.day04.ex01;

public class KoreanRecipe extends Recipe{
    KoreanRecipe(){
        super.title="김치찌개";
        super.cookTime=20;
        super.isVegan=false;
    }

    @Override
    String getDescription() {
        return "매콤한 "+title+"를 추천합니다!";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    String getSpicinessLevel(){
        return "맵기: ★★★☆☆";
    }
}
