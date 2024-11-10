plugins {
    id("java-library")
}

//default created config:
/*group = "ru.zhuravlev"
version = "unspecified"

repositories {
    mavenCentral()
}*/

dependencies {
    implementation("ch.qos.logback:logback-classic")

    api ("com.google.guava:guava") // случай 1
    // implementation ("com.google.guava:guava") //случай 2
}
