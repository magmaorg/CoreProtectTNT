plugins {
    java
}

group = "com.ghostchu"
version = "2.3.1"

java {
    sourceCompatibility = JavaVersion.toVersion(21)
    targetCompatibility = JavaVersion.toVersion(21)

    disableAutoTargetJvm()
}

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
    maven("https://maven.playpro.com/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT")
    compileOnly("net.coreprotect:coreprotect:22.4")
}
