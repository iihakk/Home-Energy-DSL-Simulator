package org.homeenergy.sim;

import java.io.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;


import org.homeenergy.HemDslStandaloneSetup;

import org.homeenergy.hemDsl.Model;


public class CliMain {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: hemSim <script.hem>");
            System.exit(1);
        }

        // ← bootstrap your DSL’s EMF registrations
        HemDslStandaloneSetup.doSetup();

        // load the .hem script
        ResourceSet rs  = new XtextResourceSet();
        URI uri         = URI.createFileURI(new File(args[0]).getAbsolutePath());
        Resource resource = rs.getResource(uri, true);

        // extract the root Model
        Model model = (Model) resource.getContents().get(0);

        // run the simulator
        Simulator sim = new Simulator(model);
        sim.runDay();
        sim.dumpLog();
    }
}
