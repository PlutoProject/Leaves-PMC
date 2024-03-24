pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "Leaves-PMC"

include("leaves-pmc-api", "leaves-pmc-server", "paper-api-generator")