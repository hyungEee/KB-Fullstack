package practice.builder.ex01;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DatingCharacter implements Comparable<DatingCharacter>{
    private String name;
    private String personality;
    private String hobby;
    private String favoriteFood;
    private String talkStyle;

    @Override
    public int compareTo(DatingCharacter o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "이름: "+name+" / 성격: "+personality+" / 취미: "+hobby;
    }

    public static class Builder{
        private String name;
        private String personality;
        private String hobby;
        private String favoriteFood;
        private String talkStyle;

        private Builder(){}

        public Builder name(String name){
            this.name=name;
            return this;
        }

        public Builder personality(String personality){
            this.personality=personality;
            return this;
        }

        public Builder hobby(String hobby){
            this.hobby=hobby;
            return this;
        }

        public Builder favoriteFood(String favoriteFood){
            this.favoriteFood=favoriteFood;
            return this;
        }

        public Builder talkStyle(String talkStyle){
            this.talkStyle=talkStyle;
            return this;
        }

        public DatingCharacter build() {
            return new DatingCharacter(name, personality, hobby, favoriteFood, talkStyle);
        }

    }

    public static Builder builder(){
        return new Builder();
    }

}
