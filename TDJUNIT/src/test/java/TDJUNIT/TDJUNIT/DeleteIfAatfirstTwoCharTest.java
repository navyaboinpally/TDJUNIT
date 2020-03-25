package TDJUNIT.TDJUNIT;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeleteIfAatfirstTwoCharTest 
{
	
	/* 
	 *1. 4 chars : ABCD => BCD
	 *2. 4 chars : AACD => CD
	 *3. 4 chars : BACD => BCD
	 *4. 4 chars :BBAA  =>BBAA
	 *5. 5 chars :AABAA =>BAA
	 *6. 1 chars :A   =>A
	 */

	A A;
	@BeforeEach
	void setUp()
	{
		A=new A();
	}
	@Test
	void test1chars() 
	{
		assertEquals("A",A.delete("A"));
	}
	@Test
	void test2chars() 
	{
		assertEquals("B",A.delete("AB"));
	}
	@Test
	void test3Chars()
	{
		assertEquals("BB",A.delete("ABB"));
	}
	@Test
	void test4chars() 
	{
		assertEquals("BCD",A.delete("ABCD"));
	}
	@Test
	void test5chars()
	{
		assertEquals("BAA",A.delete("AABAA"));
	}


}
