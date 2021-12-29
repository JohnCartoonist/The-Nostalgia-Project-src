public class ItemCustomSpade extends ItemToolCustom {
  public ItemCustomSpade(int i, nu enumtoolmaterial, EnumCustomToolMaterial realMaterial) {
    super(i, 1, enumtoolmaterial, blocksEffectiveAgainst, realMaterial, customBlocksEffectiveAgainst);
  }
  
  public boolean a(yy block) {
    if (block == yy.aS)
      return true; 
    return (block == yy.aU);
  }
  
  private static yy[] blocksEffectiveAgainst = new yy[] { yy.u, yy.v, yy.E, yy.F, yy.aS, yy.aU, yy.aW, yy.aA, yy.bc, (yy)yy.by };
  
  private static yy[] customBlocksEffectiveAgainst = new yy[] { yy.u, yy.v, yy.E, yy.F, yy.aS, yy.aU, yy.aW, yy.aA, (yy)yy.by };
}
