package project;
public class Bike extends Car{
    public Bike(float speed, float weight, String color, byte[] coordinate){
        //то есть super передает данные в конструктор класса с 4 параметрами
        super(speed, weight, color, coordinate);
        getValues();
    }
}
