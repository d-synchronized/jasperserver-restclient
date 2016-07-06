
package com.threaddynamics.jasperclient.utility;

import org.jboss.resteasy.spi.ResteasyProviderFactory;

/**
 * CustomRestEasyProviderFactory.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class CustomRestEasyProviderFactory {

    /** The factory. */
    private ResteasyProviderFactory factory;

    /**
     * Instantiates a new custom rest easy provider factory.
     * 
     * @param factory the factory
     */
    public CustomRestEasyProviderFactory(ResteasyProviderFactory factory) {
        this.factory = factory;
        factory.getClientExecutionInterceptorRegistry().register(new QueryParamMapInterceptor());
    }

    /**
     * Gets the single instance of CustomRestEasyProviderFactory.
     * 
     * @return single instance of CustomRestEasyProviderFactory
     */
    public ResteasyProviderFactory getInstance() {
        return factory;
    }
}
