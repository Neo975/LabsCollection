package Main;

import Bounds.EpicBattle;
import Bounds.Solid;
import Bounds.Solid2;

public class L24 {
    public static void main(String[] args) {
        Solid<Solid.Bounded> solid = new Solid<Solid.Bounded>(new Solid.Bounded());
        solid.getColor();
        solid.getY();
        solid.weight();

        Solid2<Solid.Bounded> solid2 = new Solid2<Solid.Bounded>(new Solid.Bounded());
        solid2.color();
        solid2.getY();
        solid2.weight();

        EpicBattle.f();
    }
}
