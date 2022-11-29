package Obj.Place;

import Obj.AbsObject;
import Obj.Status;
import java.util.ArrayList;

public abstract class AbsPlace {
    protected ArrayList<AbsObject> lobby = new ArrayList();

    public AbsPlace(AbsObject... obj) {
        this.setLobby(obj);
    }

    protected void setLobby(AbsObject... obj) {
        for(AbsObject i: obj) {
            lobby.add(i);
        }
    }
    protected int lobbyCount() {
        int count = 0;
        for(AbsObject i: lobby) {
            count++;
        }
        return count;
    }

    public abstract void showLobby();
}
