plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.6.1")

    testImplementation("org.springframework.boot:spring-boot-starter-test:2.6.1")


    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    // https://mvnrepository.com/artifact/org.junit.platform/junit-platform-launcher
    testImplementation("org.junit.platform:junit-platform-launcher:1.8.2")

    // https://mvnrepository.com/artifact/org.mockito/mockito-junit-jupiter
    testImplementation("org.mockito:mockito-junit-jupiter:4.1.0")


}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}