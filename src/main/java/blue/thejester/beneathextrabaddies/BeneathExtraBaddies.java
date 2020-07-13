package blue.thejester.beneathextrabaddies;

import blue.thejester.beneathextrabaddies.core.BEBSpawn;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import java.util.LinkedHashSet;
import java.util.Set;

@Mod(modid = BeneathExtraBaddies.MODID, name = BeneathExtraBaddies.NAME, version = BeneathExtraBaddies.VERSION, dependencies = BeneathExtraBaddies.DEPENDS)
public class BeneathExtraBaddies
{
    public static final String MODID = "beneathextrabaddies";
    public static final String NAME = "Beneath Extra Baddies";
    public static final String VERSION = "1.0";
    public static final String DEPENDS = "required-after:beneath;required-after:thebetweenlands;required-after:twilightforest;";

    // The instance of your mod that Forge uses.  Optional.
    @Mod.Instance(BeneathExtraBaddies.MODID)
    public static BeneathExtraBaddies instance;

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        BEBSpawn.register();
    }
}
