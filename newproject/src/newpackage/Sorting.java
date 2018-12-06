package newpackage;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sorting {
	
	public static void main(String[] args) {
		
	    String s1 = "Isabella,tom,hardy";
	    String s2 = "Isabella,tom,hardy,victor,smith";

	    String union = union(s1, s2, false);
	    System.out.println(union);
		
		
	}



public static String union (String s1, String s2, boolean caseInsensitive)
{
    // if either string is null, union is the other string
    if (s1 == null)
        return s2;

    if (s2 == null)
        return s1;

    // use linked set to keep ordering
    Set<String> unique = new LinkedHashSet<>();

    // put all words from string 1 into the set
    for (String word : s1.split(","))
    {
        word = word.trim(); // remove surrounding space on word

        if (caseInsensitive)
        {
            word = word.toLowerCase();
        }
        unique.add(word);
    }

    // put all words from string 2 into the set
    for (String word : s2.split(","))
    {
        word = word.trim(); // remove surrounding space on word

        if (caseInsensitive)
        {
            word = word.toLowerCase();
        }
        unique.add(word);
    }

    // get back the format of comma delimiter for the union
    String ret = unique.toString().replaceAll("[\\[\\] ]", "");
    return ret;
}
}