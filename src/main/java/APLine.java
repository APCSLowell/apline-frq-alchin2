public class APLine {
    private int aVal, bVal, cVal;
    private double slope;

    public APLine(int a, int b, int c) {
        aVal = a;
        bVal = b;
        cVal = c;
        slope = -(double) aVal / (double) bVal;
    }

    public double getSlope() {
        return slope;
    }

    public boolean isOnLine(int x, int y) {
        return (aVal * x + bVal * y + cVal) == 0; // Changed the sign of cVal
    }
}
