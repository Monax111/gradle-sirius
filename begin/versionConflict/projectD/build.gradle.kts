plugins {
    java
}


repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(group = "ru.demo.conflict", name = "projectB", version = "1")
    implementation(group = "ru.demo.conflict", name = "projectC", version = "2")

}