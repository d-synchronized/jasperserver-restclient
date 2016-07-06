package com.threaddynamics.jasperclient.client;

/**
 * StatusCode.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public enum StatusCode {

    /** The successful creation. */
    SUCCESSFUL_CREATION(201),

    /** The bad request. */
    BAD_REQUEST(400),

    /** The unauthorized request. */
    UNAUTHORIZED_REQUEST(401),

    /** The request successful. */
    REQUEST_SUCCESSFUL(201),

    /** The no content found. */
    NO_CONTENT_FOUND(204);

    /** The status code. */
    private int statusCode;

    /**
     * Instantiates a new status code.
     * 
     * @param statusCode the status code
     */
    StatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Gets the status code.
     * 
     * @return the status code
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the status code.
     * 
     * @param statusCode the new status code
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

}