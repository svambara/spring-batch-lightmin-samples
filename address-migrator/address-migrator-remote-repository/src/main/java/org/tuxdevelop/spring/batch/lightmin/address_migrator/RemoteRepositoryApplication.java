package org.tuxdevelop.spring.batch.lightmin.address_migrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tuxdevelop.spring.batch.lightmin.client.configuration.EnableSpringBatchLightminClient;

@SpringBootApplication
@EnableSpringBatchLightminClient
public class RemoteRepositoryApplication {

    public static void main(final String[] args) {
        SpringApplication.run(RemoteRepositoryApplication.class, args);
    }

}
