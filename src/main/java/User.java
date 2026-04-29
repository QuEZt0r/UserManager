public record User(String name, int age, String department) {

    @Override
    public String toString() {
        return name + " (" + age + " лет, " + department + ")";
    }

}