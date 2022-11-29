package Obj.Place;

import Obj.AbsObject;
import Obj.Nature.Reeds;
import Exceptions.*;



public class Boat extends AbsPlace {

    public void showLobby() {
        if (this.lobbyCount() == 0) {
            System.out.println("Лодка пустая");
        } else {
            String res = "";
            for(AbsObject i: lobby) {

                if (res.equals(""))
                    res = i.getName();
                else
                    res += ", " + i.getName();
            }
            System.out.println("В лодке сидит(-ят) " + res);
        }
    }

    public void addGuy(AbsObject... obj){
        for(AbsObject i: obj)
            lobby.add(i);
    }

    public void removeGuy(AbsObject obj) throws NoGuysInBoatException, NoThisGuyInBoatException {
        if(lobby.toArray().length == 0){
            throw new NoGuysInBoatException("Нет людей в лодке - удалять некого");
        }
        else {
            if(lobby.contains(obj)) {
                for (int i = 0; i < lobby.toArray().length; i++) {
                    if (lobby.toArray()[i] == obj) {
                        lobby.remove(i);
                        System.out.println(obj.getName() + " покинул лодку и пошагал по берегу");
                        showLobby();
                    }
                }
            }
            else{
                throw new NoThisGuyInBoatException(obj.getName() + " не присутствует в лодке");
            }
        }
    }

    public void scratch(Reeds reeds) {
        System.out.println("Из-за наступившей тьмы лодка столкнулась c камышами");
        reeds.setScratch();
        System.out.println(reeds.getReedsName() + " " + reeds.getScratch() + " лодкой");
    }

}
