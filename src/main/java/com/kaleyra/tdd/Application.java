package com.kaleyra.tdd;

public class Application {

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
        context.setValidator(new NotNullValidator());


        context.executeValidation(user.getName());

        //TODO other validations

        System.out.println("User saved!");
    }
}
