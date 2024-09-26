//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //        task2
    static {
        String fullName = "Ivanov Ivan Ivanovich";
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperCaseFullName);
    }

    // task3
    static {
        String fullName = "Иванов Семён Семёнович";
        String correctedFullName = fullName.replace("ё", "е");

        System.out.println("Данные Ф. И. О. сотрудника — " + correctedFullName);
    }

    public static void main(String[] args) {
//task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);
    }
}