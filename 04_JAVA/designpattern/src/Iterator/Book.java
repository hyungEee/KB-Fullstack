package Iterator;

public class Book {
    private String name; // record Book(String name){}으로 해도됨, 불변 객체이기 때문에

    public Book(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
