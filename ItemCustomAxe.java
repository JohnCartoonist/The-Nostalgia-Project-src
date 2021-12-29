public class ItemCustomAxe extends ItemToolCustom {
  protected ItemCustomAxe(int i, nu enumtoolmaterial, EnumCustomToolMaterial realMaterial) {
    super(i, 3, enumtoolmaterial, blocksEffectiveAgainst, realMaterial, customBlocksEffectiveAgainst);
  }
  
  public float a(dk itemstack, yy block) {
    if (block != null && block.bZ == p.d && !((Boolean)mod_noBiomesX.OldToolDurabilities.get()).booleanValue())
      return this.a; 
    return super.a(itemstack, block);
  }
  
  private static yy[] blocksEffectiveAgainst = new yy[] { yy.x, yy.an, yy.J, yy.au, yy.aj, yy.ak, yy.ba, yy.bf };
  
  private static yy[] customBlocksEffectiveAgainst = new yy[] { yy.x, yy.an, yy.J, yy.au, yy.aj, yy.ak };
}
