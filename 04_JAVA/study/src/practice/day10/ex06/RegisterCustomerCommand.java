package practice.day10.ex06;

import practice.day10.ex05.RandomCustomerProvider;

public class RegisterCustomerCommand implements Command{

    private DollQueueManager dqm;

    public RegisterCustomerCommand(DollQueueManager dqm) {
        this.dqm = dqm;
    }
    @Override
    public void execute() {
        dqm.registerCustomer(RandomCustomerProvider.getRandomCustomer());
        System.out.println();
    }
}
