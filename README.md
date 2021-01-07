## Exercise 1 (Creating and starting threads):
* Create Runnable object by implementing Runnable interface (e.g. using lambda or anonymous class)
* implement run() method body which will print current thread name, status and id.
* Create 5 threads by passing runnable object to Thread class constructor.
* Start threads by calling start() method on every thread object and run main() method.

* Write own class that will extend the Thread class, override and implement run() method with the same functionality as above.
* Create an object of your class and start a thread.


## Exercise 2 (Using sleep() and interrupt() methods):
* Start a new thread in main method passing CounterRunner object as parameter and check if counting to 10000 works.
* Put sleep() method in the proper place in CounterRunner class to simulate counting every one second. 
* Run the thread again and check if counting works slower.
* Try to interrupt the thread in main method by calling interrupt() method on thread object. What happened? 
* Change the moment of calling interrupt() method 10 seconds after starting the CounterRunner thread.

## Exercise 3 (Using join() method):
* Use join() method in such way that println() method to be run after calculating fibonnaci series (check FibonacciGeneratorThread class)
