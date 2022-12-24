public class HelloJava {
    private String name;

    public HelloJava(String helloName, boolean log) {
        if (log)
            System.out.println("Hello " + helloName + '!');
        this.name = helloName;
    }

    public String toString() {
        return this.name;
    }
}