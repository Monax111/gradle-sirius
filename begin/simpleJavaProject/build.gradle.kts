plugins {
    java
    id("org.barfuin.gradle.taskinfo") version "1.1.0"
}


tasks {
    test {
        useJUnitPlatform()
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of("11"))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(group = "com.google.guava", name = "guava", version = "30.1.1-jre") {
        isTransitive = false
    }

    val slf4jVersion = "1.7.30"
    implementation(group = "org.slf4j", name = "slf4j-api", version = slf4jVersion)
    implementation(group = "org.slf4j", name = "slf4j-simple", version = slf4jVersion)
    testImplementation(group = "ch.qos.logback", name = "logback-classic", version = "1.2.3")
}