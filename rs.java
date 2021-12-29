public class rs extends yy {
  public int sidetex;
  
  public int bottomtex;
  
  public rs(int i, int j) {
    super(i, p.f);
    this.sidetex = 0;
    this.bottomtex = 0;
    this.bL = j;
  }
  
  public int a(kq iblockaccess, int i, int j, int k, int l) {
    if (!((Boolean)mod_noBiomesX.OldTexturing.get()).booleanValue())
      return this.bL; 
    if (l == 1)
      return this.bL; 
    if (l == 0)
      return this.bottomtex; 
    return this.sidetex;
  }
  
  public int b(int i) {
    if (mod_noBiomesX.OldTexturing != null && !((Boolean)mod_noBiomesX.OldTexturing.get()).booleanValue())
      return this.bL; 
    if (i == 1)
      return this.bL; 
    if (i == 0)
      return this.bottomtex; 
    return this.sidetex;
  }
}
