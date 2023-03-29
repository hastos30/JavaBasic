package LessonsShcoolHeillel.Lesson8;

class Main {
    public static void main(String[] args) {

        /*  1. Создать пустой проект в IntelliJ

            2. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

            3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

            4. Создать массив из 5 сотрудников.

            5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        */
        Employee [] employees = {
                new Employee("Viktor SS_WS", "programer", "hesasr@gmail.com","123", 1000,28),
                new Employee("Viktor SS_WS", "programer", "hesasr@gmail.com","123", 1000,40),
                new Employee("Viktor SS_WS", "programer", "hesasr@gmail.com","123", 1000,45),
                new Employee("Viktor SS_WS", "programer", "hesasr@gmail.com","123", 1000,55),
                new Employee("Viktor SS_WS", "programer", "hesasr@gmail.com","123", 1000,60)
        };

        for(int i = 0; i < employees.length; i++){
            if(employees[i].getAge() > 40){
                System.out.println(employees[i].showInformation());
            }
        }
    }
}
