pluginManagement {
    val architecturyPluginVersion: String by settings
    val loomPluginVersion: String by settings
    val unifiedPublishingVersion: String by settings
    val kotlinJvmVersion: String by settings

    plugins {
        java
        id("architectury-plugin") version architecturyPluginVersion
        id("dev.architectury.loom") version loomPluginVersion apply false
        id("me.shedaniel.unified-publishing") version unifiedPublishingVersion apply false
        kotlin("jvm") version kotlinJvmVersion apply false
    }

    repositories {
        mavenCentral()
        maven("https://maven.fabricmc.net")
        maven("https://maven.architectury.dev")
        maven("https://files.minecraftforge.net/maven")
        gradlePluginPortal()
    }
}

include("common")
include("fabric")

rootProject.name = "ContingameIMESuper"
