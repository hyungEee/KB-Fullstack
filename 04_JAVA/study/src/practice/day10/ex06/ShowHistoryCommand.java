package practice.day10.ex06;

public class ShowHistoryCommand implements Command{
    DollHistoryManager dhm;

    public ShowHistoryCommand(DollHistoryManager dhm) {
        this.dhm = dhm;
    }

    @Override
    public void execute() {
        dhm.showAllHistory();
    }
}
