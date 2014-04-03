package ic2.api.recipe;

import java.util.Map;

import net.minecraft.item.ItemStack;

import net.minecraftforge.fluids.FluidStack;

public interface ICannerEnrichRecipeManager {
	/**
	 * Adds a recipe to the machine.
	 * 
	 * @param fluid Fluid input
	 * @param additive Item to enrich the fluid with
	 * @param output Output fluid
	 */
	public void addRecipe(FluidStack fluid, IRecipeInput additive, FluidStack output);

	/**
	 * Gets the recipe output for the given input.
	 * 
	 * @param fluid Fluid input
	 * @param additive Item to enrich the fluid with
	 * @param adjustInput modify the input according to the recipe's requirements
	 * @return Recipe output, or null if none
	 */
	public RecipeOutput getOutputFor(FluidStack fluid, ItemStack additive, boolean adjustInput);

	/**
	 * Gets a list of recipes.
	 * 
	 * You're a mad evil scientist if you ever modify this.
	 * 
	 * @return List of recipes
	 */
	public Map<Input, FluidStack> getRecipes();


	public static class Input {
		public Input(FluidStack fluid, IRecipeInput additive) {
			this.fluid = fluid;
			this.additive = additive;
		}

		public boolean matches(FluidStack fluid, ItemStack additive) {
			return this.fluid.isFluidEqual(fluid) && this.additive.matches(additive);
		}

		public final FluidStack fluid;
		public final IRecipeInput additive;
	}
}
