public class Car {
    private int gas;
    private String carName;

    Car() {

    }

    Car(String carName) {
        setCarName(carName);
    }

    Car (int gas) {
        setGas(gas);
    }

    Car (String carName, int gas) {
        setCarName(carName);
        setGas(gas);
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getGas() {
        return gas;
    }

    public void setCarName (String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public int move (int gas) {
        gas = gas - 5;
        System.out.println(getCarName() + "move, resume gas: " + getGas());
        return gas;
    }

    public int refuel (int amount) {
        return amount;
    }




}
