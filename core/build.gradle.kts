group = "com.leetangle.side-project.domain"
version = "0.0.1-SNAPSHOT"

dependencies {
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    implementation("org.springframework.boot:spring-boot-starter-jdbc")
//    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-web")
//    implementation("org.jetbrains.exposed:exposed-core:0.41.1")
//    implementation("org.jetbrains.exposed:exposed-dao:0.41.1")
//    implementation("org.jetbrains.exposed:exposed-jdbc:0.41.1")
    implementation(project(":article"))
}
