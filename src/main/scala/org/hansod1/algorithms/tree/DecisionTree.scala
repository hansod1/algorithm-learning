package org.hansod1.algorithms.tree

import org.hansod1.algorithms.common.LabeledPoint
import org.hansod1.algorithms.utils.Utils

/**
  * Created by dhanson on 10/8/16.
  *
  */
class DecisionTree(depth : Int, numLabels : Int, categoricalFeatures : Set[Int]) {

  val root = new DecisionTreeNode(numLabels)

  //starting with all of the data
  //FOR EACH variable, determine all splits worth considering
  //determine the information gain associated with taking each split
  //choose the split-variable combination that results in the greatest information gain
  //perform the split and recurse

  def train(X:Seq[LabeledPoint]): Unit = {

  }

  def determineSplit(X:Seq[LabeledPoint]): Unit = {

    //we assume a sane X, all features of the same dimensin
    val n_features = X.head.features.size
    var i = 0
    val n_records = X.size*1.0d

    val labelCounts = new Array[Double](numLabels)

    //we also assume labels monotonically increase from zero to numLabels
    X.foreach(x=>labelCounts(x.label.toInt) += 1.0d)

    val current_gini = Utils.gini_index(labelCounts,n_records)

    var lowest_gini = current_gini

    var categoricalSplit : Option[(Array[Double],Array[Double])] = None

    while(i<n_features) {

      if(categoricalFeatures.contains(i)) {
        //we're dealing with a categorical feature
        val valueCounts = X.map(_.features(i))
                           .groupBy(identity)
                           .mapValues(_.size)

        //I need to sort each feature value in (feature(i)) by prevalence of label(0)

//        val n_valueCounts = valueCounts.length
        //valueCounts is Double [value] to ratio in sample, ordered by prevalence
        if(numLabels==2) {
          //valueCounts[0] goes left, valueCounts[1+] goes right

        } else {
          //we need to try all 2^(M-1) - 1 splits, where M = len(valueCounts)
        }

      } else {

      }
      i += 1
    }
  }

}
