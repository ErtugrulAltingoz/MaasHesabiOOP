public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Ertuğrul",7500,45,2016);
        System.out.println(employee);
        System.out.println("\nVergi"+employee.tax()+"\nBonus: "+employee.bonus()+"\nTecrübe zammı:"+employee.riseeSalary()+ "\nToplam Maaş:" + (employee.salary + employee.riseeSalary()) + " "
                + "\nMaaş ve Toplam maaş:" + employee.salary + ", " + (employee.salary + employee.riseeSalary()));

    }
}