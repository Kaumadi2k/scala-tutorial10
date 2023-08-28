object Q1 {
  def calculateAverage(tempList: List[Int]): Double={
    val farenhiteList = tempList.map(celcius=>celcius*9/5 + 32)
    val sum = farenhiteList.reduce((x,y)=>x+y)
    val average = sum/farenhiteList.length
    average
  }


  def main(args: Array[String]): Unit={
    println("Enter a list of numbers separated by commas:")
    val userInput = scala.io.StdIn.readLine()
    val inputElements = userInput.split(",")
    val numberList = inputElements.map(_.toInt).toList
    val average = calculateAverage(numberList)
    printf("Average Fahrenheit temperature: "+ average)
  }
}

