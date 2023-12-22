import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

public class PDFSplit
{
	public static void main(String[] args) throws Exception
	{
		File oriFile = new File("/Users/aadvik/Downloads/Relocation_Expenses/ticket.pdf");
		PDDocument ori_pdf = PDDocument.load(oriFile);
		
		Splitter splitter = new Splitter();
		List<PDDocument> pages = splitter.split(ori_pdf);
		
//		PDDocument split = pages.get(0);
//		split.save("/Users/aadvik/Downloads/test/1.pdf");
		

		Iterator<PDDocument> iter = pages.iterator();
		
		int i =1;
		while(iter.hasNext())
		{
			PDDocument split = iter.next();
			split.save("/Users/aadvik/Downloads/Relocation_Expenses/" + i + ".pdf");
			i++;
		}
	}
}
