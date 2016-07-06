package com.threaddynamics.jasperclient.service.tests;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.Test;

import com.threaddynamics.exception.CustomException;
import com.threaddynamics.jasperclient.dto.Credentials;
import com.threaddynamics.jasperclient.response.ImportExportResponse;
import com.threaddynamics.jasperclient.service.ImportService;
import com.threaddynamics.jasperclient.utility.UtilityConstants;


public class ImportServiceTest {

    private static ImportService importService;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        Credentials login = new Credentials("jasperadmin", "jasperadmin");
        importService = new ImportService(UtilityConstants.JASPER_SERVER_HOST_URI, login);
    }

    @Test
    public void testImportResourceIntoServer()  {
        final File zippedCatalog = new File("C://Users//dishant//Desktop//Demo.zip");

        ImportExportResponse importExportResponse;
        try {
            importExportResponse = importService.importResourceIntoServer(true, true, true, true, true, true,
                zippedCatalog);
            System.out.println(importExportResponse.getServicePhase());
        } catch (CustomException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
}
