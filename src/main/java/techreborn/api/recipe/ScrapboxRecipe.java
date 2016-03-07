package techreborn.api.recipe;

import net.minecraft.item.ItemStack;
import techreborn.api.ScrapboxList;
import techreborn.init.ModItems;
import techreborn.lib.Reference;

public class ScrapboxRecipe extends BaseRecipe {

	public ScrapboxRecipe(ItemStack output) {
		super(Reference.compressorRecipe, 0, 0);
		inputs.add(new ItemStack(ModItems.scrapBox));
		addOutput(output);
	}

	@Override
	public String getUserFreindlyName() {
		return "Scrapbox";
	}
}
