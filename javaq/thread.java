public class thread extends Thread{
    public void run(){
        System.out.println("thread is running");
    }
    
    public static void main(String[] args) {
        thread obj = new thread();
        obj.start();
    }
}

