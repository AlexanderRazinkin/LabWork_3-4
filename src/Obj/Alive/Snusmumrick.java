package Obj.Alive;

import Obj.*;
import Obj.Nature.*;
import Obj.Place.AbsPlace;

import java.util.ArrayList;

public class Snusmumrick extends AbsObject{

    public Snusmumrick(String name) {
        super(name, true);
    }


    public void look(Reeds reeds) {
        System.out.println(getName() + " наклонился и выглянул из-за " + reeds.getReedsName());
    }

    public class SnusAction {
        private ArrayList<String> actions = new ArrayList<>();
        public void setAction(String... action) {
            for (String i : action)
                actions.add(i);
        }
        public void getRandomAction() {
            int i = (int) (Math.random() * actions.toArray().length);
            System.out.println(getName() + " совершает действие: " + actions.get(i));
        }
    }
}