# Java-Toolbox
## Join
The join() method of the target thread is used to suspend the current thread until the target thread returns from its run() method. The join() method is overloaded: no arguments waits forever for the thread to terminate, or an integer value representing millisconds can be specified for how long to wait. For a simple example, I create/start a thread that writes out a random value every second, and the main thread waits the number of seconds specified on the command line. When I run the program, it looks like this:
```
~/Developer/Java-Toolbox/join$ java Join 4
Starting
0.9633555943897615
0.1904154348206687
0.08143589164082932
0.770818736716561
Main Finished.
Thread Finished.
```
WARNING: The join(int) method does not stop the thread.

While it is tempting to use the Thread.stop() method that is not advised. It is deprecated and overkill as you can see in this example, it is a simple matter to create a method to change a flag so that the thread stops.

NOTE: If the RandomThread class was going to be used to launch multiple threads that all needed to be stopped via the "done" variable then it must be volatile to ensure the change would visible to other threads.
