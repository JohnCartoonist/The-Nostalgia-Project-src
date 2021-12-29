public class ItemToolCustom extends ads {
  private int customDamageVsEntity;
  
  private float customEfficiencyOnProperMaterial;
  
  protected int customMaxDamage;
  
  protected yy[] customBlocksEffectiveAgainst;
  
  protected ItemToolCustom(int i, int j, nu enumtoolmaterial, yy[] ablock, EnumCustomToolMaterial realMaterial, yy[] customBlockList) {
    super(i, j, enumtoolmaterial, ablock);
    this.b = enumtoolmaterial;
    this.bN = 1;
    i(enumtoolmaterial.a());
    this.customMaxDamage = realMaterial.getClassicMaxUses();
    this.customEfficiencyOnProperMaterial = realMaterial.getEfficiencyOnProperMaterial();
    this.customDamageVsEntity = j + realMaterial.getDamageVsEntity();
    this.customBlocksEffectiveAgainst = customBlockList;
  }
  
  public float a(dk itemstack, yy block) {
    if (!((Boolean)mod_noBiomesX.OldToolDurabilities.get()).booleanValue())
      return super.a(itemstack, block); 
    for (int i = 0; i < this.customBlocksEffectiveAgainst.length; i++) {
      if (this.customBlocksEffectiveAgainst[i] == block)
        return this.customEfficiencyOnProperMaterial; 
    } 
    return 1.0F;
  }
  
  public int a(ia entity) {
    if (!((Boolean)mod_noBiomesX.OldToolDurabilities.get()).booleanValue())
      return super.a(entity); 
    return this.customDamageVsEntity;
  }
  
  public int g() {
    if (!((Boolean)mod_noBiomesX.OldToolDurabilities.get()).booleanValue())
      return super.g(); 
    return this.customMaxDamage;
  }
}
