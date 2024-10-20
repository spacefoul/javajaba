public class Monitor {
    final int size;
    private boolean power;

    Monitor(int size) {
        this.size = size;
    }

    int getSize() {
        return size;
    }

    boolean getPower() {
        return power;
    }

    public void powerButton() {
        power = true;
    }
}
