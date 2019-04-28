public class RandomThread extends Thread {

  protected volatile boolean done = false;
  
  public void setDone() {
    done = true;
  }
   
  public void run() {
    for(int i = 0; i < Integer.MAX_VALUE; i++) {
      if(!done) {
        System.out.println(Math.random());
        try {
          Thread.sleep(1000);
        } catch(InterruptedException ie) {
          System.err.println("Sleep Interrupted!");
        }
      }
    }
    System.out.println("Thread Finished.");
  }

}