plugins {
    `kotlin-dsl`
    `maven-publish`
}

group = "com.erawhctim.gradle"
version = "1.0"

gradlePlugin {
    plugins {
        register("sample-plugin") {
            id = "sample-plugin"
            implementationClass = "com.erawhctim.gradle.plugin.SimpleAndroidPlugin"
        }
    }
}

publishing {
    repositories {
        maven(url = "build/repository")
    }
}

repositories {
    jcenter()
}