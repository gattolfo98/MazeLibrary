plugins {
    id("java")
}

group = "org.gattolfo.maze"
version = "1.0-SNAPSHOT"

tasks {
    jar {
        manifest {
            attributes["Main-Class"] = "org.gattolfo.maze.Main"
        }
    }
}


repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}