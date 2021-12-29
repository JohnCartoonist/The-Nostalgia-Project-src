public class ItemCustomPickaxe extends ItemToolCustom {
  protected ItemCustomPickaxe(int i, nu enumtoolmaterial, EnumCustomToolMaterial realMaterial) {
    super(i, 2, enumtoolmaterial, blocksEffectiveAgainst, realMaterial, oldBlocksEffectiveAgainst);
  }
  
  public boolean a(yy block) {
    if (block == yy.ap)
      return (this.b.d() == 3); 
    if (block == yy.ax || block == yy.aw)
      return (this.b.d() >= 2); 
    if (block == yy.ah || block == yy.G)
      return (this.b.d() >= 2); 
    if (block == yy.ai || block == yy.H)
      return (this.b.d() >= 1); 
    if (block == yy.O || block == yy.N)
      return (this.b.d() >= 1); 
    if (block == yy.aN || block == yy.aO)
      return (this.b.d() >= 2); 
    if (block.bZ == p.e)
      return true; 
    return (block.bZ == p.f);
  }
  
  public float a(dk itemstack, yy block) {
    if (block != null && (block.bZ == p.f || block.bZ == p.e) && !((Boolean)mod_noBiomesX.OldToolDurabilities.get()).booleanValue())
      return this.a; 
    return super.a(itemstack, block);
  }
  
  private static yy[] blocksEffectiveAgainst = new yy[] { 
      yy.w, yy.aj, yy.ak, yy.t, yy.Q, yy.ao, yy.H, yy.ai, yy.I, yy.ah, 
      yy.G, yy.aw, yy.ax, yy.aT, yy.bb, yy.N, yy.O, yy.aN, yy.aO, yy.aG, 
      yy.U, yy.T };
  
  private static yy[] oldBlocksEffectiveAgainst = new yy[] { 
      yy.w, yy.aj, yy.ak, yy.t, yy.Q, yy.ao, yy.H, yy.ai, yy.I, yy.ah, 
      yy.G, yy.aw, yy.ax, yy.aT, yy.bb, yy.N, yy.O };
}
