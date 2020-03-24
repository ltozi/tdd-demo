package com.kaleyra.tdd;
//Save user example

public class SaveUserExample {

    public static void main(String[] arg) {

        User user = new User();
        user.setName("Luigi"); //Not null
        user.setUsername("ltozi");//Not null //Can contain only letters and max 10 chars
        user.setEmail("luigi.toziani@kaleyra.com");//Not null //Email format must be valid
        user.setAge(35);//Not null //Not negative and age greater than 18

        Application application = new Application();

        application.save(user);

    }


}
