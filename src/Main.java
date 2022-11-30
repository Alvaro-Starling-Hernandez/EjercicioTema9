class Main {
    public static void main(String[]args){
        Client client = new Client();
        client.setAge(21);
        client.setName("Alvaro");
        client.setPhone("829-817-4805");
        client.setCredit(10000);
        System.out.println("Age: "+ client.getAge());
        System.out.println("Name: "+ client.getName());
        System.out.println("Phone: "+ client.getPhone());
        System.out.println("Credit: "+ client.getCredit());

        Worker worker = new Worker();
        worker.setAge(23);
        worker.setName("Alvaro Starling");
        worker.setPhone("829-817-0005");
        worker.setSalary(30000);
        System.out.println("Age: "+ worker.getAge());
        System.out.println("Name: "+ worker.getName());
        System.out.println("Phone: "+ worker.getPhone());
        System.out.println("Salary: "+ worker.getSalary());
    }
}