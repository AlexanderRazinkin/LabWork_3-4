package Obj.Alive;

import Obj.AbsObject;

public class MumiTroll extends AbsObject{

    public MumiTroll(String name) {
        super(name, true);
    }

    public void action(int i) {
        System.out.println(getName() + " вылез из лодки и зашагал берегом назад");
    }
}
