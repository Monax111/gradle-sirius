plugins {
    kotlin("jvm") version "1.4.21"
}

repositories {
    mavenCentral()
}
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