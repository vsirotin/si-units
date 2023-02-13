group = "eu.sirotin.kotunil"
version = "3.0.0"

buildscript {
    dependencies {
            classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
            classpath("com.vanniktech:gradle-maven-publish-plugin:0.18.0")
    }

    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}


allprojects {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}