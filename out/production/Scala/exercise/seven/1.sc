def swap(t:(_,_)) = t match {
  case (aa,bb) => (bb,aa)
}

swap((5,10))
swap(100,200)

// _ denotes anything