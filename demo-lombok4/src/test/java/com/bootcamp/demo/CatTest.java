package com.bootcamp.demo;


import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

// XXXTest or XXXTests
@ExtendWith(MockitoExtension.class)
public class CatTest { //!testing Environment(Memory)

  @Mock
  private Gun gun; //!object reference, mock gun

  @Spy
  private Gun gun2; //! real gun can be revise the method
  
@Test
  void testAllArgsConstructor() {
    Cat c1 = new Cat("Leo", 3); // Java said that the value "Leo" has been put inside the object
     // Expected Result
    String expectedName = "Leo";
    int expectedAge = 3;

    // Testing
    Assertions.assertEquals(expectedName, c1.getName());// If they are not equal, this test case fail
    Assertions.assertEquals(expectedAge, c1.getAge());
  }

  @Test
  void testGetter() {
    Cat c1 = new Cat("Leo", 3);
    String actualName = c1.getName();
    String expectedName = "Leo";
    Assertions.assertEquals(expectedName, actualName);

    c1.setName("Mary");
    expectedName = "Mary";
    Assertions.assertEquals(expectedName, c1.getName());
  }

  @Test
  void testSum() {
    int actualResult = Cat.sum(10, 3);
    Assertions.assertEquals(13, actualResult);
    Assertions.assertEquals(-7, Cat.sum(10, -17));
    Assertions.assertEquals(0, Cat.sum(-2, -17)); // do you agree?
  }

  // testSetter

  @Test
  void testMethodB(){
    char actual = Cat.methodB("hello", 2);
    char expected = 'l'; //
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void testShoot(){
    Mockito.when(this.gun.shoot()).thenReturn(true);

    Cat c1 = new Cat(this.gun, "Louis", 12 );

    //testing...
    int actual = c1.shoot();
    int expected = 100;
    Assertions.assertEquals(expected, actual);

    Mockito.verify(this.gun, Mockito.times(1)).shoot();
  }
  //! Tester A
    @Test
  void testShoot2(){
    Mockito.when(this.gun.shoot()).thenReturn(false);

    Cat c1 = new Cat(this.gun, "Leo", 11 );

    //testing...
    int actual = c1.shoot();
    int expected = -1;
    Assertions.assertEquals(expected, actual);
  }
  //! @Spy 
  @Test
  void testShoot3(){
    Mockito.when(this.gun2.shoot()).thenReturn(true);
    Cat c1 = new Cat(this.gun2, "Leo", 11 );

    //testing...
    Assertions.assertEquals(100, c1.shoot());
    Assertions.assertEquals(100, c1.shoot());
    c1.addBullet(); //real method
    Assertions.assertEquals(100, c1.shoot());
    Assertions.assertEquals(100, c1.shoot());
    Assertions.assertEquals(100, c1.shoot());
    Assertions.assertEquals(100, c1.shoot());
    Assertions.assertEquals(100, c1.shoot());
    Assertions.assertEquals(100, c1.shoot());

    verify(this.gun2, times(1)).addBullet();
    verify(this.gun2, times(8)).shoot();
    }
  }