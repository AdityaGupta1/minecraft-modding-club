package org.forge.plugins.magicalness;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderEntityThing extends RenderLiving {

	public static ResourceLocation texture = new ResourceLocation(MainMod.modid
			+ ":" + "textures/mobs/thing.png");

	public RenderEntityThing(ModelThing var1, float shadow) {
		super(var1, shadow);
	}

	public void renderEntityMiner(EntityMiner var1, double var2, double var4,
			double var6, float var8, float var9) {
		super.doRender(var1, var2, var4, var6, var8, var9);
	}

	public void doRenderLiving(EntityMiner var1, double var2, double var4,
			double var6, float var8, float var9) {
		this.renderEntityMiner((EntityMiner) var1, var2, var4, var6, var8, var9);
	}

	public void doEntityMiner(Entity var1, double var2, double var4,
			double var6, float var8, float var9) {
		this.renderEntityMiner((EntityMiner) var1, var2, var4, var6, var8, var9);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}

}
