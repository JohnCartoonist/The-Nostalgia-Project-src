public class re extends acy {
  public re(int i) {
    super(i);
    this.bN = 16;
  }
  
  public dk c(dk itemstack, ry world, vi entityplayer) {
    if (!entityplayer.cc.d)
      itemstack.a--; 
    if (((Boolean)mod_noBiomesX.OldSounds.get()).booleanValue()) {
      world.a(entityplayer, "random.old_bow", 0.5F, 0.4F / (c.nextFloat() * 0.4F + 0.8F));
    } else {
      world.a(entityplayer, "random.bow", 0.5F, 0.4F / (c.nextFloat() * 0.4F + 0.8F));
    } 
    if (!world.I)
      world.a((ia)new aah(world, entityplayer)); 
    return itemstack;
  }
}
