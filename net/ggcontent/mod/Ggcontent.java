package net.ggcontent.mod;

import net.ggcontent.mod.blocks.AlabasterOven;
import net.ggcontent.mod.blocks.BarkBlock;
import net.ggcontent.mod.blocks.LifeBlock;
import net.ggcontent.mod.blocks.MetalBlock;
import net.ggcontent.mod.blocks.OreBlock;
import net.ggcontent.mod.handler.CraftingHandler;
import net.ggcontent.mod.handler.FuelHandler;
import net.ggcontent.mod.handler.GuiHandler;
import net.ggcontent.mod.items.IronHammer;
import net.ggcontent.mod.items.IronPunch;
import net.ggcontent.mod.items.LukasAxe;
import net.ggcontent.mod.items.LukasHoe;
import net.ggcontent.mod.items.LukasPickaxe;
import net.ggcontent.mod.items.LukasShovel;
import net.ggcontent.mod.items.LukasSword;
import net.ggcontent.mod.items.MoneyPress;
import net.ggcontent.mod.items.NCItems;
import net.ggcontent.mod.tileentity.TileEntityAlabasterOven;
import net.ggcontent.mod.worldgen.GgWorldGen;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Ggcontent.MODID, version = Ggcontent.VERSION)
public class Ggcontent
{
    public static final String MODID = "ggcontent";
    public static final String VERSION = "ALPHA 3.3";
    
    
    GgWorldGen eventWorldGen = new GgWorldGen();
    
    
    
    
    public static CreativeTabs GLGGTab;
    
    public static ToolMaterial LukasMaterial = EnumHelper.addToolMaterial("LukasMaterial", 2, 500, 8.0F, 2.0F, 14);
    
    @Instance(MODID)
    public static Ggcontent instance;
    
    //ingots
    public static Item itemLukasIngot;
    public static Item itemAkermaniteIngot;
    public static Item itemNiobiumIngot;
    public static Item itemSpheneIngot;
    public static Item itemStibniteIngot;
    public static Item itemGodlyMetal;
    
    //items
    public static Item itemGlggDollar;
    public static Item itemSpheneCog;
    public static Item itemIronWasher;
    public static Item itemIronDisc;
    public static Item itemIronCoin;
    public static Item itemGoldDisc;
    public static Item itemGoldCoin;
    
    
    
    //ores
    public static Block oreLukasOre;
    public static Block oreAkermaniteOre;
    public static Block oreNiobiumOre;
    public static Block oreSpheneOre;
    public static Block oreStibniteOre;
    public static Block oreGodOre;
    
    //Blocks
    public static Block blockLukasBlock;
    public static Block blockSpheneBlock;
    public static Block blockLifeBlock;  
    public static Block blockBarkBlock;
    
    //Machines
    public static Block blockAlabasterOvenIdle;
    public static Block blockAlabasterOvenActive;
    public static final int guiIDalabasterOven = 0;
    //Fuels
    public static Item itemTreePitch;
    public static Item itemDiamondCoal;
    
    //Tools
    public static Item itemIronHammer;
    public static Item itemIronPunch;
    public static Item itemMoneyPress;
    public static Item itemLukasSword;
    public static Item itemLukasAxe;
    public static Item itemLukasShovel;
    public static Item itemLukasHoe;
    public static Item itemLukasPickaxe;
    //spawn
    
    
    @EventHandler
    public void PreInit(FMLPreInitializationEvent PreEvent){
    
    	GameRegistry.registerWorldGenerator(eventWorldGen, 0);
    	
    	GLGGTab = new CreativeTabs("GLGG Content") {
    		@SideOnly(Side.CLIENT)
    		public Item getTabIconItem() {
    			return Item.getItemFromBlock(oreLukasOre);
    		}
    	};
    	    	
	   //Ingots    	
    	itemLukasIngot = new NCItems().setUnlocalizedName("LukasIngot");
    	GameRegistry.registerItem(itemLukasIngot, "LukasIngot");
    	
    	itemSpheneIngot = new NCItems().setUnlocalizedName("SpheneIngot");
    	GameRegistry.registerItem(itemSpheneIngot, "SpheneIngot");
    	
    	itemNiobiumIngot = new NCItems().setUnlocalizedName("NiobiumIngot");
    	GameRegistry.registerItem(itemNiobiumIngot, "NiobiumIngot");
    	
    	itemStibniteIngot = new NCItems().setUnlocalizedName("StibniteIngot");
    	GameRegistry.registerItem(itemStibniteIngot, "StibniteIngot");
    	    	
    	itemAkermaniteIngot = new NCItems().setUnlocalizedName("AkermaniteIngot");
    	GameRegistry.registerItem(itemAkermaniteIngot, "AkermaniteIngot");
    	
    	//Items
    	itemGlggDollar = new NCItems().setUnlocalizedName("GlggDollar");
    	GameRegistry.registerItem(itemGlggDollar, "GlggDollar");
    	
    	itemIronWasher = new NCItems().setUnlocalizedName("IronWasher");
    	GameRegistry.registerItem(itemIronWasher, "IronWasher");
    	
    	itemIronDisc = new NCItems().setUnlocalizedName("IronDisc");
    	GameRegistry.registerItem(itemIronDisc, "IronDisc");
    	
    	itemIronCoin = new NCItems().setUnlocalizedName("IronCoin");
    	GameRegistry.registerItem(itemIronCoin, "IronCoin");
    	
    	itemGoldCoin = new NCItems().setUnlocalizedName("GoldCoin");
    	GameRegistry.registerItem(itemGoldCoin, "GoldCoin");
    	
    	itemGoldDisc = new NCItems().setUnlocalizedName("GoldDisc");
    	GameRegistry.registerItem(itemGoldDisc, "GoldDisc");
    	
    	
    	itemSpheneCog = new NCItems().setUnlocalizedName("SpheneCog");
    	GameRegistry.registerItem(itemSpheneCog, "SpheneCog");
    	
    	//Fuel items
    	itemTreePitch = new NCItems().setUnlocalizedName("TreePitch");
    	GameRegistry.registerItem(itemTreePitch, "TreePitch");
    	
    	itemDiamondCoal = new NCItems().setUnlocalizedName("DiamondCoal");
    	GameRegistry.registerItem(itemDiamondCoal, "DiamondCoal");
    	
    	//Tools
    	itemIronHammer = new IronHammer().setUnlocalizedName("IronHammer");
    	GameRegistry.registerItem(itemIronHammer, "IronHammer");
    	
    	itemIronPunch = new IronPunch().setUnlocalizedName("IronPunch");
    	GameRegistry.registerItem(itemIronPunch, "IronPunch");
    	    	
    	itemMoneyPress = new MoneyPress().setUnlocalizedName("MoneyPress");
    	GameRegistry.registerItem(itemMoneyPress, "MoneyPress");
    	
    	
    	itemLukasSword = new LukasSword(LukasMaterial).setUnlocalizedName("LukasSword");
    	GameRegistry.registerItem(itemLukasSword, "LukasSword");
 
    	itemLukasAxe = new LukasAxe(LukasMaterial).setUnlocalizedName("LukasAxe");
    	GameRegistry.registerItem(itemLukasAxe, "LukasAxe");
    	
    	itemLukasShovel = new LukasShovel(LukasMaterial).setUnlocalizedName("LukasShovel");
    	GameRegistry.registerItem(itemLukasShovel, "LukasShovel");

    	itemLukasHoe = new LukasHoe(LukasMaterial).setUnlocalizedName("LukasHoe");
    	GameRegistry.registerItem(itemLukasHoe, "LukasHoe");
    	
    	itemLukasPickaxe = new LukasPickaxe(LukasMaterial).setUnlocalizedName("LukasPickaxe");
    	GameRegistry.registerItem(itemLukasPickaxe, "LukasPickaxe");
    	
    	//Ore Drops
    	itemGodlyMetal = new NCItems().setUnlocalizedName("GodlyMetal");
    	GameRegistry.registerItem(itemGodlyMetal, "GodlyMetal");
    	
    	//Blocks
    	blockLifeBlock = new LifeBlock(Material.lava).setBlockName("LifeBlock");
    	GameRegistry.registerBlock(blockLifeBlock, "LifeBlock");
    	
    	blockBarkBlock = new BarkBlock(Material.wood).setBlockName("BarkBlock");
    	GameRegistry.registerBlock(blockBarkBlock, "BarkBlock");
    	
    	//Machines
    	blockAlabasterOvenIdle = new AlabasterOven(false).setBlockName("AlabasterOvenIdle").setCreativeTab(GLGGTab).setHardness(3.5F);
    	GameRegistry.registerBlock(blockAlabasterOvenIdle, "AlabasterOvenIdle");
    	
    	blockAlabasterOvenActive = new AlabasterOven(true).setBlockName("AlabasterOvenActive").setLightLevel(0.625F).setHardness(3.5F);
    	GameRegistry.registerBlock(blockAlabasterOvenActive, "AlabasterOvenActive");
    	
    	//Metal Blocks    	
    	blockLukasBlock = new MetalBlock(Material.iron).setBlockName("LukasBlock");
    	GameRegistry.registerBlock(blockLukasBlock, "LukasBlock");
    	
    	blockSpheneBlock = new MetalBlock(Material.iron).setBlockName("SpheneBlock");
    	GameRegistry.registerBlock(blockSpheneBlock, "SpheneBlock");
    	
    	
    	//Ores
    	oreLukasOre = new OreBlock(Material.rock).setBlockName("LukasOre");
    	GameRegistry.registerBlock(oreLukasOre, "LukasOre");
    	
    	oreAkermaniteOre = new OreBlock(Material.rock).setBlockName("AkermaniteOre");
    	GameRegistry.registerBlock(oreAkermaniteOre, "AkermaniteOre");
    
    	oreNiobiumOre = new OreBlock(Material.rock).setBlockName("NiobiumOre");
    	GameRegistry.registerBlock(oreNiobiumOre, "NiobiumOre");
    	
    	oreSpheneOre = new OreBlock(Material.rock).setBlockName("SpheneOre");
    	GameRegistry.registerBlock(oreSpheneOre, "SpheneOre");

    	oreStibniteOre = new OreBlock(Material.rock).setBlockName("StibniteOre");
    	GameRegistry.registerBlock(oreStibniteOre, "StibniteOre");
    	
    	oreGodOre = new OreBlock(Material.rock).setBlockName("GodOre");
    	GameRegistry.registerBlock(oreGodOre, "GodOre");
    
    	
    }
    
    @EventHandler
    public void Init(FMLInitializationEvent event){
    	
    	GameRegistry.registerTileEntity(TileEntityAlabasterOven.class, "AlabasterOven");
    	NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
    }
    
    @EventHandler
    public void PostInit(FMLPostInitializationEvent postEvent){
    	
    	FMLCommonHandler.instance().bus().register(new CraftingHandler());
    	GameRegistry.registerFuelHandler(new FuelHandler());
    	
    	//Recipes
    	GameRegistry.addRecipe(new ItemStack(blockLukasBlock), new Object[]{"CCC", "CCC", "CCC", 'C' ,itemLukasIngot});
    	GameRegistry.addRecipe(new ItemStack(itemSpheneCog, 4), new Object[]{" X ", "XFX", " X ", 'X', itemSpheneIngot, 'F', Items.flint});
    	GameRegistry.addRecipe(new ItemStack(itemIronDisc, 4), new Object[]{"IH", 'I', Items.iron_ingot, 'H', new ItemStack(itemIronHammer, 1, OreDictionary.WILDCARD_VALUE)});
    	GameRegistry.addRecipe(new ItemStack(itemIronWasher, 1), new Object[]{"DP", 'D', itemIronDisc, 'P', new ItemStack(itemIronPunch, 1, OreDictionary.WILDCARD_VALUE)});
    	GameRegistry.addRecipe(new ItemStack(itemIronCoin, 1), new Object[]{"DM", 'D', itemIronDisc, 'M', new ItemStack(itemMoneyPress, 1, OreDictionary.WILDCARD_VALUE)});
    	GameRegistry.addRecipe(new ItemStack(itemGoldDisc, 4), new Object[]{"GH", 'G', Items.gold_ingot, 'H', new ItemStack(itemIronHammer, 1, OreDictionary.WILDCARD_VALUE)});
    	GameRegistry.addRecipe(new ItemStack(itemGoldCoin, 1), new Object[]{"HM", 'H', itemGoldDisc, 'M', new ItemStack(itemMoneyPress, 1, OreDictionary.WILDCARD_VALUE)});
    	
    	GameRegistry.addRecipe(new ItemStack(itemLukasSword, 1), new Object[] {" L ", " L ", " S ", 'L', itemLukasIngot, 'S', Items.stick});
    	GameRegistry.addRecipe(new ItemStack(itemLukasAxe, 1), new Object[] {"LL ", "LS ", " S ", 'L', itemLukasIngot, 'S', Items.stick});
    	GameRegistry.addRecipe(new ItemStack(itemLukasShovel, 1), new Object[] {" L ", " S ", " S ", 'L', itemLukasIngot, 'S', Items.stick});
    	GameRegistry.addRecipe(new ItemStack(itemLukasHoe, 1), new Object[] {"LL ", " S ", " S ", 'L', itemLukasIngot, 'S', Items.stick});
    	GameRegistry.addRecipe(new ItemStack(itemLukasHoe, 1), new Object[] {" LL", " S ", " S ", 'L', itemLukasIngot, 'S', Items.stick});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(itemLukasIngot, 9), new Object[]{blockLukasBlock});
    	GameRegistry.addShapelessRecipe(new ItemStack(itemDiamondCoal, 2), new Object[]{Items.coal, Items.diamond});
    	
    	
    	
    	
    	//Smelting
    	GameRegistry.addSmelting(oreLukasOre, new ItemStack(itemLukasIngot), 20);
    	GameRegistry.addSmelting(oreSpheneOre, new ItemStack(itemSpheneIngot), 20);
    	GameRegistry.addSmelting(oreNiobiumOre, new ItemStack(itemNiobiumIngot), 20);
    	GameRegistry.addSmelting(oreAkermaniteOre, new ItemStack(itemAkermaniteIngot), 20);
    	GameRegistry.addSmelting(oreStibniteOre, new ItemStack(itemStibniteIngot), 20);
    	
    	    }
    
    }
    

