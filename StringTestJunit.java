import org.junit.Test;
import static org.junit.Assert.*;

public class StringTestJunit {

//Sachin
StringExamples strex= new StringExamples();
@Test
public void testWordCount(){
	String message="This is new world";
	int count=strex.wordCount(message);
	assertEquals(4,count);
		
}
@Test
public void testisPalindrome(){
	String testString="dad";
	assertEquals(true,strex.isPalindrome(testString));
	assertEquals(false, strex.isPalindrome("daddy"));
	assertEquals(true,strex.isPalindrome("d"));
	assertNotNull(testString);
}

@Test
public void testremoveChar(){
	String testString="dad";
	assertEquals("a",strex.removeChar(testString, 'd'));
	assertEquals("goodday",strex.removeChar("good day", ' '));
	
}
@Test
public void testisAnagram(){
	assertEquals(true, strex.isAnagram("iceman", "cinema"));
	assertEquals(true, strex.isAnagram("ice man", "ci nema"));
	assertEquals(true, strex.isAnagram(" ", " "));
}
@Test
public void testStringtoInt(){
	assertEquals(124, strex.stringToint("124"));
}
}