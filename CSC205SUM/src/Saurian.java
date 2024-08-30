// Programmer: Ronald Yalung
// Date:06/10/2024
// The Saurian class has the ability to translate English to Saurian
//  and Saurian to English

// Disclaimer:
// The given assignment description, project files, code files and/or solution files
// should not be made available in a public form via methods such as online hosting
// in code repositories, educational resource hosting websites, etc. These projects
// and related files can be hosted in private repositories for situations such as
// showing example work at job interviews, personal reference for future class
// projects, etc.


public class Saurian
{
	// data
	private String _english;
	private String _saurian;

	// constants used for translating
	// note M = M and m = m so M and m are not needed
	public static final char[] ENGLISHARR = {'A','B','C','D','E','F','G','H','I','J','K','L','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static final char[] SAURIANARR = {'U','R','S','T','O','V','W','X','A','Z','B','C','D','E','F','G','H','J','K','I','L','N','P','O','Q','u','r','s','t','o','v','w','x','a','z','b','c','d','e','f','g','h','j','k','i','l','n','p','o','q'};
	public static final int ARRLENGTH = ENGLISHARR.length;	// should be the same length for ENGLISHARR and SAURIANARR

	//default constructor
	public Saurian () {
		_english = "";
		_saurian = "";
	}
	
	//overloaded constructor
	public Saurian(String phrase, boolean isEnglish) {
		if(isEnglish == true) {
			_english = phrase; 
			translateEngToSaur(_english);
		}else {
			_saurian = phrase;
			translateSaurToEng(_saurian);
		}
			
	}
	
	//getters
	public String getEnglish() {
		return _english;
	}
	
	public String getSaurian() {
		return _saurian;
	}
	
	//setters
		public void setEnglish(String english) {
			_english = english;
			translateEngToSaur(_english);
		}
		
		public void setSaurian(String saurian) {
			_saurian = saurian;
			translateSaurToEng(_saurian);
		}
	
		
	//translate to english
	public void translateSaurToEng(String saurianToEnglish) {
		_english = "";			
		for(int i = 0; i < saurianToEnglish.length(); i++){
			for(int j = 0; i < ARRLENGTH; j++){
				if(saurianToEnglish.charAt(i) == SAURIANARR[j]){
					_english = _english + ENGLISHARR[j];
					break;
				}
				else if (j == ARRLENGTH - 1 && saurianToEnglish.charAt(i) != SAURIANARR[j])
				{
					_english = _english + saurianToEnglish.charAt(i);
					break;
				}

			}
		}
	}
	
	//translate to saurian
	public void translateEngToSaur(String englishToSaur) {
		_saurian = "";			
		for(int i = 0; i < englishToSaur.length(); i++){
			for(int j = 0; i < ARRLENGTH; j++){
				if(englishToSaur.charAt(i) == ENGLISHARR[j]){
					_saurian = _saurian + SAURIANARR[j];
					break;
				}
				else if (j == ARRLENGTH - 1 && englishToSaur.charAt(i) != ENGLISHARR[j])
				{
					_saurian = _saurian + englishToSaur.charAt(i);
					break;
				}

			}
		}
	}
	
	//toString
	public String toString() {
		return 	"English translation:\n" + _english + "\nSaurian translation:\n" + _saurian;
	}
	
	

}
