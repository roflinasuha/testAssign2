package test.testAssignment;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;

public class ReadPdf {

    public static void main(String[] args) throws IOException, InterruptedException {
    	
    	
	      for (int i = 0; i <1; i++) {
	         Thread.sleep(2000);
	      }
  	
        try (PDDocument document = PDDocument.load(new File("C:\\Users\\BCC\\Desktop\\A182.pdf"))) {

            document.getClass();

            if (!document.isEncrypted()) {
			
                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);

                PDFTextStripper tStripper = new PDFTextStripper();

                String pdfFileInText = tStripper.getText(document);
                //System.out.println("Text:" + st);

				// split by whitespace
                String lines[] = pdfFileInText.split("\\r?\\n");
                for (String line : lines) {
                    System.out.println(line);
                }

            }

        
        System.out.println("\nTHREAD IN PROGRAM");
        

        totalDay day = new totalDay(); //count total exam day
        totalNumberCourses fullcourse = new totalNumberCourses(); // count total courses
        ListCourses listSOC = new ListCourses(); //list course soc
        totalcoursesSOC totalSOC = new totalcoursesSOC(); // total courses soc
        STIW3054 display = new STIW3054(); //display stiw3054
   
        
        Thread thread1 = new Thread(fullcourse, "Thread 1");
        thread1.start();
        try{
            thread1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        Thread.sleep(2000);
        
        Thread thread2 = new Thread(day, "Thread 2"); 
        thread2.start();
        Thread.sleep(2000);
        
        Thread thread4 = new Thread(totalSOC, "Thread 4");
        thread4.start();
        Thread.sleep(2000);
        
        Thread thread3 = new Thread(listSOC, "Thread 3"); 
        thread3.start();
        Thread.sleep(2000);
        
        Thread thread5 = new Thread(display, "Thread 5");
        thread5.start();
        Thread.sleep(2000);
        
    	   document.close();
    	  }
    	  catch (Exception e) 
    	  {
    	   e.printStackTrace();
    	  }

       
}

	
}

