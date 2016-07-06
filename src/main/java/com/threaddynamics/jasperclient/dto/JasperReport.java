
package com.threaddynamics.jasperclient.dto;

import java.io.File;

/**
 * The Class DocumentContent.
 * 
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class JasperReport extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7947888264561168246L;

    /** The report file. */
    private File reportFile;

    /**
     * Gets the report file.
     * 
     * @return the report file
     */
    public File getReportFile() {
        return reportFile;
    }

    /**
     * Sets the report file.
     * 
     * @param reportFile the new report file
     */
    public void setReportFile(final File reportFile) {
        this.reportFile = reportFile;
    }
}
