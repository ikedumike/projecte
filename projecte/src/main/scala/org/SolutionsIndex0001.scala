package org

object SolutionsIndex0001 extends App {

  /**
   * If we list all the natural numbers below 10 that are multiples of 3 or 5,
   * we get 3, 5, 6 and 9. The sum of these multiples is 23.
   *
   * Find the sum of all the multiples of 3 or 5 below 1000.
   *
   * Solved in 2 minutes
   */
  def p0001sumOfFactorials3And5ofMax(max: Int) = {
    var sum = 0
    for (i <- 1 to max)
      sum += (if (i % 3 == 0) i else if (i % 5 == 0) i else 0)
    sum
  }
  println(p0001sumOfFactorials3And5ofMax(999))

  /**
   * by Jorge Ortiz: http://www.scala-blogs.org/2007/12/project-euler-fun-in-scala.html
   */
  def p0001sumOfFactorials3And5ofMax() = {
    (0 until 1000) filter (n => n % 3 == 0 || n % 5 == 0) reduceLeft (_ + _)
  }
  println(p0001sumOfFactorials3And5ofMax)

  // <= 4000000
  // is a fibonacci number?
  // n: 0 -> 10

  // a=0;b=0;c=0	0: 0+0 = 0
  // a=0;b=1;c=1	1: 0+1 = 1 
  // a=1;b=2;c=3	2: 1+2 = 3
  // a=2;b=3;c=5	3: 2+3 = 5
  // a=3;b=5;c=8	5: 3+5 = 8
  // a=5;b=8;c=13	8: 5+8 = 13

  def p0002sumOfEvenFibonacciTermsUpToExcluding(max: Int) = {
	var a, b, S = 0;   var c = 1;
    while (c < max) {
      a = b;   b = c;
      S += (if (c % 2 == 0) c else 0) 
      c = a + b
    }
    S
  }  
  println(p0002sumOfEvenFibonacciTermsUpToExcluding(4000001))

}

