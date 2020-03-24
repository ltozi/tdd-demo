package com.kaleyra.tdd;

public class Application {

    private DBservice dBservice;

    public Application() {
    }

    public Application(DBservice dBservice) {
        this.dBservice = dBservice;
    }

    /**
     * We must validate
     *
     * user.setName("Luigi"); //Not empty
     * user.setUsername("ltozi");//Not empty //Can contain only letters and max 10 chars
     * user.setEmail("luigi.toziani@kaleyra.com");//Not empty //Email format must be valid
     * user.setAge(35);//Not empty //Not negative and age greater than 18
     *
     * @param user
     */
    public void save(User user) {

        /*
        *         if (action == addition) then
            context.setStrategy(new ConcreteStrategyAdd())

        if (action == subtraction) then
            context.setStrategy(new ConcreteStrategySubtract())

        if (action == multiplication) then
            context.setStrategy(new ConcreteStrategyMultiply())

        result = context.executeStrategy(First number, Second number)*/

        Context context = new Context();
        context.registerValidator(new NotEmptyValidator());


        context.executeValidation(user.getName());

        //TODO other validations

        System.out.println("User saved!");
    }

    public void initConnection() {
        this.dBservice = new DBservice();
    }

    /**
     *
     * @param name
     * @return
     */
    public User queryForUser(String name) throws Exception {
        if(name == null) {
            return new User(); //Empty user

        }
        User user = dBservice.load(name);

        if(user.getAge() < 18) {
            throw new Exception("user too young! He should not exist here");
        }

        return user;
    }

    public void setService(DBservice dbService) {
        this.dBservice = dbService;
    }
}
