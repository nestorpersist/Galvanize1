"CASE CLASSES"

case class Person(name: String, age: Int = 25)

val p1 = Person("Jim", 34)
val p2 = Person("Sam")
p1.name
p1.age
val ps = List(p1, p2)
ps.map(p => Person(p.name, p.age + 1))

"ADTS"

sealed trait Animal {
  val name: String
}

case class Cat(name: String, lives: Int = 9) extends Animal

case class Fish(name: String, ocean: Boolean) extends Animal

case class Dog(name: String, breed: String) extends Animal

val c1 = Cat("Fluffy")
val c2 = Cat("Grizabella", 1)
val f1 = Fish("Tuna", true)
val f2 = Fish("Trout", false)
val d = Dog("Rover", "mutt")

val a = List(c1, c2, f1, f2, d)

val a1 = a.map {
  case Cat(name,lives) => Cat(name,lives-1)
  case x:Any => x
}

val a2 = a1.filter{
  _ match {
    case Cat(name,lives) => lives > 0
    case f:Fish => f.ocean
    case d:Dog => true
  }
}