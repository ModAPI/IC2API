package ic2.api.recipe;

import java.util.Set;

import net.minecraftforge.fluids.Fluid;

public interface ILiquidAcceptManager {
	Set<Fluid> getAcceptedFluids();
}
