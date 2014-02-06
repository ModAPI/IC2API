package ic2.api.energy.tile;

import net.minecraft.tileentity.TileEntity;

/**
 * Interface for grouping multi-block structures to a single energy net delegate.
 * 
 * The energy net uses TileEntity to refer to a specific xyz+world position. If multiple of those
 * positions should belong to the same functional structure, i.e. they consume or produce energy
 * only once for the whole multi-block instead of once per every single block, this interface
 * allows to do so.
 * 
 * The tile entity implementing IMetaDelegate has to be added/removed to/from the energy net
 * instead of every single sub-TileEntity. The energy net interaction will be handled by the
 * IMetaDelegate TileEntity as well.
 * 
 * The array TileEntity[] just provides connectivity (IEnergyAcceptor, IEnergyEmitter) and
 * position (x, y, z, World) data.
 */
public interface IMetaDelegate extends IEnergyTile {
	/**
	 * Get the sub-TileEntities belonging to this Meta TileEntity.
	 * 
	 * @return sub-TileEntity array
	 */
	TileEntity[] getSubTiles();
}
