public class PersonalComputer {
    Computer c;
    Monitor m;

    PersonalComputer (Computer c, Monitor m) {
        this.c = c;
        this.m = m;
    }

    public void turnOn() {
        c.powerButton();
        m.powerButton();
        System.out.println(c.getPower());
        System.out.println(m.getPower());
    }

    public void printSpec() {
        System.out.println(c.getCpu());
        System.out.println(m.getSize());
    }
}

class Main {
    public static void main (String[] args) {
        Computer c = new Computer("kk");
        Monitor m = new Monitor(20);

        PersonalComputer pc = new PersonalComputer(c, m);
        pc.turnOn();
        pc.printSpec();


    }
}
