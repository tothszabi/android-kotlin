// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id (BuildPlugins.application) version PluginVersions.gradle apply false
    id (BuildPlugins.gradle) version PluginVersions.gradle apply false
    kotlin (BuildPlugins.kotlin) version PluginVersions.kotlin apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}