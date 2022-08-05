package notPlancha.yacm.itens

import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.Material
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import notPlancha.yacm.YACM
import thedarkcolour.kotlinforforge.forge.registerObject

object ModItens {
    val REGISTRY: DeferredRegister<Item> = DeferredRegister.create(ForgeRegistries.ITEMS, YACM.ID)
    //TODO
    val EXAMPLE_BLOCK: Block by REGISTRY.registerObject("COIN") {
        // The last expression in a lambda is considered the return value TODO remove
        Block(BlockBehaviour.Properties.of(Material.BAMBOO).lightLevel { 15 }.strength(3.0f))
        Item(ItemBeha)
    }
}