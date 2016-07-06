
package com.threaddynamics.jasperclient.utility;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

/**
 * The Class SimpleDateDeserializer.
 * 
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a> Jan 17, 2014
 */
public class SimpleDateDeserializer extends JsonDeserializer<Date> {

    /*
     * (non-Javadoc)
     * 
     * @see org.codehaus.jackson.map.JsonDeserializer#deserialize(org.codehaus.jackson.JsonParser,
     * org.codehaus.jackson.map.DeserializationContext)
     */
    @Override
    public Date deserialize(final JsonParser jsonparser, final DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException {
        final String dateString = jsonparser.getText();
        try {
            return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(dateString);
        } catch (final ParseException pe) {
            throw new IOException("Error occurred while parsing date '" + dateString + "'", pe);
        }
    }

}
