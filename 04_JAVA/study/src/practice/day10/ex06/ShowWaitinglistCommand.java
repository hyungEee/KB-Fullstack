package practice.day10.ex06;

public class ShowWaitinglistCommand implements Command{

    DollQueueManager dqm;

    public ShowWaitinglistCommand(DollQueueManager dqm) {
        this.dqm = dqm;
    }

    @Override
    public void execute() {
        dqm.showWaitingList();
    }
}
