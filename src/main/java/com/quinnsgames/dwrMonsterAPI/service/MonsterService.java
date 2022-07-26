package com.quinnsgames.dwrMonsterAPI.service;

import java.util.List;

import com.quinnsgames.dwrMonsterAPI.domain.Monster;

public interface MonsterService {
	Monster getMonster(long id);
	List<Monster> getMonsters();
	Monster saveMonster(Monster monster);
}
