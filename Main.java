public class Main {
    public static void main(String[] args) {
        Employee person=new Employee("Ahmet",2000,45,1985);
        person.tax();
        person.bonus();
        person.raiseSalary();

        System.out.println(person.toString());
    }
}