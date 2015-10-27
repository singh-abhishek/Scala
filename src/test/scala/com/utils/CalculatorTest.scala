package com.utils

import org.junit.Test
import org.junit.Assert._

class CalculatorTest {

  val calci = new Calculator

  @Test
  def shouldAddTwoNumbers{
    val sum =  calci.add(3,2)
    assertEquals(5,sum)
  }

  @Test
  def shouldSubtractTwoNumbers{
    val difference =  calci.subtract(3,2)
    assertEquals(1,difference)
  }

  @Test
  def shouldMultiplyTwoNumbers{
    val product =  calci.multiply(3,2)
    assertEquals(6,product)
  }

  @Test
  def shouldDivideTwoNumbers{
    val quotient =  calci.divide(3,2)
    assertEquals(1,quotient)
  }

}