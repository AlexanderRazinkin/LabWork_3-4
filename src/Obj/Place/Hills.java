package Obj.Place;

import Obj.AbsObject;
import Obj.Nature.*;

public class Hills extends AbsPlace {
    public Hills(AbsObject... obj) {
        super(new AbsObject[0]);
        this.setLobby(obj);
    }

    public void showLobby() {
        if (this.lobbyCount() == 0) {
            System.out.println("На холмах никого нет");
        } else {
            class showAction{
                void lobbyActions(){
                    for(AbsObject i: lobby) {
                        if(i.getClass() == Birds.class)
                            ((Birds) i).action();
                        else if(i.getClass() == Bed_Sheets.class)
                            ((Bed_Sheets) i).action();
                    }
                }
            }
            showAction show = new showAction();
            show.lobbyActions();
        }
    }
}
