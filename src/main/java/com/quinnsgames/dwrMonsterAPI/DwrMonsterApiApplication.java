package com.quinnsgames.dwrMonsterAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.quinnsgames.dwrMonsterAPI.domain.Monster;
import com.quinnsgames.dwrMonsterAPI.service.MonsterService;

@SpringBootApplication
public class DwrMonsterApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DwrMonsterApiApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(MonsterService monsterService) {
		return args ->{
			monsterService.saveMonster(new Monster((long) 1, "Slime", 2, 2, 5, 3, 1, 2, 0, 0, 0.015625, 10, 1, 0, 1, 0, 0, 0, 4, 4, 5, 9, 9, 9, 0, 0, 2.0, 1, 1));
		};
	}

}
