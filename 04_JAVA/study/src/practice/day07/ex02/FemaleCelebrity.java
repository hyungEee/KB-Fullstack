package practice.day07.ex02;

import java.util.Objects;

public class FemaleCelebrity implements Celebrity{
    private String name;

    public FemaleCelebrity(String name) {
        this.name = name;
    }

    public boolean equals(String n) {
        if(name.equals(n)){
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "여자 연예인: "+name;
    }
}
