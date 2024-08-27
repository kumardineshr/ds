package com.arraysandhashing;
/*
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:
Input: s = "racecar", t = "carrace"
Output: true

Example 2:
Input: s = "jar", t = "jam"
Output: false
Constraints:

s and t consist of lowercase English letters.
*/
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }
	public static void main(String[] args) {
		ValidAnagram obj = new ValidAnagram();
		String s = "racecar", t = "carrace";
		System.out.println("Checking for s:"+s+", t:"+t+", isAnagram: "+obj.isAnagram(s, t));
		s = "jar"; t = "jam";
		System.out.println("Checking for s:"+s+", t:"+t+", isAnagram: "+obj.isAnagram(s, t));
	}
}
