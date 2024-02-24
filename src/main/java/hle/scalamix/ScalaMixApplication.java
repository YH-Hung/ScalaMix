package hle.scalamix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// https://youtrack.jetbrains.com/issue/SCL-19340/Highlighting-disabled-for-Java-files-in-Java-Scala-3-mixed-project
// Should disable scala.compiler.highlighting.suppress.java.highlighting

@SpringBootApplication
public class ScalaMixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScalaMixApplication.class, args);
    }

}
