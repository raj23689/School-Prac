public class VolBox3 {
    double height, width, depth;
    void SetDim(double h, double w, double l) {
        height = h;
        width = w;
        depth = l;
    }

    double Volume() {
        return height * width * depth;
    }

    public static void main(String[] args) {
        VolBox3 bo1 = new VolBox3();
        VolBox3 bo2 = new VolBox3();

        // set the data
        bo1.SetDim(14, 16, 18);
        bo2.SetDim(12, 10, 13);

        // Retrieving and printing the data
        double V = bo1.Volume();
        System.out.println(V);
        // double V = bo2.Volume(); -> this throws an error
        double V2 = bo2.Volume();
        System.out.println(V2);
    }
}
