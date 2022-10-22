public class Employee {
    String name;
    int salary;
    int workHous;
    int hireYear;
    Employee(String name,int salary,int workHous,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHous=workHous;
        this.hireYear=hireYear;
    }
    int tax(){
        int Tax=0;
        if(salary>1000){
            Tax=this.salary*3/100;
        }else{
            Tax=0;

        }
        return Tax;
    }
    int bonus(){
        int Bonus=0;
        if(workHous>40){
            Bonus=(this.workHous-40)*30;
        }else {
            Bonus=0;
        }
        return Bonus;
    }
    int riseeSalary(){
        int Risesalary = 0;
        if(2021-this.hireYear<10){
            Risesalary=this.salary*5/100;
        }
            if(9<this.hireYear-2021&&this.hireYear-2021<20){
                Risesalary=this.salary*10/100;
            }if(this.hireYear>19){
                Risesalary=this.salary*15/100;
        }
            return Risesalary;


    }
    public String toString(){
        return "Çalışanın adı: "+this.name+"\nÇalışanın Maaşı: "+this.salary+"\nÇalışma Saati: "+this.workHous+"\nİşe Başlama yılı: "+
                this.hireYear;


    }
}
