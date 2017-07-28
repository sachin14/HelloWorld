import java.util.Arrays;
//Sachin J new comment

public class StringExamples {

	public int wordCount(String message){
		int count=0;
		String[] wordList=message.split(" ");
		count=wordList.length;
		System.out.println("Inside wordList function");
		System.out.println("Count of words in string is "+ count);
		return count;
	}

	public boolean isPalindrome(String testString){
		boolean isPalindrome=true;
		int j=1;
		for(char i=0;i<(testString.length()/2);i++){
			if(testString.charAt(i)==testString.charAt(testString.length()-j))
			{
				j++;
				continue;
			}
			else{
				isPalindrome=false;
				break;
			}		
		}
		return isPalindrome;
		
	}
	
	public String removeChar(String testString, char toBeRemoved){
		String modified="";
		char[] newArray=testString.toCharArray();
		for(int i=0;i<=newArray.length-1;i++){
			if (newArray[i]!=toBeRemoved){
				modified=modified + newArray[i];
			}
		}
		return modified;
		
	}
	
	/*public String[] printPermutations(String testString){
		String[] permutedArray;
		
		
		
		
		return permutedArray;
	}*/
	
	public boolean isAnagram(String str1, String str2){
		boolean anagram=true;
		String copyOfStr1=str1.replaceAll("\\s","");
		String copyOfStr2=str2.replaceAll("\\s","");
		
		if(copyOfStr1.length()!=copyOfStr2.length()){
			anagram=false;
		}
		else{
			char[] str1arr= copyOfStr1.toCharArray();
			char[] str2arr= copyOfStr2.toCharArray();
			Arrays.sort(str1arr);
			Arrays.sort(str2arr);
			anagram=Arrays.equals(str1arr, str2arr);
		}
			
		return anagram;
		
		
	}
	public int stringToint(String str1){
		int i=0;
		int num=0;
		boolean isNeg=false;
		if (str1.charAt(0)=='-'){
			isNeg=true;
			i++;
		}
		while(i<str1.length()){
			num*=10;
			num=num+str1.charAt(i)-'0';
			i++;
		}
		if(isNeg)
			num=-num;
		
		return num;
		
	}
}
