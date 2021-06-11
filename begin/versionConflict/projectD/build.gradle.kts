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

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.1")

}