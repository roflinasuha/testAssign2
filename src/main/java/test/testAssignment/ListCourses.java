package test.testAssignment;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


public class ListCourses extends ReadPdf implements Runnable {


    @Override
    public void run() {

        try {
        	
            PDDocument document = PDDocument.load(new File("C:\\Users\\BCC\\Desktop\\A182Draft.pdf"));                
        	PDFTextStripper stripper = new PDFTextStripper();
        	stripper.setStartPage(25);
        	stripper.setEndPage(26);
        	String result = stripper.getText(document);
        	 System.out.println(Thread.currentThread().getName() +
                     "\tList Course from SOC : \n" + result);
        	 
        } catch (IOException e) {
            e.printStackTrace();
           
        }
        
    }
}