open class Foo(
    val bar: Int
)

val a = Foo(123)
val b = Foo(321)

if (a == b) {
    println("a == b")
} else {
    println("a != b")
}