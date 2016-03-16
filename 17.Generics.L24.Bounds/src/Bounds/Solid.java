package Bounds;


import java.awt.*;

interface HasColor {
    Color getColor();
}

class Colored<T extends HasColor> {
    T item;

    Colored(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    Color getColor() {
        return item.getColor();
    }
}

class Dimension {
    public int x, y, z;
}

class ColoredDimension<T extends Dimension & HasColor> {
    T item;

    ColoredDimension(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    Color getColor() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }
}

interface Weight {
    int weight();
}

public class Solid<T extends Dimension & HasColor & Weight> {
    T item;
    public Solid(T item) { this.item = item; }
    T getItem() { return item; }
    public Color getColor() { return item.getColor(); }
    int getX() { return item.x; }
    public int getY() { return item.y; }
    int getZ() { return item.z; }
    public int weight() { return item.weight(); }

    public static class Bounded extends Dimension implements HasColor, Weight {

        @Override
        public Color getColor() {
            return null;
        }

        @Override
        public int weight() {
            return 0;
        }
    }
}

