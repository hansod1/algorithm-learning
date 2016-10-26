package org.hansod1.algorithms.tree

import scala.Array

/**
  * Created by dhanson on 10/8/16.
  */
class DecisionTreeNode(numLabels : Int) {

  var left : Option[DecisionTreeNode] = None
  var right : Option[DecisionTreeNode] = None

  var continuousSplit : Option[Double] = None // < goes left, >= goes right
  var categoricalSplit : Option[(Array[Double],Array[Double])] = None //_1 goes left, _2 goes right

  var isLeaf : Boolean = false
  var classProportions : Array[Double] = new Array[Double](numLabels)

}
