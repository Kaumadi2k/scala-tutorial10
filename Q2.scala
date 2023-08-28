object Q2 {
  def countLetterOccurrences(wordList: List[String]):Int={
    val stringLengthList = wordList.map(word=>word.length)
    val totalLetters = stringLengthList.reduce((x,y)=>x+y)
    totalLetters
  }

  def main(args:Array[String]): Unit={
    println("Enter a list of words separated by commas:")
    val userInput = scala.io.StdIn.readLine()
    val inputElements = userInput.split(",")
    val wordList = inputElements.map(_.toString).toList
    val total = countLetterOccurrences(wordList)
    printf("Total count of letter occurrences: "+ total)
  }
}

