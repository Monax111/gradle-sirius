plugins{
    java
    `maven-publish`
}

group = "ru.demo.conflict"
version = 3

publishing{
    publications {
        create(project.name, MavenPublication::class.java){
            from(components["java"])
        }
    }
}