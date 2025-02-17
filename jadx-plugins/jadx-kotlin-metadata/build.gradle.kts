plugins {
	id("jadx-library")
	id("jadx-kotlin")
}

dependencies {
	api(project(":jadx-core"))

	implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.8.0")

	testImplementation(project(":jadx-core").dependencyProject.sourceSets.test.get().output)
	testImplementation("org.apache.commons:commons-lang3:3.14.0")

	testRuntimeOnly(project(":jadx-plugins:jadx-smali-input"))
}
