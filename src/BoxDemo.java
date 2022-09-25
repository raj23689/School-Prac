class Box {
    private double width;
    private double height;
    private double length;
    Box(double w, double h, double l) {
        width = w;
        height = h;
        length = l;
    }

    Box() {
        width = -1;
        height  = -1;
        length = -1;
    }

    Box(double len) {
        width = height = length  = len;
    }

    double Vol() {
        return height * length * width;
    }
}

class Box_Weight extends Box {
    double weight;
    Box_Weight(double w, double h, double l, double n) {
        super(w,h,l);
        weight = n;
    }
    Box_Weight() {
        super();
        weight = -1;
    }
    Box_Weight(double len, double m) {
        super(len);
        weight = m;
    }
}

public class BoxDemo {
}
