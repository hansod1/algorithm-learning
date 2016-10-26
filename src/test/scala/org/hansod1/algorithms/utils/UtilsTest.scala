package org.hansod1.algorithms.utils
import org.scalatest.FunSuite

/**
  * Created by dhanson on 10/8/16.
  */
class UtilsTest extends FunSuite {
  test("gini impurity returns correct values") {
    assert(Utils.gini_index(Array(1,9),10) - 0.17999999999999994 < 0.000001)
    assert(Utils.gini_index(Array(0,10),10) == 0.0d)
  }
}
