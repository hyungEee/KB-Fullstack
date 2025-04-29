package practice.day09.ex02;

public class Content {
    private String question;

    public Content(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Content target){
            if(this.question.equals(target.getQuestion()))
                return true;
        }
        return false;
    }
}
