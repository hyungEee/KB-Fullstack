package practice.day10.ex06;

public class ShowStackCommand implements Command{
    DollStackManager dsm;

    public ShowStackCommand(DollStackManager dsm) {
        this.dsm = dsm;
    }

    @Override
    public void execute() {
        dsm.showStack();
    }
}
