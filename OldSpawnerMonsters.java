public class OldSpawnerMonsters extends OldSpawnerAnimals {
  public OldSpawnerMonsters(int i, Class class1, Class[] aclass) {
    super(i, class1, aclass);
  }
  
  protected am func_1151_a(ry world, int i, int j) {
    int k = i + world.w.nextInt(16);
    int l = world.w.nextInt(world.w.nextInt(120) + 8);
    int i1 = j + world.w.nextInt(16);
    return new am(k, l, i1);
  }
}
