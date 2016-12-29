/*
 * ===========================================================================
 * IBA CZ Confidential
 *
 * © Copyright IBA CZ 2016 ALL RIGHTS RESERVED
 * The source code for this program is not published or otherwise
 * divested of its trade secrets.
 * ===========================================================================
 */

package eu.ibacz.cpas.clientadmin.web.portlet.demo.pto;

/**
 * @author Petr Vašek <petr.vasek@ibacz.cz>
 */
public class DemoPto {

    private String hello;

	public DemoPto(String hello) {
		this.hello = hello;
	}

	public String getHello() {
		return hello;
	}

	public DemoPto setHello(String hello) {
		this.hello = hello;
		return this;
	}

	@Override
	public String toString() {
		return "DemoPto{" +
				"hello='" + hello + '\'' +
				'}';
	}
}
