package study.demo;


public class Demo {


    private final Object monitor = new Object();
    private final int limit;
    private volatile int count;

    public Demo(int limit, int initCount) {
        this.limit = limit;
        this.count = initCount;
    }

    public void print() {
        while (count < limit) {
            synchronized (monitor) {
                try {
                    System.out.println(String.format("线程[%s]打印数字:%d", Thread.currentThread().getName(), ++count));
                    monitor.notifyAll();
                    monitor.wait();
                } catch (InterruptedException e) {
                    //ignore
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Demo demo = new Demo(10, 0);
        Thread thread1 = new Thread(demo::print, "thread-1");
        Thread thread2 = new Thread(demo::print, "thread-2");
        thread1.start();
        thread2.start();
        Thread.sleep(Integer.MAX_VALUE);
    }

}

