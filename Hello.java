public class Hello {
    private String toWhom = "world";
    private String whom;

    Hello() {}

    Hello(String whom) {
        setWhom(whom);
    }

    public String getWhom() {
        return whom;
    }

    public void setWhom(String whom) {
        this.toWhom = whom;
    }

    public void sayHello() {
        System.out.println("hello " + getWhom());
    }

    void print() {
        this.sayHello();
    }




}
class hello2 {
    public static void main (String[] args) {
        Hello[] arr = new Hello[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = new Hello();
        }

        for (Hello a : arr) {
            a.sayHello();
        }

        Hello[] hellos = new Hello[3];
        String[] names = {"Kim", "Kang", "Lee"};
        for (int i = 0; i < 3; i++) {

        }




    }

}
