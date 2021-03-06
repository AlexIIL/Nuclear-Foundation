package NuclearFoundation.rendering;

import NuclearFoundation.core.Constants;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.client.model.IModel;

public class GlowOreModelLoader implements ICustomModelLoader{

	public static final GlowOreModel GLOW_MODEL=new GlowOreModel();
	
	@Override
	public void onResourceManagerReload(IResourceManager resourceManager) {
		
	}

	@Override
	public boolean accepts(ResourceLocation modelLocation) {
		return modelLocation.getResourceDomain().equals(Constants.MODID)&&
				modelLocation.getResourcePath().equals("GlowOre");
	}

	@Override
	public IModel loadModel(ResourceLocation modelLocation) throws Exception {
		return GLOW_MODEL;
	}

}
