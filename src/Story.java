import Obj.AbsObject;
import Obj.Alive.*;
import Obj.Nature.*;
import Obj.Place.*;
import Exceptions.*;

public class Story {
    Snusmumrick snus = new Snusmumrick("Снусмумрик");
    Hemul hem = new Hemul("Хемуль");
    MumiTroll mumi = new MumiTroll("Муми-тролль");
    Time.timeOptions time = new Time.timeOptions();
    Boat boat = new Boat();
    Reeds reeds = new Reeds();
    Water water = new Water("Вода");
    Bed_Sheets bed = new Bed_Sheets("Постельное белье");
    Hills hills = new Hills(new AbsObject[]{new Birds("Птицы"), bed});

    public void go() {
        defaultstory();
    }

    private void defaultstory() {
        boat.addGuy(new AbsObject[]{snus, hem, mumi});
        System.out.println(time.toString());
        if (time.isNight()) {
            boat.scratch(reeds);
        } else
            System.out.println("Лодка аккуратно пришвартовалась к берегу");
        boat.showLobby();
        try {
            boat.removeGuy(mumi);
        } catch (NoGuysInBoatException | NoThisGuyInBoatException e) {
            e.getMessage();
        }

        Snusmumrick.SnusAction snusAction = snus.new SnusAction();
        snus.look(reeds);
        snusAction.setAction(new String[]{"смеется и курит свою трубку", "выбивает табак из своей трубки"});
        snusAction.getRandomAction();

        hem.lookWay();

        water.setStatus("Спадает");
        water.action();

        Trees trees = new Trees("Деревья");

        bed.setStatus("Cушится");
        hills.showLobby();

        water.action();
    }
}

