package com.pongelupe.albunsSpotify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "com.pongelupe.albunsSpotify.controller" })
@EntityScan(basePackages = { "com.pongelupe.albunsSpotify.model" })
@EnableJpaRepositories(basePackages = { "com.pongelupe.albunsSpotify.repository" })
@SpringBootApplication
public class AlbunsSpotifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbunsSpotifyApplication.class, args);
	}
}
