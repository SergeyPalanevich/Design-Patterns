package patterns.factorystaticmethod;

public class StaticFactory {
    public static User createDefaultUser(){
        User user = new User();
        user.setFirstName("sergey");
        user.setLastName("polonevich");
        user.setAge(25);
        return user;
    }

    public static User createFromBirthday(int year){
        User user = new User();
        user.setAge(2017 - year);
        return user;
    }
}
