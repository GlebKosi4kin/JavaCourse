package project;
public class Airbus extends Car {
    private boolean isLoaded;

    public Airbus(float speed, float weight, String color, byte[] coordinate, boolean isLoaded){
        super(speed, weight, color, coordinate);
        this.isLoaded =isLoaded;
        System.out.print(boolload());
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public String boolload(){
        if(isLoaded){
            return "Груз в самолете";
        } else {
            return "Груза нет в самолете";
        }
    }
}
