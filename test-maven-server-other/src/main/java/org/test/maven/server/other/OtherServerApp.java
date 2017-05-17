package org.test.maven.server.other;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:other-provider.xml") // 很重要
public class OtherServerApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(OtherServerApp.class, args);
    }
}

