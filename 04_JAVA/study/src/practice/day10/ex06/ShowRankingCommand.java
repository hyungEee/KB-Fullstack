package practice.day10.ex06;

public class ShowRankingCommand implements Command{

    DollPopularityManager dpm;

    public ShowRankingCommand(DollPopularityManager dpm) {
        this.dpm = dpm;
    }

    @Override
    public void execute() {
        dpm.showRanking();
    }
}
