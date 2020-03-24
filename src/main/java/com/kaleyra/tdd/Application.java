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


        // Validate 'name' and 'user name'
        Context<String> context1 = new Context<String>();
        context1.registerValidator(new NotEmptyValidator());
        context1.registerValidator(new RegexValidator("[a-zA-Z]{10}"));
        context1.executeValidation(user.getName());
        context1.executeValidation(user.getUserName());

        // Validate 'email'
        String EMAIL_PATTERN ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Context<String> context2 = new Context<String>();
        context2.registerValidator(new RegexValidator( EMAIL_PATTERN));
        context2.executeValidation(user.getEmail());

        // Validate 'age'
        Context<Integer> context3 = new Context<Integer>();
        context3.registerValidator(new RangeValidator(18,60));
        context3.executeValidation(user.getAge());





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
