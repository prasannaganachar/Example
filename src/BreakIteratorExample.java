
import java.text.BreakIterator;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;

public class BreakIteratorExample {
    @SuppressWarnings("null")
	public static void main(String[] args) {
        String data = "The quick brown : fox;	fox ,	dog jumps over the lazy dog.";
        
        LinkedList<String> spiltArrayWord = new LinkedList<String>();

        BreakIterator bi = BreakIterator.getWordInstance(Locale.US);

        bi.setText(data);
        int lastIndex = bi.first();
        while (lastIndex != BreakIterator.DONE) {
            int firstIndex = lastIndex;
            lastIndex = bi.next();

            if (lastIndex != BreakIterator.DONE
                    && Character.isLetterOrDigit(
                    data.charAt(firstIndex))) {
                String word = data.substring(firstIndex, lastIndex);
                        
               spiltArrayWord.add(word.trim().toString());
                       
            }
        }

        Collections.sort(spiltArrayWord);
        
        int matchFirst = 0;
        String matchWord =  "";
        for (int n=0;n< spiltArrayWord.size();n++) {
        	if (n!=0) {
        		if (spiltArrayWord.get(n-1).equals(spiltArrayWord.get(n))) {
	        		if (matchFirst == 0) {
	    				matchWord = spiltArrayWord.get(n);
	    			}
	        		matchFirst = 1;
        		}
        		else {
        			matchFirst =0;
        		}
        	}
        }
        
        System.out.println(matchWord);
    }
}