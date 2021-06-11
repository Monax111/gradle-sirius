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

    constraints {
        implementation("ru.demo.conflict:projectA"){
            version {
                strictly("2")
            }
        }
    }
}