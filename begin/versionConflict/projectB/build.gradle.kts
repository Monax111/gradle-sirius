plugins{
    java
    `maven-publish`
}

group = "ru.demo.conflict"
version = 1

publishing{
    publications {
        create(project.name, MavenPublication::class.java){
            from(components["java"])
        }
    }
}

repositories {
    mavenLocal()
}

dependencies{
    implementation(group = "ru.demo.conflict", name = "projectA", version = "1")
}