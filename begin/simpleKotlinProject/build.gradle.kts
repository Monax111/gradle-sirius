plugins {
    kotlin("jvm") version "1.5.0"
    id("org.barfuin.gradle.taskinfo") version "1.1.0"
}

tasks{
    test{
        useJUnitPlatform()
    }
}

java{
    withSourcesJar()
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(group = "org.jetbrains.kotlin", name = "kotlin-stdlib" )
    implementation(group = "io.github.microutils", name = "kotlin-logging-jvm" , version = "2.0.8")
}



tasks{
    val demoGroup = "demo"
    val a = register("a"){
        group = demoGroup
    }
    val b by registering{
        group = demoGroup
        dependsOn(a)
    }
    register("c", DefaultTask::class.java){
        group = demoGroup
        dependsOn(a, b)
    }
}