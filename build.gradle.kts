import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.21"
    id("org.jetbrains.compose") version "0.3.0-build135"
}

group = "group.tuuzed"
version = "0.0.1"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    jcenter()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    testImplementation(kotlin("test-junit"))
    implementation(compose.desktop.currentOs)
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "14"
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "ComposeDesktop"
            version = "0.0.1"
            vendor = "ComposeDesktop"
        }
    }
}
