public class CounterMain {
    public static void main(String[] args) {
        //Creating a Counter object with a start value of 10
        Counter counter1 = new Counter(10);
        System.out.println("Counter1 initial value: " + counter1.value());

        //Using the increase method with no parameters
        counter1.increase();
        System.out.println("Counter1 after increase: " + counter1.value());

        //Using the decrease method with no parameters
        counter1.decrease();
        System.out.println("Counter1 after decrease: " + counter1.value());

        //Using an overloaded increase method with a parameter
        counter1.increase(5);
        System.out.println("Counter1 after increase by 5: " + counter1.value());

        //Using an overloaded decrease method with a parameter
        counter1.decrease(3);
        System.out.println("Counter1 after decrease by 3: " + counter1.value());

        //Creating a Counter object with the default constructor (value starts at 0)
        Counter counter2 = new Counter();
        System.out.println("Counter2 initial value: " + counter2.value());

        //Using the increase and decrease methods on the default Counter
        counter2.increase();
        counter2.increase(10);
        counter2.decrease();
        counter2.decrease(5);
        System.out.println("Counter2 final value: " + counter2.value());
    }
}

