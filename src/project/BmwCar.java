package project;
public class BmwCar {
    public static void main(String[] args){
        //Мы создалиобъект, Car это название класса, на основе которого мы создали объект
        Car bmw = new Car(265, 2500, "White", new byte[]{2, 2, 2});
        //Через точку имеем доступ к полям и методам внутри класса

        Car mercedes = new Car(255, 2300, "Black", new byte[]{1, 3, 1});
        //Конструкторы класса.

        Car man = new Car(5500, "Green", new byte[]{2, 0, 1});

        Bike harley = new Bike(5500, 23, "blue", new byte[]{2, 5, 1});

        Airbus a320 = new Airbus(720, 30000, "white", new byte[]{23, 23, 11}, false);


    }
}

