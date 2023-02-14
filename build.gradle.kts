group = "eu.sirotin.kotunil"

plugins {
    kotlin("multiplatform") version "1.8.10" apply false
    id("com.vanniktech.maven.publish") version "0.24.0"
}


allprojects {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}