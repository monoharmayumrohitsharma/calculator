/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class testcalculator {

  private calculator c;

  @Before
  public void setUp() throws Exception {
    this.c = new calculator();
  }

  @After
  public void tearDown() throws Exception {
    c = null;
  }

  @Test
  public void testAdd_positiveNumbers_shouldReturnResult() {
    assertEquals( 7, c.add(3, 4));
    assertEquals( -3, c.add(-1, -2));
  }

//  @Test(expected = IllegalArgumentException.class)
 // public void testAdd_negativeNumbers_shouldThrowException() {
 //   classUnderTest.add(-3, -4);
 // }

  @Test
  public void testSubstract() {
    assertEquals( 2, c.substract(5, 3));
    assertEquals( 9, c.substract(4, -5));
    assertEquals( -1, c.substract(-5, -4));
  }

  @Test
  public void testMultiply() {
    assertEquals( 56, c.multiply(7, 8));
    assertEquals( 0, c.multiply(0, 4));
  }
  @Test
  public void testdivision() {
    assertEquals( 1, c.division(8, 8));
    assertEquals( 0, c.division(4, 0));
  }

}
