public class ItemCustomArmor extends agi {
  public int customMaxDamage;
  
  public int customDamageReduceAmount;
  
  public final int armorLevel;
  
  private static final int[] damageReduceAmountArray = new int[] { 3, 8, 6, 3 };
  
  private static final int[] customMaxDamageArray = new int[] { 11, 16, 15, 13 };
  
  public ItemCustomArmor(int i, dj enumarmormaterial, int j, int k, int l) {
    super(i, enumarmormaterial, j, k);
    this.armorLevel = l;
    this.customMaxDamage = customMaxDamageArray[l] * 3 << this.armorLevel;
    this.customDamageReduceAmount = damageReduceAmountArray[this.a];
  }
  
  public int g() {
    if (((Boolean)mod_noBiomesX.ArmorDurabilities.get()).booleanValue())
      return this.customMaxDamage; 
    return super.g();
  }
}
