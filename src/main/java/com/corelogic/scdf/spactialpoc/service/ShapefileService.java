package com.corelogic.scdf.spactialpoc.service;

import com.corelogic.scdf.spactialpoc.configuration.ShapeCliConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class ShapefileService {
    private ShapeCliConfiguration shapeCliConfiguration;

    @Autowired
    public ShapefileService(ShapeCliConfiguration shapeCliConfiguration) {
        this.shapeCliConfiguration = shapeCliConfiguration;
    }

    public void runTransfer() throws Exception {

        // TODO: Replace with some nice command builder library
        String command = shapeCliConfiguration.getPathToShpBinary() + " -I -s " +
                         shapeCliConfiguration.getSrid() + " " +
                         shapeCliConfiguration.getPathToShapeFile() + " " +
                         shapeCliConfiguration.getDatabaseSchema() + "." +
                         shapeCliConfiguration.getDatabaseTable() + " | " +
                         shapeCliConfiguration.getPathToPsql() + " " +
                         shapeCliConfiguration.getDbNameString();

        System.out.println("*********** STARTING SHP2PSQL PROCESS");

        File log = new File("poc-log");

        ProcessBuilder processBuilder = new ProcessBuilder("/bin/sh", "-c", command).inheritIO();
        processBuilder.redirectErrorStream(true);
        processBuilder.redirectOutput(ProcessBuilder.Redirect.appendTo(log));
        processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);

        Process p = processBuilder.start();
        p.waitFor();

        System.out.println("*********** SHP2PSQL PROCESS FINISHED");
    }
}
