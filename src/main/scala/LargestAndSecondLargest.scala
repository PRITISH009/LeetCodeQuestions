object LargestAndSecondLargest extends App {
  val arr: Array[Int] = Array(15,12,32,6,-1,0,-3,0,10,24,32)


  def returnLargestAndSecondLargest(arr: Array[Int]): (Int, Int) = {
    var max: Int = Integer.MIN_VALUE
    var secondMax: Int = Integer.MIN_VALUE

    arr.foreach { ele =>
      if(ele > max) {
        secondMax = max
        max = ele
      }
      else if(ele > secondMax) {
        secondMax = ele
      }
    }

    (max, secondMax)
  }

  println(returnLargestAndSecondLargest(arr))

}
