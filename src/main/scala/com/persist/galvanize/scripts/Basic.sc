"BASIC TYPES"
23
23+1
33.4
33.4+5
"abc"
"foo" + "bar"
"abcdef".substring(2,4)
"abc".toUpperCase
false
false || true
false && true
false != true

"TUPLES"
val t = (1,2)
val u = ("one",1)
u._1
u._2

"VAL"
val x:Int = 3
val y = 4
x+y

"FUNCTIONS"
def incr(i:Int)= i+1
incr(10)
val fincr = (i:Int) => i+1
fincr(99)
( (i:Int)=>i+1 )(200)
def double(f:Int=>Int)(i:Int) = f(i) + f(i)
double(incr)(10)
def round(i:Int) = {
  if (i % 2 == 0) i else i + 1
}
round(6)
round(7)
