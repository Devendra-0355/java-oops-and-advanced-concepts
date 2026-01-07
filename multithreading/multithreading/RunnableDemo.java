class RunnableDemo implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new RunnableDemo());
        t.start();
    }
}
