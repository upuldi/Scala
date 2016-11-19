val wordsArray = Array("Mary","had","a","little","lamb","its","fleece",
"was","white", "as", "snow","and","everywhere","that","Mary","went",
"the","lamb","was","sure","to","go")

//You will get a map with values are an array
val map = wordsArray.groupBy(_.substring(0,1))
map("e")(0)

val mapByLength = wordsArray.groupBy(_.length)
mapByLength(10)(0)