package Obj.Nature;

import Obj.AbsObject;
import Obj.Status;

public class Water extends AbsObject implements NatureInterface {
    public Water(String name) {
        super(name, false);
    }
    private boolean isTold = false;

    public void action() {
        if (!(getStatus().equals("DEFAULT"))) {
            if(!isTold) {
                System.out.println(getName() + " " + getStatus() + ". Медленно выползали на солнечный свет вымытые штормом берега и долины");
                isTold = true;
            }
            else
                System.out.println("Как только " + getName() + " " + getStatus() + " все заторопились домой");
        } else {
            System.out.println(this.getName() + " еще не спала");
        }

    }
}
