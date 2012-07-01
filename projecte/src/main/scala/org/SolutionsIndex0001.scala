package org

object SolutionsIndex0001 extends App {

  /**
   * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
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
}

