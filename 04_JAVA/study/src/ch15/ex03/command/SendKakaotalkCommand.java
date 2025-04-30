package ch15.ex03.command;

import ch15.ex03.Message;

public class SendKakaotalkCommand implements Command{

    @Override
    public void execute(Message message) {
        System.out.println(message.to + "님에게 카카오톡를 보냅니다.");
    }
}
