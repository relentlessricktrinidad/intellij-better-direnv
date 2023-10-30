fun properties(key: String) = project.findProperty(key).toString()

plugins {
    id("org.jetbrains.intellij")
}

// Configure Gradle IntelliJ Plugin - read more: https://github.com/JetBrains/gradle-intellij-plugin
intellij {
    version.set(properties("platformVersion"))
    type.set("IU")

    // Plugin Dependencies. Uses `platformPlugins` property from the gradle.properties file.
    plugins.set(listOf("com.jetbrains.php:232.8660.205"))
}

dependencies {
    implementation(project(":better_direnv-core"))
}
