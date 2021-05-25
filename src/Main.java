public class Main
{
    public static void main(String[] args)
    {
        Vacancy developer = new Vacancy("Developer");
        Employee tester = new Employee(7L, developer);
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
}

class Employee
{
    private long id;
    private Vacancy vacancy;

    Employee(long id,Vacancy vacancy)
    {
        this.id = id;
        this.vacancy = vacancy;
    }

    String getVacancy()
    {
        if (vacancy == null) return null;
        else return vacancy.getVacancyName();
    }

    long getId()
    {
        return id;
    }
}

class Vacancy
{
    private String vacancyName;
    Vacancy(String vacancyName)
    {
        this.vacancyName = vacancyName;
    }
    String getVacancyName()
    {
        return vacancyName;
    }
}



