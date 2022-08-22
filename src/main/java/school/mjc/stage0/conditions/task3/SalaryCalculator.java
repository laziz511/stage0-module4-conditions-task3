package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double after_taxes;
        if (salary<=10000 && salary>0){
            after_taxes = salary * 0.85;
            System.out.println(after_taxes);
        }else if (salary>10000 && salary<=20000){
            after_taxes = salary * 0.82;
            System.out.println(after_taxes);
        }else if (salary>20000){
            after_taxes = salary * 0.80;
            System.out.println(after_taxes);
        }else{
            System.out.println("wrong input!");
        }
    }
}
