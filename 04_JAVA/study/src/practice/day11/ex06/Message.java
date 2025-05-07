package practice.day11.ex06;

import java.util.StringTokenizer;

public class Message {
    private String sender;
    private String receiver;
    private String content;

    public Message(String str) {
        StringTokenizer st=new StringTokenizer(str,"|");
        sender=st.nextToken();
        receiver=st.nextToken();
        content=st.nextToken();
    }

    @Override
    public String toString() {
        return "["+sender+"] → ["+receiver+"]\n\""+content+"\"";
    }
}
