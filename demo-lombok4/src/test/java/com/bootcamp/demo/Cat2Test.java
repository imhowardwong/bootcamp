package com.bootcamp.demo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Cat2Test {
  
  @Test
  void testSum(){
    int actual = Cat.sum(3, 7);
    int expected = 10;
    assertThat(actual, equalTo(expected));
    // assertThat(actual, is(equalTo(expected)));-> ok too
  }
  @Test
  void testList(){
    List<String> names = new ArrayList<>();
      names.add("John");
      names.add("Peter");
      names.add("Leo");
      assertThat(names, hasItem("Peter"));
      assertThat(names, not(hasItem("Mary")));//not has item = false
   } 
  @Test
  void testList2(){
    List<Integer> ages = new ArrayList<>();
    ages.add(18);
    ages.add(20);
    ages.add(40);
    assertThat(ages,hasItems(20,40));
    assertThat(ages,hasItems(40,20));
    assertThat(ages,not(hasItems(40,20,100)));
    
    //! contains-> with all elements in order
    assertThat(ages, not(contains(20,40)));
    assertThat(ages, contains(18,20,40));

      //! containsInAnyOrder
      assertThat(ages, containsInAnyOrder(40,20,18));

      //! hasSize
      assertThat(ages, not(hasSize(2)));
      assertThat(ages, hasSize(3));
  }

  @Test 
  void testNumberRanger(){
    int actual = 35;
    assertThat(actual, is(greaterThan(30)));
    assertThat(actual, is(lessThan(40)));
  }



}
