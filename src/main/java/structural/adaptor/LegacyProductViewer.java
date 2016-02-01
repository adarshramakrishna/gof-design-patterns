/**
 * 
 */
package structural.adaptor;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author rkaranth
 *
 */
public class LegacyProductViewer {

	public Enumeration<String> listAllProductsFromLegacyInventory() {
		Vector<String> products = new Vector<String>();
		products.add("Phillips Trimmer");
		products.add("QTM Power bank");
		products.add("Mi MT345 Smart phone");
		products.add("Double blanket");
		
		return products.elements();
	}
}
