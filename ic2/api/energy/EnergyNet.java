package ic2.api.energy;


/**
 * Provides access to the energy network.
 * 
 * The old EnergyNet methods missing in IEnergyNet have been migrated to events (load, unload) or
 * removed (tiles no longer emit energy actively, the energy net implementation requests it).
 */
public final class EnergyNet {
	/**
	 * Instance of the global EnergyNet class.
	 */
	public static IEnergyNet instance;
}

