public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double SalaryR;
    double tax;
    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.tax=tax;

    }
    double tax(){
        if(salary>1000){
            tax=salary*0.03;
            return salary=salary-(salary*0.03);
        }
        else
        return 0;
    }
    double bonus(){
        if(workHours>40){
            return
            salary+=(workHours-40)*30;
        }
        else
        return 0;
    }
    double raiseSalary(){
        if(2021-hireYear<10){
            SalaryR=salary*0.05;
            return salary+=salary*0.05;
        }
        else if(2021-hireYear>9 && 2021-hireYear<20){
           SalaryR=salary*0.10;
            return salary+=salary*0.10;
        }
        else if(2021-hireYear>19){
            SalaryR=salary*0.15;
           return salary+=salary*0.15;
        }
        else
        return 0;
    }
    public String toString(){
        return " \n Adı: " + name +"\n Maaşı: " + salary + "\n Başlangıç Yılı: "+ hireYear+"\n Haftalık Çalışma Saati: " + workHours +"\n Vergi:"+tax+"\n Bonus:"+(workHours-40)*30 +"\n Maaş artışı: "+SalaryR+ "\n Toplam Maaşı: " + salary ;

    }
}
