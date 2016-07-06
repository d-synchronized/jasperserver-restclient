package com.threaddynamics.exception;

import com.threaddynamics.jasperclient.response.ErrorResponse;

/**
 * CustomException.java
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class CustomException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7455566066632306412L;

    /** The error response. */
    private ErrorResponse errorResponse;

    /**
     * Instantiates a new custom exception.
     * 
     * @param message the message
     * @param cause the cause
     */
    public CustomException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new custom exception.
     * 
     * @param message the message
     */
    public CustomException(final String message) {
        super(message);
    }

    /**
     * Instantiates a new custom exception.
     * 
     * @param cause the cause
     */
    public CustomException(final Throwable cause) {
        super(cause);
    }

    /**
     * Gets the error response.
     * 
     * @return the error response
     */
    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    /**
     * Sets the error response.
     * 
     * @param errorResponse the new error response
     */
    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

}
