public class gr extends zo {
  public gr(ry world) {
    super(world);
    this.aA = "/mob/zombie.png";
    this.bw = 0.5F;
    this.a = 4;
  }
  
  public int f_() {
    return 20;
  }
  
  protected int o_() {
    if (((Boolean)mod_noBiomesX.NoBetaMobActions.get()).booleanValue())
      return 0; 
    return 2;
  }
  
  public void c() {
    if (this.o.l() && !this.o.I) {
      float f = b(1.0F);
      if (f > 0.5F && this.o.l(me.c(this.s), me.c(this.t), me.c(this.u)) && this.Y.nextFloat() * 30.0F < (f - 0.4F) * 2.0F)
        e(8); 
    } 
    super.c();
  }
  
  protected String e() {
    return "mob.zombie";
  }
  
  protected String f() {
    return "mob.zombiehurt";
  }
  
  protected String g() {
    return "mob.zombiedeath";
  }
  
  protected int k() {
    if (((Boolean)mod_noBiomesX.HungerSystem.get()).booleanValue())
      return acy.bl.bM; 
    return acy.K.bM;
  }
  
  public el r_() {
    return el.b;
  }
}
