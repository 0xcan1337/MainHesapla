public class Employee {

    String name;
    int salary;
    int workHours;

    int hireYear;


    Employee(String name, int salary, int workHours, int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }

    public int tax(){
        int taxamount;
        if (this.salary > 1000){

            taxamount = (this.salary * 3) / 100;
            return taxamount;


        }

        return 0;


    }

    public int bonus()
    {
        int bonus;
        if(this.workHours > 40)
        {
            bonus = (this.workHours - 40) * 30;
            return bonus;
        }
        return 0;
    }

    public int raiseSalary(){
        int raiseSalary;

        if (2021 - hireYear > 19){


            raiseSalary = (salary * 15) / 100;




        }
        else if(2021 - hireYear > 9 && 2021 - hireYear < 19){

            raiseSalary = (salary * 10) / 100;



        }
        else{

            raiseSalary = (salary * 5) / 100;


        }

        return raiseSalary;
    }

    public String toString(){
        int lastTax = tax();
        int lastBonus = bonus();
        int lastHire = raiseSalary();
        int totalSalaryLast = this.salary + lastBonus + lastHire - lastTax;

        return "---------------------------\n" +
                "Adı: " + this.name + "\n" +
                "Maaş: " + this.salary + "\n" +
                "Çalışma saati: " + this.workHours + "\n" +
                "Çalışma yılı: " + this.hireYear + "\n" +
                "Toplam Maaş: " + totalSalaryLast;
    }




}
