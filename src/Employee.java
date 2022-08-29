public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {

        if (salary < 1000) {
            System.out.println("Vergiden muaf.");
        }
        if (salary >= 1000) {
            double taxation = (salary / 100) * (0.3);
            return taxation;

        }
        return 0;
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }

    }


    double raiseSalary(){

            if (2021-this.hireYear >= 1 &&2021-this.hireYear < 10) {
                return salary + ((salary * 5) / 100);
            }
            if (2021-this.hireYear>9&&2021-this.hireYear<20){
                return salary+((salary*10)/100);

            }if (2021-this.hireYear>19){
                return salary+((salary*15)/100);
            }

        return 0;
    }

    public  String toString(){
        double total= salary-tax()+bonus()+raiseSalary();
        double totalSalary=salary+bonus()-tax();
        System.out.println("Adi: "+this.name);
        System.out.println("Maasi: "+this.salary);
        System.out.println("Calisma Saati: "+this.workHours);
        System.out.println("Baslangic Yili: "+this.hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maas Artisi: "+raiseSalary());
        System.out.println("Vergi ve bonuslar ile toplam maas: "+total);
        System.out.println("Toplam maas: "+totalSalary);

          return null;
    }

}

