pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "TestDependabotVulnerabilities"
include(":app")
include(":firstModule")
include(":secondModule")
include(":shared-release")
include(":aarmodule-lillyanalytics")
include(":aarmodule-lillycloud")
include(":aarmodule-autoinjector")
