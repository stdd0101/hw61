public class Main {
    public static void main(String[] args) {
        new User("user1", 31, Sex.MALE);
        new User("user2", 32, Sex.FEMALE);
        new User("user3", 33, Sex.MALE);
        new User("user4", 34, Sex.FEMALE);
        System.out.println("all users:");
        User.getAllUsers().forEach(System.out::println);
        System.out.println("all users: MALE");
        User.getAllUsers(Sex.MALE).forEach(System.out::println);
        System.out.println("all users: FEMALE");
        User.getAllUsers(Sex.FEMALE).forEach(System.out::println);

        System.out.println("all users: " + User.getHowManyUsers());
        System.out.println("all users MALE: " + User.getHowManyUsers(Sex.MALE));
        System.out.println("all users FEMALE: " + User.getHowManyUsers(Sex.FEMALE));

        System.out.println("total age of all users: " + User.getAllAgeUsers());
        System.out.println("total age of all users MALE: " + User.getAllAgeUsers(Sex.MALE));
        System.out.println("total age of all users FEMALE: " + User.getAllAgeUsers(Sex.FEMALE));

        System.out.println("average age of all users: " + User.getAverageAgeOfAllUsers());
        System.out.println("average age of all users - MALE: " + User.getAverageAgeOfAllUsers(Sex.MALE));
        System.out.println("average age of all users - FEMALE: " + User.getAverageAgeOfAllUsers(Sex.FEMALE));
    }
}
