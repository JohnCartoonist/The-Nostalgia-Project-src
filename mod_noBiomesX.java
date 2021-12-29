import de.matthiasmann.twl.Widget;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class mod_noBiomesX extends BaseMod {
  public static ModSettingScreen NBXMainScreen;
  
  public static ModSettings NBXSettingSet;
  
  public static SettingBoolean UseOldBiomes;
  
  public static SettingBoolean GenerateSandstone;
  
  public static SettingBoolean GenerateLapis;
  
  public static SettingBoolean NoBetaMobs;
  
  public static SettingBoolean FlammableNetherMobs;
  
  public static SettingBoolean OldTexturing;
  
  public static SettingBoolean ClassicLight;
  
  public static SettingBoolean SunriseEffect;
  
  public static SettingBoolean SheepShearing;
  
  public static SettingBoolean OldBows;
  
  public static SettingBoolean NoBetaMobActions;
  
  public static SettingBoolean NoBetaBlockActions;
  
  public static SettingBoolean SnowFallOnGlass;
  
  public static SettingBoolean ClassicWalkAnim;
  
  public static SettingBoolean OldMainMenu;
  
  public static SettingBoolean HitThroughDoor;
  
  public static SettingBoolean OldSpawners;
  
  public static SettingBoolean ArmorBlocksAll;
  
  public static SettingBoolean HungerSystem;
  
  public static SettingBoolean XPSystem;
  
  public static SettingBoolean VoidFog;
  
  public static SettingBoolean OpaqueFlatClouds;
  
  public static SettingBoolean LowHangingClouds;
  
  public static SettingBoolean TextureMappedClouds;
  
  public static SettingBoolean OldToolDurabilities;
  
  public static SettingBoolean OldSounds;
  
  public static SettingBoolean NoBowDurability;
  
  public static SettingBoolean FixedDoubleDoors;
  
  public static SettingBoolean UnNerfFire;
  
  public static SettingBoolean NoItemSway;
  
  public static SettingBoolean OldDamage;
  
  public static SettingBoolean HarderObsidianRedstone;
  
  public static SettingBoolean BigFences;
  
  public static SettingBoolean NoFleshyLandSound;
  
  public static SettingBoolean SunriseInNorth;
  
  public static SettingBoolean MoonPhaseless;
  
  public static SettingBoolean ShorterRangeLava;
  
  public static SettingBoolean NoLargeExplodeEffect;
  
  public static SettingBoolean OverrideGenerateStructures;
  
  public static SettingBoolean ToolBreakAnim;
  
  public static SettingMulti MapFeatures;
  
  public static SettingMulti MapType;
  
  public static SettingMulti CriticalStyle;
  
  public static SettingInt LightTintRed;
  
  public static SettingInt LightTintGreen;
  
  public static SettingInt LightTintBlue;
  
  public static WidgetSimplewindow GameplayMenu;
  
  public static WidgetSimplewindow GenerationMenu;
  
  public static WidgetSimplewindow MobMenu;
  
  public static WidgetSimplewindow MiscMenu;
  
  public static WidgetSimplewindow GraphicsMenu;
  
  public static SettingBoolean ArmorDurabilities;
  
  public static SettingBoolean SlimeConstrictions;
  
  public static acy shovelSteel;
  
  public static acy pickaxeSteel;
  
  public static acy axeSteel;
  
  public static acy swordSteel;
  
  public static acy swordWood;
  
  public static acy shovelWood;
  
  public static acy pickaxeWood;
  
  public static acy axeWood;
  
  public static acy swordStone;
  
  public static acy shovelStone;
  
  public static acy pickaxeStone;
  
  public static acy axeStone;
  
  public static acy swordDiamond;
  
  public static acy shovelDiamond;
  
  public static acy pickaxeDiamond;
  
  public static acy axeDiamond;
  
  public static acy swordGold;
  
  public static acy shovelGold;
  
  public static acy pickaxeGold;
  
  public static acy axeGold;
  
  public static acy helmetLeather;
  
  public static acy plateLeather;
  
  public static acy legsLeather;
  
  public static acy bootsLeather;
  
  public static acy helmetChain;
  
  public static acy plateChain;
  
  public static acy legsChain;
  
  public static acy bootsChain;
  
  public static acy helmetSteel;
  
  public static acy plateSteel;
  
  public static acy legsSteel;
  
  public static acy bootsSteel;
  
  public static acy helmetDiamond;
  
  public static acy plateDiamond;
  
  public static acy legsDiamond;
  
  public static acy bootsDiamond;
  
  public static acy helmetGold;
  
  public static acy plateGold;
  
  public static acy legsGold;
  
  public static acy bootsGold;
  
  public static acy appleGold;
  
  public static acy cookie;
  
  public static void changeBlocks(SettingBoolean theSetting) {
    if (((Boolean)theSetting.get()).booleanValue()) {
      (yy.k[yy.ap.bM]).bN = 10.0F;
    } else {
      (yy.k[yy.ap.bM]).bN = 50.0F;
    } 
  }
  
  public void load() {
    NBXSettingSet = new ModSettings("mod_noBiomesX");
    NBXMainScreen = new ModSettingScreen("The Nostalgia Project");
    WidgetClassicTwocolumn genWidget = new WidgetClassicTwocolumn(new Widget[0]);
    UseOldBiomes = NBXSettingSet.addSetting((Widget)genWidget, "Use Biomes", "useOldBiomes", false);
    GenerateSandstone = NBXSettingSet.addSetting((Widget)genWidget, "Gen Sandstone", "generateSandstone", false);
    GenerateLapis = NBXSettingSet.addSetting((Widget)genWidget, "Gen Lapis", "generateLapis", false);
    MapFeatures = NBXSettingSet.addSetting((Widget)genWidget, "Map Features", "mapFeatures", 0, new String[] { "1.2.0", "1.4", "1.7.3" });
    MapType = NBXSettingSet.addSetting((Widget)genWidget, "Map Type", "mapType", 0, new String[] { "Normal", "Hell", "Woods", "Paradise" });
    OverrideGenerateStructures = NBXSettingSet.addSetting((Widget)genWidget, "No Beta Map Structures", "OverrideGenerateStructures", true);
    GenerationMenu = new WidgetSimplewindow((Widget)genWidget, "Generation Options");
    WidgetClassicTwocolumn gameplayWidget = new WidgetClassicTwocolumn(new Widget[0]);
    OldDamage = NBXSettingSet.addSetting((Widget)gameplayWidget, "Old Damage", "oldDamage", true);
    ArmorDurabilities = NBXSettingSet.addSetting((Widget)gameplayWidget, "Armor Durability", "armordurabilities", true);
    NoBowDurability = NBXSettingSet.addSetting((Widget)gameplayWidget, "No Bow Durability", "noBowDurability", false);
    XPSystem = NBXSettingSet.addSetting((Widget)gameplayWidget, "XP System", "xpSystem", false);
    HungerSystem = NBXSettingSet.addSetting((Widget)gameplayWidget, "Hunger System", "hungerSystem", false);
    ArmorBlocksAll = NBXSettingSet.addSetting((Widget)gameplayWidget, "Armor Blocks All", "armorBlocksAll", true);
    OldSpawners = NBXSettingSet.addSetting((Widget)gameplayWidget, "1.1.2_01 spawning", "oldSpawners", false);
    HitThroughDoor = NBXSettingSet.addSetting((Widget)gameplayWidget, "Hit through doors", "hitThroughDoor", true);
    NoBetaBlockActions = NBXSettingSet.addSetting((Widget)gameplayWidget, "No Beta Block Actions", "NoBetaBlockActions", true);
    CriticalStyle = NBXSettingSet.addSetting((Widget)gameplayWidget, "Critical Style", "critStyle", 0, new String[] { "Off", "1.5 bugged", "1.5", "1.8", "1.0 (random)" });
    OldBows = NBXSettingSet.addSetting((Widget)gameplayWidget, "Old Bows", "oldBows", true);
    UnNerfFire = NBXSettingSet.addSetting((Widget)gameplayWidget, "Unnerfed Fire damage", "unNerfFire", true);
    GameplayMenu = new WidgetSimplewindow((Widget)gameplayWidget, "Gameplay Options");
    WidgetClassicTwocolumn mobWidget = new WidgetClassicTwocolumn(new Widget[0]);
    FlammableNetherMobs = NBXSettingSet.addSetting((Widget)mobWidget, "Flammable Nether Mobs", "flammableNetherMobs", false);
    SheepShearing = NBXSettingSet.addSetting((Widget)mobWidget, "Sheep Shearing", "SheepShearing", true);
    NoBetaMobActions = NBXSettingSet.addSetting((Widget)mobWidget, "No Beta Mob Actions", "noBetaMobActions", true);
    NoBetaMobs = NBXSettingSet.addSetting((Widget)mobWidget, "No Beta Mobs", "noBetaMobs", true);
    SlimeConstrictions = NBXSettingSet.addSetting((Widget)mobWidget, "Slime Limits", "slimeLimits", true);
    MobMenu = new WidgetSimplewindow((Widget)mobWidget, "Mob Options");
    WidgetClassicTwocolumn renderWidget = new WidgetClassicTwocolumn(new Widget[0]);
    OldTexturing = NBXSettingSet.addSetting((Widget)renderWidget, "Old Textures", "oldTexturing", false);
    ClassicLight = NBXSettingSet.addSetting((Widget)renderWidget, "Classic Light", "classicLight", true);
    SunriseEffect = NBXSettingSet.addSetting((Widget)renderWidget, "Sunrise Effect", "sunriseEffect", false);
    VoidFog = NBXSettingSet.addSetting((Widget)renderWidget, "Void Fog", "voidFog", false);
    OpaqueFlatClouds = NBXSettingSet.addSetting((Widget)renderWidget, "Opaque Flat Clouds", "opaqueFlatClouds", false);
    LowHangingClouds = NBXSettingSet.addSetting((Widget)renderWidget, "Low Hanging Clouds", "lowHangingClouds", false);
    TextureMappedClouds = NBXSettingSet.addSetting((Widget)renderWidget, "Textured clouds", "textureMappedClouds", false);
    NoItemSway = NBXSettingSet.addSetting((Widget)renderWidget, "No Item Sway", "noItemSway", false);
    LightTintRed = NBXSettingSet.addSetting((Widget)renderWidget, "CL Tint Red", "lightTintRed", 255, 0, 255);
    LightTintGreen = NBXSettingSet.addSetting((Widget)renderWidget, "CL Tint Green", "lightTintGreen", 255, 0, 255);
    LightTintBlue = NBXSettingSet.addSetting((Widget)renderWidget, "CL Tint Blue", "lightTintBlue", 255, 0, 255);
    NoLargeExplodeEffect = NBXSettingSet.addSetting((Widget)renderWidget, "Classic TNT Particles", "noLargeExplodeEffect", true);
    GraphicsMenu = new WidgetSimplewindow((Widget)renderWidget, "Rendering Options");
    WidgetClassicTwocolumn miscWidget = new WidgetClassicTwocolumn(new Widget[0]);
    SnowFallOnGlass = NBXSettingSet.addSetting((Widget)miscWidget, "Snowfall on glass", "snowfallOnGlass", false);
    ClassicWalkAnim = NBXSettingSet.addSetting((Widget)miscWidget, "Classic Walk Anim", "classicWalkAnim", false);
    OldMainMenu = NBXSettingSet.addSetting((Widget)miscWidget, "Old Main Menu", "oldMainMenu", true);
    OldToolDurabilities = NBXSettingSet.addSetting((Widget)miscWidget, "Old Tool Durability", "oldToolDurabilities", false);
    OldSounds = NBXSettingSet.addSetting((Widget)miscWidget, "Old Sounds", "oldSounds", true);
    HarderObsidianRedstone = NBXSettingSet.addSetting((Widget)miscWidget, "Old Block Hardness", "harderRedstoneObsidian", true);
    BigFences = NBXSettingSet.addSetting((Widget)miscWidget, "BigFences", "bigFences", false);
    NoFleshyLandSound = NBXSettingSet.addSetting((Widget)miscWidget, "No Fall Damage Sound", "NoFleshyLandSound", false);
    SunriseInNorth = NBXSettingSet.addSetting((Widget)miscWidget, "Sunrise In North", "sunriseInNorth", true);
    MoonPhaseless = NBXSettingSet.addSetting((Widget)miscWidget, "Moon is Phaseless", "phaselessMoon", true);
    ShorterRangeLava = NBXSettingSet.addSetting((Widget)miscWidget, "Less Nether Lava Flow", "shorterRangeLava", false);
    ToolBreakAnim = NBXSettingSet.addSetting((Widget)miscWidget, "Tool Breaking Anim", "toolBreakingAnim", false);
    HarderObsidianRedstone.displayWidget.addCallback((Runnable)(new ModAction(mod_noBiomesX.class, "changeBlocks", "Callback for Obisidan setting", new Class[] { SettingBoolean.class })).setDefaultArguments(new Object[] { HarderObsidianRedstone }));
    MiscMenu = new WidgetSimplewindow((Widget)miscWidget, "Misc Options");
    NBXMainScreen.append((Widget)GuiApiHelper.makeButton("Gen Options", "show", GuiModScreen.class, Boolean.valueOf(true), new Class[] { Widget.class }, new Object[] { GenerationMenu }));
    NBXMainScreen.append((Widget)GuiApiHelper.makeButton("Gameplay Options", "show", GuiModScreen.class, Boolean.valueOf(true), new Class[] { Widget.class }, new Object[] { GameplayMenu }));
    NBXMainScreen.append((Widget)GuiApiHelper.makeButton("Mob Options", "show", GuiModScreen.class, Boolean.valueOf(true), new Class[] { Widget.class }, new Object[] { MobMenu }));
    NBXMainScreen.append((Widget)GuiApiHelper.makeButton("Render Options", "show", GuiModScreen.class, Boolean.valueOf(true), new Class[] { Widget.class }, new Object[] { GraphicsMenu }));
    NBXMainScreen.append((Widget)GuiApiHelper.makeButton("Misc Options", "show", GuiModScreen.class, Boolean.valueOf(true), new Class[] { Widget.class }, new Object[] { MiscMenu }));
    NBXSettingSet.load();
    changeBlocks(HarderObsidianRedstone);
    shovelSteel = (new ItemCustomSpade(0, nu.c, EnumCustomToolMaterial.IRON)).a(2, 5).a("shovelIron");
    pickaxeSteel = (new ItemCustomPickaxe(1, nu.c, EnumCustomToolMaterial.IRON)).a(2, 6).a("pickaxeIron");
    axeSteel = (new ItemCustomAxe(2, nu.c, EnumCustomToolMaterial.IRON)).a(2, 7).a("hatchetIron");
    swordSteel = (new ItemCustomSword(11, nu.c, EnumCustomToolMaterial.IRON)).a(2, 4).a("swordIron");
    swordWood = (new ItemCustomSword(12, nu.a, EnumCustomToolMaterial.WOOD)).a(0, 4).a("swordWood");
    shovelWood = (new ItemCustomSpade(13, nu.a, EnumCustomToolMaterial.WOOD)).a(0, 5).a("shovelWood");
    pickaxeWood = (new ItemCustomPickaxe(14, nu.a, EnumCustomToolMaterial.WOOD)).a(0, 6).a("pickaxeWood");
    axeWood = (new ItemCustomAxe(15, nu.a, EnumCustomToolMaterial.WOOD)).a(0, 7).a("hatchetWood");
    swordStone = (new ItemCustomSword(16, nu.b, EnumCustomToolMaterial.STONE)).a(1, 4).a("swordStone");
    shovelStone = (new ItemCustomSpade(17, nu.b, EnumCustomToolMaterial.STONE)).a(1, 5).a("shovelStone");
    pickaxeStone = (new ItemCustomPickaxe(18, nu.b, EnumCustomToolMaterial.STONE)).a(1, 6).a("pickaxeStone");
    axeStone = (new ItemCustomAxe(19, nu.b, EnumCustomToolMaterial.STONE)).a(1, 7).a("hatchetStone");
    swordDiamond = (new ItemCustomSword(20, nu.d, EnumCustomToolMaterial.EMERALD)).a(3, 4).a("swordDiamond");
    shovelDiamond = (new ItemCustomSpade(21, nu.d, EnumCustomToolMaterial.EMERALD)).a(3, 5).a("shovelDiamond");
    pickaxeDiamond = (new ItemCustomPickaxe(22, nu.d, EnumCustomToolMaterial.EMERALD)).a(3, 6).a("pickaxeDiamond");
    axeDiamond = (new ItemCustomAxe(23, nu.d, EnumCustomToolMaterial.EMERALD)).a(3, 7).a("hatchetDiamond");
    swordGold = (new ItemCustomSword(27, nu.e, EnumCustomToolMaterial.GOLD)).a(4, 4).a("swordGold");
    shovelGold = (new ItemCustomSpade(28, nu.e, EnumCustomToolMaterial.EMERALD)).a(4, 5).a("shovelGold");
    pickaxeGold = (new ItemCustomPickaxe(29, nu.e, EnumCustomToolMaterial.EMERALD)).a(4, 6).a("pickaxeGold");
    axeGold = (new ItemCustomAxe(30, nu.e, EnumCustomToolMaterial.EMERALD)).a(4, 7).a("hatchetGold");
    helmetLeather = (new ItemCustomArmor(42, dj.a, 0, 0, 0)).a(0, 0).a("helmetCloth");
    plateLeather = (new ItemCustomArmor(43, dj.a, 0, 1, 0)).a(0, 1).a("chestplateCloth");
    legsLeather = (new ItemCustomArmor(44, dj.a, 0, 2, 0)).a(0, 2).a("leggingsCloth");
    bootsLeather = (new ItemCustomArmor(45, dj.a, 0, 3, 0)).a(0, 3).a("bootsCloth");
    helmetChain = (new ItemCustomArmor(46, dj.b, 1, 0, 1)).a(1, 0).a("helmetChain");
    plateChain = (new ItemCustomArmor(47, dj.b, 1, 1, 1)).a(1, 1).a("chestplateChain");
    legsChain = (new ItemCustomArmor(48, dj.b, 1, 2, 1)).a(1, 2).a("leggingsChain");
    bootsChain = (new ItemCustomArmor(49, dj.b, 1, 3, 1)).a(1, 3).a("bootsChain");
    helmetSteel = (new ItemCustomArmor(50, dj.c, 2, 0, 2)).a(2, 0).a("helmetIron");
    plateSteel = (new ItemCustomArmor(51, dj.c, 2, 1, 2)).a(2, 1).a("chestplateIron");
    legsSteel = (new ItemCustomArmor(52, dj.c, 2, 2, 2)).a(2, 2).a("leggingsIron");
    bootsSteel = (new ItemCustomArmor(53, dj.c, 2, 3, 2)).a(2, 3).a("bootsIron");
    helmetDiamond = (new ItemCustomArmor(54, dj.e, 3, 0, 3)).a(3, 0).a("helmetDiamond");
    plateDiamond = (new ItemCustomArmor(55, dj.e, 3, 1, 3)).a(3, 1).a("chestplateDiamond");
    legsDiamond = (new ItemCustomArmor(56, dj.e, 3, 2, 3)).a(3, 2).a("leggingsDiamond");
    bootsDiamond = (new ItemCustomArmor(57, dj.e, 3, 3, 3)).a(3, 3).a("bootsDiamond");
    helmetGold = (new ItemCustomArmor(58, dj.d, 4, 0, 1)).a(4, 0).a("helmetGold");
    plateGold = (new ItemCustomArmor(59, dj.d, 4, 1, 1)).a(4, 1).a("chestplateGold");
    legsGold = (new ItemCustomArmor(60, dj.d, 4, 2, 1)).a(4, 2).a("leggingsGold");
    bootsGold = (new ItemCustomArmor(61, dj.d, 4, 3, 1)).a(4, 3).a("bootsGold");
    appleGold = (new agu(66, 10, 1.2F, false, 20)).r().a(abg.l.H, 30, 0, 1.0F).a(11, 0).a("appleGold");
    cookie = (new ItemCookie(101, 1, 0.1F, false)).a(12, 5).a("cookie");
    ModLoader.SetInGameHook(this, true, false);
    rs blockSteel = (rs)yy.ai;
    rs blockGold = (rs)yy.ah;
    rs blockDiamond = (rs)yy.ax;
    blockSteel.sidetex = ModLoader.addOverride("/terrain.png", "/nbx/ironside.png");
    blockSteel.bottomtex = ModLoader.addOverride("/terrain.png", "/nbx/ironbottom.png");
    blockGold.sidetex = ModLoader.addOverride("/terrain.png", "/nbx/goldside.png");
    blockGold.bottomtex = ModLoader.addOverride("/terrain.png", "/nbx/goldbottom.png");
    blockDiamond.sidetex = ModLoader.addOverride("/terrain.png", "/nbx/diamondside.png");
    blockDiamond.bottomtex = ModLoader.addOverride("/terrain.png", "/nbx/diamondbottom.png");
    ModLoader.AddRecipe(new dk(acy.bz, 1), new Object[] { "##", "##", Character.valueOf('#'), acy.aB });
  }
  
  public boolean OnTickInGame(float f, Minecraft minecraft) {
    if (minecraft.h.bK == 1) {
      minecraft.h.cc.c = true;
    } else if (minecraft.h.bK != 1 && minecraft.f.C.q() == 0) {
      minecraft.h.cc.c = false;
    } 
    return true;
  }
  
  public String getVersion() {
    return "1.0.0";
  }
  
  public static void drawLogoBlock(acr renderblocks, yy block, float f) {
    int i = block.c();
    cv tessellator = cv.a;
    if (i == 0) {
      block.e();
      GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
      float f1 = 0.5F;
      float f2 = 1.0F;
      float f3 = 0.8F;
      float f4 = 0.6F;
      tessellator.b();
      tessellator.a(f2, f2, f2, f);
      renderblocks.a(block, 0.0D, 0.0D, 0.0D, block.b(0));
      tessellator.a(f1, f1, f1, f);
      renderblocks.b(block, 0.0D, 0.0D, 0.0D, block.b(1));
      tessellator.a(f3, f3, f3, f);
      renderblocks.c(block, 0.0D, 0.0D, 0.0D, block.b(2));
      renderblocks.d(block, 0.0D, 0.0D, 0.0D, block.b(3));
      tessellator.a(f4, f4, f4, f);
      renderblocks.e(block, 0.0D, 0.0D, 0.0D, block.b(4));
      renderblocks.f(block, 0.0D, 0.0D, 0.0D, block.b(5));
      tessellator.a();
      GL11.glTranslatef(0.5F, 0.5F, 0.5F);
    } 
  }
}
