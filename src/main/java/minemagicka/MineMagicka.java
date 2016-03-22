package minemagicka;

import minemagicka.proxy.CommonProxy;
import minemagicka.reference.Reference;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Jared on 3/22/2016.
 */
@Mod(modid =  Reference.modid, name = Reference.name, version =  Reference.version)
public class MineMagicka {

    @Mod.Instance(Reference.modid)
    public static MineMagicka instance;

    @SidedProxy(clientSide =  "minemagicka.proxy.ClientProxy", serverSide = "minemagicka.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static final Logger logger = LogManager.getLogger(Reference.modid);
    public static final I18n translate = new I18n();

    public static long totalTime=0;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        logger.info("Starting PreInit");
        long time = System.currentTimeMillis();
        time = (System.currentTimeMillis()-time);
        totalTime+=time;
        logger.info("Completed PreInit in: " + time + "ms");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        logger.info("Starting Init");
        long time = System.currentTimeMillis();
        time = (System.currentTimeMillis()-time);
        totalTime+=time;
        logger.info("Completed Init in: " + time + "ms");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        logger.info("Starting PostInit");
        long time = System.currentTimeMillis();
        time = (System.currentTimeMillis()-time);
        totalTime+=time;
        logger.info("Completed PostInit in: " + time + "ms");
    }


    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent e){
        logger.info("Starting LoadComplete");
        long time = System.currentTimeMillis();
        time = (System.currentTimeMillis()-time);
        totalTime+=time;
        logger.info("Completed LoadComplete in: " + time + "ms");
        logger.info(Reference.name + " loaded in: " + totalTime + "ms");
    }
}
