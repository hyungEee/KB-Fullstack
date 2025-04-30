package ch15.ex03;

import ch15.ex03.command.Command;
import ch15.ex03.command.SendKakaotalkCommand;
import ch15.ex03.command.SendMailCommand;
import ch15.ex03.command.SendSMSCommand;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Map<String, Command> commands=new LinkedHashMap<>();
        commands.put("sendMail",new SendMailCommand());
        commands.put("sendSMS",new SendSMSCommand());
        commands.put("sendKakaotalk",new SendKakaotalkCommand());

        Queue<Message> messageQueue=new LinkedList<>();
        messageQueue.offer(new Message("sendMail","홍길동"));
        messageQueue.offer(new Message("sendSMS","최지형"));
        messageQueue.offer(new Message("sendKakaotalk","김자바"));

        while(!messageQueue.isEmpty()){
            Message message=messageQueue.poll();
            Command command=commands.get(message.command);
            if(command!=null){
                command.execute(message);
            }
        }
    }
}
