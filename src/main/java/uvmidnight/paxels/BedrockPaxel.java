package uvmidnight.paxels;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterials;

public class BedrockPaxel extends ItemPaxel {
    public BedrockPaxel() {
        super(3, -3.0F, ToolMaterials.DIAMOND, -1);
    }

    @Override
    public boolean canRepair(ItemStack itemStack, ItemStack itemStack_2) {
        return false;
    }
}