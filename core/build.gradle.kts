group = "com.leetangle.side-project.domain"
version = "0.0.1-SNAPSHOT"

apply(plugin = "kotlin-spring")
apply(plugin = "io.spring.dependency-management")
apply(plugin = "org.springframework.boot")

dependencies {

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml")
    testImplementation("io.kotest.extensions:kotest-extensions-spring:1.1.3")
//    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(project(":article"))

    testImplementation("io.kotest.extensions:kotest-extensions-spring:1.1.3")
    testImplementation("io.projectreactor:reactor-test")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
//        testImplementation("org.springframework.security:spring-security-test")
}
