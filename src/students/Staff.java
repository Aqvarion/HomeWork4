package students;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString()+
                ",school='" + school + '\'' +
                ", pay=" + pay +
                "} " ;
    }

    public static void main(String[] args) {
        Person person2 = new Person("Lily","Moilov 39");
        System.out.println(person2);
        Staff staff = new Staff(person2.getName(),person2.getAddress(),"School 128",25000.00);
        System.out.println(staff);
    }
}
