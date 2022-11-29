package Obj.Nature;

import Obj.AbsObject;

public class Bed_Sheets extends AbsObject implements NatureInterface{
    public Bed_Sheets(String name) {
        super(name, false);
    }

    @Override
    public void action() {
        if(!(getStatus().equals("DEFAULT")))
            System.out.println("На склонах холмов, уже избавившихся от воды, сушилось на траве их промокшее " + getName());
    }
}
