"LISTS"
val a = List(1, 2, 3)
val b = 1 :: 2 :: 3 :: Nil
val c = (1 to 3)
a == c
a.head
a.tail
a.reverse
a(2)
for (i <- a) yield i * 2
a.map((i: Int) => i * 2)
a.map(i => i * 2)
a.map(_ * 2)
a.sum
a.fold(0)((i, j) => i + j)
a.max
a.fold(0)((i, j) => if (i > j) i else j)
a.filter(_ % 2 == 1)
a.groupBy(_ % 2)
List(5, 4, 3).sorted
val d = List("one", "two", "three")
d.sorted
a zip d
d.zipWithIndex

"MAPS"
val m = Map(1 -> "one", 2 -> "two", 3 -> "three")
m.keys
m.values.toSet
m(2)
m.filter(_._2.startsWith("t"))
m.map(kv => (kv._2, kv._1))
m.groupBy(_._2.size)
for ((k, v) <- m) yield v +":" + k
for ((k, v) <- m) yield s"$v:$k"
a zip d
(a zip d).toMap
