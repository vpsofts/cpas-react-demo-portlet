/**
 *  ===========================================================================
 *  IBA CZ Confidential
 *
 *  © Copyright IBA CZ 2014 ALL RIGHTS RESERVED
 *  The source code for this program is not published or otherwise
 *  divested of its trade secrets.
 *  ===========================================================================
 *
 */
package eu.ibacz.cpas.clientadmin.web.portlet.demo;

import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import eu.ibacz.cpas.clientadmin.web.portlet.demo.pto.DemoPto;

import static eu.ibacz.cpas.clientadmin.web.portlet.demo.Constants.*;

/**
 * This class is base controller for VIEW mode.
 */
@Controller
@RequestMapping("VIEW")
public class ViewController {

    private static final Logger LOG = Logger.getLogger(ViewController.class);

    @RenderMapping
    public String defaultView(Model model, RenderRequest request, RenderResponse response) {

        LOG.debug("Start default VIEW mode view");

        DemoPto pto = new DemoPto("Borče");

        LOG.debug("Chat model for view: " + pto.toString());

        model.addAttribute(ATTR_CHAT_PTO, pto);

        return VIEW_MAIN;
    }


	@ResourceMapping(RESOURCE_GET_HELLO)
	public void getHello(ResourceRequest request, ResourceResponse response) {

		OutputStreamWriter writer = null;

		try {
			writer = new OutputStreamWriter(response.getPortletOutputStream(), "UTF-8");
			writer.write("{\"hello\":\"plantážník\"}");

		} catch (IOException e) {
			IOUtils.closeQuietly(writer);
			throw new RuntimeException(e);
		}
		IOUtils.closeQuietly(writer);
	}
}
