/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleur;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author HP
 */
public class ReadData {
    
    
    

    String name;

    public String ReadData(String a) {
        name = a;
        return name;
    }

    public String ReadColor(int vRow, int vColumn) {
        String value = null;          //variable for storing the cell value  
        Workbook wb = null;           //initialize Workbook null  
        try {
            //read file from out source
            wb = new XSSFWorkbook(new File(getClass().getResource("/fleur/Fleur.xlsx").toURI()));
            

            Sheet sheet = wb.getSheet(name);   //getting the XSSFSheet object at given index  
            Row row = sheet.getRow(vRow); //returns the logical row  
            Cell cell = row.getCell(vColumn); //getting the cell representing the given column  
            value = cell.getStringCellValue();    //getting cell value  
            wb.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ReadData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidFormatException ex) {
            Logger.getLogger(ReadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
        //returns the cell value  
    }

    public int ReadNumber(int vRow, int vColumn) {
        int value = 0;          //variable for storing the cell value  
        Workbook wb = null;           //initialize Workbook null  
        try {

            wb = new XSSFWorkbook(new File(getClass().getResource("/fleur/Fleur.xlsx").toURI()));
            Sheet sheet = wb.getSheet(name);   //getting the XSSFSheet object at given index  
            Row row = sheet.getRow(vRow); //returns the logical row  
            Cell cell = row.getCell(vColumn); //getting the cell representing the given column  
            value = (int) cell.getNumericCellValue();    //getting cell value  
            wb.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (InvalidFormatException ex) {
            Logger.getLogger(ReadData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(ReadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }

}
