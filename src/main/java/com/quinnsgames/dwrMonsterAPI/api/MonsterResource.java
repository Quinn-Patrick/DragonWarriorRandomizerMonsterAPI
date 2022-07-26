package com.quinnsgames.dwrMonsterAPI.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quinnsgames.dwrMonsterAPI.domain.Monster;
import com.quinnsgames.dwrMonsterAPI.service.MonsterService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController 
@RequestMapping("/api") 
@RequiredArgsConstructor
@Slf4j
public class MonsterResource {
	private final MonsterService monsterService;
	
	@GetMapping(path="/monsters")
	public ResponseEntity<List<Monster>> getMonsters(){
		log.info("Responded with all monsters.");
		return ResponseEntity.ok().body(monsterService.getMonsters());
	}
	
	@GetMapping(path="/monster/{id}")
	public ResponseEntity<Monster> getMonster(@PathVariable Long id){
		Monster output = monsterService.getMonster(id);
		
		if(output == null){
			log.error("Monster with id {} not found.", id);
			return ResponseEntity.notFound().build();
		}else {
			log.info("Responded with monster with id {} and name {}.", id, output.getName());
			return ResponseEntity.ok().body(output);
		}
	}

}
