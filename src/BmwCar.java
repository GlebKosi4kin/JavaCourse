public class BmwCar {
    public static void main(String[] args){
        //Мы создалиобъект, Car это название класса, на основе которого мы создали объект
        Car bmw = new Car();
        //Через точку имеем доступ к полям и методам внутри класса
        bmw.setValues(250.0f, 2300, "white", new byte[]{0,0,0});
        System.out.println(bmw.getValues());

        Car mercedes = new Car();
        mercedes.speed = 270f;
        mercedes.weight = 1890f;
        mercedes.color = "white";
        mercedes.coordinate = new byte[] {0, 0, 0};
        System.out.println(mercedes.getValues());

        System.out.println("BMW speed: " + bmw.speed + ". Mercedes speed: " + mercedes.speed + ".");

        //Конструкторы класса.

    }
}

