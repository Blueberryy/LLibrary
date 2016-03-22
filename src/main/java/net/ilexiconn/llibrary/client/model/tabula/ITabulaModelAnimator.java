package net.ilexiconn.llibrary.client.model.tabula;

import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author gegy1000
 * @since 1.0.0
 */
@SideOnly(Side.CLIENT)
@FunctionalInterface
public interface ITabulaModelAnimator<ENTITY extends Entity> {
    void setRotationAngles(TabulaModel model, ENTITY entity, float limbSwing, float limbSwingAmount, float ageInTicks, float rotationYaw, float rotationPitch, float scale);
}
