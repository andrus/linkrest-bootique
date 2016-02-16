package org.objectstyle.linkrest.cms;

import org.objectstyle.linkrest.cms.resource.DomainResource;

import com.google.inject.Module;
import com.nhl.bootique.Bootique;
import com.nhl.bootique.jersey.JerseyModule;

/**
 * A runnable Bootique (http://bootique.io/) application.
 */
public class BQApplication {

	public static void main(String[] args) throws Exception {

		Module jersey = JerseyModule.builder().packageRoot(DomainResource.class).build();
		Bootique.app(args).module(jersey).autoLoadModules().run();
	}
}
