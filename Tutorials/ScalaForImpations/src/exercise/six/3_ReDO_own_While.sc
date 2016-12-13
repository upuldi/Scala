val n = 10
var i = 1
var f =1

Upul(() => i< n,() => { f *= i;i += 1 })
//As per the above statemtnt you are passing a predicate and a code block

def Upul( predicate: ()=> Boolean, codeBlock: () => Unit) {
  //Here is your logic
  if(predicate()) {
    codeBlock()
    Upul(predicate,codeBlock)
  }
}

f

//Without makeing it nice I am applying curring,

UpulCurring(() => i< n) (() => { f *= i;i += 1 })

def UpulCurring( predicate: ()=> Boolean) (codeBlock: () => Unit) {
  //Here is your logic
  if(predicate()) {
    codeBlock()
    Upul(predicate,codeBlock)
  }
}

//Now making it nice

UpulCurringNice(i< n) ({ f *= i;i += 1 })

def UpulCurringNice( predicate: => Boolean) (codeBlock: => Unit) {
  //Here is your logic
  if(predicate) {
    codeBlock
    UpulCurringNice(predicate)(codeBlock)
  }
}


//Now you can ommit the last paranthesis
//As it is just a code block
UpulCurringNiceSuper(i< n) { f *= i;i += 1 }

def UpulCurringNiceSuper( predicate: => Boolean) (codeBlock: => Unit) {
  //Here is your logic
  if(predicate) {
    codeBlock
    UpulCurringNiceSuper(predicate)(codeBlock)
  }
}
