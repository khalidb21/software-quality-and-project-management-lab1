package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor()
    {
		Binary binary=new Binary("1001001");
        assertTrue( binary.getValue().equals("1001001"));
    }
    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
		Binary binary=new Binary("1001001211");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
		Binary binary=new Binary("1001001A");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign()
    {
		Binary binary=new Binary("-1001001");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * T	est The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
		Binary binary=new Binary("00001001");
        assertTrue( binary.getValue().equals("1001"));
    }
    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString()
    {
		Binary binary=new Binary("");
        assertTrue( binary.getValue().equals("0"));
    }
	/**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void add()
    {
		Binary binary1=new Binary("1000");
		Binary binary2=new Binary("1111");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("10111"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void add2()
    {
		Binary binary1=new Binary("1010");
		Binary binary2=new Binary("11");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void add3()
    {
		Binary binary1=new Binary("11");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with a binary numbers with zero
     */
    @Test
    public void add4()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }
	/**
     * Test The add functions with two zeros
     */
    @Test
    public void add5()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("0");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("0"));
    }
    /**
     * Test The multiply method with two binary numbers of equal length
     */
    @Test
    public void multiply() {
		Binary binary1=new Binary("1010");
		Binary binary2=new Binary("1000");
		Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010000"));
    }
    /**
     * Test The multiply method with two binary numbers of different lengths
     */
    @Test
    public void multiply2() {
        Binary binary1=new Binary("101");
        Binary binary2=new Binary("1101");
        Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue( binary3.getValue().equals("1000001"));
    }
    /**
     * Test The multiply method with two larger binary numbers
     */
    @Test
    public void multiply3() {
        Binary binary1=new Binary("1011101010101");
        Binary binary2=new Binary("10000");
        Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue( binary3.getValue().equals("10111010101010000"));
    }
    /**
     * Test The bitwiseOR method with two binary numbers with mixed bits
     */
    @Test
    public void bitwiseOR() {
        Binary binary1=new Binary("101010");
        Binary binary2=new Binary("110011");
        Binary binary3=Binary.bitwiseOR(binary1,binary2);
        assertTrue( binary3.getValue().equals("111011"));
    }
    /**
     * Test The bitwiseOR method with one binary numbers that has all zeroes
     */
    @Test
    public void bitwiseOR2() {
        Binary binary1=new Binary("000000");
        Binary binary2=new Binary("110011");
        Binary binary3=Binary.bitwiseOR(binary1,binary2);
        assertTrue( binary3.getValue().equals("110011"));
    }
    /**
     * Test The bitwiseOR method with different length binary numbers
     */
    @Test
    public void bitwiseOR3() {
        Binary binary1=new Binary("101");
        Binary binary2=new Binary("110011");
        Binary binary3=Binary.bitwiseOR(binary1,binary2);
        assertTrue( binary3.getValue().equals("110111"));
    }
    /**
     * Test The bitwiseAND method with two binary numbers with mixed bits
     */
    @Test
    public void bitwiseAND() {
        Binary binary1=new Binary("101010");
        Binary binary2=new Binary("110011");
        Binary binary3=Binary.bitwiseAND(binary1,binary2);
        assertTrue( binary3.getValue().equals("100010"));
    }
    /**
     * Test The bitwiseAND method with one binary numbers that has all ones
     */
    @Test
    public void bitwiseAND2() {
        Binary binary1=new Binary("111111");
        Binary binary2=new Binary("110011");
        Binary binary3=Binary.bitwiseAND(binary1,binary2);
        assertTrue( binary3.getValue().equals("110011"));
    }
    /**
     * Test The bitwiseAND method with different length binary numbers
     */
    @Test
    public void bitwiseAND3() {
        Binary binary1=new Binary("101");
        Binary binary2=new Binary("110011");
        Binary binary3=Binary.bitwiseAND(binary1,binary2);
        assertTrue( binary3.getValue().equals("1"));
    }
}