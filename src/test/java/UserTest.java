import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    @Test
    public void getAllUsers() {
        User user = new User("user1", 31, Sex.MALE);
        User user1 = new User("user2", 32, Sex.FEMALE);
        User user2 = new User("user3", 33, Sex.MALE);
        User user3 = new User("user4", 34, Sex.FEMALE);
        List<User> expected = User.getAllUsers();
        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsers_MALE() {
        User user = new User("user1", 31, Sex.MALE);
        User user1 = new User("user2", 32, Sex.FEMALE);
        User user2 = new User("user3", 33, Sex.MALE);
        User user3 = new User("user4", 34, Sex.FEMALE);
        List<User> expected = User.getAllUsers(Sex.MALE);
        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsers_FEMALE() {
        User user = new User("user1", 31, Sex.MALE);
        User user1 = new User("user2", 32, Sex.FEMALE);
        User user2 = new User("user3", 33, Sex.MALE);
        User user3 = new User("user4", 34, Sex.FEMALE);
        List<User> expected = User.getAllUsers(Sex.FEMALE);
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user3);
        Assert.assertEquals(expected, actual);
    }
}
