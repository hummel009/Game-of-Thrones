pluginManagement {
	repositories {
		maven("https://nexus.gtnewhorizons.com/repository/public")
		mavenLocal()
		mavenCentral()
		gradlePluginPortal()
	}
}

plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.+"
}
