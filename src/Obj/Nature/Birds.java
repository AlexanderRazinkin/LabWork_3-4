package Obj.Nature;

import Obj.AbsObject;

public class Birds extends AbsObject implements NatureInterface{
    public Birds(String name) {
        super(name, false);
    }

    @Override
    public void action() {

        class bird {
            private BirdCharecter color;
            public bird(){
                BirdCharecter[] colors = {BirdCharecter.BLUE, BirdCharecter.BLACK, BirdCharecter.GREEN, BirdCharecter.RED, BirdCharecter.WHITE};
                color = colors[(int) (Math.random() * colors.length)];
                pointer++;
            }
            private static int pointer = 0;

            public void getInfo(){
                System.out.printf("Птица №%d %s окраса ищет старое насиженное гнездо\n", pointer, color.toString());
            }
        }
        for(int i = 0; i <= (int) (Math.random() * 5); i ++) {
            bird a = new bird();
            a.getInfo();
        }
    }
}
