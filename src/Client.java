public class Client extends Person{
    private double credit;
    public Client(){
        System.out.println("Instance of client");
    }
    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
