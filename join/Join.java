public class Join {

  public static void main(String[] args) {
    int seconds = 1;

    if(args.length > 0) {
      try {
        seconds = Integer.valueOf(args[0]);
      } catch(NumberFormatException nfe) {
        System.err.print("Using default value of 1 for seconds. ");
        System.err.println("Expected an integer as an argument. Got: " + args[0]);
      }
    }

    RandomThread t = new RandomThread();
    System.out.println("Starting");
    t.start();

    try {
      t.join(1000 * seconds);
      t.setDone();
    } catch(InterruptedException ie) {
      System.out.println("Joining was interrupted.");
    }

    System.out.println("Main Finished.");
  }

}
