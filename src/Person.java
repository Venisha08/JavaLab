public class Person {
    protected String name;
    protected int age;

    public Person( String name, int age)
    {
        this.name = name;
        this.age= age;
    }

    public void displayDetails()
    {
        System.out.println("Detail of the person Name:"+ name + " " + "Age:"+ age);
    }

    static class Employee extends Person {
        protected int id;
        protected int salary;

        public Employee( String name, int age,int id, int salary) {
            super(name, age);
            this.id = id;
            this.salary = salary;
        }

        public void diplayDetails() {
            super.displayDetails();
            System.out.println("Employee id  : " + id + " " + "Salary " + salary);
        }
    }

            static class Manager extends Employee
           {
               private String dept;

                public Manager(String  name, int age, int id,int salary ,String dept) {
                    super(name,age,id,salary);
                    this.dept = dept;
                }
                    public void displayDetails()
                    {
                        super.displayDetails();
                        System.out.println("Department name: " + dept);
                    }
                }

            public static void main(String[] args) {
                Manager mgr = new Manager("VENISHA",23,230,5000,"MCA");
                mgr.displayDetails();
            }

    }


