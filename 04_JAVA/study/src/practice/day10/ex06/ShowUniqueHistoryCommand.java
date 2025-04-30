package practice.day10.ex06;

public class ShowUniqueHistoryCommand implements Command{

    DollHistoryManager dhm;

    public ShowUniqueHistoryCommand(DollHistoryManager dhm) {
        this.dhm = dhm;
    }

    @Override
    public void execute() {
        dhm.showAllUniqueHistory();
    }
}
