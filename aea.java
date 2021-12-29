public class aea extends aed {
  public aea(ry world) {
    super(world);
    this.aA = "/mob/lava.png";
    this.af = true;
    this.aI = 0.2F;
  }
  
  public boolean i() {
    if (((Boolean)mod_noBiomesX.NoBetaMobs.get()).booleanValue())
      return false; 
    return (this.o.v > 0 && this.o.a(this.C) && this.o.a(this, this.C).size() == 0 && !this.o.b(this.C));
  }
  
  protected int o_() {
    return aF() * 3;
  }
  
  public int a(float f) {
    return 15728880;
  }
  
  public float b(float f) {
    return 1.0F;
  }
  
  protected String ax() {
    return "flame";
  }
  
  protected aed ay() {
    return new aea(this.o);
  }
  
  protected int k() {
    return 0;
  }
  
  public boolean V() {
    return false;
  }
  
  protected int az() {
    return super.az() * 4;
  }
  
  protected void aA() {
    this.a *= 0.9F;
  }
  
  protected void ak() {
    this.w = (0.42F + aF() * 0.1F);
    this.ap = true;
  }
  
  protected void c(float f) {}
  
  protected boolean aB() {
    return true;
  }
  
  protected int aC() {
    return super.aC() + 2;
  }
  
  protected String f() {
    return "mob.slime";
  }
  
  protected String g() {
    return "mob.slime";
  }
  
  protected String aD() {
    if (aF() > 1)
      return "mob.magmacube.big"; 
    return "mob.magmacube.small";
  }
  
  public boolean F() {
    return false;
  }
  
  protected boolean aE() {
    return true;
  }
}
