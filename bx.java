import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class bx extends vh {
  private sr c;
  
  private float d;
  
  private float e;
  
  private OldBiomeGenBase oldField_4201_e;
  
  public bx(sr biomegenbase, float f, float f1) {
    this.c = biomegenbase;
    this.d = f;
    this.e = f1;
    this.oldField_4201_e = OldBiomeGenBase.hell;
  }
  
  public bx(sr biomegenbase, float f, float f1, OldBiomeGenBase oldBiome) {
    this.c = biomegenbase;
    this.d = f;
    this.e = f1;
    this.oldField_4201_e = oldBiome;
  }
  
  public sr a(acm chunkcoordintpair) {
    return this.c;
  }
  
  public sr a(int i, int j) {
    return this.c;
  }
  
  public OldBiomeGenBase oldGetBiomeGenAt(int i, int j) {
    return this.oldField_4201_e;
  }
  
  public sr[] a(int i, int j, int k, int l) {
    this.a = a(this.a, i, j, k, l);
    return this.a;
  }
  
  public float[] a(float[] af, int i, int j, int k, int l) {
    if (af == null || af.length < k * l)
      af = new float[k * l]; 
    Arrays.fill(af, 0, k * l, this.d);
    return af;
  }
  
  public double[] getTemperatures_old(double[] af, int i, int j, int k, int l) {
    if (af == null || af.length < k * l)
      af = new double[k * l]; 
    Arrays.fill(af, 0, k * l, this.d);
    return af;
  }
  
  public OldBiomeGenBase[] oldLoadBlockGeneratorData(OldBiomeGenBase[] abiomegenbase, int i, int j, int k, int l) {
    if (abiomegenbase == null || abiomegenbase.length < k * l)
      abiomegenbase = new OldBiomeGenBase[k * l]; 
    if (this.temperature == null || this.temperature.length < k * l) {
      this.temperature = new double[k * l];
      this.humidity = new double[k * l];
    } 
    Arrays.fill((Object[])abiomegenbase, 0, k * l, this.oldField_4201_e);
    Arrays.fill(this.humidity, 0, k * l, this.e);
    Arrays.fill(this.temperature, 0, k * l, this.d);
    return abiomegenbase;
  }
  
  public float[] b(int i, int j, int k, int l) {
    return a(new float[k * l], i, j, k, l);
  }
  
  public float[] b(float[] af, int i, int j, int k, int l) {
    if (af == null || af.length < k * l)
      af = new float[k * l]; 
    Arrays.fill(af, 0, k * l, this.e);
    return af;
  }
  
  public float b(int i, int j) {
    return this.e;
  }
  
  public sr[] a(sr[] abiomegenbase, int i, int j, int k, int l) {
    if (abiomegenbase == null || abiomegenbase.length < k * l)
      abiomegenbase = new sr[k * l]; 
    Arrays.fill((Object[])abiomegenbase, 0, k * l, this.c);
    return abiomegenbase;
  }
  
  public sr[] a(sr[] abiomegenbase, int i, int j, int k, int l, boolean flag) {
    return a(abiomegenbase, i, j, k, l);
  }
  
  public am a(int i, int j, int k, List list, Random random) {
    if (list.contains(this.c))
      return new am(i - k + random.nextInt(k * 2 + 1), 0, j - k + random.nextInt(k * 2 + 1)); 
    return null;
  }
  
  public boolean a(int i, int j, int k, List list) {
    return list.contains(this.c);
  }
}
