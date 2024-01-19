public class Cube {
    private int side;

    public Cube() {
        this.side = 1;
    }

    public Cube(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        this.side = side;
    }

    public int getSurfaceArea() {
        return 6 * (int) Math.pow(side, 2);
    }

    public int getVolume() {
        return (int) Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Cube{" + "side=" + side + '}';
    }
}