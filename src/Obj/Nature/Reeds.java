package Obj.Nature;

import Obj.Status;

public class Reeds{
    private String name = "Камыши";
    private Status stat = new Status();

    public String getReedsName(){
        return name;
    }
    public void setScratch() {
        stat.setStatus("Примяты");
    }

    public String getScratch(){
        return stat.getStatus();
    }
}
