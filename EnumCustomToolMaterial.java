public enum EnumCustomToolMaterial {
  WOOD("WOOD", 0, 0, 59, 2.0F, 0, 15, 32),
  STONE("STONE", 1, 1, 131, 4.0F, 1, 5, 64),
  IRON("IRON", 2, 2, 250, 6.0F, 2, 14, 128),
  EMERALD("EMERALD", 3, 3, 1561, 8.0F, 3, 10, 1024),
  GOLD("GOLD", 4, 0, 32, 2.0F, 0, 22, 32);
  
  private final int harvestLevel;
  
  private final int maxUses;
  
  private final int classicMaxUses;
  
  private final float efficiencyOnProperMaterial;
  
  private final int damageVsEntity;
  
  private final int enchantability;
  
  EnumCustomToolMaterial(String s, int i, int j, int k, float f, int l, int i1, int j1) {
    this.harvestLevel = j;
    this.maxUses = k;
    this.efficiencyOnProperMaterial = f;
    this.damageVsEntity = l;
    this.enchantability = i1;
    this.classicMaxUses = j1;
  }
  
  public int getMaxUses() {
    return this.maxUses;
  }
  
  public int getClassicMaxUses() {
    return this.classicMaxUses;
  }
  
  public float getEfficiencyOnProperMaterial() {
    return this.efficiencyOnProperMaterial;
  }
  
  public int getDamageVsEntity() {
    return this.damageVsEntity;
  }
  
  public int getHarvestLevel() {
    return this.harvestLevel;
  }
  
  public int getEnchantability() {
    return this.enchantability;
  }
}
