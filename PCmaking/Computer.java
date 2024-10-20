class Computer {
    final String cpu;
    private boolean power;

    Computer(String cpu) {
        this.cpu = cpu;
    }

    String getCpu() {
        return cpu;
    }

    boolean getPower() {
        return power;
    }

    public void powerButton() {
        power = true;
    }

}
