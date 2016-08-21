//Traditional Ways of defining multilines are like this
val  someStringWithMultiLines = "This is my first Line, \n" +
                                  "And another Line, \n" +
                                  "one line below that, \n" +
                                  "one more line";

println(someStringWithMultiLines);

println("Smart String Demo \n\n\n");

//Smart Strings are begin and end with three quatation marks

val smartString =
  """Some String With First Line
    And This is my second line
    This is the thrid line
    And Forth
    And the fifth line.
  """;

println(smartString); // see the result, there is an empty margin from the left, to ged rid of that.

//

val smartStringWithFlushedMargins =
  """
    |Some Margin With the left most
    |Another line with leftmost
    |Third line with leftmost
    |forth line
    |fifth line
  """.stripMargin;

println(smartStringWithFlushedMargins);

//You can change the margin indicating charactor as you wish..


val withDiffrentCharForMargin =
  """
    $Some Margin With the left most
    $Another line with leftmost
    $Third line with leftmost
    $forth line
    $fifth line
  """.stripMargin('$');

println(withDiffrentCharForMargin);


