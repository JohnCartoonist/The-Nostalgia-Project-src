public class il extends acy {
  public il(int i) {
    super(i);
    this.bN = 1;
    i(384);
  }
  
  public void a(dk itemstack, ry world, vi entityplayer, int i) {
    if (entityplayer.cc.d || entityplayer.by.c(acy.k.bM)) {
      int j = b(itemstack) - i;
      float f = j / 20.0F;
      f = (f * f + f * 2.0F) / 3.0F;
      if (f < 0.1D)
        return; 
      if (f > 1.0F)
        f = 1.0F; 
      ro entityarrow = new ro(world, entityplayer, f * 2.0F);
      if (f == 1.0F)
        entityarrow.d = true; 
      if (!((Boolean)mod_noBiomesX.NoBowDurability.get()).booleanValue())
        itemstack.a(1, entityplayer); 
      if (((Boolean)mod_noBiomesX.OldSounds.get()).booleanValue()) {
        world.a(entityplayer, "random.old_bow", 1.0F, 1.0F / (c.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
      } else {
        world.a(entityplayer, "random.bow", 1.0F, 1.0F / (c.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
      } 
      entityplayer.by.b(acy.k.bM);
      if (!world.I)
        world.a(entityarrow); 
    } 
  }
  
  public dk a(dk itemstack, ry world, vi entityplayer) {
    return itemstack;
  }
  
  public int b(dk itemstack) {
    return 72000;
  }
  
  public ps c(dk itemstack) {
    return ps.e;
  }
  
  public dk c(dk itemstack, ry world, vi entityplayer) {
    if (((Boolean)mod_noBiomesX.OldBows.get()).booleanValue()) {
      if (entityplayer.cc.d || entityplayer.by.b(acy.k.bM)) {
        if (((Boolean)mod_noBiomesX.OldSounds.get()).booleanValue()) {
          world.a(entityplayer, "random.old_bow", 1.0F, 1.0F / (c.nextFloat() * 0.4F + 0.8F));
        } else {
          world.a(entityplayer, "random.bow", 1.0F, 1.0F / (c.nextFloat() * 0.4F + 0.8F));
        } 
        if (!world.I)
          world.a(new ro(world, entityplayer, 1.0F)); 
      } 
      return itemstack;
    } 
    if (entityplayer.cc.d || entityplayer.by.c(acy.k.bM))
      entityplayer.c(itemstack, b(itemstack)); 
    return itemstack;
  }
}
