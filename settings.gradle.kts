pluginManagement {
	repositories {
		mavenLocal()
		mavenCentral()
		gradlePluginPortal()
		maven {
			name = "GTNH Maven"
			url = uri("https://nexus.gtnewhorizons.com/repository/public/")
			isAllowInsecureProtocol = true
			mavenContent {
				includeGroup("com.gtnewhorizons")
				includeGroup("com.gtnewhorizons.retrofuturagradle")
			}
		}
	}
}

dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
	repositories {
		mavenLocal()
		mavenCentral()
		gradlePluginPortal()
		maven {
			name = "GTNH Maven"
			url = uri("https://nexus.gtnewhorizons.com/repository/public/")
			isAllowInsecureProtocol = true
			mavenContent {
				includeGroup("com.gtnewhorizons")
				includeGroup("com.gtnewhorizons.retrofuturagradle")
			}
		}
	}
}

plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}
