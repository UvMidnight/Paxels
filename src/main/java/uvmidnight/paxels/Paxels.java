package uvmidnight.paxels;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Paxels implements ModInitializer {
    public static final Item diamondPaxel = new ItemPaxel(2, -3.0F, ToolMaterials.DIAMOND);
    public static final Item goldPaxel = new ItemPaxel(1, -3.0F, ToolMaterials.GOLD);
    public static final Item ironPaxel = new ItemPaxel(1.5f, -3.0F, ToolMaterials.IRON);
    public static final Item stonePaxel = new ItemPaxel(1, -3.0F, ToolMaterials.STONE);
    public static final Item woodPaxel = new ItemPaxel(0, -3.0F, ToolMaterials.WOOD);

    public static final Item bedrockPaxel = new BedrockPaxel();

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("paxels", "diamond_paxel"), diamondPaxel);
        Registry.register(Registry.ITEM, new Identifier("paxels", "gold_paxel"), goldPaxel);
        Registry.register(Registry.ITEM, new Identifier("paxels", "iron_paxel"), ironPaxel);
        Registry.register(Registry.ITEM, new Identifier("paxels", "stone_paxel"), stonePaxel);
        Registry.register(Registry.ITEM, new Identifier("paxels", "wood_paxel"), woodPaxel);

        Registry.register(Registry.ITEM, new Identifier("paxels", "bedrock_paxel"), bedrockPaxel);
    }
}
