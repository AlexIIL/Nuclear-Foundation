package NuclearFoundation;

import NuclearFoundation.core.CommonProxy;
import NuclearFoundation.core.Constants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Constants.MODID, name=Constants.MODNAME, version=Constants.VERSION)
public class NuclearFoundation {
	
	@Mod.Instance
	public static NuclearFoundation instance;
	
	@SidedProxy(clientSide="NuclearFoundation.core.ClientProxy",
			serverSide="NuclearFoundation.core.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		Test.init();
		
	}
	@EventHandler
	public void init(FMLInitializationEvent e){
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		
	}
}