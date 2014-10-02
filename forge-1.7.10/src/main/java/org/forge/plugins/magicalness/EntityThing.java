package org.forge.plugins.magicalness;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityThing extends EntityAnimal {
	public EntityThing(World par1World) {
		super(par1World);
		this.setSize(1.0F, 2.0F);
		float var2 = 0.25F;
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 0.38F));
		this.tasks.addTask(4, new EntityAIWander(this, var2));
		this.tasks.addTask(5, new EntityAIWatchClosest(this,
				EntityPlayer.class, 6.0F));
		this.tasks.addTask(6, new EntityAILookIdle(this));
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
	}

	public boolean isAIEnabled() {
		return true;
	}

	protected String getLivingSound() {
		return "mob.cow.say";
	}

	protected String getHurtSound() {
		return "mob.cow.hurt";
	}

	protected String getDeathSound() {
		return "mob.cow.hurt";
	}

	public EntityAgeable createChild(EntityAgeable var1) {
		return null;
	}
}