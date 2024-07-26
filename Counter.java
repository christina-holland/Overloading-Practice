public class Counter {
    //Creating the attribute to hold the value of the counter
    private int value;

    //Creating a constructor that sets the start value of the counter to startValue
    public Counter(int startValue) {
        this.value = startValue;
    }

    //Creating a constructor that sets the start value of the counter to 0
    public Counter() {
        this.value = 0;
    }

    //Creating a method to return the current value of the counter
    public int value() {
        return this.value;
    }

    //Creating a method to increase the value by 1
    public void increase() {
        this.value++;
    }

    //Creating a method to decrease the value by 1
    public void decrease() {
        this.value--;
    }

    // Overloaded method to increase the value by a specified amount
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }

    //Overloaded method to decrease the value by a specified amount
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }
}

