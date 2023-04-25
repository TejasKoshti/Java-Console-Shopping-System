package Day7.Task;

public class Customer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Customer(String name, int password) {
        this.name = name;
        this.password = password;
    }

    private String name;
    private int password;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", password=" + password +
                '}';
    }
}
