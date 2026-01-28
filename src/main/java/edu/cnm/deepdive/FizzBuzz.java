package edu.cnm.deepdive;

import java.util.EnumSet;
import java.util.Set;

public enum FizzBuzz {
  FIZZ, BUZZ;

  public static Set<FizzBuzz> fizzBuzz(int position) {
    Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class);
    boolean factorOf3 = position % 3 == 0;
    boolean factorOf5 = position % 5 == 0;
    if (factorOf3) {
      result.add(FIZZ);
    }
    if (factorOf5) {
      result.add(BUZZ);
    }
    return result;
  }

}
