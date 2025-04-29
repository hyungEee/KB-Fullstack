package ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        MovieThread mt=new MovieThread();
        MusicRunnable mr=new MusicRunnable();

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                mt.run();

            }
        });
        thread.start();
        mr.run();
    }
}
