package project;
public class Car {
    private float speed, weight;
    private String color;
    private byte[] coordinate;

    public Car(){}

    //Конструктор класса. Внутри, например, можно подключиться к бд
    protected Car(float speed, float weight, String color, byte[] coordinate){
        System.out.println("New car created");
        setValues(speed, weight, color, coordinate);
        System.out.println(getValues());
    }

    protected Car(float weight, String color, byte[] coordinate){
        System.out.println("Big object created");
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
        System.out.println("Big car weight: " + weight +". Color: " + color);
        System.out.println("Coordinate: ");
        for (byte x: coordinate){
            System.out.println(x);
        }

    }

    protected void setValues(float speed, float weight, String color, byte[] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues(){
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + ". \n";
        String infocoordinates = "Coordinates: \n";
        for (int i = 0; i < coordinate.length; i++){
            infocoordinates += coordinate[i] + "\n";
        }
        return info + infocoordinates;
    }
        //существуют модификаторы доступа public protected private
        //public = класс будет доступен из других классов
        //protected = доступен только внутри класса или внутри класса наследника
        //private = только в пределах текущего класса виден
}
