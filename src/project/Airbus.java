package project;
public class Airbus extends Car {
    private boolean isLoaded;

    public Airbus(float speed, float weight, String color, byte[] coordinate, boolean isLoaded){
        setValues(speed, weight, color, coordinate, isLoaded);
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public String boolload(boolean isLoaded){
        if(isLoaded){
            return "Груз в самолете";
        } else {
            return "Груза нет в самолете";
        }
    }


    public void setValues(float speed, float weight, String color, byte[] coordinate, boolean isLoaded) {
        super.setValues(speed, weight, color, coordinate);
        System.out.println(boolload(isLoaded));
        System.out.println("Второй метод");
    }
}
