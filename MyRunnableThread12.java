package MyRunnableThread12;



public class MyRunnableThread12  implements Runnable {
	public static int myCount = 0;
    public MyRunnableThread12(){
         
    }
    public void run() {
        while(MyRunnableThread12.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++MyRunnableThread12.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 

	public static void main(String[] args) {
		System.out.println("Starting Main Thread...");
        MyRunnableThread12 mrt = new MyRunnableThread12();
        Thread t = new Thread(mrt);
        t.start();
        while(MyRunnableThread12.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++MyRunnableThread12.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");


	}

}
