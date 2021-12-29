public class l extends agu {
  public l(int i, int j) {
    super(i, j, false);
    h(1);
  }
  
  public dk a(dk itemstack, ry world, vi entityplayer) {
    super.a(itemstack, world, entityplayer);
    return new dk(acy.D);
  }
  
  public dk c(dk itemstack, ry world, vi entityplayer) {
    if (!((Boolean)mod_noBiomesX.HungerSystem.get()).booleanValue()) {
      itemstack.a--;
      entityplayer.a_(this.healthHealAmount);
      return new dk(acy.D);
    } 
    if (entityplayer.b(this.bT))
      entityplayer.c(itemstack, b(itemstack)); 
    return itemstack;
  }
}
