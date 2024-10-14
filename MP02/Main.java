class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        String[] carNames = {"kia", "ferrari", "bmw", "toyota"};
        int[] carGas = {10, 20, 15, 17};

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(carNames[i], carGas[i]);
        }

        for (int i = 0; i < 7; i++) {
            for (Car c : cars) {
                if (carGas[i] < 5) {
                    c.move(carGas[i]);
                }
                System.out.println();
            }
        }
    }
}

