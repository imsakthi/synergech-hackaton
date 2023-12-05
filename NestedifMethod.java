package conditionstatement;

public class NestedifMethod {
 public static int scholarship(int marks,String city,int classs) {
	 int scholarshipp=0;
	 if (classs==10)
	 {
		 if(marks<60 &&marks>30){
			 scholarshipp =30 *15000/100;
			 if(city.equals("Chennai")) {
				 scholarshipp =30 *15000/100;
			 }else {
				 scholarshipp =  scholarshipp -3000;
			 }
			 }
		 else if((marks<90 && marks>60))
		 {
			 scholarshipp =50 *15000/100;
		 }
		 else if (marks >= 90) {
             scholarshipp = 70 * 15000 / 100;
         }

	 }
	 else if (classs == 11) {
         if (marks > 30 && marks < 60) {
             scholarshipp = 30 * 25000 / 100;
             if (city.equals("Chennai")) {
                 scholarshipp -= 1000;
             } else {
                 scholarshipp -= 2000;
             }
         } else if (marks >= 60 && marks < 90) {
             scholarshipp = 50 * 25000 / 100;
         } else if (marks >= 90) {
             scholarshipp = 70 * 25000 / 100;
         }
     }
	 return scholarshipp;
	 
	 
	 }
 
 
 public static void main(String[] args) {
     // Scenario 1
     int scholarship1 = scholarship(80, "Chennai", 10);
     System.out.println("Scenario 1 Scholarship: " + scholarship1);

     // Scenario 2
     int scholarship2 = scholarship(70, "Delhi", 10);
     System.out.println("Scenario 2 Scholarship: " + scholarship2);

     // Scenario 3
     int scholarship3 = scholarship(20, "Chennai", 10);
     System.out.println("Scenario 3 Scholarship: " + scholarship3);
 
 }
}
