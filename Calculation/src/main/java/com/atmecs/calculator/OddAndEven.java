package com.atmecs.calculator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OddAndEven {
	public void oddMethod() {
	
		@SuppressWarnings("rawtypes")
		List a = {4, 3, 1, 2, 5, 6, 8, 9, 7, 10};

      List.set(a, new Comparator<Integer>() {
          public int compare(Integer o1, Integer o2) {
              if (o1%2 == o2%2) {
                  // Both numbers are odd or both numbers are even
                  return 0;
              }
              // One is odd, the other one is even
              if (o1%2 == 0) {
                  return -1;
              }
              return 1;
          }
      });
      for(int x:a) {
          System.out.print(x);
      }
	}
}