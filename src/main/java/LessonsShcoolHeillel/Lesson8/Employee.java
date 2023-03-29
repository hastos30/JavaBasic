package LessonsShcoolHeillel.Lesson8;

class Employee {
    private String fullName;
    private String jobTitle;
    private String eMail;
    private String numberPhone;
    private int salary;
    private int age;

    public Employee(String fullName, String jobTitle, String eMail, String numberPhone, int salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.eMail = eMail;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String showInformation() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", eMail='" + eMail + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

}
