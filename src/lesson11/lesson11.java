package lesson11;

public class lesson11 {
    public static void main(String[] args) {
        //Домашняя работа
        System.out.println("Домашняя работа");
        //Задание 1 и 2
        System.out.println("Задание 1 и 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName =  lastName + " " + firstName + " " + middleName;
        fullName = fullName.toUpperCase ();
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание 3
        System.out.println("Задание 3");
        String firstName2 = "Семён";
        String middleName2 = "Семёнович";
        String lastName2 = "Иванов";
        String fullName2 =  lastName2 + " " + firstName2 + " " + middleName2;
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName2);
    }
}
