
package com.threaddynamics.jasperclient.utility;

import java.lang.reflect.Method;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.annotations.interception.ClientInterceptor;
import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.spi.interception.AcceptedByMethod;
import org.jboss.resteasy.spi.interception.ClientExecutionContext;
import org.jboss.resteasy.spi.interception.ClientExecutionInterceptor;

// TODO: Auto-generated Javadoc
/**
 * QueryParamMapInterceptor.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
@Provider
@ClientInterceptor
public class QueryParamMapInterceptor implements ClientExecutionInterceptor, AcceptedByMethod {

    /*
     * @see org.jboss.resteasy.spi.interception.AcceptedByMethod#accept(java.lang.Class, java.lang.reflect.Method)
     */
    public boolean accept(@SuppressWarnings("rawtypes") Class declaring, Method method) {

        return method.isAnnotationPresent(GET.class);
    }

    /*
     * @see org.jboss.resteasy.spi.interception.ClientExecutionInterceptor#execute(org.jboss.resteasy.spi.interception.
     * ClientExecutionContext)
     */
    @SuppressWarnings("rawtypes")
    public ClientResponse execute(ClientExecutionContext ctx) throws Exception {

        ClientRequest request = ctx.getRequest();

        if (request.getBody() != null) {
            @SuppressWarnings("unchecked")
            Map<String, String> map = (Map<String, String>) request.getBody();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                request = request.queryParameter(entry.getKey(), entry.getValue());
            }
            request.body(null, null, null, null, null);
        } else {
            System.out.println("Query map is triggered but no map found");
        }
        return ctx.proceed();
    }
}