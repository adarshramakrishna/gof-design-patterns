/**
 * 
 */
package structural.adaptor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author rkaranth
 *
 */
public class ListProductViewerAdaptor implements ProductViewer {

	private LegacyProductViewer legacyProductViewer;
	
	public ListProductViewerAdaptor(LegacyProductViewer legacyProductViewer) {
		this.legacyProductViewer = legacyProductViewer;
	}
	
	public List<String> listAllProducts() {
		Enumeration<String> legacyProducts = legacyProductViewer.listAllProductsFromLegacyInventory();
		List<String> productList = new ArrayList<String>();
		
		while (legacyProducts.hasMoreElements()) {
			productList.add(legacyProducts.nextElement());
		}
		
		return productList;
	}

}
