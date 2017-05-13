//import org.scalatest.Assertions._

object MergeSort extends App {

    def Merge(left: List[Int], right: List[Int]) : List[Int] =
    (left, right) match {
	        case(left, Nil) => left
	        case(Nil, right) => right
	        case(leftHead :: leftTail, rightHead :: rightTail) =>
	          if (leftHead < rightHead) leftHead::Merge(leftTail, right)
	          else rightHead :: Merge(left, rightTail)

    }

    def mergeSort(InitialList: List[Int]) : List[Int] =
    {
        val n = InitialList.length
        val HalfWay = n/2
        if (n == 0 || n == 1) return InitialList
        else{
            val (left, right) = InitialList.splitAt(HalfWay)
            Merge(mergeSort(left), mergeSort(right))
        }
    }

    val x = mergeSort(List(1,4,2,1,3))
    println(x)
}
