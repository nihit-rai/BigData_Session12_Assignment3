class Assignment12_3Class 
{
  val tupleList = List[(Int, String)]((1, "alpha"), (2, "beta"), (3, "gamma"), (4, "zeta"), (5, "omega"));
  
  //print the numbers where the corresponding string length is 4
  def findLengthFour()
  {
     println("Problem 1 : numbers where the corresponding string length is 4")
    for( t <- tupleList)
    {
      if(t._2.length() == 4 )
      {
        println(t._1);
      }
    }
     println("---------------------------------------");
 }
  //finding the average of all numbers, where the corresponding string contains alphabet ‘m’ or alphabet ‘z’
  def findAvgZM()
  {
    var total = 0;
    var count = 0;
    for( t <- tupleList)
    {
      if(t._2.contains('m') || t._2.contains('M') || t._2.contains('z') || t._2.contains('Z'))
      {
        total = total + t._1;
        count = count + 1;
      }
    }
    println(" ");
    println("Problem 2 : average of all numbers, where the corresponding"); 
    println("string contains alphabet ‘m’ or alphabet ‘z’ = " + (total/count));
    
  }
}

object Obj{
  
  def main(args:Array[String])
  {
    var obj = new Assignment12_3Class();
    obj.findLengthFour();
    obj.findAvgZM();
  }
}