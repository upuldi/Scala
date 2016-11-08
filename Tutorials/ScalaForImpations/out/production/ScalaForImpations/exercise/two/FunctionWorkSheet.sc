//First Attempt
def isVovel(x: Char): Boolean = x.equals('a') || x.equals('e') ||
  x.equals('i') || x.equals('o') || x.equals('u')

isVovel('b')
isVovel(' ')
isVovel('u')


//Second Attempts without the if statement.

def isVovalSmartWay(xs: Char) = "aeiou".contains(xs)

isVovalSmartWay('b')
isVovalSmartWay('e')
isVovalSmartWay('i')
isVovalSmartWay('u')
isVovalSmartWay('d')


def vovels(input: String) = {
  var returnSt = ""
  for (x <- input) {
    if ("aeiou".contains(x)) returnSt = returnSt + x;
  }
  returnSt
}
vovels("wekkojjjhu")

def vovelsWithGuards(in: String) = {
  var rtString = ""
  for (x <- in; if ("aeiou".contains(x))) rtString += x
  rtString
}
vovelsWithGuards("abcdefgh")

//no mutation
def vovelsWithYeild(in: String) = {
  for (x <- in; if ("aeiou".contains(x))) yield x
  //here no need to collect the values yield does that for us
}
vovelsWithYeild("abcdefg")


//This is a recursion test with vovles
//in scala loops are better than recursion
def vovlesWithRecursion2(word: String): String = {
  println(word)
  if (word.length == 1) {
    if ("aeiou".contains(word)) {
      word
    } else
      ""
  } else {
    vovlesWithRecursion2(word.substring(0, 1)) +
      vovlesWithRecursion2(word.substring(1, word.length))
  }
}

vovlesWithRecursion2("abcdefghij")
vovlesWithRecursion2("aaio")
//vowles with while loop
def vowelsWithWhile(in: String) = {
  var i = 0;
  var result = ""
  while (i < in.length) {
    if ("aeiou".contains(in.charAt(i))) result += in.charAt(i)
    i += 1
  }
  result
}
vowelsWithWhile("abcdefghijklmno")
//defaul params
def matchCase(in: String,
              chars: String = "aeiou",
              ignoreCase: Boolean = true) = {
  if (ignoreCase)
    for (x <- in.toLowerCase; if chars.toLowerCase.contains(x)) yield x
  else
    for (x <- in; if chars.contains(x)) yield x
}
matchCase("abcdefgh")
matchCase("abcdefgh", "AEIOU")
matchCase("abcdefgh", "AEIOU", false)
matchCase("aasdasdfdfdfdghfghghbcdefgh", "abc")

//better approach
def matchCaseBetter(in:String,matchingSt:String="aeiou",ignoreCase:Boolean=true) = {
  //Here i have put a if statement to the collection
  for (x <- if (ignoreCase)  in.toLowerCase else in ; if (matchingSt.contains(x)) ) yield x
}

matchCaseBetter("abcdefgh")
matchCaseBetter("abcdefgh", "AEIOU")
matchCaseBetter("abcdefgh", "AEIOU", false)
matchCaseBetter("aasdasdfdfdfdghfghghbcdefgh", "abc")

//Best approach
def matchCaseWithRecursion(in: String, matchingSt: String = "aeiou",
                           ignoreCase: Boolean = true): String = {

  if (ignoreCase) matchCaseWithRecursion(in.toLowerCase,
    matchingSt.toLowerCase, false)
  else for (x <- in; if (matchingSt.contains(x))) yield x
}

matchCaseWithRecursion("abcdefgh")
matchCaseWithRecursion("abcdefgh", "AEIOU")
matchCaseWithRecursion("abcdefgh", "AEIOU", false)
matchCaseWithRecursion("aasdasdfdfdfdghfghghbcdefgh", "abc")