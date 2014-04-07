package ic2.api.energy.tile;

/**
 * Allows a tile entity (mostly a generator) to emit energy.
 */
public interface IEnergySource extends IEnergyEmitter {
	/**
	 * Energy output provided by the source this tick.
	 * This is typically Math.min(stored energy, max output/tick).
	 * 
	 * @return Energy offered this tick
	 */
	double getOfferedEnergy();

	/**
	 * Draw energy from this source's buffer.
	 * 
	 * If the source doesn't have a buffer, this is a no-op.
	 * 
	 * @param amount amount of EU to draw
	 */
	void drawEnergy(double amount);
}

