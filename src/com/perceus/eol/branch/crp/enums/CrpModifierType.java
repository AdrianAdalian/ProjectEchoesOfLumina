package com.perceus.eol.branch.crp.enums;

public enum CrpModifierType
{
	BASE_ATTACK,
	ATTACK_RATE,
	PERCENT_CRITICAL,
	CRITICAL_MODIFIER,

	SET_BASE_ATTACK,
	SET_ATTACK_RATE,
	SET_PERCENT_CRITICAL,
	SET_CRITICAL_MODIFIER,
	
	ADD_BY_PERCENT,
	ADD_BY_INTEGER,
	
	REDUCE_BY_PERCENT,
	REDUCE_BY_INTEGER,
	
	OFF_HAND,
	
	SPELL_DAMAGE,
	SPELL_REFRESH,
	
	//minecraft effects
	BLIND_EFFECT,
	EXPOSE_EFFECT,
	GLOW_EFFECT,
	FATIGUE_EFFECT,
	SLOW_EFFECT,
	REGENERATION_EFFECT,
	WITHER_EFFECT,
	STUN_EFFECT,
	POISON_EFFECT,
	
	//custom effects
	BURN_EFFECT,
	MELT_EFFECT,
	FROST_EFFECT,
	BLEED_EFFECT,
	PLAGUE_EFFECT,
	
	RESTORE_ITEM_DURABILITY,
	RESTORE_HEALTH,
	INTERACT_BOOST,
	SPEED_BOOST,

	DAMAGE_REDUCTION,
	DAMAGE_REFLECT,
	DAMAGE_NEGATE,
	
	SET_MAX_HP_TO_SELF,
	SET_MAX_HP_TO_TARGET,
	REDUCE_ARMOR,
	STEAL_ARMOR,
	STEAL_HEALTH,
	STRIP_HEALTH,
	STRIP_ARMOR,
	
	ARROW_EFFICIENCY,
	
	REDUCE_ELEMENTAL_RESISTANCE,
	NULLIFY_ELEMENTAL_RESISTANCE,
	
	KNOCKBACK_BOOST
	;
	
}
