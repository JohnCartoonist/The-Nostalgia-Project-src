public class ItemCookie extends agu {
  public ItemCookie(int i, int j, float f, boolean flag) {
    super(i, j, f, flag);
  }
  
  public int e() {
    if (!((Boolean)mod_noBiomesX.HungerSystem.get()).booleanValue())
      return 8; 
    return 64;
  }
}
