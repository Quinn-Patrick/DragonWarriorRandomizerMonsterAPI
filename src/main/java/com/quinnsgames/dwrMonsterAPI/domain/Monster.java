package com.quinnsgames.dwrMonsterAPI.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Monster {
	@Id
	private Long id;
	
	private String name;
	private int lowerHp;
	private int upperHp;
	private int strength;
	private int agility;
	private int xp;
	private int gold;
	private double hurtResistance;
	private double sleepResistance;
	private double evasion;
	private int runGroup;
	private int fiftyPercentRunAgility;
	private int seventyFivePercentRunAgility;
	private int sleepInsteadOfRunAgility;
	private int twentyFivePercentAmbushAgility;
	private double stopspellCap;
	private int brokenCap;
}
