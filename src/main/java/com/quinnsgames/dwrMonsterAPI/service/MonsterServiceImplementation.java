package com.quinnsgames.dwrMonsterAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quinnsgames.dwrMonsterAPI.domain.Monster;
import com.quinnsgames.dwrMonsterAPI.repo.MonsterRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class MonsterServiceImplementation implements MonsterService {
	@Autowired
	private MonsterRepo monsterRepo;

	@Override
	public Monster getMonster(long id) {
		log.info("Retrieving monster id {} from the database.", id);
		return monsterRepo.getReferenceById(id);
	}

	@Override
	public List<Monster> getMonsters() {
		log.info("Retrieving all monsters from the database.");
		return monsterRepo.findAll();
	}
	
	@Override
	public Monster saveMonster(Monster monster) {
		monsterRepo.save(monster);
		return monster;
	}

}
