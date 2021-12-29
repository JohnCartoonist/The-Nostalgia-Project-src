class LogoEffectRandomizer {
  public double field_1312_a;
  
  public double field_1311_b;
  
  public double field_1314_c;
  
  final eh field_1313_d;
  
  public LogoEffectRandomizer(eh guimainmenu, int i, int j) {
    this.field_1313_d = guimainmenu;
    this.field_1312_a = this.field_1311_b = (10 + j) + eh.func_592_j().nextDouble() * 32.0D + i;
  }
  
  public void func_875_a() {
    this.field_1311_b = this.field_1312_a;
    if (this.field_1312_a > 0.0D)
      this.field_1314_c -= 0.6D; 
    this.field_1312_a += this.field_1314_c;
    this.field_1314_c *= 0.9D;
    if (this.field_1312_a < 0.0D) {
      this.field_1312_a = 0.0D;
      this.field_1314_c = 0.0D;
    } 
  }
}
