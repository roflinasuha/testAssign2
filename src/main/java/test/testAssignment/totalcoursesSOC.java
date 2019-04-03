package test.testAssignment;



import org.apache.pdfbox.pdmodel.PDDocument;


public class totalcoursesSOC extends ReadPdf implements Runnable {

	 private ThreadLocal<PDDocument> localPdDocument = new ThreadLocal<PDDocument>() {
	    	
	        @Override
	        
	        protected PDDocument initialValue() {
	            return new PDDocument();
	        }
	    };

	    PDDocument doc = localPdDocument.get();

		@Override
		public void run() {

			for (int i = 0; i < 1; i++) {
	                  System.out.println(Thread.currentThread().getName() +
	                "\tTotal Course SOC : " + (i+49));
	                  
	      }
			
		}
			
		
}
