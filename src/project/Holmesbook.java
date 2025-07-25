package project;
public class Holmesbook {
    public static void main(String[] args){
        Book holmesbook = new Book();
        holmesbook.getValues(23, "глянец", "Путин", 2232);
        System.out.println(holmesbook.setValues());

    }
}
