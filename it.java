public class it extends zo {
  public it(ry world) {
    super(world);
    this.aA = "/mob/skeleton.png";
  }
  
  public int f_() {
    return 20;
  }
  
  protected String e() {
    return "mob.skeleton";
  }
  
  protected String f() {
    return "mob.skeletonhurt";
  }
  
  protected String g() {
    return "mob.skeletonhurt";
  }
  
  public boolean a(pm damagesource, int i) {
    return super.a(damagesource, i);
  }
  
  public void a(pm damagesource) {
    super.a(damagesource);
    if (damagesource.g() instanceof ro && damagesource.a() instanceof vi) {
      vi entityplayer = (vi)damagesource.a();
      double d = entityplayer.s - this.s;
      double d1 = entityplayer.u - this.u;
      if (d * d + d1 * d1 >= 2500.0D)
        entityplayer.a((px)ut.v); 
    } 
  }
  
  public void c() {
    if (this.o.l() && !this.o.I) {
      float f = b(1.0F);
      if (f > 0.5F && this.o.l(me.c(this.s), me.c(this.t), me.c(this.u)) && this.Y.nextFloat() * 30.0F < (f - 0.4F) * 2.0F)
        e(8); 
    } 
    super.c();
  }
  
  protected void a(ia entity, float f) {
    if (f < 10.0F) {
      double d = entity.s - this.s;
      double d1 = entity.u - this.u;
      String fireSound = "random.bow";
      if (((Boolean)mod_noBiomesX.OldSounds.get()).booleanValue())
        fireSound = "random.old_bow"; 
      if (this.aT == 0)
        if (((Boolean)mod_noBiomesX.OldBows.get()).booleanValue()) {
          ro entityarrow = new ro(this.o, (nq)this, 1.0F);
          double d2 = entity.t - 0.20000000298023224D - entityarrow.t;
          float f1 = me.a(d * d + d1 * d1) * 0.2F;
          this.o.a((ia)this, fireSound, 1.0F, 1.0F / (this.Y.nextFloat() * 0.4F + 0.8F));
          this.o.a(entityarrow);
          entityarrow.a(d, d2 + f1, d1, 0.6F, 12.0F);
          this.aT = 30;
        } else {
          ro entityarrow = new ro(this.o, (nq)this, 1.0F);
          double d2 = entity.t + entity.E() - 0.699999988079071D - entityarrow.t;
          float f1 = me.a(d * d + d1 * d1) * 0.2F;
          this.o.a((ia)this, fireSound, 1.0F, 1.0F / (this.Y.nextFloat() * 0.4F + 0.8F));
          this.o.a(entityarrow);
          entityarrow.a(d, d2 + f1, d1, 1.6F, 12.0F);
          this.aT = 60;
        }  
      this.y = (float)(Math.atan2(d1, d) * 180.0D / 3.1415927410125732D) - 90.0F;
      this.i = true;
    } 
  }
  
  public void a(ik nbttagcompound) {
    super.a(nbttagcompound);
  }
  
  public void b(ik nbttagcompound) {
    super.b(nbttagcompound);
  }
  
  protected int k() {
    return acy.k.bM;
  }
  
  protected void a(boolean flag, int i) {
    int j = this.Y.nextInt(3 + i);
    for (int k = 0; k < j; k++)
      b(acy.k.bM, 1); 
    if (((Boolean)mod_noBiomesX.NoBetaMobActions.get()).booleanValue())
      return; 
    j = this.Y.nextInt(3 + i);
    for (int l = 0; l < j; l++)
      b(acy.aW.bM, 1); 
  }
  
  public dk s() {
    if (((Boolean)mod_noBiomesX.NoBetaMobActions.get()).booleanValue())
      return null; 
    return b;
  }
  
  public el r_() {
    return el.b;
  }
  
  private static final dk b = new dk(acy.j, 1);
}
