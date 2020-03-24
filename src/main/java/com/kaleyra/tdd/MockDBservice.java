package com.kaleyra.tdd;

public class MockDBservice extends DBservice {

    //TODO what to do with this mock?
    // when mock.load(), retrun some User I decide
    // 1. user.getAge() < 18
    // 2. user.getAge > 18
    @Override
    public User load(String name) {
        User user = new User();//TODO logic that can do anything I want
        user.setAge(15);
        return user;
    }
}
