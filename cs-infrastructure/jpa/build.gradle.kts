group = "com.leetangle.side-project.common"
version = "0.0.1-SNAPSHOT"

apply(plugin = "kotlin-spring")
apply(plugin = "io.spring.dependency-management")
apply(plugin = "org.springframework.boot")
apply(plugin = "kotlin-jpa")
dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
}

allOpen {
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.persistence.MappedSuperclass")
    annotation("jakarta.persistence.Embeddable")
}
