public class Worker extends Person{
    private double salary;

    public Worker(){
        System.out.println("Instance of worker");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
