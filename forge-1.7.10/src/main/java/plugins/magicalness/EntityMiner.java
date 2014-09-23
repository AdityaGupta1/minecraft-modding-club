package plugins.magicalness;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityMiner extends EntityMob {
	
	public EntityMiner(World par1World) {
	super(par1World);
	
	this.setSize(1.5F, 2.0F);
	this.tasks.addTask(1, new EntityAISwimming(this));
	this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
	this.tasks.addTask(5, new EntityAIWander(this, 0.8D));
	this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	this.tasks.addTask(6, new EntityAILookIdle(this));
	this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
	this.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_pickaxe, 1));
	}
	
	@Override
	protected String getLivingSound()
	{
	return "mob.zombie.say";
	}

	@Override
	protected String getHurtSound()
	{
	return "mob.zombie.hurt";
	}

	@Override
	protected String getDeathSound()
	{
	return "mob.zombie.death";
	}

	@Override
	protected boolean isAIEnabled() {
	return true;
	}
	
	@Override
	protected void applyEntityAttributes()
	{
	super.applyEntityAttributes();
	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0D);
	this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4317D);
	this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
	this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100.0D);
	}
	
	@Override
	protected Item getDropItem()
	{
	return Items.coal;
	}
	
	@Override
	protected boolean isValidLightLevel()
	{
	return true;
	}
}
