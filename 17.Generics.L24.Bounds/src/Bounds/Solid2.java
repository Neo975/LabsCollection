package Bounds;

import java.awt.*;

/**
 * Created by Mike on 14.03.2016.
 */
class HoldItem<T> {
    T item;
    HoldItem(T item) { this.item = item; }
    T getItem() { return item; }
}

class Colored2<T extends HasColor> extends HoldItem<T> {
    Colored2(T item) { super(item); }
    public Color color() { return item.getColor(); }
}

class ColoredDimension2<T extends Dimension & HasColor> extends Colored2<T> {
    ColoredDimension2(T item) { super(item); }
    int getX() { return item.x; }
    public int getY() { return item.y; }
    int getZ() { return item.z; }
}

public class Solid2<T extends Dimension & HasColor & Weight> extends ColoredDimension2<T> {
    public Solid2(T item) { super(item); }
    public int weight() { return item.weight(); }
}
