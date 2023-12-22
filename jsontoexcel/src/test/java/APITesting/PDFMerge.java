package APITesting;

import java.io.File;

import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;

public class PDFMerge
{
	public static void main(String[] args) throws Exception
	{
		String[] pdfs = new String[] {
				"1.pdf", "2.pdf", "3.pdf", "4.pdf"
		};
		
		PDFMergerUtility PDFMerger = new PDFMergerUtility();
//		PDFMerger.setDestinationFileName("/Users/aadvik/Google Drive/Documents/I797/Akshitha/I_797_A_Akshitha_All_Till_2019.pdf");
		PDFMerger.setDestinationFileName("/Users/aadvik/Downloads/Relocation_Expenses/air_travel/Merge.pdf");
		
		
		for(String pdf : pdfs)
		{
//			File file = new File("/Users/aadvik/Google Drive/Documents/I797/Akshitha/" + pdf);
			File file = new File("/Users/aadvik/Downloads/Relocation_Expenses/air_travel/" + pdf);
			PDFMerger.addSource(file);
		}
		
		PDFMerger.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());
		System.out.println("Documents merged");
	}
}
