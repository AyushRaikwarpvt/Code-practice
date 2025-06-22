package OOPs.Rivsion;

public class Employes {
    private String  Emp_Name;
    private  long Emp_Phone;
    private int Emp_salary;

    public String getEmp_Name() {
        return Emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        Emp_Name = emp_Name;
    }

    public long getEmp_Phone() {
        return Emp_Phone;
    }

    @Override
    public String toString() {
        return "Employes{" +
                "Emp_Name='" + Emp_Name + '\'' +
                ", Emp_Phone=" + Emp_Phone +
                ", Emp_salary=" + Emp_salary +
                '}';
    }

    public void setEmp_Phone(long emp_Phone)
    {
        if (emp_Phone > 0){
            Emp_Phone = emp_Phone;
        }
       else {
            System.out.println("Phone Number Must Be save in 10 digit");
        }
    }

    public int getEmp_salary() {
        return Emp_salary;
    }

    public void setEmp_salary(int emp_salary)
    {
        if (emp_salary > 0){
            Emp_salary = emp_salary;
        }
        else {
            System.out.println("Your Sallary Have in Positive Number");
        }
    }
}
class Test extends Employes{
    public static void main(String[] args) {
        Employes Mukesh = new Employes();
        Mukesh.setEmp_Name("Ayush Raikwar");
        Mukesh.setEmp_Phone(898219632);
        Mukesh.setEmp_salary(1200);

        System.out.println(Mukesh);


    }
}
