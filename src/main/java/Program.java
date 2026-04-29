import java.util.List;

public class Program {

    public static void main(String[] args){

        List<User> users = List.of(
                new User("Nikita", 19, "IT"),
                new User("Aleksandr", 20, "Marketing"),
                new User("Egor", 18, "IT"),
                new User("Islam", 17, "HR")
        );

        System.out.println("Взрослые: " + UserManager.getAdults(users));
        System.out.println("IT отдел: " + UserManager.getITUserName(users));
        System.out.println("Средний возраст: " + UserManager.getAverageAge(users));
        System.out.println("Самый молодой: " + UserManager.getYoungestUser(users));
        UserManager.groupByDepartment(users).forEach((dep, list) -> {System.out.println(dep + ": " + list.size() + " чел.");});

    }

}