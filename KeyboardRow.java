class Solution {

	/* Problem 500 */
	
	/* Given a List of words, return the words that can be typed
	   using letters of alphabet on only one row's of American keyboard */

	/* https://leetcode.com/problems/keyboard-row/description/ */

    public String[] findWords(String[] words) {

	// Store each keyboard row
	String upRow = "qwertyuiop";
	String midRow = "asdfghjkl";
	String lowRow = "zxcvbnm";

	// Create arraylist to store words that pass test
	List<String> goodWords = new ArrayList<>();

	// Iterate through array of strings provided
	for (int i = 0; i < words.length; i++){

		// convert word to lower case
		String currentWord = words[i].toLowerCase();
		boolean contains = true;

		// Check first row
		if (upRow.indexOf(currentWord.charAt(0)) != -1 ){

			for (int j = 1; j < currentWord.length();j++){
				if (upRow.indexOf(currentWord.charAt(j)) == -1){
					contains = false;
					break;
				}
			}

			if (contains){
				goodWords.add(words[i]);
			}

                // Check second row
		} else if (midRow.indexOf(currentWord.charAt(0)) != -1 ) {

			for (int j = 1; j < currentWord.length();j++){
				if (midRow.indexOf(currentWord.charAt(j)) == -1){
					contains = false;
					break;
				}
			}

			if (contains){
				goodWords.add(words[i]);
			}

                 // Check final row
		} else if (lowRow.indexOf(currentWord.charAt(0)) != -1 ) {

			for (int j = 1; j < currentWord.length();j++){
				if (lowRow.indexOf(currentWord.charAt(j)) == -1){
					contains = false;
					break;
				}
			}

			if (contains){
				goodWords.add(words[i]);
			}

		}

	}

	// Print array of good words
	return goodWords.toArray(new String[goodWords.size()]);

    }
}
