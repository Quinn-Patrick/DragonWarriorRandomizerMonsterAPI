package com.quinnsgames.dwrMonsterAPI.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quinnsgames.dwrMonsterAPI.domain.Monster;

public interface MonsterRepo extends JpaRepository<Monster, Long> {

}
