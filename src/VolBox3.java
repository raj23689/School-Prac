public class VolBox3 {
    double height, length, depth;
    void SetDim(double h, double d, double l) {
        height = h;
        depth = d;
        length = l;
    }

    double Volume() {
        return height * length * depth;
    }

    public static void main(String[] args) {
        VolBox3 bo1 = new VolBox3();
        VolBox3 bo2 = new VolBox3();

        // set the data
        bo1.SetDim(14, 16, 18);
        bo2.SetDim(12, 10, 13);

        // Retrieving and printing the data
        double V = bo1.Volume();
        System.out.println("B1 box volume is: " + V);
        // double V = bo2.Volume(); -> this throws an error
        double V2 = bo2.Volume();
        System.out.println("B2 box volume is: " + V2);
    }
}
