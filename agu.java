public class agu extends acy {
  public final int a = 32;
  
  private final int b;
  
  private final float bR;
  
  private final boolean bS;
  
  protected boolean bT;
  
  private int bU;
  
  private int bV;
  
  private int bW;
  
  private float bX;
  
  protected int healthHealAmount;
  
  public agu(int i, int j, float f, boolean flag) {
    super(i);
    this.b = j;
    this.bS = flag;
    this.bR = f;
    this.healthHealAmount = j;
  }
  
  public int e() {
    if (!((Boolean)mod_noBiomesX.HungerSystem.get()).booleanValue())
      return 1; 
    return this.bN;
  }
  
  public agu(int i, int j, float f, boolean flag, int heal) {
    this(i, j, f, flag);
    this.healthHealAmount = heal;
  }
  
  public agu(int i, int j, boolean flag) {
    this(i, j, 0.6F, flag);
  }
  
  public dk a(dk itemstack, ry world, vi entityplayer) {
    itemstack.a--;
    entityplayer.aO().a(this);
    world.a(entityplayer, "random.burp", 0.5F, world.w.nextFloat() * 0.1F + 0.9F);
    if (!world.I && this.bU > 0 && world.w.nextFloat() < this.bX)
      entityplayer.a(new s(this.bU, this.bV * 20, this.bW)); 
    return itemstack;
  }
  
  public int b(dk itemstack) {
    return 32;
  }
  
  public ps c(dk itemstack) {
    return ps.b;
  }
  
  public dk c(dk itemstack, ry world, vi entityplayer) {
    if (!((Boolean)mod_noBiomesX.HungerSystem.get()).booleanValue()) {
      itemstack.a--;
      entityplayer.a_(this.healthHealAmount);
      return itemstack;
    } 
    if (entityplayer.b(this.bT))
      entityplayer.c(itemstack, b(itemstack)); 
    return itemstack;
  }
  
  public int o() {
    return this.b;
  }
  
  public float p() {
    return this.bR;
  }
  
  public boolean q() {
    return this.bS;
  }
  
  public agu a(int i, int j, int k, float f) {
    this.bU = i;
    this.bV = j;
    this.bW = k;
    this.bX = f;
    return this;
  }
  
  public agu r() {
    this.bT = true;
    return this;
  }
  
  public acy a(String s) {
    return super.a(s);
  }
}
