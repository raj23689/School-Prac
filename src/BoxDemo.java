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



public class BoxDemo {
}
