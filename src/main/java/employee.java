public class employee {

    private String name;

    private double salary;

    private String position;


    public employee(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }



    public String getSalaryGrade(double salary){
        if (salary >= 10000  && salary < 20000){
            return "C";
        } else if (salary >= 20000 && salary < 40000) {
            return "B";
        } else {
            return "A";
        }
    }
}

