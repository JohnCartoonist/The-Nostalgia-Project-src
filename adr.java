public class adr extends fx {
  public adr(ry world) {
    super(world);
    this.aA = "/mob/cow.png";
    a(0.9F, 1.3F);
  }
  
  public int f_() {
    return 10;
  }
  
  public void a(ik nbttagcompound) {
    super.a(nbttagcompound);
  }
  
  public void b(ik nbttagcompound) {
    super.b(nbttagcompound);
  }
  
  protected String e() {
    return "mob.cow";
  }
  
  protected String f() {
    return "mob.cowhurt";
  }
  
  protected String g() {
    return "mob.cowhurt";
  }
  
  protected float w_() {
    return 0.4F;
  }
  
  protected int k() {
    return acy.aE.bM;
  }
  
  protected void a(boolean flag, int i) {
    int j = this.Y.nextInt(3) + this.Y.nextInt(1 + i);
    for (int k = 0; k < j; k++)
      b(acy.aE.bM, 1); 
    if (!((Boolean)mod_noBiomesX.HungerSystem.get()).booleanValue())
      return; 
    j = this.Y.nextInt(3) + 1 + this.Y.nextInt(1 + i);
    for (int l = 0; l < j; l++) {
      if (V()) {
        b(acy.bi.bM, 1);
      } else {
        b(acy.bh.bM, 1);
      } 
    } 
  }
  
  public boolean c(vi entityplayer) {
    dk itemstack = entityplayer.by.a();
    if (itemstack != null && itemstack.c == acy.av.bM) {
      entityplayer.by.a(entityplayer.by.c, new dk(acy.aF));
      return true;
    } 
    return super.c(entityplayer);
  }
  
  protected fx a(fx entityanimal) {
    return new adr(this.o);
  }
}
