group = "eu.sirotin.kotunil"
version = "3.0.0"

allprojects {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

plugins {
    kotlin("multiplatform") version "1.8.10" apply false
    id("com.vanniktech.maven.publish") version "0.24.0" apply false
}
