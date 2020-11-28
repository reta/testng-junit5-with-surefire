Running TestNG and JUnit 5 test cases side by side
==============

One of the ways to run Testng and JUnit 5 test suites side-by-side is to use Surefire Testng integration along with Surefire JUnit Platform integration, for example:

    <dependencies>
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.3.0</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.7.0</version>
            <scope>test</scope>
        </dependency>

        ...
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
                <dependencies>
                    <dependency>                                      
                        <groupId>org.apache.maven.surefire</groupId>  
                        <artifactId>surefire-junit-platform</artifactId>      
                        <version>3.0.0-M5</version>                   
                    </dependency>   
                    <dependency>                                      
                        <groupId>org.apache.maven.surefire</groupId>  
                        <artifactId>surefire-testng</artifactId>      
                        <version>3.0.0-M5</version>                   
                    </dependency>                                    
                </dependencies>
            </plugin>
            ...
        </plugins>
    </build>