/*
public class Main {
    public static void main(String[] args){
        Employee tester = new Employee(7, "Developer");
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
}

class Employee {
    private long id;
    private String vacancy;

    public Employee(long id, String vacancy) {
        this.id = id;
        this.vacancy = vacancy;
    }

    String getVacancy() {
        return vacancy;
    }

    long getId() {
        return id;
    }
}
*/

public class Main {
    public static void main(String[] args){
        Employee tester = new Employee(7, "Developer");
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
}

class Employee {
    private long id;
    private Vacancy vacancy;
    Employee(long id,String vacancyName){
        this.id = id;
        this.vacancy = new Vacancy(vacancyName);
    }
    String getVacancy() {
        return vacancy.getVacancyName();
    }

    long getId() {
        return id;
    }
}

class Vacancy {
    private String vacancyName;
    Vacancy(String vacancyName){
        this.vacancyName = vacancyName;
    }
    String getVacancyName() {
        return vacancyName;
    }
}



