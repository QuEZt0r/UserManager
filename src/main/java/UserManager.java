import java.util.*;
import java.util.stream.Collectors;

public class UserManager {

    public static List<User> getAdults(List<User> users) {
        return users.stream().filter(u -> u.age() > 17).collect(Collectors.toList());
    }

    public static List<String> getITUserName(List<User> users) {
        return users.stream().filter(u -> "IT".equals(u.department())).map(User::name).collect(Collectors.toList());
    }

    public static double getAverageAge(List<User> users) {
        return users.stream().mapToInt(User::age).average().orElse(0.0);
    }

    public static User getYoungestUser(List<User> users) {
        return users.stream().min(Comparator.comparingInt(User::age)).orElse(null);
    }

    public static Map<String, List<User>> groupByDepartment(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::department));
    }

}