public class Car {
    public float speed, weight;
    public String color;
    public byte[] coordinate;

    //Конструктор класса. Внутри, например, можно подключиться к бд
    public Car(){

    }

    public void setValues(float _speed, float _weight, String _color, byte[] _coordinate){
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
    }

    public String getValues(){
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
