



package net.ggcontent.mod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelObsidianTable extends ModelBase
{
  //fields
    ModelRenderer TableTop;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
  
  public ModelObsidianTable()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      TableTop = new ModelRenderer(this, 0, 0);
      TableTop.addBox(0F, 0F, 0F, 16, 4, 16);
      TableTop.setRotationPoint(-8F, 12F, -8F);
      TableTop.setTextureSize(64, 32);
      TableTop.mirror = true;
      setRotation(TableTop, 0F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 0, 20);
      Leg1.addBox(0F, 0F, 0F, 4, 8, 4);
      Leg1.setRotationPoint(-8F, 16F, -8F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 16, 20);
      Leg2.addBox(0F, 0F, 0F, 4, 8, 4);
      Leg2.setRotationPoint(-8F, 16F, 4F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 32, 20);
      Leg3.addBox(0F, 0F, 0F, 4, 8, 4);
      Leg3.setRotationPoint(4F, 16F, 4F);
      Leg3.setTextureSize(64, 32);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 48, 20);
      Leg4.addBox(0F, 0F, 0F, 4, 8, 4);
      Leg4.setRotationPoint(4F, 16F, -8F);
      Leg4.setTextureSize(64, 32);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    TableTop.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
  }
  
  public void renderModel(float f) {
	  TableTop.render(f);
	  Leg1.render(f);
	  Leg2.render(f);
	  Leg3.render(f);
	  Leg4.render(f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
