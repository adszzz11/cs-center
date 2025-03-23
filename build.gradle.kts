plugins {
    java
    kotlin("jvm") version "1.9.25"
    kotlin("plugin.spring") version "1.9.25"
    id("org.springframework.boot") version "3.4.3"
    id("io.spring.dependency-management") version "1.1.7"
    kotlin("plugin.jpa") version "1.9.25"
}

allprojects {
    plugins
    group = "com.leetangle.side-project"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
    apply(plugin = "kotlin")
    apply(plugin = "kotlin-spring")
//    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "org.springframework.boot")
    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(17)
        }
    }

    kotlin {
        compilerOptions {
            freeCompilerArgs.addAll("-Xjsr305=strict")
        }
    }
    val kotestVersion = "5.9.0"
    dependencies {
        // kotlin default
        implementation("org.jetbrains.kotlin:kotlin-reflect")

//        testRuntimeOnly("com.h2database:h2")

        /**
         * Kotest default
         */
        testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
        testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
        testImplementation("io.kotest:kotest-property:$kotestVersion")
        testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
        testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
        testImplementation("io.kotest:kotest-property:$kotestVersion")

        /**
         * Test Default
         */
        testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
        testRuntimeOnly("org.junit.platform:junit-platform-launcher")

        /**
         * Kotlin Logging Default
         */
        implementation("io.github.microutils:kotlin-logging-jvm:2.0.11")
    }
    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
//
// subprojects {
// }
