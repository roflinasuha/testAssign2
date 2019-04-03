package test.testAssignment;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



 public class STIW3054 extends ReadPdf implements Runnable  {
	 
	 @Override
		public void run() {

			 
		 File f1=new File("A182.txt"); //Creation of File Descriptor for input file
	      String[] words=null;  //Intialize the word Array
	      FileReader fr = null;
		try {
			fr = new FileReader(f1);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  //Creation of File Reader object
	      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
	      String s;     
	      String input="STIW3054";   // Input word to be searched
	      int count=0;   //Intialize the word to zero
	      try {
			while((s=br.readLine())!=null)   //Reading Content from the file
			  {
			     words=s.split(" ");  //Split the word using space
			      for (String word : words) 
			      {
			             if (word.equals(input))   //Search for the given word
			             {
			               count++;    //If Present increase the count by one
			             }
			      }
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      if(count!=0)  //Check for count not equal to zero
	      {
	         System.out.println(Thread.currentThread().getName() + "\tThe Subject STIW3054 is present for "+count+ " Times in the file");
	      }
	      else
	      {
	         System.out.println("The given word is not present in the file");
	      }
	      
	         try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }

 }
