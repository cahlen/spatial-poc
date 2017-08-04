package com.corelogic.scdf.spactialpoc.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "shapefile")
public class ShapeCliConfiguration {
    private String srid;
    private String pathToShapeFile;
    private String databaseSchema;
    private String databaseTable;
    private String dbNameString;

    private String pathToShpBinary;
    private String pathToPsql;

    public String getSrid() {
        return srid;
    }

    public void setSrid(String srid) {
        this.srid = srid;
    }

    public String getPathToShapeFile() {
        return pathToShapeFile;
    }

    public void setPathToShapeFile(String pathToShapeFile) {
        this.pathToShapeFile = pathToShapeFile;
    }

    public String getDatabaseSchema() {
        return databaseSchema;
    }

    public void setDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
    }

    public String getDatabaseTable() {
        return databaseTable;
    }

    public void setDatabaseTable(String databaseTable) {
        this.databaseTable = databaseTable;
    }

    public String getPathToShpBinary() {
        return pathToShpBinary;
    }

    public void setPathToShpBinary(String pathToShpBinary) {
        this.pathToShpBinary = pathToShpBinary;
    }

    public String getPathToPsql() {
        return pathToPsql;
    }

    public void setPathToPsql(String pathToPsql) {
        this.pathToPsql = pathToPsql;
    }

    public String getDbNameString() {
        return dbNameString;
    }

    public void setDbNameString(String dbNameString) {
        this.dbNameString = dbNameString;
    }
}
