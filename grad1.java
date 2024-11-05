package ir.isc.saeidi;

public class grad1 {

	public static void main(String[] args) {
     int score = 76;
     
     switch (score /10) {
     case 10: // score 100
     case  9: // score 90-99
    	 System.out.println("grade : A");
    	 break;
     case 8 :  // score 80-89
     case 7:   // score 70-79
    	 System.out.println("grade :B");
    	 break;
     case 6 :  // score 60-69
    	 System.out.println("grade :C"); 
    	 break;
     default:
    	 System.out.println("grade :D");
    	 break;
    	 
     }

	}

}
