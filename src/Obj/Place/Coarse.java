package Obj.Place;

public enum Coarse {
    NORTH("Север"),
    SOUTH("Юг"),
    EAST("Восток"),
    WEST("Запад");

    private String name;
    Coarse(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
