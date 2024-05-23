pluginManagement {
    repositories {
        maven {
            setUrl("https://artifactory.ida.avast.com/artifactory/maven-local")
            name = "avast"
        }
        maven(url = "https://artifactory.ida.avast.com/artifactory/repo1.maven.org-maven2")
        maven(url = "https://artifactory.ida.avast.com/artifactory/maven.google.com")
        maven(url = "https://artifactory.ida.avast.com/artifactory/plugins.gradle.org-m2")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            setUrl("https://artifactory.ida.avast.com/artifactory/maven-local")
            name = "avast"
        }
        maven(url = "https://artifactory.ida.avast.com/artifactory/repo1.maven.org-maven2")
        maven(url = "https://artifactory.ida.avast.com/artifactory/maven.google.com")
        maven(url = "https://artifactory.ida.avast.com/artifactory/plugins.gradle.org-m2")
    }
}

rootProject.name = "plain"
include(":app")
