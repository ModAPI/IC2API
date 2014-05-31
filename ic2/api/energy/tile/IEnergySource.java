package ic2.api.energy.tile;

/**
 * Allows a tile entity (mostly a generator) to emit energy.
 */
public interface IEnergySource extends IEnergyEmitter {
	/**
	 * Energy output provided by the source.
	 * This is typically Math.min(stored energy, max output/tick).
	 * 
	 * @return Energy offered this tick
	 */
	double getOfferedEnergy();

	void drawEnergy(double amount);
}

