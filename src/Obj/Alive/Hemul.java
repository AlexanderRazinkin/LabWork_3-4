package Obj.Alive;

import Obj.*;
import Obj.Place.Coarse;


public class Hemul extends AbsObject {
    public Hemul(String name) {
        super(name, true);
    }

    Way way = new Way() {
        @Override
        public void look() {
            Coarse[] ways = {Coarse.EAST, Coarse.NORTH, Coarse.SOUTH, Coarse.WEST};
            System.out.println(getName() + "держит курс на " + ways[(int) (Math.random() * 4)].getName());
        }
    };

    public void lookWay(){
        way.look();
    }

}
