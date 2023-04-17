plugins {
    id("java");
    id ("org.sonarqube") version "3.5.0.2730"
}

group = "org.example"
version = "1.0-SNAPSHOT"

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

sonarqube {
    properties {
        property ("sonar.projectKey");
        property("Mario-vitolo_CD_3");
        property ("sonar.organization")
        property("mario-vitolo");
        property( "sonar.host.url")
        property("https://sonarcloud.io");
    }
}