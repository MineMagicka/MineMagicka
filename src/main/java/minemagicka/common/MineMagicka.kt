package minemagicka.common

import minemagicka.common.core.CommonProxy
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.SidedProxy
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

@Mod(modid = "minemagicka", name = "MineMagicka", version = "r1-1")
class MineMagicka {
    companion object {
        @Mod.Instance("minemagicka")
        lateinit var instance: MineMagicka

        @SidedProxy(serverSide = "minemagicka.common.core.CommonProxy",
                clientSide = "minemagicka.client.core.ClientProxy")
        lateinit var proxy: CommonProxy
    }

    @Mod.EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        proxy.pre(event)
    }

    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        proxy.init(event)
    }

    @Mod.EventHandler
    fun post(event: FMLPostInitializationEvent) {
        proxy.post(event)
    }
}
