import java.util.Random;

public class OldMapGenBase {
  protected int field_1306_a = 8;
  
  protected Random rand = new Random();
  
  public void generate(ej ichunkprovider, ry world, int i, int j, byte[] abyte0) {
    int k = this.field_1306_a;
    this.rand.setSeed(world.t());
    long l = this.rand.nextLong() / 2L * 2L + 1L;
    long l1 = this.rand.nextLong() / 2L * 2L + 1L;
    for (int i1 = i - k; i1 <= i + k; i1++) {
      for (int j1 = j - k; j1 <= j + k; j1++) {
        this.rand.setSeed(i1 * l + j1 * l1 ^ world.t());
        recursiveGenerate(world, i1, j1, i, j, abyte0);
      } 
    } 
  }
  
  protected void recursiveGenerate(ry world, int i, int j, int k, int l, byte[] abyte0) {}
}
