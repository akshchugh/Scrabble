import java.util.HashMap;
import java.util.Map;

public class createHashMap { //<String,int>

	ScrabbleHelper scrabbleHelper = new ScrabbleHelper();
	Map <String, AnagramListStructure> anagramMap = scrabbleHelper.getMap();
	Map <String,int> allPossibleWords =new HashMap <String, int>();
	public  Map<String,int> validWords(String word) {
		if(anagramMap.containsKey(word)!=null)
		{	int i=0;
		while(String list: anagramMap.anagramList){
			allPossibleWords.put(list,anagramMap.score);
		} }
	}
}

static String inputString;
static StringBuilder output ;

public generateWord( String inputLetters) {
inputString = inputLetters;
output = new StringBuilder();
}

public static void generate(int startindex) {
for ( int i = startindex ; i < inputString.length() ; ++i) {
output.append(inputString.charAt(i));
new isvalid(output);
if(i < inputString.length()) {
generate(startindex + 1) ;
output.setLength(output.length() - 1);
}