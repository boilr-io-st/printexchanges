package mobi.boilr.printexchanges;

import mobi.boilr.libdynticker.core.Exchange;

public final class XMLArrayPrinter extends ExchangePrinter {
	public static void main(String[] args) {
		Exchange[] exchanges = getSortedExchanges();

		// Print them!
		for(Exchange e : exchanges) {
			System.out.println("<item>" + e.getName() + "</item>");
		}
		for(Exchange e : exchanges) {
			System.out.println("<item>" + e.getClass().getName() + "</item>");
		}
	}
}
