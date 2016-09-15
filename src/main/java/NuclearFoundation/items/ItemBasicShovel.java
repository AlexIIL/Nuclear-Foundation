package NuclearFoundation.items;

import NuclearFoundation.core.Constants;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBasicShovel extends ItemSpade{

	public final String Type;
	public ItemBasicShovel(ToolMaterial material,String type) {
		super(material);
		this.Type=type;
		this.setRegistryName("shovel"+this.Type);
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
	@SideOnly(Side.CLIENT)
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(Constants.MODID+":material/"+this.Type+"/tool/shovel", "inventory"));
	}
}