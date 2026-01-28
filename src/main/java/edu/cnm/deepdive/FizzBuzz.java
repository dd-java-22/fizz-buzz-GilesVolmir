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

  static void main(String[] args) {
    int max = 100;
    int parsedArg;
    if (args.length > 0 && (parsedArg = Integer.parseInt(args[0])) > 0) {
      max = parsedArg;
    }
    FizzBuzz fizzBuzz = new FizzBuzz();
    for (int i = 0; i < max; i++) {
      System.out.println(fizzBuzz.fizzBuzz(i+1));
    }
  }

}
