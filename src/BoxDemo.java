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
    public static void main(String[] args) {
        double v1, v2, v3, v4;
        Box_Weight b1 = new Box_Weight(10, 10, 10, 10);
        Box_Weight b2 = new Box_Weight(2, 3, 4, 0.076);
        Box_Weight b3 = new Box_Weight(3, 2);
        Box_Weight b4 = new Box_Weight();
        v1 = b1.Vol();
        v2 = b2.Vol();
        v3 = b3.Vol();
        v4 = b4.Vol();
        System.out.println("B1 vol:  " + v1);
        System.out.println("B1 weight: " + b1.weight);
        System.out.println("B2 vol:  " + v2);
        System.out.println("B2 weight: " + b2.weight);
        System.out.println("B3 vol:  " + v3);
        System.out.println("B3 weight: " + b3.weight);
        System.out.println("B4 vol:  " + v4);
        System.out.println("B4 weight: " + b4.weight);
    }
}
