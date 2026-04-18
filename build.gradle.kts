plugins {
    id 'java'
}

group = 'COM.YIT' //package name
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'junit:junit:4.12'
    testImplementation 'org.junit.jupiter:junit-jupiter:5.10.3'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.10.3'
    
    // Required by Gradle 9+ to launch JUnit 5 tests
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
}

task run(type: JavaExec) {
    main = 'COM.YIT.App' //package name with class name
    classpath = sourceSets.main.runtimeClasspath
}
test {
    useJUnitPlatform()
}