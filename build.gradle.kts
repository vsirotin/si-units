val kotunilVersion = "4.2.2"

val kotunilJvmStableVersion = kotunilVersion
val kotunilJsStableVersion = "4.2.1"
allprojects {
    group = "eu.sirotin.kotunil"

    repositories {
        mavenCentral()
    }
    extra.apply {
        set("kotunil-version", kotunilVersion)
        set("kotunil-jvm-stable-version", kotunilJvmStableVersion)
        set("kotunil-js-stable-version", kotunilJsStableVersion)
    }

}


plugins {
    //Below: 1) Not clear, how replace version with variable
    //2) This is needed to configure subprojects
    kotlin("multiplatform") version "2.0.0" apply false
}





