package Obj.Nature;

import Obj.AbsObject;
import Obj.Status;

public class Trees extends AbsObject {
    public Trees(String name) {
        super(name, false);
        System.out.println("Первыми показались деревья");
    }

    public void check() {
        System.out.println(this.getName() + " качали пробудившимися от сна макушками и расправляли над водой ветки, проверяя, все ли у них цело после катастрофы");
        if (!(getStatus().equals("DEFAULT")))
            System.out.println("Сломанные деревья торопились выпустить новые побеги");
    }
}
