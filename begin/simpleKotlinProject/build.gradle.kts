plugins {
    kotlin("jvm") version "1.5.0"
    id("org.barfuin.gradle.taskinfo") version "1.1.0"
}

tasks{
    test{
        useJUnitPlatform()
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(group = "org.jetbrains.kotlin", name = "kotlin-stdlib" )
    implementation(group = "io.github.microutils", name = "kotlin-logging-jvm" , version = "2.0.8")
}
