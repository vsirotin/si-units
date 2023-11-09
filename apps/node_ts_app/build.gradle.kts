
group = "eu.sirotin.kotunil.app.ts-node"
version = "0.0.1"


plugins {
    id("com.github.node-gradle.node") version "7.0.1"
}

tasks.register<com.github.gradle.node.task.NodeTask>("statJS"){
    script.set(file("src/scripts/my.js"))

    dependsOn("installKotUniL")
}

tasks.register<com.github.gradle.node.npm.task.NpmTask>("installAllProduction"){
    args.addAll("install", "--omit=dev")
}

tasks.register<com.github.gradle.node.npm.task.NpmTask>("installAllDevelopment"){
    args.addAll("install", "-D",)
}

tasks.register<com.github.gradle.node.npm.task.NpmTask>("installTypeScript"){
    args.addAll("install", "typescript", "--save-dev")
}


