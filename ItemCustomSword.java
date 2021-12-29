public class ItemCustomSword extends acy {
  private int weaponDamage;
  
  protected int customMaxDamage;
  
  private int classicWeaponDamage;
  
  private final nu field_40439_b;
  
  public ItemCustomSword(int i, nu enumtoolmaterial, EnumCustomToolMaterial realMaterial) {
    super(i);
    this.field_40439_b = enumtoolmaterial;
    this.bN = 1;
    i(enumtoolmaterial.a());
    this.customMaxDamage = realMaterial.getClassicMaxUses();
    this.weaponDamage = 4 + enumtoolmaterial.c();
    this.classicWeaponDamage = 4 + realMaterial.getDamageVsEntity() * 2;
  }
  
  public float a(dk itemstack, yy block) {
    return (block.bM != yy.W.bM) ? 1.5F : 15.0F;
  }
  
  public boolean a(dk itemstack, nq entityliving, nq entityliving1) {
    itemstack.a(1, entityliving1);
    return true;
  }
  
  public boolean a(dk itemstack, int i, int j, int k, int l, nq entityliving) {
    itemstack.a(2, entityliving);
    return true;
  }
  
  public int a(ia entity) {
    if (((Boolean)mod_noBiomesX.OldDamage.get()).booleanValue())
      return this.classicWeaponDamage; 
    return this.weaponDamage;
  }
  
  public int g() {
    if (((Boolean)mod_noBiomesX.OldToolDurabilities.get()).booleanValue())
      return this.customMaxDamage; 
    return super.g();
  }
  
  public boolean a() {
    return true;
  }
  
  public ps c(dk itemstack) {
    return ps.d;
  }
  
  public int b(dk itemstack) {
    return 72000;
  }
  
  public dk c(dk itemstack, ry world, vi entityplayer) {
    entityplayer.c(itemstack, b(itemstack));
    return itemstack;
  }
  
  public boolean a(yy block) {
    return (block.bM == yy.W.bM);
  }
  
  public int c() {
    return this.field_40439_b.e();
  }
}
