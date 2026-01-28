package edu.cnm.deepdive;

public class FizzBuzz {



  public String fizzBuzz(int position) {
    String result = "";
    boolean factorOf3 = position % 3 == 0;
    boolean factorOf5 = position % 5 == 0;
    if (factorOf3) {
      result += "Fizz";
    }
    if (factorOf5) {
      result += "Buzz";
    }
    if (result.isEmpty()) {
      result = Integer.toString(position);
    }
    return result;
  }

}
