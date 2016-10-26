package org.hansod1.algorithms.utils

import org.hansod1.algorithms.common.LabeledPoint

/**
  * Created by dhanson on 10/8/16.
  */
object Utils {
  def gini_index(counts: Array[Double], totalCount : Double) : Double = {
    val n_labels = counts.length
    var impurity = 1.0
    var i =0
    while(i<n_labels) {
      val f = counts(i) / totalCount
      impurity -= f*f
      i+=1
    }
    impurity
  }
}
