## Exercise 1:
* Create Runnable object by implementing Runnable interface (e.g. using lambda or anonymous class)
* implement run() method body which will print current thread name, status and id.
* Create 10 threads by passing runnable object to Thread class constructor.
* Start threads by calling start() method on every thread object and run main() method.


## Exercise 2:
* Start a new thread in main method passing CounterRunner object as parameter and check if counting to 10000 works.
* Put sleep() method in the proper place in CounterRunner class to simulate counting every one second. 
* Run the thread again and check if counting works slower.
* Try to interrupt the thread in main method by calling interrupt() method on thread object. What happened? 
* Change the moment of calling interrupt() method 10 seconds after starting the CounterRunner thread.

## Exercise 3:
* 